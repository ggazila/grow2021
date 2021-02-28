describe('Queue: ', () => {
  let Queue;

  beforeEach(() => {
    Queue = require('./Queue').Queue;
  });

  it(`Function 'createQueue' should be declared`, () => {
    expect(Queue).toBeInstanceOf(Function);
  });

  it(`'queue.size' should return 0 for an empty queue`, () => {
    const queue = new Queue();

    expect(queue.size()).toBe(0);
  });

  it(`'queue.size' should return current queue's size`, () => {
    const queue = new Queue();

    [8, 9, 5, 4, 1, 3].forEach(el => queue.enqueue(el));

    expect(queue.size()).toBe(6);
  });

  it(`'queue.peek' should return null for an empty queue`, () => {
    const queue = new Queue();

    expect(queue.peek()).toBeNull();
  });

  it(`'queue.dequeue' should return null for an empty queue`, () => {
    const queue = new Queue();

    expect(queue.dequeue()).toBeNull();
  });

  it(`'queue.peek' should return first added value`, () => {
    const queue = new Queue();

    [1, 3, 2, 4, 6].forEach((el) => queue.enqueue(el));

    expect(queue.peek()).toBe(1);
    expect(queue.size()).toBe(5);
  });

  it(`'queue.dequeue' should return first added value and remove it from the queue`, () => {
    const queue = new Queue();

    [1, 3, 2, 4, 6].forEach((el) => queue.enqueue(el));

    expect(queue.dequeue()).toBe(1);
    expect(queue.size()).toBe(4);
    expect(queue.peek()).toBe(3);
  });

  it(`'queue.serialize' should return an empty array for the empty queue`, () => {
    const queue = new Queue();

    expect(queue.serialize()).toEqual([]);
  });

  it(`'queue.serialize' should return an array with queue's items in the correct order (LIFO)`, () => {
    const queue = new Queue();

    const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

    items.forEach((el) => {
      queue.enqueue(el);
    });

    expect(queue.serialize()).toEqual(items);
  });

  it(`'queue.clear' should clear the queue`, () => {
    const queue = new Queue();

    const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

    items.forEach((el) => {
      queue.enqueue(el);
    });

    expect(queue.size()).toBe(items.length);
    expect(queue.peek()).toBe(5);

    queue.clear();

    expect(queue.size()).toBe(0);
    expect(queue.peek()).toBeNull();
    expect(queue.dequeue()).toBeNull();

    expect(queue.serialize()).toEqual([]);
  });

  it(`methods should work with duplicated values`, () => {
    const queue = new Queue();

    const items = [1, 2, 3, 4, 1, 2, 3, 4];

    items.forEach(el => {
      queue.enqueue(el);
    });

    expect(queue.peek()).toBe(items[0]);

    for (let i = 0; i < 4; i += 1) {
      expect(queue.peek()).toBe(items[i]);
      expect(queue.dequeue()).toBe(items[i]);
      expect(queue.size()).toBe(items.length - i - 1);
      expect(queue.serialize()).toEqual(items.slice(i + 1));
    }

    expect(queue.peek()).toBe(1);
  });

  it(`methods should work with random data`, () => {
    const queue = new Queue();

    const items = new Array(100)
      .fill(0)
      .map(() => Math.trunc(Math.random() * 1000));

    items.forEach((el) => {
      queue.enqueue(el);
    });

    expect(queue.size()).toBe(items.length);
    expect(queue.peek()).toBe(items[0]);

    for (let i = 0; i < 10; i += 1) {
      expect(queue.peek()).toBe(items[i]);
      expect(queue.dequeue()).toBe(items[i]);

      expect(queue.size()).toBe(items.length - i - 1);

      expect(queue.serialize()).toEqual(items.slice(i + 1));
    }

    queue.clear();

    expect(queue.serialize()).toEqual([]);
    expect(queue.peek()).toBeNull();
    expect(queue.dequeue()).toBeNull();
    expect(queue.size()).toBe(0);
  });
});
