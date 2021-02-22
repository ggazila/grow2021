'use strict';

/**
 * Definition for singly-linked list.
 *
 * function ListNode(val) {
 *     this.val = val
 *     this.next = null
 * }
 *
 * @param { ListNode } head
 * @return { ListNode }
 */
export function reverseList(head) {
    let prev = null;
    let current = head;
    let next = null;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    head = prev;

    return head;
}
