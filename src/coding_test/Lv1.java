package coding_test;

public class Lv1 {
	
	//하샤드
	public boolean harsa(int x, String flag) {
		boolean answer = true;
		
		if(flag.equals("my")) {
			int sum = 0;
			int testInt = x;
			
			while(x >= 10) {
				sum += x%10;
				x = x/10;
			}
			sum += x%10;
			
			if(sum%testInt != 0) {
				answer = false;
			}
		}else if(flag.equals("other")) {
			String[] temp = String.valueOf(x).split("");
			int sum = 0;
			for(String s : temp) {
				sum += Integer.parseInt(s);
			}
			
			if(x % sum != 0) {
				answer = false;
			}
		}
		return answer;
	}
	
	//배열 평균 구하기
	public double arrAvg(int[] arr) {
		double answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		
		answer = answer/arr.length;
		
		return answer;
	}
	
	//collatz
	public int collatz(int num, String flag) {
		int answer = 0;
		if(flag.equals("my")) {
			while (num != 1) {
				if(num % 2 == 0) {
					num /= 2;
				}else if(num % 2 == 1) {
					num = (num * 3) +1;
				}
				
				if(answer >= 500) {
					answer = -1;
					break;
				}else {
					answer++;
				}
			}
		}else if(flag.equals("other")) {
			for(int i=0; i<500; i++) {
				if(num == 1) return i;
				num = (num %  2 == 0) ? num/2 : num*3 + 1;
			}
			return -1;
		}
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}