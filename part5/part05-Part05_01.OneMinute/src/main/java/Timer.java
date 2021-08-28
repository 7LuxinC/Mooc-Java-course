public class Timer {
        private ClockHand second;
        private ClockHand hundredthsOfSec;

    public Timer(){
        this.second = new ClockHand(60);
        this.hundredthsOfSec = new ClockHand(100);
    }



    public void advance(){
        this.hundredthsOfSec.advance();

        if(this.hundredthsOfSec.value() == 0){
            this.second.advance();


        }

    }
    public String toString(){
        return this.second + ":" + this.hundredthsOfSec;
    }

}
