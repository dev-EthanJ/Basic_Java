import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {

        CalendarEx cal = new CalendarEx();
        Calendar now = Calendar.getInstance();
        cal.printCalendar("now ", now);

        Calendar firstDate = Calendar.getInstance();
        firstDate.clear();

        firstDate.set(2022, 11, 25);
        firstDate.set(Calendar.HOUR_OF_DAY, 16);
        firstDate.set(Calendar.MINUTE, 50);
        cal.printCalendar("The very first day we date ", firstDate);
    }

    public void printCalendar(String str, Calendar cal) {
        int year = cal.get(Calendar.YEAR);

        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        int hour = cal.get(Calendar.HOUR);
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int ampm = cal.get(Calendar.AM_PM);

        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milisecond = cal.get(Calendar.MILLISECOND);

        System.out.print(str + year + '-' + month + '-' + day + " (");
        System.out.println(hourOfDay + ")");

        if (ampm == Calendar.AM) System.out.print("AM ");
        else System.out.print("PM ");
        System.out.println(hour + ":" + minute + " " + second + "sec");
    }
}