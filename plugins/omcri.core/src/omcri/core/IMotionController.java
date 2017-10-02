package omcri.core;

/**
 * 
 * @author Christophe Gourdin
 *
 */
public interface IMotionController extends IRobotController {
	public int getAngle();
	public void setAngle(int value);
	public int getSpeed();
	public void setSpeed(int value);
	public int getDuration();
	public void setDuration(int value);
	public void moveforward();
	public void movebackward();
	public void turnright();
	public void turnleft();
	public void stop();
}
