package j16_제네릭;

import lombok.Data;

@Data

public class GenericTest<K,V> {			//T는 type E 는 element 의미
	
	private K key;
	private V value; 
	

}
