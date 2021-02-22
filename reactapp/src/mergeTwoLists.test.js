const { createList, serialize, ListNode } = require('./mergeTwoLists.lib');

describe('', () => {
    let mergeTwoLists;

    beforeEach(() => {
        mergeTwoLists = require('./mergeTwoLists').mergeTwoLists;
    });

    it(`Function 'mergeTwoLists' should be declared`, () => {
        expect(mergeTwoLists).toBeInstanceOf(Function);
    });

    it(`Function 'mergeTwoLists' should return a ListNode`, () => {
        const l1 = createList([1, 2, 3]);
        const l2 = createList([1, 2, 3]);

        expect(mergeTwoLists(l1, l2)).toBeInstanceOf(ListNode);
    });

    it(`Should merge two lists: simple order`, () => {
        const l1 = createList([1, 3, 5]);
        const l2 = createList([2, 4, 6]);

        const result = mergeTwoLists(l1, l2);

        expect(serialize(result)).toEqual([1, 2, 3, 4, 5, 6]);
    });

    it(`Should merge two lists with same nodes`, () => {
        const l1 = createList([1, 2, 3, 4, 5]);
        const l2 = createList([1, 2, 3, 4, 5]);

        const result = mergeTwoLists(l1, l2);

        expect(serialize(result)).toEqual([1, 1, 2, 2, 3, 3, 4, 4, 5, 5]);
    });

    it(`Should merge two lists: shifted nodes`, () => {
        const l1 = createList([1, 2, 3, 4, 8, 11, 13, 15]);
        const l2 = createList([5, 12, 16, 18, 20, 23]);

        const result = mergeTwoLists(l1, l2);

        expect(serialize(result)).toEqual(
            [1, 2, 3, 4, 5, 8, 11, 12, 13, 15, 16, 18, 20, 23],
        );
    });

    it(`Should merge two empty lists`, () => {
        const l1 = createList([]);
        const l2 = createList([]);

        const result = mergeTwoLists(l1, l2);

        expect(serialize(result)).toEqual([]);
    });

    it(`Should merge two lists: random data`, () => {
        const n1 = Math.trunc(Math.random() * 51);
        const n2 = Math.trunc(Math.random() * 51);

        const items1 = new Array(n1)
            .fill(0)
            .map(() => 100 - Math.trunc(Math.random() * 201))
            .sort((a, b) => a - b);

        const items2 = new Array(n2)
            .fill(0)
            .map(() => 100 - Math.trunc(Math.random() * 201))
            .sort((a, b) => a - b);

        const l1 = createList(items1);
        const l2 = createList(items2);

        const result = mergeTwoLists(l1, l2);

        const expectedResult = [...items1, ...items2]
            .sort((a, b) => a - b);

        expect(serialize(result)).toEqual(expectedResult);
    });
});
