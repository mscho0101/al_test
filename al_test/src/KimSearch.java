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
		answer = "�輭���� "+index+"�� �ִ�";
        return answer;
    }
	
	public static void main(String[] args) {
		KimSearch ks = new KimSearch();
		String [] seoul = {"Jane","Kim"};
		System.out.println(ks.KimSearch(seoul));
	}
	
	
}
