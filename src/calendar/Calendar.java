package calendar;

import java.util.TimeZone;

public class Calendar
{
    public static final String JANUARY = "1";

    protected TimeZone timezone = null;

    public Calendar(TimeZone timezone)
    {
        this.timezone = timezone;
    }
}
