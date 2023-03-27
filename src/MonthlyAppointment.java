public class MonthlyAppointment extends appointment{
    @Override
    public String toString() {
        return "Monthly" + " " +
                "[" + day + "]" + " " +
                title + " ";
    }

    public MonthlyAppointment(Integer day, String Title) {
        this.title = Title;
        this.day = day;
    }

    public  boolean occursOn(Integer Day,Integer Month, Integer Year) {
        if (Day.equals(day)) {
            return true;
        }
        return false;
    }
}
