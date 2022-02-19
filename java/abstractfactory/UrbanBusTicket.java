package abstractfactory;

import java.util.Calendar;

class UrbanBusTicket extends UrbanTicket {
    public UrbanBusTicket(String origin, String destiny, Calendar dateTime) {
        super(origin, destiny, dateTime);
    }

    @Override
    public void getDetails() {
        System.out.println("Urban bus ticket: "
                + this.getOrigin() + " from " + this.getDestination()
                + " Date: " + super.dateFormat.format(this.getDateTime().getTime()));
    }
}
