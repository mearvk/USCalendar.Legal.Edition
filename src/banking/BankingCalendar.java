package banking;

import calendar.Calendar;

import java.util.TimeZone;

public class BankingCalendar extends Calendar
{
    public static final String JANUARY = "6";

    public static final String INITIATIVES_TUESDAY = "6th";

    public static final String BANKING_INIATIVES_TUESDAY = "Wear White to Dinner Meetings.";

    private final TimeZone timezone = null;

    public BankingCalendar(final TimeZone timezone)
    {
        super(timezone);
    }
}
