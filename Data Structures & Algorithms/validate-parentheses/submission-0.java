class Solution {
    public boolean isValid(String s) {
        char ch;
        int c = -1;
        char arr[] = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if(c!=arr.length-1 && (ch=='{' || ch=='(' || ch=='[')){
                arr[++c] = ch;
            }
            else{
                if(c>-1 && ((ch=='}' && arr[c]=='{') || (ch==')' && arr[c]=='(') || (ch==']' && arr[c]=='['))){
                    c--;
                }
                else{
                    return false;
                }
            }

        }
        if(c==-1){
            return true;
        }
        else{
            return false;
        }
    }
}
