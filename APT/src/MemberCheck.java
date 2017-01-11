import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hushijia on 12/28/16.
 */
public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Set<String> people = new TreeSet<>();
        Set<String> club_1 = new HashSet<String>(Arrays.asList(club1));
        club_1.retainAll(Arrays.asList(club2));
        Set<String> club_2 = new HashSet<String>(Arrays.asList(club2));
        club_2.retainAll(Arrays.asList(club3));
        Set<String> club_3 = new HashSet<String>(Arrays.asList(club3));
        club_3.retainAll(Arrays.asList(club1));
        people.addAll(club_1);
        people.addAll(club_2);
        people.addAll(club_3);
        String[] answer = people.toArray(new String[people.size()]);
        return answer;
    }
}
