describe('Stack: ', () => {
    let Stack;

    beforeEach(() => {
        Stack = require('./Stack').Stack;
    });

    it(`Function 'createStack' should be declared`, () => {
        expect(Stack).toBeInstanceOf(Function);
    });

    it(`'stack.size' should return 0 for an empty stack`, () => {
        const stack = new Stack();

        expect(stack.size()).toBe(0);
    });

    it(`'stack.size' should return current stack's size`, () => {
        const stack = new Stack();

        [8, 9, 5, 4, 1, 3].forEach(el => stack.push(el));

        expect(stack.size()).toBe(6);
    });

    it(`'stack.peek' should return null for an empty stack`, () => {
        const stack = new Stack();

        expect(stack.peek()).toBeNull();
    });

    it(`'stack.pop' should return null for an empty stack`, () => {
        const stack = new Stack();

        expect(stack.pop()).toBeNull();
    });

    it(`'stack.peek' should return last added value`, () => {
        const stack = new Stack();

        [1, 3, 2, 4, 6].forEach((el) => stack.push(el));

        expect(stack.peek()).toBe(6);
        expect(stack.size()).toBe(5);
    });

    it(`'stack.pop' should return last added value and remove it from the stack`, () => {
        const stack = new Stack();

        [1, 3, 2, 4, 6].forEach((el) => stack.push(el));

        expect(stack.pop()).toBe(6);
        expect(stack.size()).toBe(4);
        expect(stack.peek()).toBe(4);
    });

    it(`'stack.serialize' should return an empty array for the empty stack`, () => {
        const stack = new Stack();

        expect(stack.serialize()).toEqual([]);
    });

    it(`'stack.serialize' should return an array with stack's items in the correct order (LIFO)`, () => {
        const stack = new Stack();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            stack.push(el);
        });

        expect(stack.serialize()).toEqual(items.reverse());
    });

    it(`'stack.clear' should clear the stack`, () => {
        const stack = new Stack();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            stack.push(el);
        });

        expect(stack.size()).toBe(items.length);
        expect(stack.peek()).toBe(45);

        stack.clear();

        expect(stack.size()).toBe(0);
        expect(stack.peek()).toBeNull();
        expect(stack.pop()).toBeNull();

        expect(stack.serialize()).toEqual([]);
    });

    it(`methods should work with duplicated values`, () => {
        const stack = new Stack();

        const items = [1, 2, 3, 4, 1, 2, 3, 4];

        items.forEach(el => {
            stack.push(el);
        });

        expect(stack.peek()).toBe(items[items.length - 1]);

        for (let i = 0; i < 4; i += 1) {
            const pointer = items.length - 1 - i;

            expect(stack.peek()).toBe(items[pointer]);
            expect(stack.pop()).toBe(items[pointer]);
            expect(stack.size()).toBe(pointer);
            expect(stack.serialize()).toEqual(items.slice(0, pointer).reverse());
        }

        expect(stack.peek()).toBe(4);
    });

    it(`methods should work with random data`, () => {
        const stack = new Stack();

        const items = new Array(100)
            .fill(0)
            .map(() => Math.trunc(Math.random() * 1000));

        items.forEach((el) => {
            stack.push(el);
        });

        expect(stack.size()).toBe(items.length);
        expect(stack.peek()).toBe(items[items.length - 1]);

        for (let i = 0; i < 10; i += 1) {
            const pointer = items.length - i - 1;

            expect(stack.peek()).toBe(items[pointer]);
            expect(stack.pop()).toBe(items[pointer]);

            expect(stack.size()).toBe(pointer);

            expect(stack.serialize()).toEqual(items.slice(0, pointer).reverse());
        }

        stack.clear();

        expect(stack.serialize()).toEqual([]);
        expect(stack.peek()).toBeNull();
        expect(stack.pop()).toBeNull();
        expect(stack.size()).toBe(0);
    });
});
