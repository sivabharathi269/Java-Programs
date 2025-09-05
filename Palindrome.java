class Solution {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
       boolean palindrome=false;
        String result="";

     for(int i=0;i<s.length();i++){
       
         result+=s.charAt(i);
       }

    
     String rev="";
     for(int i=result.length()-1;i>=0;i--){
         rev+=result.charAt(i);
     }
     if(result.equals(rev)){
         palindrome=true;
     }
    System.out.println(result);
         System.out.println(rev);
            System.out.println(result.equals(rev));
     return palindrome;
    }
}
