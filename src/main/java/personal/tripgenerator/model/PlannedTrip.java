package personal.tripgenerator.model;

import java.util.Date;

public class PlannedTrip {
    private final long id;

    private final String destination;

    private final Date date;

    public PlannedTrip(long id, String destination) {
        this.id = id;
        this.destination = destination;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }
}
