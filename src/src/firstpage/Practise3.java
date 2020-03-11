package firstpage;

public class Practise3 {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder strNew = new StringBuilder();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            strNew.append(a);
            maxLength = strNew.toString().length() > maxLength ? strNew.toString().length() : maxLength;
            for (int j = i + 1; j <= s.length() - 1; j++) {
                char b = s.charAt(j);
                if (strNew.toString().indexOf(String.valueOf(b)) >= 0) {
                    strNew = new StringBuilder();
                    break;
                } else {
                    strNew.append(b);
                    if(strNew.toString().length() > maxLength)
                        ++maxLength;
                }
                if(j == s.length()- 1)
                    strNew = new StringBuilder();
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
       System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
