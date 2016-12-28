import java.util.Arrays;

/**
 * Created by hushijia on 12/28/16.
 */
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        int answer = -1;
        for (int i = 0; i < orders.length; i++){
            String[] gradient = orders[i].split("\\s+");
            boolean check = true;
            for (int j = 0; j < gradient.length; j++){
                String grad = gradient[j];
                if (!Arrays.asList(available).contains(grad)) check = false;
            }
            if (check){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
