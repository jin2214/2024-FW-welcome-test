package java_test;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner sc = new Scanner(System.in);
    	
    	int age, height;
    	age = sc.nextInt();
    	height = sc.nextInt();
    	
    	if (age >= 14 || height >= 170) {
    		System.out.println('X');
    	} else {
    		System.out.println('O');
    	}

        sc.close();
    }

}