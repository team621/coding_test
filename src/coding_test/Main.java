package coding_test;

public class Main {

	public static void main(String[] args) {
		System.out.println("coding test");
		
		Lv1 lv1 = new Lv1();
		//하샤드 test case [10=true, 11=false]
		System.out.println(lv1.harsa(10, "other"));
		
		int[] arrAvgValue = {1,2,3,4};
		System.out.println(lv1.arrAvg(arrAvgValue));
	}
}