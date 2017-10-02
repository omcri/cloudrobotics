package omcri.turtlebot.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri.core.IMotionController;
import omcri.core.IRobotController;
import tb.TurtlebotControl;

public class TurtlebotMotionController implements IMotionController {
	private static Logger LOGGER = LoggerFactory.getLogger(TurtlebotMotionController.class);
	private TurtlebotControl turtlebotControl = null;

	private boolean connected = false;
	private String username = null;
	private String password = null;
	private String hostAddress = null;
	private int duration = 0;
	private int angle = 0;
	private int speed = 0;

	/**
	 * 
	 * @param username
	 * @param password
	 * @param hostAddress
	 */
	public TurtlebotMotionController(final String username, final String password, final String hostAddress) {
		this.hostAddress = hostAddress;
		this.password = password;
		this.username = username;
		turtlebotControl = new TurtlebotControl(this.username, this.password, this.hostAddress);
		if (username == null) {
			LOGGER.warn("No name is specified on controller, must be updated to control the turtlebot.");
		}
		if (hostAddress == null) {
			LOGGER.warn("No mac address is specified on controller, must be updated to control the turtlebot.");
		}
		if (password == null) {
			LOGGER.warn("No password is specified on controller, must be updated to control the turtlebot.");
		}
	}

	@Override
	public IRobotController getRobotController() {
		return this;
	}

	@Override
	public void connect() throws Exception {
		if (!connected) {
			try {
				turtlebotControl.connect();
				connected = true;
			} catch (Exception ex) {
				connected = false;
				ex.printStackTrace();
				LOGGER.error(
						"Cant connect to turtle bot : " + ex.getMessage() + " , exception: " + ex.getClass().getName());
				throw ex;
			}
		}

	}

	@Override
	public void disconnect() throws Exception {
		if (connected) {
			try {
				turtlebotControl.disconnect();
				connected = false;
			} catch (Exception ex) {
				ex.printStackTrace();
				LOGGER.error("Cant disconnect from turtle bot : " + ex.getMessage() + " , exception: "
						+ ex.getClass().getName());
			}
		}
	}

	@Override
	public boolean isConnected() {
		return connected;
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
		return this.speed;
	}

	@Override
	public void setSpeed(int value) {
		this.speed = value;

	}

	@Override
	public int getDuration() {
		return this.duration;
	}

	@Override
	public void setDuration(int value) {
		this.duration = value;

	}

	@Override
	public void moveforward() {
		if (connected) {
			turtlebotControl.move_forward(duration);
		}

	}

	@Override
	public void movebackward() {
		if (connected) {
			turtlebotControl.move_backward(duration);
		}

	}

	@Override
	public void turnright() {
		if (connected) {
			turtlebotControl.turnRight(duration);
		}

	}

	@Override
	public void turnleft() {
		if (connected) {
			turtlebotControl.turnLeft(duration);
		}

	}

	@Override
	public void stop() {
		if (connected) {
			turtlebotControl.stop(duration);
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

}
