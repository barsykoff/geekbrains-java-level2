package Lesson1;

public class Lesson1_DopDZ {

    static String[] str = {
            "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb",
            " quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s",
            " pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag",
            "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx",
            "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba",
            " auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk",
            " cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd",
            "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob",
            "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf",
            "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan",
            "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv",
            "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq",
            " ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh",
            "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk",
            "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa",
            "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb",
            "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs "
    };

    public static int[] parser(int rowCount, String[] str) {
        String template = "[aouiey]";
        int[] counts;

        if (rowCount > str.length) {
            throw new IllegalArgumentException();
        }
        else {
            counts = new int[rowCount];
            for (int i = 0; i < counts.length - 1; i++) {
                counts[i] = str[i].length() - str[i].replaceAll(template, "").length();
            }
            return counts;
        }
    }

    public static void main(String[] args) {

        int[] counts = parser(10, str);

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
}
