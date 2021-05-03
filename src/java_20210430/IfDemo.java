package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		// Run Configurations => Arguments => Program arguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month >= 3 &&  month <= 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "다섯번째 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다.");
		
		int a = 125900;
		double d = 125234.789;
		String name = "위나현";
		
		// 정수형은 %d, 10 넣으면 10자리로 나옴, 앞에 0있으면 자리를 0으로 채워줌, - 붙이면 뒤를 채워줌, ','는 쉼표 넣어줌
		System.out.printf("a는 %,d 입니다.%n", a);
		// 실수형은 %f, .2는 소수점 둘째자리까지
		System.out.printf("d는 %,.2f 입니다.%n", d);
		// 문자형은 %s, % 개수만큼 변수 입력
		System.out.printf("저는 %s, %d, %f 입니다.%n",name,a,d);
		
		int a1 = 100;
		String msg = "";
		if(a1 %2 ==0) {
			msg = "짝수";
		}else {
			msg = "홀수";
		}
		System.out.println(msg);
		
		msg = (a1 % 2 ==0) ? "짝수" : "홀수";
		System.out.println(msg);

	}

}
