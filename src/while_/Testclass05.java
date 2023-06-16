package while_;

import java.util.Scanner;

public class Testclass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i , temp;
	System.out.println("수 입력");
	i = input.nextInt();
	
	boolean bool = true;
	while(bool) {
		temp = i%10;
		i = i/10;
		System.out.println(temp);
		if(i == 0) {
			//break
			bool = false;
		}
	}
	System.out.println("다음 문장들 실행");
}
}
