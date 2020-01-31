
class MountainBike extends Bicycle {
    String frontShock;
    String rearShock;

    MountainBike(String frontShockVar, String rearShockVar) {
        frontShock = frontShockVar;
        rearShock = rearShockVar;
    }

    void spares() {
        super.spares();
    }
}

//Template pattern method 

class Bicycle {
    char size;
    String chain;
    String tireSize;

    Bicycle(char sizeVar, String ... var) {
        size = sizeVar;
        if (var.length == 2) {
            chain = var[0];
            tireSize = var[1];
        }
        else if (var.length == 1) {
            defaultChain();
            tireSize = var[0];
        }
    }

    void defaultChain() {
        chain = "11-speed";
    }
}

class MountainBike extends Bicycle {

    void defaultTireSize() {
        tireSize = "23";
    }
}

class RoadBike extends Bicycle {
    void defaultTireSize() {
        tireSize = "2.1";
    }
}


abstract class Bicycle 
{
    char size;
    String chain;
    String tireSize;

    Bicycle(char sizeVar, String ... var)
     {
        size = sizeVar;
        if (var.length == 2) {
            chain = var[0];
            tireSize = var[1];
        }
        else if (var.length == 1) {
            defaultChain();
            tireSize = var[0];
        }
    }

    void defaultChain() {
        chain = "11-speed";
    }

    void spares ()
     {
        System.out.println(chain + " " + tireSize);
        localSpares();
    }

    abstract void defaultTireSize();
    abstract void localSpares();

    void postInitialize(String ... var) {

    }
}

class MountainBike extends Bicycle {

    String frontShock;
    String rearShock;

    void defaultTireSize()
     {
        tireSize = "23";
    }

    void postInitialize(String ... var)
     {
        if (var.length == 2) {
            frontShock = var[0];
            rearShock = var[1];
        }
        else {
            frontShock = var[0];
        }
    }

    void localSpares()
     {
        System.out.println(frontShock);
    }
}

class RoadBike extends Bicycle {

    String tapeColor;

    void defaultTireSize()
     {
        tireSize = "2.1";
    }

    void postInitialize(String var)
     {
        tapeColor = var;
    }

    void localSpares() 
    {
        System.out.println(tapeColor);
    }
}