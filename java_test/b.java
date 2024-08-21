package java_test;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner sc = new Scanner(System.in);
    	String str = sc.next(); 
    	str = str.toLowerCase(); //소문자 변환
    	char ch = str.charAt(0);
    	
    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    		System.out.println('O');
    	} else {
    		System.out.println('X');
    	}

        sc.close();
    }

}