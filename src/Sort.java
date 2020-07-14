import java.util.StringTokenizer;

public class Sort {
    public static void getMax(String joinedString) {
        String mytext="";
        StringTokenizer st = new StringTokenizer(joinedString);
        int maxLengthOfWord = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLength = word.length();
            if ( maxLengthOfWord == 0) {
                mytext = word;
                maxLengthOfWord = wordLength;
            }
            else if (wordLength > maxLengthOfWord) {
                maxLengthOfWord = wordLength;
                mytext = word;
            }
        }
        if ( maxLengthOfWord > 0)
            System.out.println("Самое большое слово: " + mytext);

        else {
            System.out.println("В строке нет слов!");
        }
    }
}
