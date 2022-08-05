package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main (String [] args) {
		//트레이 아이콘 -> 인텔HD 그래픽 -> 그래픽 옵션 
		//-> 바로가기 키 -> 사용안함
		
		//ctrl + alt + 방향키 위 or 아래 : 해당 줄 복사

		
		/*출력 메서드
		 * 
		 * System.out.print("내용")
		 * ->( )안의 내용 출력 (줄바꿈 X)
		 * 
		 * System.out.println("내용")
		 * ->( )안의 내용 출력 (줄바꿈 O)
		 * 
		 * 
		 * System.out.printf("내용 + 패턴" , 패턴에 들어갈 값 )
		 * 
		 * 
		 * 
		 * */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb"); //aaaaabbbbb
		System.out.println("ccccc"); //aaaaabbbbbccccc
		System.out.println("ddddd"); //aaaaabbbbbccccc
									 //ddddd
		
		String name = "이연정";
		int age = 29;
		char gender = '여';
		double height = 165.5;
		boolean tf = true;
		
		//이연정님은 29세 여성, 키는 165.5cm 입니다. (true)
		
		System.out.println(name +"님은" + age +"세" + gender + "성, 키는" 
					+ height + "cm 입니다 (" + tf + ")");
		
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b) \n" , name, age, gender, height, tf);
		// \n : 줄 바꿈 (개행)을 나타내는 탈출(escape) 문자
		
		System.out.println("줄 바꼈나요?");
		
		
		System.out.println("추가한 내용");
	}
}
