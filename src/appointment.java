public class appointment {
    public String title;
    public Integer day, month, year;

    //All Arguments Constructor
    public appointment(String title, Integer day, Integer month, Integer year) {
        this.title = title;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //No Arguments Constructor
    public appointment() {
        this.day =  0;
        this.month = 1;
        this.year = 1000;
        this.title = "title";
    }
    //Method OccursOn
    public boolean occursOn(Integer Day, Integer Month, Integer Year){
        if(day.equals(Day) && month.equals(Month) && year.equals(Year)){
            return true;
        }
        return false;
    }
    //Method toString()
    @Override
    public String toString() {
        return "appointment" + " " +
                "[" + day + "/" + month + "/" + year + "]" + " " +
                title + " ";
    }
}

