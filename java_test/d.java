package java_test;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner sc = new Scanner(System.in);
    	
    	int num;
    	
    	while (true) {
    		num = sc.nextInt();
    		
    		if (num <= 0) {
    			System.out.println('X');
    		} else {
    			break;
    		}
    	}
    	
    	int sum = 0;
    	
    	for (int i = 1; i <= num; i++) {
    		sum += i;
    	}
    	
    	System.out.println(sum);

        sc.close();
    }

}