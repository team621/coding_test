package coding_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	
	//홀짝
	public String oddEven(int num) {
		String answer = "";
		
		answer = num % 2 ==0 ? "Even" : "Odd";
		
		return answer;
	}
	
	//제일 작은 수 제거
	public int[] removeMin(int arr[]) {
		int[] answer = {};
		int min = arr[0];
		
		ArrayList<Integer> tempList = new ArrayList<>();
		
		if(arr.length <= 1) return new int[]{-1};

        for(int i=0; i<arr.length; i++){
            tempList.add(arr[i]);
            if(min > arr[i]) min = arr[i];
        }

        int minIndex = tempList.indexOf(min);
        tempList.remove(minIndex);
        answer = new int[tempList.size()];

        for(int i=0; i<tempList.size(); i++) answer[i] = tempList.get(i);
		
		return answer;
	}
	
	//제곱근 구하기
	public long sqrt(long n) {
		long answer = 0;
		double temp = Math.sqrt(n);
		if(temp % 1 == 0) return (long) ((temp + 1) * (temp + 1));
		else return -1;
	}

	//내림차순 배치
	public long descSort(long n, String flag) {
		if(flag.equals("my")) {
			String temp = "";
	        String[] tempArr = Long.toString(n).split("");
	        
	        Long[] tempLArr = new Long[tempArr.length];

	        for(int i=0; i<tempArr.length; i++) tempLArr[i] = Long.parseLong(tempArr[i]);

	        Arrays.sort(tempLArr, Collections.reverseOrder());

	        for(int i=0; i<tempArr.length; i++) temp += Long.toString(tempLArr[i]);
					
			return Long.parseLong(temp);
			
		}else if(flag.equals("other")) {
			String temp[] = String.valueOf(n).split("");
			Arrays.sort(temp);
			
			StringBuilder sb = new StringBuilder();
			for(String a : temp) sb.append(a);
			
			return Long.parseLong(sb.reverse().toString());
		}else {
			return -1;
		}
		
	}
	
	//최소공배수, 최대공약수
	public int[] gcd(int n, int m) {
		int[] answer = new int[2];
		int temp = 1;
		int gcd = n * m;
		
		while(temp != 0) {
			temp = m % n;
			m = n;
			n = temp;
		}
		
		answer[0] = m;
		answer[1] = gcd/m;		
		
		return answer;
	}
	
	//배열 뒤집기
	public int[] reverseArr(long n) {
		int[] answer = {};
		
		String str = String.valueOf(n);
		
		StringBuilder sb = new StringBuilder(str);
		
		sb = sb.reverse();
		
		String[] strArr = sb.toString().split("");
		
		answer = new int[strArr.length];
		
		for(int i=0; i<strArr.length; i++) answer[i] = Integer.parseInt(strArr[i]);
		
		return answer;
	}
	
	//자릿수 더하기
	public int sumInt(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n /= 10;	
		}

		return answer;
	}
	
	public String scaleChange(String s) {
		String answer = "";
		String strArr[] = s.split(" ");
		int cnt = 0;
		
		for(String ans : strArr) {
			//여기서 짝,홀이 바뀜 그래서 아래에서 반대로 로우 업퍼 함
			cnt = ans.equals(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ans.toLowerCase() : ans.toUpperCase();
		}		
		return answer;
	}
	
	//약수의 합
	public int aliquit(int n) {
		int answer = 0;
		int m = n;
		
		while(m > 0) {
			if(n%m==0) answer += m;
			m--;
		}
		return answer;
	}
	
	//시저암호
	public String sizer(String s, int n) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isLowerCase(ch)) ch = (char)((ch-'a'+n) % 26 + 'a');
			else if(Character.isUpperCase(ch)) ch = (char)((ch-'A'+n) % 26 + 'A');
			System.out.println(ch);
			answer += ch;
		}
		
		return answer;
	}
	
	//문자열 숫자 변환
	public int changeInt(String s) {
		int answer = 0;
		
		if(s.contains("+")) s.replace("+","");

        answer = Integer.parseInt(s);
				
		return answer;
	}
	
	//수박수박수박수박수박
	public String waterMelon(int n) {
		String answer = "";
        int count = n/2;

        for(int i=0; i<count; i++){
            answer += "수박";
        }

        if(n%2 == 1) answer += "수";
        
		return answer;
	}
	
	//김서방
	public String findKim(String[] seoul) {
		int x = Arrays.asList(seoul).indexOf("Kim");
		return "김서방은 " + x + "에 있다.";
	}
	
	//문자열 다루기 기본
	public boolean Str(String s) {
		boolean answer = true;
		
        if(s.length() == 4 || s.length() == 6){
            String ansArr[] = s.split("");
            for(int i=0; i<ansArr.length; i++){
                int index = ansArr[i].charAt(0);
                if(index >= 48 && index <= 57) answer = true;
                else {
                	answer = false;
                	break;
                }
            }
        }else answer = false;
		
		return answer;
	}
	
	//문자열 역배열
	public String reverseStr(String s) {
        String answer = "";
        Character[] arr = new Character[s.length()];

        for(int i=0; i<arr.length; i++) arr[i] = s.charAt(i);

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) answer += arr[i];
        
        return answer;
	}
}