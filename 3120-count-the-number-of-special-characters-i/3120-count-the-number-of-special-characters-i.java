class Solution {
    public int numberOfSpecialChars(String word) {
        int [] lower=new int[26];
        int [] upper=new int[26];
        int count=0;
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if(ch-'a'>=0)lower[ch-'a']=1;
           else{
            upper[ch-'A']=1;
           }
        }for(int i=0; i<26; i++){
        if(lower[i]==1&&upper[i]==1)count++;
        }return count;
    }
}