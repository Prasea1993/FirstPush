package programs;

public class BranchingStatements {

	public static void main(String[] args) {

		int num = 3;

		switch (num) {

		case 1:

			System.out.println("Idli");
			break;

		case 2:

			System.out.println("Poori");
			break;

		case 3:

			System.out.println("Vada");
			break;

		case 4:

			System.out.println("Dosa");
			break;
		case 5:

			System.out.println("Pongal");
			break;
			
			default:
				System.out.println("Please select proper option from 1-5");

		}

	}

}
