package while_;

public class Testclass01 {
public static void main(String[] args) {
	/*
	 break
	 -switch 또는 반복문 안에서 사용가능
	 -break를 만나는 순간 해당 종속문장을 빠져나간다
	 continue
	 -반복문 안에서 사용가능
	 -continue를 만나는 순간 반복문의 위로 올라간다
	 */
	int i =0;
	while(true) {
		i++;
		System.out.println("i : "+i);
		if(i>3) {
			break;
		}
	}
	System.out.println("다음 문장들 실행");
	/*
	 if(i==4){
	 break;
	  }
	 */
	for( ; ; ) {
		System.out.println("for");
		if(i==4)
			break;
	}
	System.out.println("다음 문장들 실행");
}

}
