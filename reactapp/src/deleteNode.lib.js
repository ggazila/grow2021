/**
 *
 * @param val
 * @constructor
 */
function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 *
 * @param { ListNode } node
 * @returns { Array }
 */
function serialize(node) {
    const result = [];
    let currentNode = node;

    while (currentNode !== null) {
        result.push(currentNode.val);
        currentNode = currentNode.next;
    }

    return result;
}

/**
 *
 * @param { Array } data
 * @returns { ListNode }
 */
function createList(data) {
    const head = new ListNode(data[0]);
    let currentNode = head;

    for (let i = 1; i < data.length; i += 1) {
        currentNode.next = new ListNode(data[i]);
        currentNode = currentNode.next;
    }

    return head;
}

/**
 *
 * @param { Number } val
 * @param { ListNode } head
 *
 * @returns { ListNode }
 */
function findNode(head, val) {
    let node = head;

    while (node.val !== val) {
        node = node.next;
    }

    return node;
}

module.exports = {
    ListNode,
    serialize,
    createList,
    findNode,
};
