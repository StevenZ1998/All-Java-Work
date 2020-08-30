
public class Parachute {

	public static void main(String[] args) {
		
		pull();
		
	}
	
	static void pull() throws DeploymentException {
		if(Math.random() < 0.001) {
			throw new DeploymentException();
		}
	}
	
}

class DeploymentException extends RuntimeException {}