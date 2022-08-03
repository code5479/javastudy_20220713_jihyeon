package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		strMap.put(1, "java");			//순서 없음
		strMap.put(2, "java");			//key값은 중복 불가, value값은 중복 가능
		strMap.put(3, "java");
		strMap.put(4, "java");
		
		System.out.println(strMap);
		
		strMap2.put("a", "python");
		strMap2.put("b", "python");
		strMap2.put("c", "python");
		strMap2.put("d", "python");
		
		System.out.println(strMap2);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
		
		strMap.entrySet().forEach(arg ->{
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});
		
		
	}

}
