import javax.security.auth.kerberos.DelegationPermission;

public class Practise82 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = deleteDuplicates(node1);
        String out = listNodeToString(node);
        System.out.println(out);
    }


    public static ListNode deleteDuplicates(ListNode head) {
        if(null == head) return null;
        if(null == head.next) return head;
        ListNode newListNode = new ListNode(0);
        ListNode newListNodeNext = newListNode;
        ListNode tmpListNode = null;
        while (null != head.next) {
            ListNode nextNode = head.next;
            int headVal = head.val;
            int nextVal = nextNode.val;
            if(headVal == nextVal) {
                tmpListNode = head;
            } else {
               if(null == tmpListNode) {
                   newListNodeNext.next = new ListNode(headVal);
                   newListNodeNext = newListNodeNext.next;
               } else {
                   tmpListNode = null;
               }
            }
            head = head.next;
        }

        if(null == head.next && null == tmpListNode) {
            newListNodeNext.next = new ListNode(head.val);
            newListNodeNext = newListNodeNext.next;
        }

        return  newListNode.next;
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

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
