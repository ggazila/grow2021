'use strict';

class LinkedList {
  constructor() {
    this.listSize = 0;
  }

  /**
   * Add value to the end of the list
   * @param { Number } value
   *
   * @returns { void }
   */
  append(value) {
    const node = new Node(value);

    if (this.head == null) {
      this.head = node;
    } else {
      let temp = this.head;

      while (true) {
        if (temp.next == null) {
          temp.next = node;
          break;
        } else {
          temp = temp.next;
        }
      }
    };
    this.listSize += 1;
  }

  /**
   * Add value to the beginning of the list
   * @param { Number } value
   *
   * @returns { void }
   */
  prepend(value) {
    const node = new Node(value);

    node.next = this.head;

    this.head = node;
  }

  /**
   * Return list size
   * @returns { Number }
   */
  size() {
    return this.listSize;
  }

  /**
   * Return the last node's value
   * @returns { Number | null }
   */
  getLast() {
    let node = this.head;

    while (true) {
      if (this.head == null) {
        return null;
      }

      if (node.next == null) {
        return node.value;
      } else {
        node = node.next;
      }
    }
  }

  /**
   * Return the first node's value
   * @returns { Number | null }
   */
  getFirst() {
    if (this.head === undefined || this.head === null) {
      return null;
    }

    return this.head.value;
  }

  /**
   * Empty the list
   * @returns { void }
   */
  clear() {
    this.head = null;
    this.listSize = 0;
  }

  /**
   * Delete node by its value
   * @param { Number } value
   *
   * @returns { void }
   */
  delete(value) {
    let node = this.head;
    let previous = node;

    while (node != null && node.value !== value) {
      previous = node;
      node = node.next;
    }

    if (node == null) {
      return null;
    }
    this.listSize -= 1;
    previous.next = node.next;
  }

  /**
   * Serialize the list
   * @returns { Number[] }
   */
  serialize() {
    const arr = [];

    if (this.head == null) {
      return arr;
    }

    let node = this.head;

    while (node != null) {
      arr.push(node.value);
      node = node.next;
    }

    return arr;
  }
}

class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}
