
//ducktyping in java using interface


interface Plan{

    void trip_plan(Trip trip);

}

class Trip {

    private int bicycle,customer,vehicle;

    public void prepares(Plan preparer)
    {
        preparer.trip_plan(this);
    }

}

class Mechanic
{
    public void trip_plan(Trip trip)
    {
        System.out.println("Mechanic");
    }
}

class TripAdviser
{
    public void trip_plan(Trip trip)
    {
        System.out.println("Trip Adviser");
    }
}