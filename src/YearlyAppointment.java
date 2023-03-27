public class YearlyAppointment extends appointment{
    @Override
    public String toString() {
        return "Yearly" + " " +
                "[" + day + "/" + month + "]" + " " +
                title + " " ;
    }
    public YearlyAppointment(int day, int month, String title) {
        this.day = day;
        this.month = month;
        this.title = title;
    }

    public boolean occursOn(Integer Day, Integer Month, Integer Year){
        if(Day.equals(day) && Month.equals(month)){
            return true;
        }
        return false;
    }
}
