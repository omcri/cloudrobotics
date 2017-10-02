package omcri.legomindstormNXT2.connector;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommException;
import lejos.pc.comm.NXTCommFactory;
import lejos.pc.comm.NXTInfo;
import omcri.core.IMotionController;

public class MindstormsControl {
	private NXTComm nxtComm = null;
	private NXTInfo nxt = null;
	DataOutputStream dos;
	DataInputStream dis;

	public String name; // "ClapTrap"
	public String macAddress; // "00:16:53:10:10:C3"

	public MindstormsControl() {
	}

	public void BTconnect(String name, String macAddress) {
		try {
			this.name = name;
			this.macAddress = macAddress;
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
				System.out.println("Tentative de connection nb : " + i);
			}
		} catch (NXTCommException e) {
			e.printStackTrace();
		}

		System.out.println("connected !");

		dos = new DataOutputStream(nxtComm.getOutputStream());
		dis = new DataInputStream(nxtComm.getInputStream());
	}

	public void BTdisconnect() {
		try {
			dos.writeInt(2);
			dos.flush();
			nxtComm.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void turnLeft(int angle) {
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

	public void turnRight(int angle) {
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

	public void moveForward(int duration) {
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

	public void moveBackward(int duration) {
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

	public void openMouth(int angle) {
		try {
			dos.writeInt(7);
			dos.flush();
			dos.writeInt(angle);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeMouth(int angle) {
		try {
			dos.writeInt(8);
			dos.flush();
			dos.writeInt(angle);
			dos.flush();
			getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Integer getUltraSonic() {
		try {
			dos.writeInt(9);
			dos.flush();
			dos.writeInt(0);
			dos.flush();
			return getAcknowledgement();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

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

	private void failedAcknowledgment() throws IOException {
		System.out.println("Bluetooth connection lost");
		nxtComm.close();
	}
}
