package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Run implements Speed{
    private List<Speed> speeds = new ArrayList<>();
    @Override
    public void speed(double speed) {
        speeds.forEach(speed1 -> speed1.speed(speed));
    }

    public void deleteBySpeed(Speed s){
        this.speeds.remove(s);
    }

    public void add(Speed s){
        this.speeds.add(s);
    }

    public void deleteAll(){
        speeds.clear();
    }

    public List<Speed> getSpeeds() {
        return speeds;
    }
}
