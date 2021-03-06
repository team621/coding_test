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
	
	
	//p, y 세기
	public boolean pyCount(String s) {
		boolean answer = false;
        String[] arr = s.split("");
        int pCount = 0;
        int yCount = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].toLowerCase().equals("p")) pCount++;
            if(arr[i].toLowerCase().equals("y")) yCount++;
        }
        
        if(pCount == yCount) answer = true;
        
        return answer;
	}
	
	//문자열 내 마음대로 정렬하기
	public String[] arrString(String[] strings, int n) {
		String[] answer = new String[strings.length];
		
		ArrayList<String> array = new ArrayList<String>();
		
		for(int i=0; i<strings.length; i++) array.add(strings[i].charAt(n) + strings[i]);
		
		Collections.sort(array);
		
		for (int i = 0; i < array.size(); i++) answer[i] = array.get(i).substring(1);
		
		return answer;
	}
	
	//두 정수 사이의 합
	public long sumTwo(int a, int b) {
		long answer = 0;
		int big = a > b ? a : b;
		int small = a > b ? b : a;
		
		for(int i=small; i<=big; i++) answer += i;
		
		return answer;
	}
	
	//같은숫자는 싫어
	public int[] hateSame(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
        int num = -1;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != num) {
        		list.add(arr[i]);
        		num = arr[i];
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        

        return answer;
	}
	
	//나누어 떨어지는 숫자 배열
	 public int[] divisor(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
	        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        
        if(list.size() == 0) list.add(-1);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) answer[i] = list.get(i);
        
        Arrays.sort(answer); 
        
        return answer;
	 }
	 
	 //가운데 글자 가져오기
	 public String middleStr(String s) {
		 String answer = "";
		 
		 if(s.length() % 2 != 0) answer = s.substring(s.length()/2, s.length()/2+1);
	     else answer = s.substring(s.length()/2-1, s.length()/2+1);
		 
		 return answer;
	 }
	 
	 //부족한 금액 구하기
	 public long coin(int price, int money, int count) {
		 long answer = money;

		 for(int i=1; i<=count; i++) {
			 answer -= price * i;
		 }
		 
		 if(answer < 0) answer *= -1;
		 else answer = 0;
		 
		 return answer;
	 }
	 
	 //나머지가 1이 되는 수 찾기
	 public int one(int n) {
		 int answer = 1;
		 
		 while(n % answer != 1) answer++;
		 
		 return answer;
	 }
	 
	 //최소 직사각형
	 public int minRec(int[][] sizes) {
		 int row = -1;
	        int column = -1;

	        for(int i=0; i<sizes.length; i++){
	            if(sizes[i][0] < sizes[i][1]){
	                int temp = sizes[i][1];
	                sizes[i][1] = sizes[i][0];
	                sizes[i][0] = temp;
	            }
	        }

	        for(int i=0; i<sizes.length; i++){
	            if(row < sizes[i][0]) row = sizes[i][0];
	            int[] tempArr = sizes[i];
	            for(int j=1; j<tempArr.length; j++){
	                if(column < tempArr[j]) column = tempArr[j];
	            }
	        }
	        return row * column;
	 }
	 
	 //2016년 요일 구하기
	 public String days(int a, int b) {
		int days = 0;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        for(int i=0; i<a-1; i++) days += month[i];
        days += (b-1);
        
        return day[days % 7];
	 }
	 
	 //두개 뽑아서 더하기
	 public int[] twoPlus(int[] numbers) {
		 ArrayList<Integer> list = new ArrayList<>();
		 
		 for(int i=0; i<numbers.length; i++) {
			 for(int j=i+1; j<numbers.length; j++) {
				 int a = numbers[i] + numbers[j];
				 if (list.indexOf(a) < 0){
					 list.add(a);
				 }
			 }
		 }
		 
		 int[] answer = new int[list.size()];
		 
		 for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
		 
		 Arrays.sort(answer);
		 
		 return answer;
	 }
	 
	 //3진법
	 public int samJinbub(int n) {
		 int answer = 0;
		 String samJinsu = "";
		 
		 while(n > 0) {
			 samJinsu += Integer.toString(n % 3);
			 n /= 3;
		 }

		 String arr[] = samJinsu.split("");
		 List<String> list = Arrays.asList(arr);
		 Collections.reverse(list);
		 
		 for(int i=0; i<list.size(); i++) {
			 answer += Math.pow(3, i) * Integer.parseInt(list.get(i));
		 }
		 
		 return answer;
	 }
	
	 //수포자
	 public int[] supoja(int[] answers) {
		 int[] answer = {};
		 int[] first = {1,2,3,4,5};
		 int[] second = {2,1,2,3,2,4,2,5};
		 int[] third = {3,3,1,1,2,2,4,4,5,5};
		 int count1st = 0;
		 int count2nd = 0;
		 int count3rd = 0;
		 int j = 0;
		 
		 //1번 학생의 점수 구하기
		 for(int i=0; i<answers.length; i++) {
			 if(answers[i] == first[j]) count1st++;
			 j++;
			 if(j == first.length) j = 0;
		 }
		 j=0;
		 
		 //2번 학생의 점수 구하기
		 for(int i=0; i<answers.length; i++) {
			 if(answers[i] == second[j]) count2nd++;
			 j++;
			 if(j == second.length) j = 0;
		 }
		 j=0;
		 
		 //3번 학생의 점수 구하기
		 for(int i=0; i<answers.length; i++) {
			 if(answers[i] == third[j]) count3rd++;
			 j++;
			 if(j == third.length) j = 0;
		 }
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 ArrayList<Integer> listAnswer = new ArrayList<Integer>();
		 
		 list.add(count1st);
		 listAnswer.add(1);
		 
		 if(count1st == count2nd) {
			 list.add(count2nd);
			 listAnswer.add(2);
		 }
		 else if(count1st < count2nd) {
			 list.remove(0);
			 listAnswer.remove(0);
			 list.add(count2nd);
			 listAnswer.add(2);
		 }
		 
		 if(list.get(0) == count3rd) {
			 list.add(count3rd);
			 listAnswer.add(3);
		 }
		 else if(list.get(0) < count3rd) {
			 list.removeAll(list);
			 listAnswer.removeAll(listAnswer);
			 list.add(count3rd);
			 listAnswer.add(3);
		 }
		 
		 answer = new int[listAnswer.size()];
		 
		 for(int i=0; i<listAnswer.size(); i++) answer[i] = listAnswer.get(i);
		 
		 return answer;
	 }

}