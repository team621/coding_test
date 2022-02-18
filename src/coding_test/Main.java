package coding_test;

public class Main {

	public static void main(String[] args) {
		System.out.println("coding test");
		
		Lv1 lv1 = new Lv1();
		//하샤드 test case [10=true, 11=false]
		//System.out.println(lv1.harsa(10, "my"));
		
		//배열의 평균 구하기m
		//int[] arrAvgValue = {1,2,3,4};
		//System.out.println(lv1.arrAvg(arrAvgValue));
		
		//collatz
		System.out.println(lv1.collatz(6, "my"));
	}
}