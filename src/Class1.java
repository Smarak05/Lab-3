import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        System.out.println(wordCount(urlToString("https://www.bls.gov/tus/charts/chart9.txt")));
    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

        public static int wordCount(final String url) {
            int value = 1;
            for (int i = 0; i < url.length(); i++) {
                if (url.substring(i, i + 1).equals("  "));
                value ++;
            }
            return value;
        }

    }
