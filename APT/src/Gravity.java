/**
 * Created by hushijia on 12/28/16.
 */
public class Gravity {
    public double falling(double time, double velo){
        double answer = velo * time + 0.5 * 9.8 * Math.pow(time,2);
        return answer;
    }
}
