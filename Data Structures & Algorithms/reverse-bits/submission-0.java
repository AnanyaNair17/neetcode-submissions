class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        String snew = "";
        for(int i = s.length()-1; i>-1; i--){
            snew = snew + s.charAt(i);
        }
        for(int i = 0; i<32-s.length(); i++){
            snew = snew + '0';
        }
        return (int)Long.parseLong(snew, 2);
    }
}
