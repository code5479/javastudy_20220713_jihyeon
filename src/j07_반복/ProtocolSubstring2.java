package j07_반복;

public class ProtocolSubstring2 {

	public static void main(String[] args) {
		
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendData:2022/07/21";
		String message = null;
		String to = null;
		String from = null;
		String sendData = null;

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
	}

}
