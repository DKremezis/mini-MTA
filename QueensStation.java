package sample;

class QueensStation extends Station{

    private Station qStation = new Station();
    private String[] allQStations;


    public QueensStation(){
        qStation.setBorough("Queens");
    }

    public Station getForestHills71Avenue(){
        qStation.setName("Forest Hills-71 Avenue");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station get67AvenueQueens(){
        qStation.setName("67 Avenue");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station get63DriveRegoPark(){
        qStation.setName("63 Drive/Rego Park");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getWoodhavenBoulevard(){
        qStation.setName("Woodhaven Boulevard");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getGrandAvenueNewton(){
        qStation.setName("Grand Avenue/Newton");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getElmhurstAvenue(){
        qStation.setName("Elmhurst Avenue");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getJacksonHeightsRooseveltAvenue(){
        qStation.setName("Jackson Heights/Roosevelt Avenue");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station get65StreetQueens(){
        qStation.setName("65 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getNorthernBoulevard(){
        qStation.setName("Northern Boulevard");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station get46StreetQueens(){
        qStation.setName("46 Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getSteinwayStreet(){
        qStation.setName("Steinway Street");
        qStation.setCrossStreets("Broadway");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station get36StreetQueens(){
        qStation.setName("36 Street");
        qStation.setCrossStreets("Northen Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getQueensPlaza(){
        qStation.setName("Queens Plaza");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("R-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getAstDit(){
        qStation.setName("Astoria - Ditmars");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        //qStation.setConnections(0);
        return qStation;
    }

    public Station getAstoriaBlv(){
        qStation.setName("Astoria Boulevard");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        //connections = 0;
        return qStation;
    }

    public Station get30AvenueQueens(){
        qStation.setName("30 Avenue");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train" );
        qStation.addTrain("W-Train");
        //connections = 0;
        return qStation;
    }

    public Station getBroadwayQueens(){
        qStation.setName("Broadway");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train" );
        qStation.addTrain("W-Train");
        //connections = 0;
        return qStation;
    }

    public Station get36AvenueQueens(){
        qStation.setName("36 Avenue");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train" );
        qStation.addTrain("W-Train");
        //connections = 0;
        return qStation;
    }

    public Station get39AvenueQueens(){
        qStation.setName("39 Avenue");
        qStation.setCrossStreets("31 Street");
        qStation.addTrain("N-Train");
        qStation.addTrain("W-Train");
        //connections = 0;
        return qStation;
    }

    public Station getQueensboroPlaza(){
        qStation.setName("Queensboro Plaza");
        qStation.setCrossStreets("Bridge Plaza and Queensboro Bridge");
        qStation.addTrain("N-Train");
        qStation.addTrain("7-Local-Train" );
        qStation.addTrain("7-Express-Train");
        qStation.addTrain("W-Train");
        //connections = 4;
        return qStation;
    }

    public Station getFlushingMainStr(){
        qStation.setName("Flushing-Main Street");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train");
        qStation.addTrain("7-Express-Train");
        //connections = 0;
        return qStation;
    }

    public Station getMetsWillentsPoint(){
        qStation.setName("Mets-Willets Point");
        qStation.setCrossStreets("");
        qStation.addTrain("7-Local-Train");
        qStation.addTrain("7-Express-Train");
        //connections = 1;
        return qStation;
    }

    public Station get111StreetQueens(){
        qStation.setName("111 Street");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train");
        //connections = 0;
        return qStation;
    }

    public Station get103StreetCoronaPlaza(){
        qStation.setName("103 Street-Corona Plaza");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station getJunctionBlv(){
        qStation.setName("Junction Boulevard");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train");
        qStation.addTrain("7-Express-Train");
        //connections = 1;
        return qStation;
    }

    public Station get90StreetElmhurstAvenue(){
        qStation.setName("90 Street-Elmhurst Avenue");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station get82StreetJacksonHeights(){
        qStation.setName("82 Street-Jackson Heights");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station get74StreetBroadway(){
        qStation.setName("74 Street-Broadway");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 4;
        return qStation;
    }

    public Station get69StreetQueens(){
        qStation.setName("69 Street");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station getWoodside61Street(){
        qStation.setName("Woodside 61 Street");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train");
        qStation.addTrain("7-Express-Train");
        //connections = 1;
        return qStation;
    }

    public Station get52StreetQueens(){
        qStation.setName("52 Street");
        qStation.setCrossStreets("Roosevelt Avenue");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station get40StreetQueens(){
        qStation.setName("40 Street");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station get33StreetQueens(){
        qStation.setName("33 Street");
        qStation.setCrossStreets("Queens Boulevard");
        qStation.addTrain("7-Local-Train" );
        //connections = 0;
        return qStation;
    }

    public Station getCourtSquare(){
        qStation.setName("CourtSquare");
        qStation.setCrossStreets("");
        qStation.addTrain("7-Local-Train" );
        qStation.addTrain("7-Express-Train");
        //connections = 3;
        return qStation;
    }

    public Station getHuntersPoint(){
        qStation.setName("Hunters Point Avenue");
        qStation.setCrossStreets("49 Avenue-21 Street");
        qStation.addTrain("7-Local-Train" );
        qStation.addTrain("7-Express-Train");
        //connections = 0;
        return qStation;
    }

    public Station getVernonBlv(){
        qStation.setName("Vernon Boulevard-Jackson Avenue");
        qStation.setCrossStreets("");
        qStation.addTrain("7-Local-Train" );
        qStation.addTrain("7-Express-Train");
        //connections = 0;
        return qStation;
    }

    public String[] getAllQStations(){
      allQStations = new String[] {
          "Forest Hills-71 Avenue",
          "67 Avenue",
          "63 Drive/Rego Park",
          "Woodhaven Boulevard",
          "Grand Avenue/Newton",
          "Elmhurst Avenue",
          "Jackson Heights/Roosevelt Avenue",
          "65 Street",
          "Northern Boulevard",
          "46 Street",
          "Steinway Street",
          "36 Street",
          "Queens Plaza",
          "Astoria - Ditmars",
          "Astoria Boulevard",
          "30 Avenue",
          "Broadway",
          "36 Avenue",
          "39 Avenue",
          "Queensboro Plaza",
          "Flushing-Main Street",
          "Mets-Willets Point",
          "111 Street",
          "103 Street-Corona Plaza",
          "Junction Boulevard",
          "90 Street-Elmhurst Avenue",
          "82 Street-Jackson Heights",
          "74 Street-Broadway",
          "69 Street",
          "Woodside 61 Street",
          "52 Street",
          "46 Street",
          "40 Street",
          "33 Street",
          "CourtSquare",
          "Hunters Point Avenue",
          "Vernon Boulevard-Jackson Avenue"
        };
        return allQStations;
    }


}
