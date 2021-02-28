describe('', () => {
    let calcPoints;

    beforeEach(() => {
        calcPoints = require('./calcPoints').calcPoints;
    });

    it(`Function 'calcPoints' should be declared`, () => {
        expect(calcPoints).toBeInstanceOf(Function);
    });

    it(`Should return a score for single item input`, () => {
        expect(calcPoints(['23'])).toBe(23);
    });

    it(`Should return a score for numbers only input`, () => {
        expect(calcPoints(['23', '32', '21', '1', '21', '11'])).toBe(109);
    });

    it(`Should invalidate and remove score if "C" is passed`, () => {
        expect(calcPoints(['23', '2', '3', 'C'])).toBe(25);
    });

    it(`Should double previous score if "D" is passed`, () => {
        expect(calcPoints(['23', '2', '5', 'D'])).toBe(40);
    });

    it(`Should sum previous two scores if "+" is passed`, () => {
        expect(calcPoints(['23', '2', '5', '6', '+'])).toBe(47);
    });

    it(`Should calculate score when 'C', 'D', and '+' are passed`, () => {
        expect(calcPoints(['5', '2', 'C', 'D', '+'])).toBe(30);
    });

    it(`Should calculate score when '+' is passed continuously`, () => {
        expect(calcPoints(['5', '-2', '4', 'C', 'D', '9', '+', '+'])).toBe(27);
    });

    it(`Should calculate score when elements are continuously passed in random order`, () => {
        expect(calcPoints(['5', '-2', '4', 'C', 'D', '9', '+', '+', '+', '+', 'C', 'D', 'C', 'D', 'D'])).toBe(160);
    });

    it(`Should calculate score`, () => {
        expect(calcPoints(['5', '-2', '4', 'C', 'D', 'C', 'D', 'D', 'D', 'C', '2', '-100', '25', '123', '+', '+'])).toBe(460);
    });

    // TODO: add tests with random data
});
