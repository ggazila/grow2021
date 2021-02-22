'use strict';

/**
 *
 * @param val
 * @constructor
 */
function ListNode(val) {
  this.val = val;
  this.next = null;
}

/**
 *
 * @param { ListNode } l1
 * @param { ListNode } l2
 *
 * @return { ListNode }
 */
export function mergeTwoLists(l1, l2) {
  let left = l1;
  let right = l2;
  if (!left) {
    return right;
  } else if (!right) {
    return left;
  }

  let mergedHead;
  if (left.val <= right.val) {
    mergedHead = left;
    left = left.next;
  } else {
    mergedHead = right;
    right = right.next;
  }

  let mergedTail = mergedHead;

  while (left && right) {
    let temp = null;
    if (left.val <= right.val) {
      temp = left;
      left = left.next;
    } else {
      temp = right;
      right = right.next;
    }

    mergedTail.next = temp;
    mergedTail = temp;
  }

  if (left) {
    mergedTail.next = left;
  } else if (right) {
    mergedTail.next = right;
  }

  return mergedHead;
}


