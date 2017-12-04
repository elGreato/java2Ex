package application;

class Question {
	
	public static void main(String[] args) {
		
		for (int n = 0; n < 5; ++n) {
			switch (n) {
			case 0:
				System.out.print(n);
			case 1:
				System.out.print(n + 1);
				break;
			case 2:
				System.out.print(n + 2);
				break;
			case 3:
				System.out.print(n + 3);
			default:
				System.out.println(n - 1);
				break;
			}
		}
	}
}