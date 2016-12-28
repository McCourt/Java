/**
 * Created by hushijia on 12/28/16.
 */
public class DNAReverse {
    public String reverse(String dna) {
        String answer = new String();
        for (int i = 0; i < dna.length(); i++){
            answer += dna.charAt(dna.length() - i - 1);
        }
        return answer;
    }
}
