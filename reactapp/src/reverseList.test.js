const {createList, ListNode, serialize} = require('./reverseList.lib');

describe('3', () => {
    let reverseList;

    beforeEach(() => {
        reverseList = require('./reverseList').reverseList;
    });

    it(`Function 'reverseList' should be declared`, () => {
        expect(reverseList).toBeInstanceOf(Function);
    });

    it(`Function 'reverseList' should return a ListNode`, () => {
        const head = createList([1, 2, 3]);

        expect(reverseList(head)).toBeInstanceOf(ListNode);
    });

    it(`Should reverse a single-node list`, () => {
        const head = createList([1]);
        const result = reverseList(head);

        expect(serialize(result)).toEqual([1]);
    });

    it(`Should reverse a list`, () => {
        const items = [1, 2, 3, 4, 5, 6, 7];

        const head = createList(items);
        const result = reverseList(head);

        expect(serialize(result)).toEqual(items.reverse());
    });

    it(`Should reverse a list with repeated values`, () => {
        const items = [1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3];

        const head = createList(items);
        const result = reverseList(head);

        expect(serialize(result)).toEqual(items.reverse());
    });

    it(`Should work on random data`, () => {
        const number = 1 + Math.trunc(Math.random() * 1000);

        const items = new Array(number)
            .fill(0)
            .map(() => 1000 - Math.trunc(Math.random() * 2000));

        const head = createList(items);
        const result = reverseList(head);

        expect(serialize(result)).toEqual(items.reverse());
    });
});
