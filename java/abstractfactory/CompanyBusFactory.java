package abstractfactory;

import java.util.Calendar;

class CompanyBusFactory extends CompanyBus {
    @Override
    public UrbanTicket issueUrbanBusTicket(String origin, String destination, Calendar dateTime) {
        return new UrbanBusTicket(origin, destination, dateTime);
    }

    @Override
    public InterstateTicket issueInterstateBusTicket(String origin, String destination, Calendar dateTime) {
        return new InterstateBusTicket(origin, destination, dateTime);
    }
}
