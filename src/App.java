import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * You are given an array of k linked-lists lists, each linked-list is sorted in
         * ascending order.
         * 
         * Merge all the linked-lists into one sorted linked-list and return it.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: lists = [[1,4,5],[1,3,4],[2,6]]
         * Output: [1,1,2,3,4,4,5,6]
         * Explanation: The linked-lists are:
         * [
         * 1->4->5,
         * 1->3->4,
         * 2->6
         * ]
         * merging them into one sorted linked list:
         * 1->1->2->3->4->4->5->6
         * 
         * Example 2:
         * 
         * Input: lists = []
         * Output: []
         * 
         * Example 3:
         * 
         * Input: lists = [[]]
         * Output: []
         * 
         */
        System.out.println("Hello, World!");

        ListNode list1 = new ListNode(1);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(5);
        list1.next = node12; // 1 -> 4
        node12.next = node13; // 4 -> 5
        System.out.println("The given list is:");
        printList(list1);

        ListNode list2 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);
        list2.next = node22; // 1 -> 3
        node22.next = node23; // 3 -> 4
        System.out.println("The given list is:");
        printList(list2);

        ListNode list3 = new ListNode(2);
        ListNode node32 = new ListNode(6);
        list3.next = node32; // 2 -> 6
        System.out.println("The given list is:");
        printList(list3);

        ListNode[] lists = new ListNode[3];
        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;

        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(lists);

        System.out.println("The merged list is:");
        printList(result);

    }

    public static void printReverse(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Pop elements to display in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
