import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        int i = 1;
        while(i<=N) {
        	System.out.println(i);
        	i++;
        }
    
    }
}
