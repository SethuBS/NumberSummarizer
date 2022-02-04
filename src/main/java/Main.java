import com.numberRangeSummarizer.NumberRangeSummarizer;
import com.numberRangeSummarizer.NumberSummarizerImpl;

import java.util.Collection;
import java.util.List;

/**
 * Created by SethuBudaza on 2022/02/03.
 */
public class Main {

    static boolean isNumber(String s)
    {
        boolean isInteger = true;
        for(int i = 0; i < s.length() && isInteger; i++)
        {
            char c = s.charAt(i);
            isInteger = isInteger & (
                    (c >= '0' && c <= '9') || (c == ','));
        }
        return isInteger;
    }

    public static void main(String[] args) throws Exception {

        NumberRangeSummarizer summarizer = new NumberSummarizerImpl();

        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        // Result: "1, 3, 6-8, 12-15, 21-24, 31"

        if(isNumber(input)){
            Collection<Integer> collectionInput = (List<Integer>) summarizer.collect(input);
            String range = summarizer.summarizeCollection(collectionInput);

            System.out.println(range);
        } else {
            throw new Exception("Please review the string there might be a character");
        }

    }
}
