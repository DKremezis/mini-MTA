package sample;

class PurpleTrain extends Train{

    public PurpleTrain(){}

    public PurpleTrain get7LocalTrain(){
        PurpleTrain pTrain = new PurpleTrain();
        pTrain.setName("7-Local-Train");
        pTrain.addStation(new QueensStation().getFlushingMainStr());
        pTrain.addStation(new QueensStation().getMetsWillentsPoint());
        pTrain.addStation(new QueensStation().get111StreetQueens());
        pTrain.addStation(new QueensStation().get103StreetCoronaPlaza());
        pTrain.addStation(new QueensStation().getJunctionBlv());
        pTrain.addStation(new QueensStation().get90StreetElmhurstAvenue());
        pTrain.addStation(new QueensStation().get82StreetJacksonHeights());
        pTrain.addStation(new QueensStation().get74StreetBroadway());
        pTrain.addStation(new QueensStation().get69StreetQueens());
        pTrain.addStation(new QueensStation().getWoodside61Street());
        pTrain.addStation(new QueensStation().get52StreetQueens());
        pTrain.addStation(new QueensStation().get46StreetQueens());
        pTrain.addStation(new QueensStation().get40StreetQueens());
        pTrain.addStation(new QueensStation().get33StreetQueens());
        pTrain.addStation(new QueensStation().getQueensboroPlaza());
        pTrain.addStation(new QueensStation().getCourtSquare());
        pTrain.addStation(new QueensStation().getHuntersPoint());
        pTrain.addStation(new QueensStation().getVernonBlv());
        pTrain.addStation(new ManhattanStation().getGrandCentral());
        pTrain.addStation(new ManhattanStation().get5AveBryantPark());
        pTrain.addStation(new ManhattanStation().getTimesSquare());
        pTrain.addStation(new ManhattanStation().get34StreetHudsonYards());
        return pTrain;
    }

    public PurpleTrain get7ExpressTrain(){
        PurpleTrain pTrain = new PurpleTrain();
        pTrain.setName("7-Express-Train");
        pTrain.addStation(new QueensStation().getFlushingMainStr());
        pTrain.addStation(new QueensStation().getMetsWillentsPoint());
        pTrain.addStation(new QueensStation().getJunctionBlv());
        pTrain.addStation(new QueensStation().getWoodside61Street());
        pTrain.addStation(new QueensStation().getQueensboroPlaza());
        pTrain.addStation(new QueensStation().getCourtSquare());
        pTrain.addStation(new QueensStation().getHuntersPoint());
        pTrain.addStation(new QueensStation().getVernonBlv());
        pTrain.addStation(new ManhattanStation().getGrandCentral());
        pTrain.addStation(new ManhattanStation().get5AveBryantPark());
        pTrain.addStation(new ManhattanStation().getTimesSquare());
        pTrain.addStation(new ManhattanStation().get34StreetHudsonYards());
        return pTrain;
    }

}
