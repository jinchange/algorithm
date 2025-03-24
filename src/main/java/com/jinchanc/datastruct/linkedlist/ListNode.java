package com.jinchanc.datastruct.linkedlist;

/**
 * @author zhangjin@algorix.co
 * @since 2025/3/24 11:42
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int value) {
        this.val = value;
    }
    public ListNode(int value, ListNode next) {
        this.val = value;
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
