class Gear {

    Wheel wheel;
    int chainRing;
    int cog;
    

    Gear(int chainVar, int cogVar, Wheel wheelVar) 
    {
        chainRing = chainVar;
        cog = cogVar;
        wheel = wheelVar;
    }

    float gearInches()
     {
        return  ratio() * wheel.diameter;
    }
    float ratio()
     {
        return (double)chainRing/cog;
    }
}

class Wheel {

    double tire;
    int rim;
    public static final PI = 3.14;

    Wheel(int rimVar, double tireVar) 
    {
        rim = rimVar;
        tire = tireVar;
    }

    double diameter ()
     {
        return (rim + tire * 2);
    }

    double circumference() 
    {
        return diameter() * PI;
    }
}

class Main {

    public static  void main(String[] args) {

        Wheel wheel = new Wheel(26, 1.5);
        Gear gear1 = new Gear(52, 11, wheel);
        gearInches1 = gear1.gearInches();
    }
}

