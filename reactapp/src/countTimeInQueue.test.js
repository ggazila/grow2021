describe('', () => {
  let countTimeInQueue;

  beforeEach(() => {
    countTimeInQueue = require('./countTimeInQueue').countTimeInQueue;
  });

  it(`Function 'countTimeInQueue' should be declared`, () => {
    expect(countTimeInQueue).toBeInstanceOf(Function);
  });

  it(`Should count a time for single node queue with one ticket`, () => {
    expect(countTimeInQueue([1], 0)).toBe(1);
  });

  it(`Should count a time for single node queue with multiple tickets`, () => {
    expect(countTimeInQueue([5], 0)).toBe(5);
  });

  it(`Should count a time in queue: pos = 0`, () => {
    expect(countTimeInQueue([2, 5, 3, 6, 4], 0)).toBe(6);
  });
  /*
   */

  it(`Should count a time in queue: pos = 1`, () => {
    expect(countTimeInQueue([2, 5, 3, 6, 4], 1)).toBe(18);
  });



  it(`Should count a time in queue: pos = 2`, () => {
    expect(countTimeInQueue([2, 5, 3, 6, 4], 2)).toBe(12);
  });

  it(`Should count a time in queue: pos = 3`, () => {
    expect(countTimeInQueue([2, 5, 3, 6, 4], 3)).toBe(20);
  });

  it(`Should count a time in queue: pos = 4`, () => {
    expect(countTimeInQueue([2, 5, 3, 6, 4], 4)).toBe(17);
  });

  it(`Should count a time in queue with large number of elements: pos = 62`, () => {
    expect(countTimeInQueue(
      [2, 105, 370, 41, 8, 157, 1, 553, 2, 779, 37, 92, 342, 10, 418, 29, 1, 5, 1, 6, 9, 10, 64, 8, 7, 887, 341, 81, 34, 808, 247, 115, 796, 82, 28, 8, 735, 10, 889, 182, 4, 85, 820, 6, 8, 7, 212, 78, 74, 10, 685, 471, 35, 67, 89, 76, 5, 846, 326, 7, 8, 4, 7, 23, 99, 251, 81, 6, 1, 5, 7, 1, 1, 1, 86, 52, 437, 9, 885, 4, 8, 2, 70, 2, 248, 54, 17, 8, 93, 167, 1, 86, 971, 959, 7, 4, 910, 4, 507, 82, 92, 590, 67, 8, 966, 741, 326, 450, 8, 44, 2, 48, 847, 167, 9, 6, 87, 517, 10, 6],
      62
    ))
      .toBe(699);
  });

  it(`Should count a time in queue with large number of elements: pos = 65`, () => {
    expect(countTimeInQueue(
      [2, 105, 370, 41, 8, 157, 1, 553, 2, 779, 37, 92, 342, 10, 418, 29, 1, 5, 1, 6, 9, 10, 64, 8, 7, 887, 341, 81, 34, 808, 247, 115, 796, 82, 28, 8, 735, 10, 889, 182, 4, 85, 820, 6, 8, 7, 212, 78, 74, 10, 685, 471, 35, 67, 89, 76, 5, 846, 326, 7, 8, 4, 7, 23, 99, 251, 81, 6, 1, 5, 7, 1, 1, 1, 86, 52, 437, 9, 885, 4, 8, 2, 70, 2, 248, 54, 17, 8, 93, 167, 1, 86, 971, 959, 7, 4, 910, 4, 507, 82, 92, 590, 67, 8, 966, 741, 326, 450, 8, 44, 2, 48, 847, 167, 9, 6, 87, 517, 10, 6],
      65,
    ))
      .toBe(11464);
  });

  it(`Should count a time in queue with large number of elements: pos = 3`, () => {
    expect(countTimeInQueue(
      [53, 204, 87, 297, 34, 7, 500, 30, 798, 422, 17, 10, 882, 539, 9, 379, 6, 402, 823, 27, 1, 10, 26, 79, 11, 9, 8, 783, 4, 6, 47, 407, 47, 12, 607, 2, 517, 749, 32, 40, 3, 38, 4, 5, 682, 2, 79, 7, 382, 30, 914, 590, 319, 459, 30, 7, 8, 93, 35, 553, 3, 3, 61, 46, 900, 67, 45, 7, 895, 5, 7, 3, 394, 54, 1, 471, 84, 475, 1, 438, 429, 89, 43, 9, 58, 258, 15, 7, 38, 5],
      3,
    ))
      .toBe(10357);
  });

  it(`Should count a time in queue with large number of elements: pos = 12`, () => {
    expect(countTimeInQueue(
      [53, 204, 87, 297, 34, 7, 500, 30, 798, 422, 17, 10, 882, 539, 9, 379, 6, 402, 823, 27, 1, 10, 26, 79, 11, 9, 8, 783, 4, 6, 47, 407, 47, 12, 607, 2, 517, 749, 32, 40, 3, 38, 4, 5, 682, 2, 79, 7, 382, 30, 914, 590, 319, 459, 30, 7, 8, 93, 35, 553, 3, 3, 61, 46, 900, 67, 45, 7, 895, 5, 7, 3, 394, 54, 1, 471, 84, 475, 1, 438, 429, 89, 43, 9, 58, 258, 15, 7, 38, 5],
      12,
    ))
      .toBe(18008);
  });
});
