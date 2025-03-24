package com.jinchanc.datastruct.linkedlist;

/**
 * @author 475636591@qq.com
 * @since 2025/3/24 10:44
 */
public class Test {

    public static void main(String[] args) {
        Node[] nodes = new Node[2];
        nodes[0] = new Node(1, new Node(2, new Node(3, new Node(4))));
        nodes[1] = new Node(2, new Node(3, new Node(4, new Node(5))));
        Node node = mergeMultipleSortedLinkedList(nodes);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    // 合并多个有序链表
    public static Node mergeMultipleSortedLinkedList(Node[] nodes) {
        Node dummy = new Node(0);
        Node p = dummy;
        Node minNode;
        while ((minNode = findMinNode(nodes)) != null) {
            p.next = minNode;
            p = p.next;
        }
        return dummy.next;
    }

    public static Node findMinNode(Node[] nodes) {
        int minIndex = -1;
        Node minNode = null;
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            if (node != null && minNode == null) {
                minNode = node;
                minIndex = i;
            } else if (node != null && node.value < minNode.value) {
                minNode = node;
                minIndex = i;
            }
        }

        if (minIndex != -1) {
            nodes[minIndex] = minNode.next;
        }
        return minNode;
    }
}
