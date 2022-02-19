package factorymethod;

import java.util.Calendar;

class InterstateBusCompanyFactory extends Company {
    @Override
    public Ticket issueTicket(String origin, String destination, Calendar dateTime) {
        return new InterstateBusTicket(origin, destination, dateTime);
    }
}
