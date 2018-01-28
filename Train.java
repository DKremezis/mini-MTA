package sample;

import java.util.ArrayList;

class Train{
    private String name;
    private ArrayList<Station> root = new ArrayList<>();
    protected int lengthOfRoot;
    private Station station = new Station();
    protected double startTime;
    protected double endTime;

    public Train(){
        this.startTime = 0;
        this.endTime = 0;
        this.lengthOfRoot = 0;
    }

    public Train(String name, double startTime, double endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lengthOfRoot = 0;
    }

    public Train(String name){
        this.name = name;
        this.startTime = 0;
        this.endTime = 0;
        this.lengthOfRoot = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getStartTime(){
        return startTime;
    }

    public void setStartTime(double startTime){
        this.startTime = startTime;
    }

    public double getEndTime(){
        return endTime;
    }

    public void setEndTIme(double endTime){
        this.endTime = endTime;
    }

    public int numberOfStops(){
        return lengthOfRoot;
    }

    public String startsAt(){
        return this.root.get(0).getName();
    }

    public String endsAt(){
        return this.root.get(lengthOfRoot-1).getName();
    }

    public void addStation(Station station){
        addStation(lengthOfRoot, station);
    }

    public void addStation(int index, Station station){
        if (index < 0 || index > lengthOfRoot) throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        this.root.add(index, station);
        lengthOfRoot++;
    }

    public Station getStation(int index){
        return root.get(index);
    }

    public String get(int index){
        return root.get(index).getName();
    }

    public Station getStation(String nameOfSt){
        int index = getIndexOfStation(nameOfSt);
        return getStation(index);
    }

    public int getIndexOfStation(String nameOfSt){
        for (int i=0; i<numberOfStops(); i++) {
            if (nameOfSt.equals( root.get(i).getName() ) ) return i;
        }
        return 0;
    }

    public void addMultiple(ArrayList<Station> multiple){
        for (int i=0; i<multiple.size(); i++){
            addStation(multiple.get(i) );
        }
    }

    public void Operates(){
        System.out.println("Starting point: " + this.root.get(0) + ", " + startTime + "/n" +
                "Finish point: " + this.root.get(lengthOfRoot-1) + ", " + endTime);
    }

    public double hoursOfOperation(){
        return endTime - startTime;
    }

    public PurpleTrain get7LocalTrain(){
        PurpleTrain train = new PurpleTrain();
        train = train.get7LocalTrain();
        return train;
    }

    public PurpleTrain get7ExpressTrain(){
        PurpleTrain train = new PurpleTrain();
        train = train.get7ExpressTrain();
        return train;
    }

    public YellowTrain getNTrain(){
        YellowTrain train = new YellowTrain();
        train = train.getNTrain();
        return train;
    }


    public YellowTrain getWTrain(){
        YellowTrain train = new YellowTrain();
        train = train.getWTrain();
        return train;
    }

    public YellowTrain getQTrain(){
        YellowTrain train = new YellowTrain();
        train = train.getQTrain();
        return train;
    }

    public YellowTrain getRTrain(){
        YellowTrain train = new YellowTrain();
        train = train.getRTrain();
        return train;
    }

    public RedTrain get1Train(){
        RedTrain train = new RedTrain();
        train = train.get1Train();
        return train;
    }

    public RedTrain get2Train(){
        RedTrain train = new RedTrain();
        train = train.get2Train();
        return train;
    }

    public Train createTrain(String name){
        Train train = new Train();
        if (name.equals("N-Train")) train = train.getNTrain();
        else if (name.equals("R-Train")) train = train.getRTrain();
        else if (name.equals("W-Train")) train = train.getWTrain();
        else if (name.equals("Q-Train")) train = train.getQTrain();
        else if (name.equals("7-Local-Train")) train = train.get7LocalTrain();
        return train;
    }

    public boolean goesTo(Station station){
        for (int i=0; i<lengthOfRoot; i++){
            if (root.get(i).getName().equals(station.getName())) return true;
        }
        return false;
    }

    public void displayRoot(){
        System.out.println("Root: " );
        for (int i=0; i<lengthOfRoot; i++){
            System.out.println(i+1 + ": " + root.get(i).getName());
        }
    }

    public String displayDetailedRoot(){
        String report = getName() + "\nRoot: " ;
        for (int k=0; k<lengthOfRoot; k++){
            if (k==0) report = (report + "\n--" + root.get(k).getBorough() + "--\n");
            if (k>0 && root.get(k).getBorough() != root.get(k-1).getBorough() ) report = report + ("\n--" + root.get(k).getBorough() + "--\n\n");
            report = report + (k+1 + ": ");
            report = report + (root.get(k).showInfo()) + "\n";
        }
        return report;
    }


}
