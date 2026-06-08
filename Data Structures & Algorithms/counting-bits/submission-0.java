class Solution {
    public int[] countBits(int n) {
        String s = "";
        int c = 0;
        int arr[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            s = Integer.toBinaryString(i);
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
            }
            arr[i] = c;
            c = 0;
        }

        return arr;
    }
}
