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
		//System.out.println(lv1.collatz(6, "my"));
		
		//홀짝 구하기
		//System.out.println(lv1.oddEven(12812981));
		
		//제일 작은 수 제거
		//int[] arr = {1,2,3,4};
		//int[] answer = lv1.removeMin(arr);
		//for(int a : answer) System.out.print(a + ", ");
		
		//제곱근 구하기
		//System.out.println(lv1.sqrt(121));
		
		//내림차순으로 배치
		//System.out.println(lv1.descSort(118372, "other"));
		
		//최대공약수, 최소공배수
		//System.out.println(lv1.gcd(3, 12)[0] + "   " + "  " + lv1.gcd(3, 12)[1]);
		
		//int[] answer = lv1.reverseArr(12345);
		//for(int a : answer) System.out.print(a+ " ,");
		
		//System.out.println(lv1.sumInt(123));
		
		//System.out.println(lv1.scaleChange("try hello world"));
		
		//System.out.println(lv1.aliquit(12));
		
		//System.out.println(lv1.sizer("AB", 1));
		
		//System.out.println(lv1.changeInt("-1234"));
		
		//System.out.println(lv1.waterMelon(3));
		
		//String[] kim = {"LEE", "Kim", "Choi"};
		//System.out.println(lv1.findKim(kim));
		
		//System.out.println(lv1.Str("1234"));
		
		//System.out.println(lv1.reverseStr("asdjfkljasdfZ"));
		
		//System.out.println(lv1.pyCount("pPoooyY"));
		
		//String[] arr = {"abce", "abcd", "cdx"};
		//System.out.println(lv1.arrString(arr, 2));
		
		//System.out.println(lv1.sumTwo(3, 5));
		
		//int[] arr = {4,4,4,3,3};	
		//System.out.println(lv1.hateSame(arr));
		
		//int[] arr = {5, 9, 7, 10};
		//System.out.println(lv1.divisor(arr, 5));
		
		//System.out.println(lv1.middleStr("abcde"));
		
		System.out.println(lv1.coin(3, 20, 4));
	}
}