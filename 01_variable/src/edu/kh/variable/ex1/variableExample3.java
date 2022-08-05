package edu.kh.variable.ex1;

//글자 크기조절 : ctrl + (위쪽 숫자 배열) - or +
public class variableExample3 {

	//main method(메서드) : 자바 애플리케이션 실행 시 반드시 필요한 구문
	public static void main (String[] args) {
		
		//******변수 명명 규칙 *******
		
		// 1. 대소문자가 구분되며 길이 제한이 없다.
		//(단, 띄어쓰기 X)
		
		int num1;
		int Num1;
		//int Num1; //Duplicate local variable Num1 
				  //Num1 변수가 중복이다 (에러) 
				  //대소문자가 구분되지만 같은 이름은 쓸 수 없다
	
		int abcdefg;
		int showMeTheMoney;
		int skldjflsadekj; //길이의 제한 X 띄어쓰기 시 에러 발생
		
		// 2. 예약어 사용 금지
		
		//int int;
		//int true;
		//boolean final;
		//char void;
		
		// 3. 숫자로 시작하면 안된다.
		int age1;
		//int 1age; //Syntax error on token "1", delete this token 1이라는 문자를 지워라
				  //Syntax error : 문법 오류 
		
		// 4. 특수문자는 '$' , '_' 만을 허용한다.
		// -> $는 내부클래스 사용시 자동으로 붙는 기호 (직접 사용 X)
		// -> _는 상수 단어 구분 외에는 사용 X
		
		double $dNum;
		float _f_num$;
		//longlong@Num!; //에러
		//$는 잘 사용하지 않음
		
		// 5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다.
		//		단, 첫 시작 글지나느 소문자로 하는 것이 관례이다.
		// ==카멜 표기법 (자바, 자바스크립트, c언어, c# , c++ 에서 사용)
		//오류는 발생하지 않음 (개발자들 간의 약속/ 관례 ) 
		//띄어쓸 수 없어서 개발자들이 알아보기 쉽게하기 위해
		
		int userAge;
		int Helloworld;
		
		
		//참고 : 변수명은 언어 제한이 없다.
		//단, 코드 공유시 글자 깨짐이 발생할 수 있어서 권장X
		int 정수1;
		boolean 참거짓;
		
		// ** 변수는 한 개의 데이터만 보관 가능 **
		int iNum = 30;
		System.out.println(iNum);
		
		 iNum = 50;
		System.out.println(iNum); //마지막 값만 보관 됨
		
		//문자열 자료형 String
		// ->기본 자료형 X, 참조형 O
		
		//String의 리터럴 : 문자열
		//String의 리터럴 표기법 : " 쌍따옴표 " 
		
		String str1;
		str1 = "안녕하세요?"; //str1 변수의 초기화 (최초 값 대입 )
		
		System.out.println(str1);
		
		str1 = "String도 기본 자료형 변수처럼 값을 변경할 수 있습니다.";
		
		System.out.println(str1);
		
		//변수 선언과 동시에 초기화
		String name = "이연정";
				
		int age = 29;
		
		char gender = '여';
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(age + 10); //숫자 + 숫자 = 두 숫자의 합
									  //39
		
		System.out.println(name + "입니다."); //문자열 + 문자열 = 이어쓰기
											 //이연정입니다
		
		System.out.println(name + age); //문자열 + 숫자 = 이어쓰기
										//이연정29
		
		System.out.println(age + 10 + name); //숫자 + 숫자 + 문자열 = 
											//숫자합 + 문자열 (이어쓰기)
											//39이연정
		
		System.out.println(name + age + 10); // 문자열 + 숫자 + 숫자 =
											 // 이어쓰기
											 //왼쪽에서 오른쪽으로 순서대로 더하기
											 //이연정3910
		
		
		
		//이연정님은 29세 여성입니다.
		System.out.println(name + "님은 " + age + "세 " + gender + "성입니다.");
		
		System.out.println("-----------------------------------------------------------");
		
		
		//상수 (final) : 항[상] 같은 [수] (이 값은 절대 변하지 않는다)
		//-> Java에서는 한번 값을 기록하면 값을 바꿀 수 없는 변수
		//(저장되는 값을 바꿀 수 있는데 그 기능을 막아 버리는 것)
		
		int num2 = 200;
		num2 = 300; //새로 대입 가능
		
		//상수 (대문자로 표기, 여러 단어면 _로 구분)
		final int CONSTANT_NUMBER =10000000; //1억
		//마지막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다.
		//변하지 않는 수 (상수)
		
		//CONSTANT_NUMBER = 0; //에러 발생 
		
		System.out.println(CONSTANT_NUMBER);
		
		//상수 예제
		final int UP = 10;
		final int DOWN = -10;
		final int INIT = 0;
		
		int num3 = INIT;
		
		System.out.println(num3); // 0
		
		num3 = num3 + UP; //0 + 10을 num3에 대입하겠다.
		System.out.println(num3); // 10
		
		num3 = num3 + DOWN * 3; // num3 + DOWN + DOWN + DOWN
		//사칙연산 우선순위 (* , / ) 먼저
		System.out.println(num3); //-20
		
		
	}
}
