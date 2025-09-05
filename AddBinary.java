import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger X=new BigInteger(a,2);
        BigInteger Y=new BigInteger(b,2);
        BigInteger add=X.add(Y);
         String result=add.toString(2);
        
        return result;
        
    }
}
