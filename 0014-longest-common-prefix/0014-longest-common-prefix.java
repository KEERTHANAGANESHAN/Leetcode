class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String t=strs[strs.length-1];
        int i=0;
        while(i<s.length() && i<t.length()){
            if(s.charAt(i)==t.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        String a=s.substring(0,i);
        return a;
    }
}