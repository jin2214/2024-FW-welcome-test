package java_test;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        String str;

        Scanner sc = new Scanner(System.in);
        str = sc.next();
        
        char[] num = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
        	 num[i] = str.charAt(i);
        }
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
        	System.out.print(num[i]);
        }

        sc.close();
    }

}