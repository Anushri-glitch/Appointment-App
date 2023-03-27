public class SingleAppointment extends appointment {
    @Override
    public String toString() {
        return "Single" + " " +
                "[" + day + "/" + month + "/" + year + "]" + " " +
                title + " ";
    }
    public SingleAppointment(Integer day, Integer month, Integer year, String Title) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.title = Title;
    }

    public boolean occursOn(Integer Day, Integer Month, Integer Year){
        if(Day.equals(day) && Month.equals(month) && Year.equals(year)){
            return true;
        }
        return false;
    }

}
