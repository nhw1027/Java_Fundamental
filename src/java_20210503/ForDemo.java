package java_20210503;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum+= i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);

		int evensum = 0;
		//for (int i = 0; i <= 10; i+=2) {
			//evensum += i;			
		for (int i = 1; i <= 10; i++) {	
			if (i%2==0) {
				evensum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.%n", evensum);
		
		for(int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for(int second = 2; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first*second);
			}
		}
	}

}
