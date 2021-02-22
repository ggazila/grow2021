describe('LinkedList:', () => {
    let LinkedList;

    beforeEach(() => {
        LinkedList = require('./LinkedList').LinkedList;
    });

    it(`'createLinkedList' function should be declared`, () => {
        expect(LinkedList).toBeInstanceOf(Function);
    });

    it(`'linkedList.size' should return 0 for an empty list`, () => {
        const linkedList = new LinkedList();

        expect(linkedList.size()).toBe(0);
    });

    it(`'linkedList.size' should return current list's size`, () => {
        const linkedList = new LinkedList();

        [8, 2, 1, 5, 4].forEach((el) => linkedList.append(el));

        expect(linkedList.size()).toBe(5);
    });

    it(`'linkedList.getLast' should return null for an empty list`, () => {
        const linkedList = new LinkedList();

        expect(linkedList.getLast()).toBeNull();
    });

    it(`'linkedList.getFirst' should return null for an empty list`, () => {
        const linkedList = new LinkedList();

        expect(linkedList.getFirst()).toBeNull();
    });

    it(`'linkedList.append' should add value to the end of the list`, () => {
        const linkedList = new LinkedList();

        [1, 2, 3, 4, 5].forEach((el) => {
            linkedList.append(el);

            expect(linkedList.getLast()).toBe(el);
            expect(linkedList.getFirst()).toBe(1);
        });
    });

    it(`'linkedList.prepend' should add value to the beginning of the list`, () => {
        const linkedList = new LinkedList();

        [1, 2, 3, 4, 5].forEach((el) => {
            linkedList.prepend(el);

            expect(linkedList.getLast()).toBe(1);
            expect(linkedList.getFirst()).toBe(el);
        });
    });

    it(`'linkedList.serialize' should return an empty array for the empty list`, () => {
        const linkedList = new LinkedList();

        expect(linkedList.serialize()).toEqual([]);
    });

    it(`'linkedList.serialize' should return an array with list's items in the correct order (append)`, () => {
        const linkedList = new LinkedList();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            linkedList.append(el);
        });

        expect(linkedList.serialize()).toEqual(items);
    });

    it(`'linkedList.serialize' should return an array with list's items in the correct order (prepend)`, () => {
        const linkedList = new LinkedList();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            linkedList.prepend(el);
        });

        expect(linkedList.serialize()).toEqual(items.reverse());
    });

    it(`'linkedList.clear' should clear the list`, () => {
        const linkedList = new LinkedList();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            linkedList.append(el);
        });

        expect(linkedList.size()).toBe(items.length);
        expect(linkedList.getFirst()).toBe(items[0]);
        expect(linkedList.getLast()).toBe(items[items.length - 1]);

        linkedList.clear();

        expect(linkedList.size()).toBe(0);
        expect(linkedList.getFirst()).toBeNull();
        expect(linkedList.getLast()).toBeNull();

        expect(linkedList.serialize()).toEqual([]);
    });

    it(`'linkedList.delete' should delete a node from the list`, () => {
        const linkedList = new LinkedList();

        const items = [5, 3, 7, 2, 1, 18, 31, 23, 45];

        items.forEach((el) => {
            linkedList.append(el);
        });

        expect(linkedList.size()).toBe(items.length);

        linkedList.delete(items[2]);
        items.splice(2, 1);

        expect(linkedList.size()).toBe(items.length);
        expect(linkedList.serialize()).toEqual(items);
    });

    it(`methods should work with random data`, () => {
        const linkedList = new LinkedList();

        const items = [
            ...new Set(
                new Array(100)
                    .fill(0)
                    .map(() => Math.trunc(Math.random() * 1000)),
            ),
        ];

        const result = [];

        items.forEach((el) => {
            if (Math.random() > 0.5) {
                linkedList.append(el);
                result.push(el);
            } else {
                linkedList.prepend(el);
                result.unshift(el);
            }
        });

        expect(linkedList.size()).toBe(result.length);
        expect(linkedList.getFirst()).toBe(result[0]);
        expect(linkedList.getLast()).toBe(result[result.length - 1]);

        for (let i = 0; i < 10; i += 1) {
            const index = Math.floor(Math.random() * result.length);

            linkedList.delete(result[index]);
            result.splice(index, 1);

            expect(linkedList.size()).toBe(result.length);
            expect(linkedList.getFirst()).toBe(result[0]);
            expect(linkedList.getLast()).toBe(result[result.length - 1]);
            expect(linkedList.serialize()).toEqual(result);
        }

        linkedList.clear();

        expect(linkedList.serialize()).toEqual([]);
        expect(linkedList.getFirst()).toBe(null);
        expect(linkedList.getLast()).toBe(null);
        expect(linkedList.size()).toBe(0);
    });
});
