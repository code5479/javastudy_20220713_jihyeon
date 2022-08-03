package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class StringHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();			//순서 없고 중복 안됌.
		set.add("java");										//수정할 수 없음. remove 후 add 해야함. 
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		// 값 조회
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {				//있는지 확인. true /false로 나옴
			String str = ir.next();
			if(str.equals("java")) {
				System.out.println(str);  //값을 보여줌				
			}
		}
	}

}
