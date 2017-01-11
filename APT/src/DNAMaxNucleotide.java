/**
 * Created by hushijia on 12/28/16.
 */
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int count = 0;
        String answer = new String();
        for (int i = 0; i < strands.length; i++){
            String gene = strands[i];
            int count0 = 0;
            for (int j = 0; j < gene.length(); j++){
                char letter = gene.charAt(j);
                if (nuc.charAt(0) == letter) count0 += 1;
            }
            if (count0 > count){
                count = count0;
                answer = gene;
            } else if (count0 == count && gene.length() > answer.length() && !answer.equals("")){
                answer = gene;
            }
        }
        return answer;
    }
}
