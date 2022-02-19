package abstractfactory;

import java.util.Calendar;

abstract class CompanyBus {
    public abstract UrbanTicket issueUrbanBusTicket(String origin, String destination, Calendar dateTime);

    public abstract InterstateTicket issueInterstateBusTicket(String origin, String destination, Calendar dateTime);
}
