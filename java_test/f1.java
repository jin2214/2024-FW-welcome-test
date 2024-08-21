package java_test;
import java.util.Scanner;

class Fan {
	private String model;
	private int price;
	
	public Fan() {
		
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
}

public class f1 {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner sc = new Scanner(System.in);
    	Fan[] fan = new Fan[3];
    	for (int i = 0; i < fan.length; i++) {
    		fan[i] = new Fan();
    	}
    	
    	String model;
    	int price;
    	
    	for (int i = 0; i < 3; i++) {
    		model = sc.next();
    		price = sc.nextInt();
    		fan[i].setModel(model);
    		fan[i].setPrice(price);
    	}
    	
    	Fan lowPrice = fan[0];
    	for (int i = 1; i < 3; i++) {
    		if (lowPrice.getPrice() > fan[i].getPrice()) {
    			lowPrice = fan[i];
    		}
    	}
    	
    	System.out.println(lowPrice.getModel());
    	
    	sc.close();
    }

}