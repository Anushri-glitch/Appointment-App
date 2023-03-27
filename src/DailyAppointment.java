public class DailyAppointment extends appointment {
    //1st Subclass
        public DailyAppointment() {
            this.title = "title";
        }
        public DailyAppointment(String title) {
            this.title = title;
        }
        public boolean occursOn(String Title){
            if(Title.equals(title)){
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Daily" + " " +
                    title + " ";
        }
}
