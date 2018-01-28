package sample;

import java.util.ArrayList;

class Station {

    private String name;
    private Train train;
    private ArrayList<String> connTrains = new ArrayList<>();
    protected int connections=0;
    protected String crossStreets;
    protected String borough;
    protected boolean operates = true;


    public Station(String name){
        this.name = name;
    }

    public Station(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBorough(){
        return borough;
    }

    public void setBorough(String nameOfBorough){
        borough = nameOfBorough;
    }

    public int numberOfConnections(){
        return connections;
    }

    public boolean hasConnections(){
        if (connections>1) return true;
        return false;
    }

    public void setConnections(int number){
        this.connections = number;
    }

    public boolean containsTrain(Train train){
        for (int i=0; i<connections; i++){
            if (connTrains.get(i).equals(train.getName())) return true;
        }
        return false;
    }

    public String getCrossStreets(){
        return crossStreets;
    }

    public void setCrossStreets(String crossStreets){
        this.crossStreets = crossStreets;
    }

    public boolean isActive(){
        return operates;
    }

    public void deactivate(){
        operates = false;
    }

    public QueensStation createQStation(){
        QueensStation qStation = new QueensStation();
        return qStation;
    }

    public ManhattanStation createMStation(){
        ManhattanStation mStation = new ManhattanStation();
        return mStation;
    }

    public BrooklynStation createBStation(){
        BrooklynStation bStation = new BrooklynStation();
        return bStation;
    }

    public void addTrain(String train){
        connTrains.add(train);
        connections++;
    }

    public String getConnection(int index){
        return connTrains.get(index);
    }

    public String connectsWith(){
        int length = connTrains.size();
        if (length == 0) return "";
        String report = "Line(s): ";
        for( int i = 0; i < length; i++){
            if (i==length - 1) report = report + connTrains.get(i);
            else report = report + connTrains.get(i) + ", ";
        }
        return report;
    }

    public String showInfo(){
        String report =  "Station: " + name + "\nCrosses: " + getCrossStreets() + "\nConnections: " + (connections-1);
        report = report + "\n" + connectsWith() + "\n";
        if(!isActive() ) report = report + "TEMPORARILY CLOSED!\n";
        return report;
    }

}
