public class Practise7 {

    public static int reverse(int x) {
        if (x <= -Math.pow(2, 31) || x >= Math.pow(2, 31) - 1)
            return 0;
        int reverseX = 0;
        int n = 0;
        boolean isPlusOrMinus = x > 0;
        if (!isPlusOrMinus)
            x = Math.abs(x);
        String xStr = String.valueOf(x);
        int xLength = String.valueOf(x).length();

        while (xLength > 0) {
            int i = (int) (x / Math.pow(10, xLength - 1));
            int j = (int) (i * Math.pow(10, n));
            if (j <= -Math.pow(2, 31) || j >= Math.pow(2, 31) - 1)
                return 0;
            reverseX += j;
            ++n;
            if (String.valueOf(x).length() > 1)
                x = Integer.valueOf(xStr.substring(n));
            --xLength;
        }

        if (!isPlusOrMinus)
            reverseX = 0 - reverseX;

        if((reverseX < 0 && isPlusOrMinus)|| ( reverseX > 0 && !isPlusOrMinus ))
            reverseX = 0;

        return reverseX;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1563847412));
    }
}
