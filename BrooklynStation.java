package sample;

class BrooklynStation extends Station{

    private Station qStation = new Station();
    private String[] allBStations;

    public BrooklynStation(){
        qStation.setBorough("Brooklyn");
    }

    public Station getCourtStreet(){
        qStation.setName("Court Street");
        //qStation.setConnections(5);
        qStation.setCrossStreets("Montague Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getJayStreet(){
        qStation.setName("Jay Street-Metro Tech");
        //qStation.setConnections(3);
        qStation.setCrossStreets("Fulton Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getDeKalb(){
        qStation.setName("DeKalb Avenue");
        //qStation.setConnections(5);
        qStation.setCrossStreets("Flatbush Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getAtlanticAv(){
        qStation.setName("Atlantic Avenue/Barclays Center");
        //qStation.setConnections(8);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getUnionStreet(){
        qStation.setName("Union Street");
        //qStation.setConnections(0);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get4AvenueBro(){
        qStation.setName("4 Avenue");
        //qStation.setConnections(3);
        qStation.setCrossStreets("9 Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getProspectAvenue(){
        qStation.setName("Prospect Avenue");
        //qStation.setConnections(0);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        qStation.deactivate();
        return qStation;
    }

    public Station get25StreetBro(){
        qStation.setName("25 Street");
        //qStation.setConnections(0);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get36StreetBro(){
        qStation.setName("36 Street");
        //qStation.setConnections(2);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get45StreetBro(){
        qStation.setName("45 Street");
        qStation.setConnections(0);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get53StreetBro(){
        qStation.setName("53 Street");
        //qStation.setConnections(0);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get59StreetBro(){
        qStation.setName("59 Street");
        //qStation.setConnections(1);
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get8AvenueBro(){
        qStation.setName("8 Avenue");
        //qStation.setConnections(0);
        qStation.setCrossStreets("62 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station getFortHamiltonParkway(){
        qStation.setName("Fort Hamilton Parkway");
        //qStation.setConnections(0);
        qStation.setCrossStreets("62 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station getNewUtrechtAvenue(){
        qStation.setName("New Utrecht Avenue");
        //qStation.setConnections(1);
        qStation.setCrossStreets("62 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station get18AvenueBro(){
        qStation.setName("18 Avenue");
        //qStation.setConnections(0);
        qStation.setCrossStreets("64 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station get20AvenueBro(){
        qStation.setName("20 Avenue");
        //qStation.setConnections(0);
        qStation.setCrossStreets("64 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station getBayParkway(){
        qStation.setName("Bay Parkway");
        //qStation.setConnections(0);
        qStation.setCrossStreets("West 7 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station getKingsHighway(){
        qStation.setName("Kings Highway");
        //qStation.setConnections(0);
        qStation.setCrossStreets("West 7 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station getAvenueU(){
        qStation.setName("Avenue U");
        //qStation.setConnections(0);
        qStation.setCrossStreets("West 7 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station get86StreetBro(){
        qStation.setName("86 Street");
        //qStation.setConnections(0);
        qStation.setCrossStreets("West 7 Street");
        qStation.addTrain("N-Train");
        return qStation;
    }

    public Station get7AvenueBro(){
        qStation.setName("7 Avenue");
        qStation.setCrossStreets("Flatbush Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getProspectPark(){
        qStation.setName("Prospect Park");
        qStation.setCrossStreets("Empire Boulevard-Flatbush Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getParkSideAvenue(){
        qStation.setName("Parkside Avenue");
        qStation.setCrossStreets("Ocean Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getChurchAvenue(){
        qStation.setName("Church Avenue");
        qStation.setCrossStreets("East 18 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getBeverleyRoad(){
        qStation.setName("Beverley Road");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getCortelyouRoad(){
        qStation.setName("Cortelyou Road");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getNewkirkPlaza(){
        qStation.setName("Newkirk Plaza");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getAvenueH(){
        qStation.setName("Avenue H");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getAvenueJ(){
        qStation.setName("Avenue J");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getAvenueM(){
        qStation.setName("Avenue M");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getKingsHighway2(){
        qStation.setName("Kings Highway");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getAvenueU2(){
        qStation.setName("Avenue U");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getNeckRoad(){
        qStation.setName("Neck Road");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getSheepsheadBay(){
        qStation.setName("Sheepshead Bay");
        qStation.setCrossStreets("East 16 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getBrightonBeach(){
        qStation.setName("Brighton Beach");
        qStation.setCrossStreets("Brighton 6 Street");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getOceanParkway(){
        qStation.setName("Ocean Parkway");
        qStation.setCrossStreets("Brighton Beach Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getNewYorkAquarium(){
        qStation.setName("West 8 Street-New York Aquarium");
        qStation.setCrossStreets("Surf Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getConeyIsland(){
        qStation.setName("Coney Island-Stillwell");
        qStation.setCrossStreets("Surf Avenue");
        qStation.addTrain("Q-Train");
        qStation.addTrain("N-Train");
        //qStation.setConnections(3);
        return qStation;
    }

    public Station getBayRidgeAvenue(){
        qStation.setName("Bay Ridge Avenue");
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("R-Train");
        //qStation.setConnections(3);
        return qStation;
    }

    public Station get77StreetBrkln(){
        qStation.setName("77 Street");
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("R-Train");
        //qStation.setConnections(3);
        return qStation;
    }

    public Station get86StreetBrkln(){
        qStation.setName("86 Street");
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("R-Train");
        //qStation.setConnections(3);
        return qStation;
    }

    public Station getBayRidge95Street(){
        qStation.setName("Bay Ridge-95 Street");
        qStation.setCrossStreets("4 Avenue");
        qStation.addTrain("R-Train");
        //qStation.setConnections(3);
        return qStation;
    }

    public Station getClarkStreet(){
        qStation.setName("Clark Street");
        qStation.setCrossStreets("Henry Street");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getBoroughHall(){
        qStation.setName("Borough Hall");
        qStation.setCrossStreets("Court Street-Montague Street");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getHoytStreet(){
        qStation.setName("Hoyt Street");
        qStation.setCrossStreets("Fulton Mall");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getNevinsStreet(){
        qStation.setName("Nevins Street");
        qStation.setCrossStreets("Flatbush Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getBergenStreet(){
        qStation.setName("Bergen Street");
        qStation.setCrossStreets("Flatbush Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getGrandArmyPlaza(){
        qStation.setName("Grand Army Plaza");
        qStation.setCrossStreets("Flatbush Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getEasternParkwayBrooklynMuseum(){
        qStation.setName("Eastern Parkway - Brooklyn Museum");
        qStation.setCrossStreets("");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getFranklinAvenue(){
        qStation.setName("Franklin Avenue");
        qStation.setCrossStreets("Eastern Parkway");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getPresidentStreet(){
        qStation.setName("President Street");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getSterlingStreet(){
        qStation.setName("Sterling Street");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getWinthropStreet(){
        qStation.setName("Winthrop Street");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getChurchAvenueNostrand(){
        qStation.setName("Church Avenue");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getBeverleyRoadNostrand(){
        qStation.setName("Beverley Road");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getNewkirkAvenue(){
        qStation.setName("Newkirk Avenue");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getFlatbushAvenue(){
        qStation.setName("Flatbush Avenue - Brooklyn College");
        qStation.setCrossStreets("Nostrand Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }







    public String[] getAllBStations(){
      allBStations = new String[]{
          "Court Street",
          "Jay Street-Metro Tech",
          "DeKalb Avenue",
          "Atlantic Avenue/Barclays Center",
          "Union Street",
          "4 Avenue",
          "Prospect Avenue",
          "25 Street",
          "36 Street",
          "45 Street",
          "53 Street",
          "59 Street",
          "8 Avenue",
          "Fort Hamilton Parkway",
          "New Utrecht Avenue",
          "18 Avenue",
          "20 Avenue",
          "Bay Parkway",
          "Kings Highway",
          "Avenue U",
          "86 Street",
          "7 Avenue",
          "Prospect Park",
          "Parkside Avenue",
          "Church Avenue",
          "Beverley Road",
          "Cortelyou Road",
          "Newkirk Plaza",
          "Avenue H",
          "Avenue J",
          "Avenue M",
          "Kings Highway",
          "Avenue U",
          "Neck Road",
          "Sheepshead Bay",
          "Brighton Beach",
          "Ocean Parkway",
          "West 8 Street-New York Aquarium",
          "Coney Island-Stillwell",
          "Bay Ridge Avenue",
          "77 Street",
          "86 Street",
          "Bay Ridge-95 Street",
        "Clark Street",
        "Borough Hall",
        "Hoyt Street",
        "Nevins Street",
        "Bergen Street",
        "Grand Army Plaza",
        "Eastern Parkway - Brooklyn Museum",
        "Franklin Avenue",
        "President Street",
        "Sterling Street",
        "Winthrop Street",
        "Church Avenue",
        "Beverley Road",
        "Newkirk Avenue",
        "Flatbush Avenue - Brooklyn College"};
        return allBStations;
    }
}
