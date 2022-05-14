import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextInt();
		double B = scanner.nextInt();
		
		scanner.close();
		System.out.println(A / B);
		
	}

}

//상대오차가 10⁻⁹ 이내여야 한다는 단서가 있으므로 변수는 소수점 아래 9자리 이상 표현할 수 있는 실수형(double)으로 입력받는다.
