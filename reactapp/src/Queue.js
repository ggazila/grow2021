'use strict';

export class Queue {
  constructor() {
    this.inside = [];
    this.count = 0;
    this.arraySize = 0;
  }

  /**
   * Add value to the queue
   * @param { Number } value
   *
   * @returns { void }
   */
  enqueue(value) {
    this.inside[this.count++] = value;
    this.arraySize++;
  }

  /**
   * Return queue size
   * @returns { Number }
   */
  size() {
    return this.arraySize;
  }

  /**
   * Return the first added value
   * @returns { Number | null }
   */
  peek() {
    if (this.arraySize === 0) {
      return null;
    }
    return this.inside[0];
  }

  /**
   * Return the first added value and remove it from the queue
   * @returns { Number | null }
   */
  dequeue() {
    if (this.arraySize === 0) {
      return null;
    }
    let pop = this.inside.shift();
    this.arraySize--;
    return pop;

  }

  /**
   * Empty the queue
   * @returns { void }
   */
  clear() {
    this.inside = [];
    this.arraySize = 0;
  }

  /**
   * Serialize the queue
   * @returns { Number[] }
   */
  serialize() {
    return this.inside;
  }
}
