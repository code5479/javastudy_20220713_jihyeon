package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product = Product.builder()			//static을 이용하면 생성없이 builder사용가능
				.productCode(20220802)				//builder로 시작해서 build로 끝내기.
				.productCategory("텀블러")
				.build();
		
		System.out.println(product);
		
	}

}
