package omcri.legomindstormNXT2.connector;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommException;
import lejos.pc.comm.NXTCommFactory;
import lejos.pc.comm.NXTInfo;
import omcri.core.IMotionController;
import omcri.core.IRobotController;

public class MindstormNXTMotionController implements IMotionController {

	private static Logger LOGGER = LoggerFactory.getLogger(MindstormNXTMotionController.class);
	
	private NXTComm nxtComm = null;
	private NXTInfo nxt = null;
	DataOutputStream dos;
	DataInputStream dis;
	
	private int angle;
	private int duration;
	private int speed;
	
	private boolean connected = false;
	
	public String name; // "ClapTrap"
	public String macAddress; // "00:16:53:10:10:C3"
	
	public MindstormNXTMotionController(final String name, final String macAddress) {
		this.name = name;
		this.macAddress = macAddress;
		if (name == null) {
			LOGGER.warn("No name is specified on controller, must be updated to control the lego nxt.");
		}
		if (macAddress == null) {
			LOGGER.warn("No mac address is specified on controller, must be updated to control the lego nxt.");
		}
	}
	
	
	@Override
	public IRobotController getRobotController() {
		return this;
	}

	@Override
	public int getAngle() {
		return angle;
	}

	@Override
	public void setAngle(int value) {
		this.angle = value;
		
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int value) {
		this.speed = value;
		
	}

	@Override
	public int getDuration() {
		return duration;
	}

	@Override
	public void setDuration(int value) {
		this.duration = value;
	}

	@Override
	public void moveforward() {
		try {
			dos.writeInt(1);
			dos.flush();
			dos.writeInt(duration);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void movebackward() {
		try {
			dos.writeInt(5);
			dos.flush();
			dos.writeInt(duration);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void turnright() {
		try {
			dos.writeInt(4);
			dos.flush();
			dos.writeInt(angle);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void turnleft() {
		try {
			dos.writeInt(3);
			dos.flush();
			dos.writeInt(angle);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void stop() {
		try {
			dos.writeInt(6);
			dos.flush();
			dos.writeInt(0);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void connect() {
		try {
			System.out.println("Connecting to nxt2 bluetooth with parameters: " + name + " --> " + macAddress);
			nxtComm = NXTCommFactory.createNXTComm(NXTCommFactory.BLUETOOTH);
			nxt = new NXTInfo(NXTCommFactory.BLUETOOTH, name, macAddress);
			int i = 0;
			while (!nxtComm.open(nxt)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
				}
				i++;
				LOGGER.warn("Tentative de connection nb : " + i);
			}
			connected = true;
		} catch (NXTCommException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage());
			connected = false;
		}
		if (connected) {
			LOGGER.info("connected to mindstorm nxt2 for name: " + name);
			dos = new DataOutputStream(nxtComm.getOutputStream());
			dis = new DataInputStream(nxtComm.getInputStream());
		}
		
		
	}

	@Override
	public void disconnect() {
		try {
			if (connected) {
				dos.writeInt(2);
				dos.flush();
				nxtComm.close();
			} else {
				LOGGER.warn("Already disconnected from " + name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	private Integer getAcknowledgement() throws IOException {
		try {
			int command = dis.readInt();

			System.out.println("Command successful.");
			return command;
		} catch (IOException e) {
			failedAcknowledgment();
		}
		return null;
	}

	/**
	 * 
	 * @throws IOException
	 */
	private void failedAcknowledgment() throws IOException {
		System.out.println("Bluetooth connection lost");
		connected = false;
		dis.close();
		dos.close();
		nxtComm.close();
	}


	@Override
	public boolean isConnected() {
		return connected;
	}
	

}
