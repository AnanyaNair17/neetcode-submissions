class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()==t.length()){
          char s1[] = new char[s.length()];
          for(int i = 0; i<s.length(); i++){
            s1[i] = s.charAt(i);
          }
          char t1[] = new char[t.length()];
          for(int j = 0; j<t.length(); j++){
            t1[j] = t.charAt(j);
          }
          Arrays.sort(s1);
          Arrays.sort(t1);
          for(int k=0; k<s.length(); k++){
            if(s1[k]!=t1[k]){
                return false;
            }
          }
          return true;
       }
       else{
        return false;
       }
    }
}
