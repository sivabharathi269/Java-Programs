class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        int nval=n;
       int nopen=0;
        int nclose=0;
        String str="";
        generate(nopen,nclose,nval,str,res);
      return res;
        
    }
    public void  generate(int op,int cl,int len,String s,List<String>res){
        if(s.length()==len*2){
            res.add(s);
            return;
            }
            if(op<len){
                generate(op+1,cl,len,s+"(",res);
            }
            if(cl<op){
                generate(op,cl+1,len,s+")",res);
            }



    }
}
