package practicet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subPalindrome {

	public subPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public static Set<String> getPal(String s) {
		Set<String> res = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();
			int j = i, k = i + 1;
			res.add(s.charAt(i) + "");
			for (int it = 0; it < 2; it++) {
				if (it == 1) {
					j = i - 1;
					k = i + 1;
					sb.setLength(0);
					sb.append(s.charAt(i));
				}
				while (j >= 0 && k < s.length()) {
					if (s.charAt(j) == s.charAt(k)) {
						sb.insert(0, s.charAt(j));
						res.add(sb.append(s.charAt(k)).toString());
						j--;
						k++;
					} else
						break;
				}
			}
		}
		return  res;
	}
	
	public static void main(String[] args){
		String s = "aabb";
		Set<String> res = getPal(s);
		for(String i:res) System.out.println(i);
		
		
	}

}
