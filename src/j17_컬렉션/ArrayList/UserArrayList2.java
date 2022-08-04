package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList2{
	
	private List<User> userList2;
	private Scanner scanner;
	
	public UserArrayList2(){
		userList2 = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public static void start() {
		
		UserArrayList2 userArrayList2 = new UserArrayList2();
		
		while(true) {
			String select = null;
			System.out.println("[사용자 관리 시스템]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("선택 > ");
			
			select = userArrayList2.getScanner().nextLine();
			if(select.equals("1")) {
				userArrayList2.addUser();
			}else if(select.equals("2")) {
				userArrayList2.showUser();
			}else if(select.equals("3")) {
				userArrayList2.removeUser();
			}else if(select.equals("q")) {
				System.out.println("시스템 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		User user2 = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		userList2.add(user2);
	}
	
	public void showUser() {
	
		for(User user2 : userList2) {
			System.out.println("아이디\t >" + user2.getUsername());
			System.out.println("비밀번호 >" + user2.getPassword());
			System.out.println("이름\t >" + user2.getName());
			System.out.println("이메일\t >" + user2.getEmail());
		}
	}
	
	public void removeUser() {
		String username = null;
		String password = null;
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		
		for(User user2 : userList2) {
			if(user2.getUsername().equals(username)) {
				System.out.print("비밀번호 입력: ");
				password = scanner.nextLine();
				if(user2.getPassword().equals(password)) {
					userList2.remove(user2);
					System.out.println("삭제완료");
					return;
				}else {
					System.out.println("비밀번호 오류");
					return;
				}
			}
		}
		System.out.println("해당아이디는 존재하지 않습니다.");
	}
		
	public static void main(String[] args) {
		start();
	
	}
	
	
	
	
}
