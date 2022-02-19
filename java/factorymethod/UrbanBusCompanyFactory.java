package factorymethod;

import java.util.Calendar;

class UrbanBusCompanyFactory extends Company {
    @Override
    public Ticket issueTicket(String origin, String destination, Calendar dateTime) {
        return new UrbanBusTicket(origin, destination, dateTime);
    }
}
