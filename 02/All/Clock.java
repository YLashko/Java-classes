public class Clock
{
    int hour = 0;
    int minute = 0;
    int alarmHour = 0;
    int alarmMinute = 0;
    boolean alarmOn;
    
    Clock(final int hour, final int minute){
        alarmOn = false;
        SetClock(hour, minute);
    }
    
    Clock(){
        alarmOn = false;
        SetClock(0, 0);
    }
    
    void SetClock(final int hour, final int minute){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }
    
    void SetClock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    void SetAlarm(final int hour, final int minute){
        alarmOn = true;
        if (hour >= 0 && hour <= 23){
            this.alarmHour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.alarmMinute = minute;
        }
    }
    
    void DisplayTime(){
        System.out.println(hour + ":" + minute);
    }
    
    void AddMinute(){
        minute += 1;
        if (minute > 59){
            minute = 0;
            hour += 1;
        }
        if (hour > 23){
            hour = 0;
        }
        CheckAlarm();
    }
    
    void CheckAlarm(){
        if (alarmOn && hour == alarmHour && minute == alarmMinute){
            RunAlarm();
        }
    }
    
    void RunAlarm(){
        System.out.println("beep-beep-beep-beep !!");
        alarmOn = false;
    }
    
    public static void main(String[] args){
        Clock myClock = new Clock(12, 47);
        myClock.DisplayTime();
        myClock.SetAlarm(23, 59);
        myClock.SetClock(18, 14);
        myClock.DisplayTime();
        myClock.SetClock(9, 3);
        myClock.DisplayTime();
        myClock.SetClock(23, 58);
        myClock.DisplayTime();
        myClock.AddMinute();
        myClock.DisplayTime();
        myClock.AddMinute();
        myClock.DisplayTime();
    }
}
