import java.io.IOException;

public class Practise2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nodeValue1 = 0;
        int nodeValue2 = 0;
        int nodeValue3 = 0;
        boolean isBigToTen = false;
        ListNode l3 = new ListNode(0);
        ListNode curr = l3;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                nodeValue1 = l1.val;
                l1 = l1.next;
            } else {
                nodeValue1 = 0;
            }
            if (l2 != null) {
                nodeValue2 = l2.val;
                l2 = l2.next;
            } else {
                nodeValue2 = 0;
            }
            nodeValue3 = isBigToTen ? nodeValue1 + nodeValue2 + 1 : nodeValue1 + nodeValue2;
            isBigToTen = !(nodeValue3 < 10);
            nodeValue3 = isBigToTen ? nodeValue3 - 10 : nodeValue3;
            curr.next = new ListNode(nodeValue3);
            curr = curr.next;
            if (l1 == null && l2 == null && isBigToTen) {
                curr.next = new ListNode(1);
                curr = curr.next;
            }
        }

        return l3.next;
    }


    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {

        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(8);
        //ListNode l13 = new ListNode(3);
        l1.next = l12;
        //l12.next = l13;
        ListNode l2 = new ListNode(0);
        //ListNode l22 = new ListNode(7);
        //ListNode l23 = new ListNode(4);
        //l2.next = l22;
        //l22.next = l23;
        ListNode ret = addTwoNumbers(l1, l2);

        String out = listNodeToString(ret);

        System.out.print(out);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

