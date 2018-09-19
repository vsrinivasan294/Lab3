import java.io.IOException;
import java.net.URL;
import java.util.Scanner;




public class WebScraper {






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

    public static void main(String[] args) {



        // number of hamlets
        String str = urlToString("http://erdani.com/tdpl/hamlet.txt").toLowerCase();
        int c = str.split("hamlet").length - 1;
        System.out.println(c);


        int spaces  = 0 ;
        char[] test = urlToString("http://erdani.com/tdpl/hamlet.txt").toCharArray();

        for (int i = 0; i <test.length - 1; i ++){
            if ( test[i] == ' ' && test[i+1] != ' '){
                spaces++;
            }

        }

        System.out.println(spaces+1);
    }


}
