package firstpage;

public class Practise8 {

    public static void main(String[] args) {

        System.out.println(myAtoi("-"));
    }


    public static int myAtoi(String targetStr) {
        String trimStr = targetStr.trim();
        if(trimStr.length() == 0) return 0;
        String firstStr = trimStr.substring(0, 1);
        StringBuilder sb = new StringBuilder();
        if((!firstStr.matches("^[0-9]*$") && !firstStr.equals("-"))
                || (firstStr.equals("-") && trimStr.length() == 1)) return 0;
        for (int i = 0; i < trimStr.length(); i++) {
            String str = trimStr.substring(i, i + 1);
            if(str.equals("-") && sb.length() == 0) sb.append(str);
            if(str.matches("^[0-9]*$")) sb.append(str);
            if((!str.matches("^[0-9]*$") && !str.equals("-")) || (str.equals("-") && sb.length() > 1)) break;
        }

        long longValue = Long.valueOf(sb.toString());
        if(longValue > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(longValue < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return Integer.valueOf(sb.toString());
    }
}
