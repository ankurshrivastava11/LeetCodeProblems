package practicet;

import java.math.BigInteger;
import java.util.Random;


public class RabinKarp {
    static String s, sub;
    static long mod = 997;
    static int R=10;
    static long RM;
    static long phash;
     
    private static void setUp(){
        
        mod = BigInteger.probablePrime(32, new Random()).longValue();
        //Compute Hash for Pattern
        
        phash = 0;
        for(int i=0;i<sub.length();++i){
            //Calculation =>> phash = phash*R+(new digit)
            RabinKarp.phash = hash(sub, i, RabinKarp.phash); 
        }
        
        //Precompute RM
        RM = 1;
        for(int i=0;i<sub.length()-1;++i){
            RM=RM*R%mod;
        }
    }
    
    private static long hash(String ss, int i, long lastHash){ 
        if(i>=sub.length())return ((lastHash+ss.charAt(i-sub.length())*(mod-RM))*R+ss.charAt(i))%mod; 
        else return lastHash*R+ss.charAt(i);
    } 
    
    public static int match(String s, String sub){
        RabinKarp.s = s;
        RabinKarp.sub = sub;  
        setUp();
        
        long lastHash = 0;
        int i; 
        for(i=0;i<s.length();++i){
           long cHash = hash(s, i, lastHash); 
           if(cHash == phash)return i-sub.length()+1;
           lastHash = cHash;
       }
       return -1;
    }
    
    public static void main(String[] args){
        s = "findaneedleinahaystack";
        sub="needle";
        System.out.println("Match found at index "+match(s, sub));
    }
}
