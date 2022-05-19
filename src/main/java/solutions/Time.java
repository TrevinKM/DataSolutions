package solutions;

public class Time {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    private int temp = 0;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String timeString(){
        temp = seconds/60;
        if (seconds>=60){
            seconds = seconds%60;
        }

        minutes += temp;
        temp = minutes/60;
        if (minutes>=60){
            minutes = minutes%60;
        }

        hours += temp;
        if (hours>23){
            hours = hours - 24;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    public void scale(int sSeconds){
        seconds += sSeconds;
    }

}
