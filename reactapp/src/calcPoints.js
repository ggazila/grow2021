'use strict';

/**
 * @param { String[] } ops
 *
 * @returns { number }
 */
export function calcPoints(ops) {
  const result = [];
  for (let item of ops) {
    if (parseInt(item)) {
      result.push(parseInt(item));
    } else {
      if (item === 'D') {
        let temp = result[result.length - 1];
        temp *= 2;
        result.push(parseInt(temp));
      } else if (item === 'C') {
        result.pop();
      } else if (item === '+') {
        if (result.length > 1) {
          const first = result[result.length - 1];
          const second = result[result.length - 2];
          result.push(first + second);
        }
      }
    }
  }

  return result.reduce((a, b) => a + b);
}

/*
Input: ops = [5, -2, 4, "C", "D", 9, "+", "+"]
Output: 27
Explanation:
    5 - Add 5 to the record, record is now [5].
-2 - Add -2 to the record, record is now [5, -2].
4 - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
9 - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
    The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
*/
