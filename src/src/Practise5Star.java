public class Practise5Star {

    public static String longestPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder returnStr = new StringBuilder();
        StringBuilder strReverse = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            str.append(a);
            strReverse.append(a);
            for (int j = i + 1; j <= s.length() - 1; j++) {
                char b = s.charAt(j);
                str.append(b);
                strReverse.append(b);
                strReverse.reverse();
                if (str.toString().equals(strReverse.toString()) &&
                        str.toString().length() > returnStr.toString().length()) {
                    returnStr = new StringBuilder();
                    returnStr.append(str);
                }
                strReverse.reverse();
            }
            str = new StringBuilder();
            strReverse = new StringBuilder();
        }

        if (returnStr.toString().length() == 0 && s.length() > 0)
            returnStr.append(s.substring(0, 1));

        return returnStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
        //StringBuilder sb = new StringBuilder("dbc");
        //System.out.println(sb.toString());
        //System.out.println(sb.reverse().toString());
    }
}
