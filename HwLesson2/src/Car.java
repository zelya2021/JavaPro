public class Car {
    public String start(){
        return startElectricity() + "\t" + startCommand() + "\t" + startFuelSystem();
    }

    private String startElectricity(){
        return "Electricity started";
    }

    private String startCommand(){
        return "Command started";
    }

    private String startFuelSystem(){
        return "FuelSystem started";
    }
}
