class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        String str = "";
        for(char c:word.toCharArray())
        {
            str = c + str;
            if(c==ch)
            {
                return str + word.substring(index+1);
            }
            index++;
        }
        return word;
    }
}