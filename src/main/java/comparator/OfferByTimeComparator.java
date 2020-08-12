package comparator;

import domain.Offer;

import java.util.Comparator;

public class OfferByTimeComparator implements Comparator<Offer> {
    public int compare(Offer o1, Offer o2) {
        return o1.getFlightTimeInMinutes() - o2.getFlightTimeInMinutes();
    }
}
