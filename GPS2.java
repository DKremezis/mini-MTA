package sample;

import java.util.ArrayDeque;
import java.util.Stack;

public class GPS2{
    private Station cue;
    private Station destination;
    private Train train= new Train();
    private ArrayDeque<String> stationStack = new ArrayDeque<>();
    private ArrayDeque<String> trainStack = new ArrayDeque<>();
    private ArrayDeque<Integer> numberOfStops = new ArrayDeque<>();
    private boolean path = false;
    private Stack<String> data = new Stack<>();

    public GPS2(){}

    public String navigate(String startPoint, String endPoint){
        String result = new String();
        cue = find(startPoint);
        destination = find(endPoint);
        for (int i=0; i<cue.numberOfConnections(); i++){
            train = searchForTrain(cue.getConnection(i) );
            if (pathExists(train) ){
                path=true;
                int f = train.getIndexOfStation(cue.getName());
                int j = train.getIndexOfStation(destination.getName());
                numberOfStops.add(Math.abs(j-f));
                trainStack.add(train.getName());
                storeToString();
            }
        }
        if (!path){
            Train connection = searchForConnection();
            navigateAgain(cue, connection);
        }
        result = print();
        return result;
    }

    private Train searchForConnection(){
        Train connection = new Train();
        connection = connection.getNTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.getQTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.getRTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.getWTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.get7LocalTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.get7ExpressTrain();
        if (connection.goesTo(destination)) return connection;
        connection = connection.get1Train();
        if (connection.goesTo(destination)) return connection;
        connection = connection.get2Train();
        if (connection.goesTo(destination)) return connection;
        return connection;
    }

    private void navigateAgain(Station cueStation, Train connection){
        Station connectionStop;
        for (int i=0; i<cueStation.numberOfConnections(); i++){
            train = searchForTrain(cueStation.getConnection(i));
            for (int k=0; k<train.numberOfStops(); k++){
                connectionStop = train.getStation(k);
                if (connectionStop.containsTrain(connection)){
                    stationStack.add(connectionStop.getName());
                    trainStack.add(connection.getName());
                    int f = train.getIndexOfStation(cueStation.getName());
                    int j = train.getIndexOfStation(connectionStop.getName());
                    numberOfStops.add(Math.abs(j-f));
                    f = connection.getIndexOfStation(connectionStop.getName());
                    j = connection.getIndexOfStation(destination.getName());
                    numberOfStops.add(Math.abs(j-f));
                    storeToString();
                }
            }
        }
    }

    private void storeToString(){
        if (stationStack.isEmpty()) data.push("Take " + trainStack.remove() + ". " + destination.getName() + " will be " + numberOfStops.remove() +" stops away." );
        else data.push("Take " + train.getName() + " and at "+ numberOfStops.remove() + " stops, get off at " + stationStack.remove() +
                ". \nThen take " + trainStack.remove() + " and " + destination.getName() + " will be " +  numberOfStops.remove() +" stops away." );
    }

    public String print(){
        if (data.isEmpty()) return "No other possible route";
        return data.pop();
    }


    private Train searchForTrain(String name){
        System.out.println(name);
        if (name.equals("7-Local-Train") ) return train.get7LocalTrain();
        if (name.equals("7-Express-Train")) return train.get7ExpressTrain();
        if (name.equals("W-Train")) return train.getWTrain();
        if (name.equals("Q-Train")) return train.getQTrain();
        if (name.equals("R-Train")) return train.getRTrain();
        if (name.equals("1-Train")) return train.get1Train();
        if (name.equals("2-Train")) return train.get2Train();
        else if (name.equals("N-Train") ) return train.getNTrain();
        return train;
    }

    private Station find(String nameOfSt){
        AllTheStations search = new AllTheStations();
        search.storeStations();
        Station found = new Station();
        for (int i=0; i<search.numberOfStations(); i++){
            if (search.get(i).getName().equals(nameOfSt)) found = search.get(i);
        }
        return found;
    }

    private boolean pathExists(Train pathTrain){
        for (int i=0; i<pathTrain.numberOfStops(); i++){
            if (pathTrain.getStation(i).getName().equals(destination.getName() ) ){
                return true;
            }
        }
        return false;
    }

}