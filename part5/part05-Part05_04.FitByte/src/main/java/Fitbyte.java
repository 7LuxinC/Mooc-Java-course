public class Fitbyte {
    private  int age;
    private  int restingHearRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHearRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double max =  206.3 - (0.711 * this.age);
        double target = (max - this.restingHearRate) * percentageOfMaximum + this.restingHearRate;

        return target;
    }
}
