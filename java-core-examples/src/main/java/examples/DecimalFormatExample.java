package examples;

import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double d = 5.1;

        String ukraine = "ukr";
        String ukraine2 = "uk";
        String english = "eng";
        String english2 = "en";
        System.out.println(format(d, ukraine));
        System.out.println(format(d, ukraine2));
        System.out.println(format(d, english));
        System.out.println(format(d, english2));

    }

    private static String format(double n, String language) {
        if (language.length() > 2) {
            language = getTwoLetter(language);
        }

        Locale locale = new Locale(language);
        NumberFormat format = NumberFormat.getNumberInstance(locale);
        return format.format(n);
    }

    private static String getTwoLetter(String three) {
        for (String language : Locale.getISOLanguages()) {
            Locale locale = new Locale(language);
            if (locale.getISO3Language().equals(three)) {
                return locale.getLanguage();
            }
        }

        return Locale.getDefault().getLanguage();
    }
}
