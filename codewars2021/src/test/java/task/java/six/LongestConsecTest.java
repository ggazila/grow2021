package task.java.six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(LongestConsec.longestConsec(
                new String[] { "zone", "abigail", "theta", "form", "libe",
                        "zas", "theta", "abigail" }, 2), "abigailtheta");
        testing(LongestConsec.longestConsec(
                new String[] { "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx",
                        "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh" }, 1),
                "oocccffuucccjjjkkkjyyyeehh");
        testing(LongestConsec.longestConsec(new String[] {}, 3), "");
        testing(LongestConsec.longestConsec(new String[] { "itvayloxrp",
                        "wkppqsztdkmvcuwvereiupccauycnjutlv",
                        "vweqilsfytihvrzlaodfixoyxvyuyvgpck" }, 2),
                "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec(
                new String[] { "wlwsasphmxx", "owiaxujylentrklctozmymu",
                        "wpgozvxxiu" }, 2),
                "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(LongestConsec.longestConsec(
                new String[] { "zone", "abigail", "theta", "form", "libe",
                        "zas" }, -2), "");
        testing(LongestConsec.longestConsec(
                new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" },
                3), "ixoyx3452zzzzzzzzzzzz");
        testing(LongestConsec.longestConsec(
                new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" },
                15), "");
        testing(LongestConsec.longestConsec(
                new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" },
                0), "");

        String s =
                "wwdddmmmoommm, icp, nnnjjuaaajff, nnbbaabbj, llkkqqqstaaa, jjjaaaiixxxiiitq,"
                        + " sseeeaaacccgoofffss, ffcckkkhwsssuu, ffzkkkk, uuggikkcc, ppvvvk, "
                        + "uuttturrhff, wwoocroozwkkk, qqqzzttta, fyyyggscnnn, wwrryynnv, "
                        + "nnccqqqbsoovvv, rrzzzcccuuu, aaxxxayy, qfsxzz, ggfffbbbyyyj, nnfddvtts, "
                        + "wwgyull, mmmzzaarrmm, iiiwwwqaaappy, uhhbbbggkkaaa, asssuupkii, "
                        + "wwwxggjjfffggxxxemm, qqwhhaaaaa, bjjcclll, jwwpp, ohhjjqaaafuukkqq, "
                        + "cddrggdd, vvaedd, rrddbbkxxxuuu, ppaaatyyddggg, qqqwttnn, nvvvrv, "
                        + "euuulllfffrrr, ffuhhhmmmhhnnxxx, nneesssm, bkkkbgccooo, gssnnnssy, "
                        + "llmmmij, eelloooeelllr, lltrttppplll, tttcccnnnnnbbp, zkgggyy, jjjqkkkrr, "
                        + "mmmxxdddhhmmddd, jjjnqqqkkg, kkkmccccpp, ffnrrwwc, pjje, aaccnnncc, "
                        + "gggxxxbbggg, hoqq, uooyyhlaaajj, lvvmmsss, dggffuuuuut, eeaaage, shhaa, "
                        + "eecccqsss, yyssszzz, nvvvoozznn, aks, sssgsmmeebbh, qqqqeeqqvvl, "
                        + "ffmaacccwwwll, vvxxsssmmmgggg, hhzzzlnppa, swwddhiiijjc, bbffwwwooozeee, "
                        + "hnnq, ccggggvvzzq, ssffccccccr, uuuywooodd, eeeoooffrpppxxgggu, "
                        + "aaafffaaapppddvvvi, eeejjjs, rrwwjjn, ddzzzuuumm, iiwwkzztt, "
                        + "xxhppvvmmccppp, rrppccgg, follee, gghhhbxx, ammpiihhhpp, edddvvllueessb, "
                        + "ddzzuudxyyy, xxyyysssjquuttt, mmmmmddooorr, lioddrrn, ptgggnn, "
                        + "jjjccgggzzee, ssttllllzzxxx, yyymmeeal, haagggmmhhhzzss, hhsyyyajjjdd, "
                        + "vvabbjjqqxx, uuugwje, bbbzzjjjm, dmmhhwwuattt, ggnooodddoo, gggttaaa, "
                        + "ffzzjeeoog, wwwiicffhh, nvkkcc, yygaaaneebb, yjoff, yyytfzzmmmxqqq, "
                        + "jkkppsuuu, ppkggyyxxo, kkkzzzbbb, wwwhoo, tccssoooaaajjuu, fffxxlllww, "
                        + "rriiooomml, ggvxkkkxxk, iiiddzzuubbbhhm, ssswwwfm, pppsmxxxsss, "
                        + "jjmmmvvctttfff, qqjjggghpaaa, uuuuuwwwffrrccc, ddpppuuulll, "
                        + "fmmkbbbggfxxyy, afxxxeeeqqcc, mmqqxxnnzzz, kkjjpeewwee, eeebbuulllvee, "
                        + "nnmmvvvffppjjj, kdddbbcwwkbb, hhhwwbluuupkkk, yffayyrr, ppyoogghhhggyyddd,"
                        + " ppffddeeln, nnuuuffr, spdd, qqqqquuqqqiiijj, hhhxiiqw, ggzzzzcchd, "
                        + "jjiqvveego, ppmmrr, seeoooii, "
                        + "zuxxkk, vvxxtrrha, sbbbgkkkkvvv, ppxkrcp, wvzbbmmm, ffvvxxixiill, "
                        + "xxxnnnwwmni, nddqqqbbi, wwhywwo, zpcczzffaa, mmzzzppgg, rryyykktmmm, "
                        + "ilc, tzzlllyyymmvkkk";
        testing(LongestConsec.longestConsec(s.split(", "), 159),
                "wwdddmmmoommmicpnnnjjuaaajffnnbbaabbjllkkqqqstaaajjjaaaiixxxiiitqsseeeaaacccgoofffssffcckkkhwsssuuffzkkkkuuggikkccppvvvkuuttturrhffwwoocroozwkkkqqqzztttafyyyggscnnnwwrryynnvnnccqqqbsoovvvrrzzzcccuuuaaxxxayyqfsxzzggfffbbbyyyjnnfddvttswwgyullmmmzzaarrmmiiiwwwqaaappyuhhbbbggkkaaaasssuupkiiwwwxggjjfffggxxxemmqqwhhaaaaabjjccllljwwppohhjjqaaafuukkqqcddrggddvvaeddrrddbbkxxxuuuppaaatyyddgggqqqwttnnnvvvrveuuulllfffrrrffuhhhmmmhhnnxxxnneesssmbkkkbgccooogssnnnssyllmmmijeelloooeelllrlltrttpppllltttcccnnnnnbbpzkgggyyjjjqkkkrrmmmxxdddhhmmdddjjjnqqqkkgkkkmccccppffnrrwwcpjjeaaccnnnccgggxxxbbggghoqquooyyhlaaajjlvvmmsssdggffuuuuuteeaaageshhaaeecccqsssyyssszzznvvvoozznnakssssgsmmeebbhqqqqeeqqvvlffmaacccwwwllvvxxsssmmmgggghhzzzlnppaswwddhiiijjcbbffwwwooozeeehnnqccggggvvzzqssffccccccruuuywoooddeeeoooffrpppxxggguaaafffaaapppddvvvieeejjjsrrwwjjnddzzzuuummiiwwkzzttxxhppvvmmccppprrppccggfolleegghhhbxxammpiihhhppedddvvllueessbddzzuudxyyyxxyyysssjquutttmmmmmddooorrlioddrrnptgggnnjjjccgggzzeessttllllzzxxxyyymmeealhaagggmmhhhzzsshhsyyyajjjddvvabbjjqqxxuuugwjebbbzzjjjmdmmhhwwuatttggnooodddoogggttaaaffzzjeeoogwwwiicffhhnvkkccyygaaaneebbyjoffyyytfzzmmmxqqqjkkppsuuuppkggyyxxokkkzzzbbbwwwhootccssoooaaajjuufffxxlllwwrriiooommlggvxkkkxxkiiiddzzuubbbhhmssswwwfmpppsmxxxsssjjmmmvvctttfffqqjjggghpaaauuuuuwwwffrrcccddpppuuulllfmmkbbbggfxxyyafxxxeeeqqccmmqqxxnnzzzkkjjpeewweeeeebbuulllveennmmvvvffppjjjkdddbbcwwkbbhhhwwbluuupkkkyffayyrrppyoogghhhggyydddppffddeelnnnuuuffrspddqqqqquuqqqiiijjhhhxiiqwggzzzzcchdjjiqvveegoppmmrrseeoooiizuxxkkvvxxtrrhasbbbgkkkkvvvppxkrcpwvzbbmmmffvvxxixiillxxxnnnwwmninddqqqbbiwwhywwozpcczzffaammzzzppggrryyykktmmmilctzzlllyyymmvkkk");
    }
}
