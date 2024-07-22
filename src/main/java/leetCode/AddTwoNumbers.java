package leetCode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(2, node2);

        ListNode node6 = new ListNode(4);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);

        System.out.println(addTwoNumbers(node1, node4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode1 = l1;
        StringBuilder numb1 = new StringBuilder();
        StringBuilder numb2 = new StringBuilder();

        while (currentNode1 != null) {
            numb1.append(String.valueOf(currentNode1.val));
            currentNode1 = currentNode1.next;
        }

        ListNode currentNode2 = l2;
        while (currentNode2 != null) {
            numb2.append(String.valueOf(currentNode2.val));
            currentNode2 = currentNode2.next;
        }

        int sum = Integer.parseInt(numb1.toString()) + Integer.parseInt(numb2.toString());
        String[] res = String.valueOf(sum).split("");

        ListNode newNode = new ListNode(Integer.parseInt(res[0]));
        for (int i = res.length - 2; i >= 0; i--) {
            newNode.next = new ListNode(Integer.parseInt(res[i]));
        }
        return newNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
