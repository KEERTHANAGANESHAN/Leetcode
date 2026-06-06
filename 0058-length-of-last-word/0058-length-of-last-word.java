class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
           char ch=s.charAt(i);
           if(ch==' ' && c==0){
            continue;
           }
           else if(ch!=' '){
            c++;
           }
           else{
            break;
           }
        }
        return c;
    }
}