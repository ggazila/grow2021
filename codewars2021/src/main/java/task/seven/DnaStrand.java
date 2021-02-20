package task.seven;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
            case 'A':
                chars[i] = 'T';
                break;
            case 'T':
                chars[i] = 'A';
                break;
            case 'C':
                chars[i] = 'G';
                break;
            case 'G':
                chars[i] = 'C';
                break;
            }
        }

        return String.valueOf(chars);
    }
}

/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"

 */
