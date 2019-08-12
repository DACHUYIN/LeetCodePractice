import java.util.Map;
import java.util.TreeMap;

public class Practise6 {

    public static String convert(String s, int numRows) {
        String result = "";
        if (numRows == 1) {
            result = s;
        } else {
            Map<Integer, String> treeMap = new TreeMap<Integer, String>();
            int n = 0;
            for (int j = 0; j < s.length(); j++) {
                ++n;
                char a = s.charAt(j);
                while (n <= numRows) {
                    String str = treeMap.get(n) != null ? treeMap.get(n) + String.valueOf(a) : String.valueOf(a);
                    treeMap.put(n, str);
                    break;
                }
                while (n + 1 < 2 * numRows && n > numRows) {
                    String str = treeMap.get(numRows - n % numRows) != null ? treeMap.get(numRows - n % numRows) + String.valueOf(a) : String.valueOf(a);
                    treeMap.put(numRows - n % numRows, str);
                    break;
                }
                if (n + 2 == 2 * numRows)
                    n = 0;
            }
            StringBuilder sb = new StringBuilder();
            for (String value : treeMap.values()) {
                sb.append(value);
            }
            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("ABC", 2));
    }
}
