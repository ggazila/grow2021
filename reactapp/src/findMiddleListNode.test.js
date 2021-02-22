const {serialize, createList, ListNode} = require('./findMiddleListNode.lib');

describe('1', () => {
    let findMiddleListNode;

    beforeEach(() => {
        findMiddleListNode = require('./findMiddleListNode').findMiddleListNode;
    });

    it(`Function 'findMiddleListNode' should be declared`, () => {
        expect(findMiddleListNode).toBeInstanceOf(Function);
    });

    it(`Function 'findMiddleListNode' should return a ListNode`, () => {
        const head = createList([1, 2, 3]);

        expect(findMiddleListNode(head)).toBeInstanceOf(ListNode);
    });

    it(`Should return a middle node for single node list`, () => {
        const head = createList([1]);
        const result = findMiddleListNode(head);

        expect(serialize(result)).toEqual([1]);
    });

    it(`Should return a middle node for the list with two nodes`, () => {
        const head = createList([1, 2]);
        const result = findMiddleListNode(head);

        expect(serialize(result)).toEqual([2]);
    });

    it(`Should return a middle node for the list with even number of nodes`, () => {
        const head = createList([1, 2, 3, 4, 5, 6, 7, 8]);
        const result = findMiddleListNode(head);

        expect(serialize(result)).toEqual([5, 6, 7, 8]);
    });

    it(`Should return a middle node for the list with odd number of nodes`, () => {
        const head = createList([9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1]);
        const result = findMiddleListNode(head);

        expect(serialize(result)).toEqual([4, 3, 2, 1, 0, -1]);
    });

    it(`Should work with random data`, () => {
        const number = 1 + Math.trunc(Math.random() * 100);
        const items = new Array(number)
            .fill(0)
            .map(() => 500 - Math.trunc(Math.random() * 1000));

        const head = createList(items);

        const expectedResult = items.slice(items.length / 2);

        const result = findMiddleListNode(head);

        expect(serialize(result)).toEqual(expectedResult);
    });
});
