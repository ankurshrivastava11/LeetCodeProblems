package practicet;

import java.lang.reflect.Field;

class icbroker {
    private final Character m_value = 'a';
    
    public String toString() { return "" + m_value; }

    public static void main(String[] args) {
    	int a = 1;

    	System.out.println(a);
    	int b = a++;
    	System.out.println(b +"A= "+ a);
    	int c = ++b;
    	System.out.println(a +" "+ b+ " "+ c);
        
    }
}