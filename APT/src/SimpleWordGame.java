import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hushijia on 12/28/16.
 */
public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        List<String> finalList = new ArrayList<String>();
        int answer = 0;
        for (int i = 0; i < player.length; i++){
            String word = player[i];
            if (!finalList.contains(word) && Arrays.asList(dictionary).contains(word)){
                finalList.add(word);
                answer += Math.pow(word.length(), 2);
            }
        }
        return answer;
    }
}
