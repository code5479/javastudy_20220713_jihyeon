package j08_메소드;

public class Method1 {
	
	public static void printData(String data) {
		
		while (true) {
			int commandindex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1); // 1을 안주게 되면 처음 @이만 찾음

			String command = data.substring(commandindex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);

			System.out.println(command + ":" + content);
			
			if(nextCommandIndex == -1) {
				break;
			}
			data = data.substring(nextCommandIndex);
		}
		System.out.println("--------------------------------");
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendData:2022/07/21";
		String data2 = "@Message:안녕하세요2.@To:김준일@From:김준이@SendData:2022/07/21";
		String data3 = "@Message:안녕하세요3.@To:김준일@From:김준이@SendData:2022/07/21";
		
		printData(data);
		printData(data2);
		printData(data3);
		

	}

}
