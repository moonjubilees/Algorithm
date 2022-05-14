import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		scan.close();
		System.out.println(A - B);
	}

}

/*scanner = 키보드로 입력받기 위한 방법의 클래스
 * scanner import 필요
 * 객체 생성
 * 입력받기
 */

//문제 자체가 1 2 이렇게 공백으로 입력받는 것 주의한다.
