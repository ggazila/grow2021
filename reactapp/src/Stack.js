'use strict';

export class Stack {
  constructor() {
    this.list = [];
    this.top = -1;
  }

  /**
   * Add value to the stack
   * @param { Number } value
   *
   * @returns { void }
   */
  push(value) {
    this.top += 1;
    this.list[this.top] = value;
  }

  /**
   * Return stack size
   * @returns { Number }
   */
  size() {
    return this.top + 1;
  }

  /**
   * Return the last added value
   * @returns { Number | null }
   */
  peek() {
    if (this.top < 0) {
      return null;
    }

    return this.list[this.top];
  }

  /**
   * Return the last added value and remove it from the stack
   * @returns { Number | null }
   */
  pop() {
    if (this.top < 0) {
      return null;
    }

    this.top -= 1;

    return this.list.pop();
  }

  /**
   * Empty the stack
   * @returns { void }
   */
  clear() {
    this.top = -1;
    this.list = [];
  }

  /**
   * Serialize the stack
   * @returns { Number[] }
   */
  serialize() {
    const result = [];
    for (let i = 0; i < this.list.length; i++) {
      result[i] = this.list[this.list.length - 1 - i];
    }
    return result;
  }
}
