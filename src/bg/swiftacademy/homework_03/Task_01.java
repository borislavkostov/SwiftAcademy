package bg.swiftacademy.homework_03;

public class Task_01 {

	public static void main(String[] args) {
		int out = 450;
		int garb = 7890;
		int n = 5; //broq izhvurleniq
		int left = 0;
		for (int i = 1; i <= n; i++) {
			left = garb - out;
			garb = garb - out;
			System.out.println(left);
		}
	}

}
