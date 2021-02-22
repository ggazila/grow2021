const {createList, serialize, findNode} = require('./deleteNode.lib');

describe('2', () => {
    let deleteNode;

    beforeEach(() => {
        deleteNode = require('./deleteNode').deleteNode;
    });

    it(`Function 'deleteNode' should be declared`, () => {
        expect(deleteNode).toBeInstanceOf(Function);
    });

    it(`Function 'deleteNode' should not return a value`, () => {
        const head = createList([1, 2, 3]);

        const node = findNode(head, 1);

        expect(deleteNode(node)).toBeUndefined();
    });

    it(`Should delete the first node in the list`, () => {
        const head = createList([1, 2, 3, 4, 5, 6]);
        const node = findNode(head, 1);

        deleteNode(node);

        expect(serialize(head)).toEqual([2, 3, 4, 5, 6]);
    });

    it(`Should delete the penult node in the list`, () => {
        const head = createList([1, 2, 3, 4]);
        const node = findNode(head, 3);

        deleteNode(node);

        expect(serialize(head)).toEqual([1, 2, 4]);
    });

    it(`Should delete node in the middle of the list`, () => {
        const head = createList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
        const node = findNode(head, 5);

        deleteNode(node);

        expect(serialize(head)).toEqual([1, 2, 3, 4, 6, 7, 8, 9, 10]);
    });

    it(`Should work on random data`, () => {
        const number = 2 + Math.trunc(Math.random() * 999);
        const data = [
            ...new Set(
                new Array(number)
                    .fill(0)
                    .map(() => 1000 - Math.trunc(Math.random() * 2000)),
            ),
        ];

        const head = createList(data);
        const index = Math.trunc(Math.random() * (data.length - 2));
        const node = findNode(head, data[index]);
        const deleted = data[index];

        const expectedResult = data.filter(el => el !== deleted);

        deleteNode(node);

        expect(serialize(head)).toEqual(expectedResult);
    });
});
