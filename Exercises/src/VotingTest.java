
public class VotingTest {
	
	public static void main(String[] args) {
		Voting v = new Voting();
		v.vote(17);
	}
	
}

class Voting {
	public void vote(int age) throws AgeRequirementException {
		if(age < 18) {
			throw new AgeRequirementException();
			// System.out.println("Less that 18");
		}else System.out.println("Requirements met.");
	}
}