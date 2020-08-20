import java.util.Arrays;

public class KimSearch {
	
	
    public String KimSearch(String[] seoul) {
        String answer = "";
        int index = 0;
        String who = "Kim";
        
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals(who)) {
				index = i;
			}

		}
		answer = "김서방은 "+index+"에 있다";
        return answer;
    }
	
	public static void main(String[] args) {
		KimSearch ks = new KimSearch();
		String [] seoul = {"Jane","Kim"};
		System.out.println(ks.KimSearch(seoul));
	}
	
	
}
