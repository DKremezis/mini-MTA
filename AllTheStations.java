package sample;

import java.util.ArrayList;

class AllTheStations extends Station{

    private ArrayList<Station> allStations = new ArrayList<>();

    public void storeStations(){
        allStations.add(new QueensStation().getAstDit());
        allStations.add(new QueensStation().getAstoriaBlv());
        allStations.add(new QueensStation().get30AvenueQueens());
        allStations.add(new QueensStation().getBroadwayQueens());
        allStations.add(new QueensStation().get36AvenueQueens());
        allStations.add(new QueensStation().get39AvenueQueens());
        allStations.add(new QueensStation().getQueensboroPlaza());
        allStations.add(new QueensStation().getFlushingMainStr());
        allStations.add(new QueensStation().getMetsWillentsPoint());
        allStations.add(new QueensStation().get111StreetQueens());
        allStations.add(new QueensStation().get103StreetCoronaPlaza());
        allStations.add(new QueensStation().getJunctionBlv());
        allStations.add(new QueensStation().get90StreetElmhurstAvenue());
        allStations.add(new QueensStation().get82StreetJacksonHeights());
        allStations.add(new QueensStation().get74StreetBroadway());
        allStations.add(new QueensStation().get69StreetQueens());
        allStations.add(new QueensStation().getWoodside61Street());
        allStations.add(new QueensStation().get52StreetQueens());
        allStations.add(new QueensStation().get46StreetQueens());
        allStations.add(new QueensStation().get40StreetQueens());
        allStations.add(new QueensStation().get33StreetQueens());
        allStations.add(new QueensStation().getCourtSquare());
        allStations.add(new QueensStation().getHuntersPoint());
        allStations.add(new QueensStation().getVernonBlv());
        allStations.add(new QueensStation().getForestHills71Avenue());
        allStations.add(new QueensStation().get67AvenueQueens());
        allStations.add(new QueensStation().get63DriveRegoPark());
        allStations.add(new QueensStation().getWoodhavenBoulevard());
        allStations.add(new QueensStation().getGrandAvenueNewton());
        allStations.add(new QueensStation().getElmhurstAvenue());
        allStations.add(new QueensStation().getJacksonHeightsRooseveltAvenue());
        allStations.add(new QueensStation().get65StreetQueens());
        allStations.add(new QueensStation().getNorthernBoulevard());
        allStations.add(new QueensStation().get46StreetQueens());
        allStations.add(new QueensStation().getSteinwayStreet());
        allStations.add(new QueensStation().get36StreetQueens());
        allStations.add(new QueensStation().getQueensPlaza());
        allStations.add(new ManhattanStation().get96StreetMan());
        allStations.add(new ManhattanStation().get86StreetMan());
        allStations.add(new ManhattanStation().get72StreetMan());
        allStations.add(new ManhattanStation().getLexingtonAvenue());
        allStations.add(new ManhattanStation().get5Avenue());
        allStations.add(new ManhattanStation().get57StreetMan());
        allStations.add(new ManhattanStation().get49StreetMan());
        allStations.add(new ManhattanStation().getTimesSquare());
        allStations.add(new ManhattanStation().getHeraldSquare());
        allStations.add(new ManhattanStation().get28StreetMan());
        allStations.add(new ManhattanStation().get23StreetMan());
        allStations.add(new ManhattanStation().getUnionSquare());
        allStations.add(new ManhattanStation().getNewYorkUniversity());
        allStations.add(new ManhattanStation().getPrinceStreet());
        allStations.add(new ManhattanStation().getCanalStreet());
        allStations.add(new ManhattanStation().getCityHall());
        allStations.add(new ManhattanStation().getCortlandtStreet());
        allStations.add(new ManhattanStation().getRectorStreet());
        allStations.add(new ManhattanStation().getWhitehallStreetSouthFerry());
        allStations.add(new ManhattanStation().getGrandCentral());
        allStations.add(new ManhattanStation().get5AveBryantPark());
        allStations.add(new ManhattanStation().get34StreetHudsonYards());
        allStations.add(new ManhattanStation().getMarbleHill());
        allStations.add(new ManhattanStation().get215StreetManhattan());
        allStations.add(new ManhattanStation().get207StreetManhattan());
        allStations.add(new ManhattanStation().getDyckmanStreet());
        allStations.add(new ManhattanStation().get191StreetManhattan());
        allStations.add(new ManhattanStation().get181StreetManhattan());
        allStations.add(new ManhattanStation().get168StreetWashingtonHeights());
        allStations.add(new ManhattanStation().get145StreetManhattan());
        allStations.add(new ManhattanStation().get157StreetManhattan());
        allStations.add(new ManhattanStation().get137StreetCityCollege());
        allStations.add(new ManhattanStation().get125StreetManhattan());
        allStations.add(new ManhattanStation().get116StreetColombiaUniversity());
        allStations.add(new ManhattanStation().getCathedralParkway());
        allStations.add(new ManhattanStation().get103StreetManhattan());
        allStations.add(new ManhattanStation().get96StreetManhattan());
        allStations.add(new ManhattanStation().get86StreetManhattan());
        allStations.add(new ManhattanStation().get79StreetManhattan());
        allStations.add(new ManhattanStation().get72StreetManhattan());
        allStations.add(new ManhattanStation().get66StreetLincolnCenter());
        allStations.add(new ManhattanStation().get59StreetColombusCircle());
        allStations.add(new ManhattanStation().get50StreetManhattan());
        allStations.add(new ManhattanStation().get34StreetPennStation());
        allStations.add(new ManhattanStation().get28StreetManhattan());
        allStations.add(new ManhattanStation().get23StreetManhattan());
        allStations.add(new ManhattanStation().get18StreetManhattan());
        allStations.add(new ManhattanStation().get14StreetManhattan());
        allStations.add(new ManhattanStation().getChristopherStreet());
        allStations.add(new ManhattanStation().getHoustonStreet());
        allStations.add(new ManhattanStation().getCanalStreetVarick());
        allStations.add(new ManhattanStation().getFranklinStreet());
        allStations.add(new ManhattanStation().getChambersStreet());
        allStations.add(new ManhattanStation().getCortlandtStreetWestBroadway());
        allStations.add(new ManhattanStation().getRectorStreetWest());
        allStations.add(new ManhattanStation().getSouthFerry());
        allStations.add(new ManhattanStation().get135StreetMan());
        allStations.add(new ManhattanStation().get125StreetMan());
        allStations.add(new ManhattanStation().get116StreetMan());
        allStations.add(new ManhattanStation().getCentralParkNorth());
        allStations.add(new ManhattanStation().getParkPlace());
        allStations.add(new ManhattanStation().getFultonStreet());
        allStations.add(new ManhattanStation().getWallStreet());
        allStations.add(new BrooklynStation().getCourtStreet());
        allStations.add(new BrooklynStation().getJayStreet());
        allStations.add(new BrooklynStation().getDeKalb());
        allStations.add(new BrooklynStation().getAtlanticAv());
        allStations.add(new BrooklynStation().getUnionStreet());
        allStations.add(new BrooklynStation().get4AvenueBro());
        allStations.add(new BrooklynStation().getProspectAvenue());
        allStations.add(new BrooklynStation().get25StreetBro());
        allStations.add(new BrooklynStation().get36StreetBro());
        allStations.add(new BrooklynStation().get45StreetBro());
        allStations.add(new BrooklynStation().get53StreetBro());
        allStations.add(new BrooklynStation().get59StreetBro());
        allStations.add(new BrooklynStation().get8AvenueBro());
        allStations.add(new BrooklynStation().getFortHamiltonParkway());
        allStations.add(new BrooklynStation().getNewUtrechtAvenue());
        allStations.add(new BrooklynStation().get18AvenueBro());
        allStations.add(new BrooklynStation().get20AvenueBro());
        allStations.add(new BrooklynStation().getBayParkway());
        allStations.add(new BrooklynStation().getKingsHighway());
        allStations.add(new BrooklynStation().getAvenueU());
        allStations.add(new BrooklynStation().get86StreetBro());
        allStations.add(new BrooklynStation().get7AvenueBro());
        allStations.add(new BrooklynStation().getProspectPark());
        allStations.add(new BrooklynStation().getParkSideAvenue());
        allStations.add(new BrooklynStation().getChurchAvenue());
        allStations.add(new BrooklynStation().getBeverleyRoad());
        allStations.add(new BrooklynStation().getCortelyouRoad());
        allStations.add(new BrooklynStation().getNewkirkPlaza());
        allStations.add(new BrooklynStation().getAvenueH());
        allStations.add(new BrooklynStation().getAvenueJ());
        allStations.add(new BrooklynStation().getAvenueM());
        allStations.add(new BrooklynStation().getKingsHighway2());
        allStations.add(new BrooklynStation().getAvenueU2());
        allStations.add(new BrooklynStation().getNeckRoad());
        allStations.add(new BrooklynStation().getSheepsheadBay());
        allStations.add(new BrooklynStation().getBrightonBeach());
        allStations.add(new BrooklynStation().getOceanParkway());
        allStations.add(new BrooklynStation().getNewYorkAquarium());
        allStations.add(new BrooklynStation().getConeyIsland());
        allStations.add(new BrooklynStation().getBayRidgeAvenue());
        allStations.add(new BrooklynStation().get77StreetBrkln());
        allStations.add(new BrooklynStation().get86StreetBrkln());
        allStations.add(new BrooklynStation().getBayRidge95Street());
        allStations.add(new BrooklynStation().getClarkStreet());
        allStations.add(new BrooklynStation().getBoroughHall());
        allStations.add(new BrooklynStation().getHoytStreet());
        allStations.add(new BrooklynStation().getNevinsStreet());
        allStations.add(new BrooklynStation().getBergenStreet());
        allStations.add(new BrooklynStation().getGrandArmyPlaza());
        allStations.add(new BrooklynStation().getEasternParkwayBrooklynMuseum());
        allStations.add(new BrooklynStation().getFranklinAvenue());
        allStations.add(new BrooklynStation().getPresidentStreet());
        allStations.add(new BrooklynStation().getSterlingStreet());
        allStations.add(new BrooklynStation().getWinthropStreet());
        allStations.add(new BrooklynStation().getChurchAvenueNostrand());
        allStations.add(new BrooklynStation().getBeverleyRoadNostrand());
        allStations.add(new BrooklynStation().getNewkirkAvenue());
        allStations.add(new BrooklynStation().getFlatbushAvenue());
        allStations.add(new BronxStation().getVanCortlandtPark());
        allStations.add(new BronxStation().get238StreetBronx());
        allStations.add(new BronxStation().get231StreetBronx());
        allStations.add(new BronxStation().getWakefield());
        allStations.add(new BronxStation().getNereidAvenue());
        allStations.add(new BronxStation().get233StreetBronx());
        allStations.add(new BronxStation().get225StreetBronx());
        allStations.add(new BronxStation().get219StreetBronx());
        allStations.add(new BronxStation().getGunHillRoad());
        allStations.add(new BronxStation().getBurkeAvenue());
        allStations.add(new BronxStation().getAllertonAvenue());
        allStations.add(new BronxStation().getPelhamParkway());
        allStations.add(new BronxStation().getBronxPartEast());
        allStations.add(new BronxStation().getEast180StreetBronx());
        allStations.add(new BronxStation().getWestFarmsSquare());
        allStations.add(new BronxStation().get174StreetBronx());
        allStations.add(new BronxStation().getFreemanStreet());
        allStations.add(new BronxStation().getSimpsonStreet());
        allStations.add(new BronxStation().getIntervaleAvenue());
        allStations.add(new BronxStation().getProspectAvenue());
        allStations.add(new BronxStation().getJacksonAvenue());
        allStations.add(new BronxStation().get3Avenue149StreetBronx());
        allStations.add(new BronxStation().get149StreetGrandConcourse());
    }


    public int numberOfStations(){
        return allStations.size();
    }

    public Station get(int index){
        return allStations.get(index);
    }

    public ArrayList<Station> getAllStations(){
        storeStations();
        return allStations;
    }

    public Station findStationObject(String stationName) {
        for (Station station : allStations) {
            if (station.getName().equals(stationName)) return station;
        }
        return new Station();
    }


}
