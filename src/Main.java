import calendar.Calendar;

import java.util.TimeZone;

public class Main
{
    protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");

    public static void main(String[] args)
    {
        Calendar calendar = new Calendar(Main.US.Admiral.timezone);

        calendar = null;

        calendar = new Calendar(Main.US.Admiral.timezone);

        calendar = new Calendar(Main.US.Federal.timezone);

        calendar = new Calendar(Main.US.Labor.timezone);

        calendar = new Calendar(Main.US.Citizens.timezone);

        calendar = new Calendar(Main.US.Military.timezone);

        calendar = new Calendar(Main.US.Finance.timezone);

        calendar = new Calendar(Main.US.Banking.timezone);

        calendar = null;
    }

    protected static class US
    {
        protected static class Admiral
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Federal
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Labor
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Citizens
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Military
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Finance
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static class Banking
        {
            protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        }

        protected static final TimeZone timezone = TimeZone.getTimeZone("America/New_York");
    }
}