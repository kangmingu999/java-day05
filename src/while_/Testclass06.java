package while_;

public class Testclass06 {
public static void  main(String[] args) {
	// 무조건 1번은 실행된다
	int su=5, i=1;
	do {
		//종속문장
		System.out.println(i);
		i++;
	}while(i<su);//조건식
	System.out.println("다음 문장들 실행!");
	while(i<su) {
		System.out.println("while : "+ i);
		i++;
	};
}
}
