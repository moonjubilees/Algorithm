import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a;
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	
    	for(a =1; a<=9; a++) {
    		System.out.println(N + " * " + a + " = " + a*N );
    	}
    }
    }
