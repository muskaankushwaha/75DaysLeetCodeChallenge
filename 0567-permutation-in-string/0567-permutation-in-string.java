class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []freq=new int[26];
        
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            freq[ch-'a']++;
        }
        int windsize=s1.length();
        for(int i=0; i<s2.length(); i++){
            int windIdx=0,indx=i;
            int []windfreq=new int[26];
            while(windIdx<windsize && indx<s2.length()){
                char c=s2.charAt(indx);
        windfreq[c-'a']++;
        windIdx++;
        indx++;
            }
            if(Arrays.equals(freq,windfreq)){
              return true;
            
            }
        }
        return false;
    }
}