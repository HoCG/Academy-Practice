
public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호 (serial no)는 "+p1.serialNo);
		System.out.println("p2의 제품번호 (serial no)는 "+p2.serialNo);
		System.out.println("p3의 제품번호 (serial no)는 "+p3.serialNo);
		System.out.println("제품의 개수: "+Product.count);
		System.out.println("count++="+Product.count++);      //Product자체의 static int count라는 고유의 수는 바꿀수없다!
		System.out.println("p1의 카운트값에 1더하기: "+p1.count++);
	}
}

class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo  = count;
	}
	public Product() {}  //없어도 상관없다.(자동으로 이와같은 생성자가 생김!)
}
