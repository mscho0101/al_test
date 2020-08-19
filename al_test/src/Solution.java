import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		Solution sl = new Solution();
		int [] arr = {5,9,7,10};
		int divisor = 5;
		System.out.println(Arrays.toString(sl.solution(arr, divisor)));
		}
	
	
	
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
     	int [] re = {};

        ArrayList<Integer> num = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
			    Arrays.sort(arr);
                num.add(arr[i]);
				answer = num.stream().mapToInt(Integer::intValue).toArray();
				}
            
            if(Arrays.equals(answer, re) == true) {
				num.clear();
				num.add(-1);
				answer = num.stream().mapToInt(Integer::intValue).toArray();
				}


			}
        
        return answer;
    }
}