package practicet;

public class reversevow {
	
public String reverseVowels(String s) {
	char[] vow = s.toCharArray();
	int i = 0;
	int j = vow.length-1;
	
	while(i<j)
	{
		
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
		{
			if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'||s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'){
				char temp;
				temp = vow[i];
				vow[i] = vow[j];
				vow[j] = temp;
				i++;
				j--;
			}
			else{
			    j--;
			}
		}
		else{
		i++;
		}
	}
	return new String(vow);
        
    }

}
