package banking;

import calendar.Calendar;

import java.util.TimeZone;

public class BankingCalendar extends Calendar
{
    public static final String JANUARY = "6";

    public static final String INITIATIVES_TUESDAY = "6th";

    public static final String BANKING_INIATIVES_TUESDAY = "Wear White to Dinner Meetings.";

    public static final String STRING_FINANCIAL_PUBLIC_LOCANCES_WHITE = "$4,200,000,000,000.00/per Day";

    public static final String STRING_FINANCIAL_PRIVATE_MEETINGS = "$6,000,000,000,000,000,000.00/per Day";

    private final TimeZone timezone = null;

    public BankingCalendar(final TimeZone timezone)
    {
        super(timezone);
    }
}
