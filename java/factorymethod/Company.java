package factorymethod;

import java.util.Calendar;

abstract class Company {
    public abstract Ticket issueTicket(String origin, String destination, Calendar dateTime);
}
