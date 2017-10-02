package omcri.core;

public interface IRobotController {
	public IRobotController getRobotController();
	public void connect() throws Exception;
	public void disconnect() throws Exception;
	public boolean isConnected();
}
