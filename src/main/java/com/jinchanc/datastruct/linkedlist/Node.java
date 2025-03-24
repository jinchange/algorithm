package com.jinchanc.datastruct.linkedlist;

/**
 * @author zhangjin@algorix.co
 * @since 2025/3/24 11:42
 */
public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
               "value=" + value +
               ", next=" + next +
               '}';
    }
}
