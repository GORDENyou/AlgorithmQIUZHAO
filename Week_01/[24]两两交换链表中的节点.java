//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表 
// 👍 548 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
//         return method1(head);

        return method2(head);
    }

    // 递归解法，代码不算易懂。时空度：O(n) O(n)
    // 递归求解时，这三个条件不能有误！！！
    private ListNode method2(ListNode head) {
        // 1.结束条件
        if(head == null || head.next == null){
            return head;
        }

        // 2.单步的操作
        ListNode temp = head.next;
        // 3.关联未来
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }

    // 非递归方法，占用内存较小，但是代码不好理解。时空度：O(n) O(1)
    private ListNode method1(ListNode head) {
        // 我们需要操作第一个节点，所以我们需要一个头结点！
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode newHead = start;
        ListNode first, second;
        while(start.next != null && start.next.next != null){
            first = start.next;
            second = first.next;
            System.out.println("first:" + first.val);
            System.out.println("second:" + second.val);
            start.next = second;
            first.next = second.next;
            second.next = first;
            start = first;
        }
        return newHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
