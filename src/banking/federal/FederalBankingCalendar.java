package banking.federal;

import banking.BankingCalendar;
import calendar.Calendar;

import java.util.TimeZone;

public class FederalBankingCalendar extends BankingCalendar
{
    public static final String JANUARY = "6";

    public static final String INITIATIVES_TUESDAY = "6th";

    public static final String BANKING_INIATIVES_TUESDAY = "Wear White to Dinner Meetings.";

    public static final String STRING_FINANCIAL_PUBLIC_LOCANCES_WHITE = "$4,200,000,000,000,005.09/per Day";            //$4.2 Quadrillion Per Day USD

    public static final String STRING_FINANCIAL_PRIVATE_MEETINGS = "$6,000,000,000,000,000,001,000.02/per Day";         //$6.001 Sextillionth Per Day Local Privacies and Utilitaries and Sums ADRs

    private final TimeZone timezone = null;

    public FederalBankingCalendar(final TimeZone timezone)
    {
        super(timezone);
    }
}
