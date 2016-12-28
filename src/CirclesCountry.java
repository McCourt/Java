/**
 * Created by hushijia on 12/28/16.
 */
public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
        int answer = 0;
        for (int i = 0; i < r.length; i++){
            double r1 = Math.pow(x[i] - x1,2) + Math.pow(y[i] - y1,2);
            double r2 = Math.pow(x[i] - x2,2) + Math.pow(y[i] - y2,2);
            double r0 = Math.pow(r[i],2);
            if (!(r1 <= r0 && r2 <= r0)){
                if (r1 <= r0) answer += 1;
                if (r2 <= r0) answer += 1;
            }
        }
        return answer;
    }
}