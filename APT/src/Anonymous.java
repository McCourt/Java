import java.util.HashMap;
import java.util.Map;

/**
 * Created by hushijia on 12/28/16.
 */
public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        Map<Character, Integer> dicHeadlines = new HashMap<>();
        for (int i = 0; i < headlines.length; i++){
            String[] oneHeadline = headlines[i].split("\\s+");
            for (int j = 0; j < oneHeadline.length; j++){
                char[] letters = oneHeadline[j].toLowerCase().toCharArray();
                for (int k = 0; k < letters.length; k++){
                    char letter = letters[k];
                    if (dicHeadlines.containsKey(letter)) dicHeadlines.put(letter, dicHeadlines.get(letter) + 1);
                    else dicHeadlines.put(letter, 1);
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < messages.length; i++){
            String[] oneMessage = messages[i].split("\\s+");
            Map<Character, Integer> dicMessage = new HashMap<>();
            for (int j = 0; j < oneMessage.length; j++){
                char[] letters = oneMessage[j].toLowerCase().toCharArray();
                for (int k = 0; k < letters.length; k++){
                    char letter = letters[k];
                    if (dicMessage.containsKey(letter)) dicMessage.put(letter, dicMessage.get(letter) + 1);
                    else dicMessage.put(letter, 1);
                }
            }
            boolean check = true;
            for (Character letter: dicMessage.keySet()){
                if (!dicHeadlines.containsKey(letter)) check = false;
                else if (dicMessage.get(letter) > dicHeadlines.get(letter)) check = false;
            }
            if (check) {
                answer += 1;
            }
        }
        return answer;
    }
}
