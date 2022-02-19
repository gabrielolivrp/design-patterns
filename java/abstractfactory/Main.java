package abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        CompanyBusFactory company = new CompanyBusFactory();

        UrbanTicket urbanTicker = company.issueUrbanBusTicket(
                "São Paulo",
                "Campinas",
                new GregorianCalendar(2020, Calendar.DECEMBER, 10, 11, 0));

        InterstateTicket interstateTicket = company.issueInterstateBusTicket(
                "Rio de Janeiro",
                "Bahia",
                new GregorianCalendar(2020, Calendar.NOVEMBER, 12, 30, 0));

        urbanTicker.getDetails();
        interstateTicket.getDetails();
    }
}
