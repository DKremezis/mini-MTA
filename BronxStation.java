package sample;

public class BronxStation extends Station {

    private Station bStation = new Station();
    private String[] allBStations;

    public BronxStation() {bStation.setBorough("The Bronx"); }

    public Station getVanCortlandtPark(){
        bStation.setName("Van Cortlandt Park - 242 Street");
        bStation.setCrossStreets("Broadway");
        bStation.addTrain("1-Train");
        return bStation;
    }

    public Station get238StreetBronx(){
        bStation.setName("238 Street");
        bStation.setCrossStreets("Broadway");
        bStation.addTrain("1-Train");
        return bStation;
    }

    public Station get231StreetBronx(){
        bStation.setName("231 Street");
        bStation.setCrossStreets("Broadway");
        bStation.addTrain("1-Train");
        return bStation;
    }

    public Station getWakefield(){
        bStation.setName("Wakefield - 241 Street");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getNereidAvenue(){
        bStation.setName("Nereid Avenue");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        //bStation.addTrain("5-Train");
        return bStation;
    }

    public Station get233StreetBronx(){
        bStation.setName("233 - Street");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        //bStation.addTrain("5-Train");
        return bStation;
    }

    public Station get225StreetBronx(){
        bStation.setName("225 Street");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station get219StreetBronx(){
        bStation.setName("219 Street");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getGunHillRoad(){
        bStation.setName("Gun Hill Road");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        //bStation.addTrain("5-Train");
        return bStation;
    }

    public Station getBurkeAvenue(){
        bStation.setName("Burke Avenue");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getAllertonAvenue(){
        bStation.setName("Allerton Avenue");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getPelhamParkway(){
        bStation.setName("Pelham Parkway");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }



    public Station getBronxPartEast(){
        bStation.setName("Bronx Park East");
        bStation.setCrossStreets("White Plains Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getEast180StreetBronx(){
        bStation.setName("East 180 Street");
        bStation.setCrossStreets("Morris Park Avenue");
        bStation.addTrain("2-Train");
        //bStation.addTrain("5-Train");
        return  bStation;
    }

    public Station getWestFarmsSquare(){
        bStation.setName("West Farms Square/ East Tremont Avenue");
        bStation.setCrossStreets("Boston Road");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station get174StreetBronx(){
        bStation.setName("174 Street");
        bStation.setCrossStreets("Southern Boulevard");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getFreemanStreet(){
        bStation.setName("Freeman Street");
        bStation.setCrossStreets("Southern Boulevard");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getSimpsonStreet(){
        bStation.setName("Simpson Street");
        bStation.setCrossStreets("Westchester Avenue");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getIntervaleAvenue(){
        bStation.setName("Intervale Avenue");
        bStation.setCrossStreets("Westchester Avenue");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getProspectAvenue(){
        bStation.setName("Prospect Avenue");
        bStation.setCrossStreets("Westchester Avenue");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station getJacksonAvenue(){
        bStation.setName("Jackson Avenue");
        bStation.setCrossStreets("Westchester Avenue");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station get3Avenue149StreetBronx(){
        bStation.setName("3 Avenue - 149 Street");
        bStation.setCrossStreets("");
        bStation.addTrain("2-Train");
        return bStation;
    }

    public Station get149StreetGrandConcourse(){
        bStation.setName("149 Street - Grand Concourse");
        bStation.setCrossStreets("");
        bStation.addTrain("2-Train");
        return bStation;
    }




    public String[] getAllBStations() {
      allBStations = new String[]
        {   "Van Cortlandt Park - 242 Street",
            "238 Street",
            "231 Street",
            "Wakefield - 241 Street",
            "Nereid Avenue",
            "233 - Street",
            "225 Street",
            "219 Street",
            "Gun Hill Road",
            "Burke Avenue",
            "Allerton Avenue",
            "Pelham Parkway",
            "Bronx Park East",
            "East 180 Street",
            "West Farms Square/ East Tremont Avenue",
            "174 Street",
            "Freeman Street",
            "Simpson Street",
            "Intervale Avenue",
            "Prospect Avenue",
            "Jackson Avenue",
            "3 Avenue - 149 Street",
            "149 Street - Grand Concourse"
        };
        return allBStations;
    }
}
