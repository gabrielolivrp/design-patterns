package abstractfactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract class InterstateTicket {
    private String origin;
    private String destination;
    private Calendar dateTime;

    protected SimpleDateFormat dateFormat;

    public InterstateTicket(String origin, String destination, Calendar dateTime) {
        this.origin = origin;
        this.destination = destination;
        this.dateTime = dateTime;
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public Calendar getDateTime() {
        return this.dateTime;
    }

    public abstract void getDetails();
}
