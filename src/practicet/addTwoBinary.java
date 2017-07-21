package practicet;

public class addTwoBinary {
	  public String addBinary(String a, String b) {
		  
		  int i = Integer.parseInt(a,2);
		  int j = Integer.parseInt(b,2);
		  int k = i+j;
		  String str = Integer.toBinaryString(k);
	      return str;  
		  
	    }

}
