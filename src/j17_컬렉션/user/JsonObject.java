package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {

	public static void main(String[] args) {

		Map<String, Object> json = new HashMap<String,Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> todojson = new HashMap<String, Object>();
		todojson.put("name", "bulbasaur");
		todojson.put("url", "https://pokeapi.co/api/v2/pokemon/1/");
		
		Map<String, Object> todojson2 = new HashMap<String, Object>();
		todojson2.put("name", "ivysaur");
		todojson2.put("url", "https://pokeapi.co/api/v2/pokemon/2/");
		
		Map<String, Object> todojson3 = new HashMap<String, Object>();
		todojson3.put("name", "venusaur");
		todojson3.put("url", "https://pokeapi.co/api/v2/pokemon/3/");
		
		list.add(todojson);
		list.add(todojson2);
		list.add(todojson3);
		
		json.put("count", 1118);
		json.put("next", "https://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		json.put("previous", null);
		json.put("results", list);
		
		System.out.println(json);

	}

}
