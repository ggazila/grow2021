'use strict';

/**
 * @param { Number[] } nums
 * @param { number } target
 *
 * @returns { Number }
 */

function searchInsert(nums, target) {
    let min = 0;
    let max = nums.length - 1;
    let result = 0;

    while (min <= max) {
        const mid = Math.round((max + min) / 2);

        if (nums[mid] === target) {
            return mid;
        }

        if (nums[mid] > target) {
            max = mid - 1;
        } else {
            min = min + 1;
        }

        result = mid;
    }

    return min;
}

console.log(searchInsert([1, 3, 5, 6], 5))
console.log(searchInsert([1, 3, 5, 6], 2))
console.log(searchInsert([1, 3, 5, 6], 7))


function countNegatives(grid) {
    let sum = 0;

    for (const array of grid) {
        for (const number of array) {
            if (number < 0) {
                sum++;
            }
        }
    }

    return sum;
}

console.log(countNegatives([
    [4, 3, 2, -1],
    [3, 2, 1, -1],
    [1, 1, -1, -2],
    [-1, -1, -2, -3]
]))


function sqrt(x) {
    if (x === 0) {
        return 0;
    }

    const bisect = (left, right) => {
        const average = (left + right) / 2;
        if (right - left < 0.00000001) {
            return (left + right) / 2;
        }
        if (average * average > x) {
            return bisect(left, average);
        } else if (average * average < x) {
            return bisect(average, right);
        }
    };
    return bisect(0, x < 1 ? 1 : x);
}

console.log(sqrt(2147483647))
