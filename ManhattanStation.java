package sample;

class ManhattanStation extends Station{

    private Station qStation = new Station();
    private String[] allMStations;

    public ManhattanStation(){
        qStation.setBorough("Manhattan");
    }

    public Station get96StreetMan(){
        qStation.setName("96 Street");
        qStation.setCrossStreets("2 Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station get86StreetMan(){
        qStation.setName("86 Street");
        qStation.setCrossStreets("2 Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station get72StreetMan(){
        qStation.setName("72 Street");
        qStation.setCrossStreets("2 Avenue");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station getLexingtonAvenue(){
        qStation.setName("Lexington Avenue");
        //qStation.setConnections(5);
        qStation.setCrossStreets("59 Street");
        qStation.addTrain("R-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        qStation.addTrain("Q-Train");
        return qStation;
    }

    public Station get5Avenue(){
        qStation.setName("5 Avenue");
        //qStation.setConnections(0);
        qStation.setCrossStreets("59 Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get57StreetMan(){
        qStation.setName("57 Street");
        //qStation.setConnections(1);
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get49StreetMan(){
        qStation.setName("49 Street");
        //qStation.setConnections(3);
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getTimesSquare(){
        qStation.setName("Times Square-42 Street");
        //qStation.setConnections(11);
        qStation.setCrossStreets("Broadway-7 Avenue");
        qStation.addTrain("N-Train");
        qStation.addTrain("7-Local-Train");
        qStation.addTrain("W-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getHeraldSquare(){
        qStation.setName("34 Street-Herald Square");
        //qStation.setConnections(7);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get28StreetMan(){
        qStation.setName("28 Street");
        //qStation.setConnections(2);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station get23StreetMan(){
        qStation.setName("23 Street");
        //qStation.setConnections(2);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getUnionSquare(){
        qStation.setName("14 Street-Union Square");
        //qStation.setConnections(7);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getNewYorkUniversity(){
        qStation.setName("8 Street-New York University");
        //qStation.setConnections(2);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getPrinceStreet(){
        qStation.setName("Prince Street");
        //qStation.setConnections(2);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getCanalStreet(){
        qStation.setName("Canal Street");
        //qStation.setConnections(7);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("Q-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getCityHall(){
        qStation.setName("City Hall");
        //qStation.setConnections(1);
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getCortlandtStreet(){
        qStation.setName("Cortlandt Street");
        //qStation.setConnections(1);
        qStation.setCrossStreets("Church Street");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getRectorStreet(){
        qStation.setName("Rector Street");
        //qStation.setConnections(1);
        qStation.setCrossStreets("Trinity Place");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getWhitehallStreetSouthFerry(){
        qStation.setName("Whitehall Street South Ferry");
        //qStation.setConnections(2);
        qStation.setCrossStreets("Water Street");
        qStation.addTrain("W-Train");
        qStation.addTrain("N-Train");
        qStation.addTrain("R-Train");
        return qStation;
    }

    public Station getGrandCentral(){
        qStation.setName("Grand Central - 42 Street");
        //qStation.setConnections(4);
        qStation.setCrossStreets("Lexington Avenue");
        qStation.addTrain("7-Local-Train");
        return qStation;
    }

    public Station get5AveBryantPark(){
        qStation.setName("5 Avenue-Bryant Park");
        //qStation.setConnections(4);
        qStation.setCrossStreets("42 Street");
        qStation.addTrain("7-Local-Train");
        return qStation;
    }

    public Station get34StreetHudsonYards(){
        qStation.setName("34 St-Hudson Yards");
        //qStation.setConnections(0);
        qStation.setCrossStreets("34 Street-11 Avenue");
        qStation.addTrain("7-Local-Train");
        return qStation;
    }


    public Station getMarbleHill(){
        qStation.setName("Marble Hill - 225 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get215StreetManhattan(){
        qStation.setName("215 Street");
        qStation.setCrossStreets("10 Avenue");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get207StreetManhattan(){
        qStation.setName("207 Street");
        qStation.setCrossStreets("10 Avenue");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station getDyckmanStreet(){
        qStation.setName("Dyckman Street");
        qStation.setCrossStreets("Nagle Avenue");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get191StreetManhattan(){
        qStation.setName("191 Street");
        qStation.setCrossStreets("Saint Nicholas Avenue");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get181StreetManhattan(){
        qStation.setName("181 Street");
        qStation.setCrossStreets("Saint Nicholas Avenue");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get168StreetWashingtonHeights(){
        qStation.setName("168 Street - Washington Heights");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get157StreetManhattan(){
        qStation.setName("157 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get145StreetManhattan(){
        qStation.setName("145 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get137StreetCityCollege(){
        qStation.setName("137 Street - City College");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get125StreetManhattan(){
        qStation.setName("125 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get116StreetColombiaUniversity(){
        qStation.setName("116 Street - Colombia University");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station getCathedralParkway(){
        qStation.setName("Cathedral Parkway - 110 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get103StreetManhattan(){
        qStation.setName("103 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get96StreetManhattan(){
        qStation.setName("96 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get86StreetManhattan(){
        qStation.setName("86 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get79StreetManhattan(){
        qStation.setName("79 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get72StreetManhattan(){
        qStation.setName("72 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get66StreetLincolnCenter(){
        qStation.setName("66 Street- Lincoln Center");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get59StreetColombusCircle(){
        qStation.setName("59 Street - Columbus Circle");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get50StreetManhattan(){
        qStation.setName("50 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get34StreetPennStation(){
        qStation.setName("34 Street - Penn Station");
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get28StreetManhattan(){
        qStation.setName("28 Street");
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get23StreetManhattan(){
        qStation.setName("23 Street");
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get18StreetManhattan(){
        qStation.setName("18 Street");
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get14StreetManhattan(){
        qStation.setName("14 Street");
        qStation.setCrossStreets("7 Avenue");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getChristopherStreet(){
        qStation.setName("Christopher Street - Sheridan Square");
        qStation.setCrossStreets("7 Avenue South");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getHoustonStreet(){
        qStation.setName("Houston Street");
        qStation.setCrossStreets("Varick Street");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getCanalStreetVarick(){
        qStation.setName("Canal Street (Cross w/ Varick Street");
        qStation.setCrossStreets("Varick Street");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getFranklinStreet(){
        qStation.setName("Franklin");
        qStation.setCrossStreets("Varick Street");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getChambersStreet(){
        qStation.setName("Chambers Street");
        qStation.setCrossStreets("West Broadway");
        qStation.addTrain("1-Train");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getCortlandtStreetWestBroadway(){
        qStation.setName("Cortlandt Street (Cross w/ West Broadway");
        qStation.setCrossStreets("West Broadway");
        qStation.addTrain("1-Train");
        qStation.deactivate();
        return qStation;
    }

    public Station getRectorStreetWest(){
        qStation.setName("Rector Street (West)");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station getSouthFerry(){
        qStation.setName("South Ferry");
        qStation.addTrain("1-Train");
        return qStation;
    }

    public Station get135StreetMan(){
        qStation.setName("135 Street");
        qStation.setCrossStreets("Lenox Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get125StreetMan(){
        qStation.setName("125 Street");
        qStation.setCrossStreets("Lenox Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station get116StreetMan(){
        qStation.setName("116 Street");
        qStation.setCrossStreets("Lenox Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getCentralParkNorth(){
        qStation.setName("Central Park North (100 Street)");
        qStation.setCrossStreets("Lenox Avenue");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getParkPlace(){
        qStation.setName("Park Place");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getFultonStreet(){
        qStation.setName("Fulton Street");
        qStation.setCrossStreets("William Street");
        qStation.addTrain("2-Train");
        return qStation;
    }

    public Station getWallStreet(){
        qStation.setName("Wall Street");
        qStation.setCrossStreets("William Street");
        qStation.addTrain("2-Train");
        return qStation;
    }







    public String[] getAllMStations(){
      allMStations = new String[]
          { "96 Street",
          "86 Street",
          "72 Street",
          "Lexington Avenue",
          "5 Avenue",
          "57 Street",
          "49 Street",
          "Times Square-42 Street",
          "34 Street-Herald Square",
          "28 Street",
          "23 Street",
          "14 Street-Union Square",
          "8 Street-New York University",
          "Prince Street",
          "Canal Street",
          "City Hall",
          "Cortlandt Street",
          "Rector Street",
          "Whitehall Street South Ferry",
          "Grand Central - 42 Street",
          "5 Avenue-Bryant Park",
          "34 St-Hudson Yards",
          "Marble Hill - 225 Street",
          "215 Street",
          "207 Street",
          "Dyckman Street",
          "191 Street",
          "181 Street",
          "168 Street - Washington Heights",
          "157 Street",
          "145 Street",
          "137 Street - City College",
          "125 Street",
          "116 Street - Colombia University",
          "Cathedral Parkway - 110 Street",
          "103 Street",
          "96 Street",
          "86 Street",
          "79 Street",
          "72 Street",
          "66 Street- Lincoln Center",
          "59 Street - Columbus Circle",
          "50 Street",
          "34 Street - Penn Station",
          "28 Street",
          "23 Street",
          "18 Street",
          "14 Street",
          "Christopher Street - Sheridan Square",
          "Houston Street",
          "Canal Street (Cross w/ Varick Street",
          "Franklin",
          "Chambers Street",
          "Cortlandt Street (Cross w/ West Broadway",
          "Rector Street (West)",
          "South Ferry",
          "135 Street",
          "125 Street",
          "116 Street",
          "Central Park North (100 Street)",
          "Park Place",
          "Fulton Street",
          "Wall Street" };

        return allMStations;
    }
}
