package main.com.collatz;

public class Collatz {

	public static void main(String[] args) {
		long onenum = 372908606L;
		for(;;){
		if(onenum == 1) break;
		System.out.println(onenum);
		for (;;) {
			if (onenum == 1 || onenum == 0) {
				break;
			} else if (onenum % 2 == 0) {
				onenum = onenum / 2;
				System.out.println(onenum);
			} else {
				onenum = onenum * 3 + 1;
			}
		}
	}
	}
}
