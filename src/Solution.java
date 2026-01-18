
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        /**
         * A couple of important notes about the solution:
         * 
         * A "Min Heap" is a complete binary tree where the value of each node is less
         * than or equal to the values of its children. This property ensures that the
         * smallest element is always at the root of the tree, making it efficient for
         * priority queue implementations. In a Min Heap, the time complexity for
         * insertion and deletion operations is O(logn).
         * 
         * A "Priority Queue" is an abstract data type similar to a regular queue but
         * with an added feature: each element has a priority associated with it.
         * Elements
         * with higher priorities are served before those with lower priorities. In a
         * Priority Queue, the retrieval of elements is based on priority instead of
         * their order in the queue. It is often implemented using heaps, allowing
         * efficient insertion and removal operations.
         * 
         * Knowing this, we have opted to use PriorityQueue since it will have the
         * records in ascending order for us.
         */

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        /**
         * Iterate through list in Lists and keep adding inside the minHeap
         */
        for (ListNode list : lists) {
            /**
             * check if the current list within lists is not null
             */
            while (list != null) {
                minHeap.add(list.val);
                /**
                 * move list node pointer forward
                 */
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode mergedList = dummy;

        /**
         * iterate and remove elemnts from priority queue(named minHeap in our case)
         * until the queue is empty
         */
        while (!minHeap.isEmpty()) {
            mergedList.next = new ListNode(minHeap.remove());
            mergedList = mergedList.next;
        }
        /**
         * This will always return the head of the merged list
         */
        return dummy.next;

    }

}
