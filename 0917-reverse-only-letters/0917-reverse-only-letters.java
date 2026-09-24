class Solution {
    public String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] arr = s.toCharArray();
        while(l<r)
        {
            if(!Character.isLetter(arr[l]))
            {
                l++;
            }
            else if(!Character.isLetter(arr[r]))
            {
                r--;
            }
            else{
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}