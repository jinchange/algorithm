package com.jinchanc.datastruct.linkedlist;

/**
 * @author 475636591@qq.com
 * @since 2025/3/24 10:44
 */
public class Test {

    public static void main(String[] args) {
        ListNode[] ListNodes = new ListNode[2];
        ListNodes[0] = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNodes[1] = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        ListNode ListNode = new Test().mergeMultipleSortedLinkedList(ListNodes);
        while (ListNode != null) {
            System.out.println(ListNode.val);
            ListNode = ListNode.next;
        }
    }


    /**
     * <a href="https://leetcode.cn/problems/merge-k-sorted-lists/submissions/614736737/?envType=study-plan-v2&envId=top-100-liked">23. 合并 K 个升序链表</a>
     * @param lists
     * @return
     */
    public ListNode mergeMultipleSortedLinkedList(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        ListNode minListNode;
        while ((minListNode = findMinListNode(lists)) != null) {
            p.next = minListNode;
            p = p.next;
        }
        return dummy.next;
    }

    public ListNode findMinListNode(ListNode[] lists) {
        int minIndex = -1;
        ListNode minListNode = null;
        for (int i = 0; i < lists.length; i++) {
            ListNode listNode = lists[i];
            if (listNode != null && minListNode == null) {
                minListNode = listNode;
                minIndex = i;
            } else if (listNode != null && listNode.val < minListNode.val) {
                minListNode = listNode;
                minIndex = i;
            }
        }

        if (minIndex != -1) {
            lists[minIndex] = minListNode.next;
        }
        return minListNode;
    }
}
