class Solution {
    public boolean isPalindrome(String s) {
        String snew = "";
        String sreverse = "";
        for(int i = 0; i<s.length(); i++){
            int val = (int)s.charAt(i);
            if((val>=65 && val<=90) || (val>=48 && val<=57) || (val>=97 && val<=122)){
            snew = snew + s.charAt(i);
            }
        }
        for(int i = snew.length()-1; i>-1; i--){
            sreverse = sreverse + snew.charAt(i);
            
        }

        if(snew.equalsIgnoreCase(sreverse)){
            return true;
        }
        else{
            return false;
        }
    }
}
