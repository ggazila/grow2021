'use strict';

/**
 * @param { Number[] } queuers
 * @param { Number } pos
 *
 * @returns { Number }
 */
function countTimeInQueue(queuers, pos) {
  const buddy = queuers[pos];

  const rest = queuers.slice(pos, 1);

  const sum = rest.reduce((a, b) => a + b);

  if (buddy === 0) {
    return buddy;
  }

  return sum;
}
