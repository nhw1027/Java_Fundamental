package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		// char 리터럴 => 문자 표현법
		char c1 = '위';
		char c2 = '나';
		char c3 = '현';
		
		//ln은 \n같은 기능
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char c4 = '\uc704';
		char c5 = '\ub098';
		char c6 = '\ud604';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		// char 리터럴 => 아스키코드 표현법
		
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		// 문자중에 사용할 수 없는 문자는 ',\
		// 사용하기 위해서는 \를 사용해야 한다.
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		// 특수문자 \t \n
		
		System.out.print("안녕하세요. \n저는 위나현입니다. \n잘 부탁드립니다.\n");
		
		System.out.println("아이디\t이름\t지역");
		System.out.println("nhw1027\t위나현\t서울");
	}

}
