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

function findMiddleListNode(head) {
    let count = 0;
    let h = head;

    while (h != null) {
        count++;
        h = h.next;
    }

    count = count / 2 - 1;
    h = head;

    while (count >= 0) {
        h = h.next;
        count--;
    }

    return h;
}
