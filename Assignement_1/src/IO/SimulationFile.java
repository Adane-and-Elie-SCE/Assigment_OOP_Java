package IO;


import Country.*;
import Location.*;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimulationFile {

    private final static int m_argsNum = 7;
    private final String m_fileName;
    private Map m_map;

    //Ctor
    public SimulationFile(String fileName) throws Exception {
        m_fileName = fileName;
        m_map = Map.getInstance(loadFile());
    }


    private Settlement [] loadFile() throws Exception{

        File file = new File(m_fileName);
        Scanner sc = new Scanner(file);

        List<Settlement> settlementsList = new ArrayList<Settlement>();
        Settlement[] settlementsArray;
        
        String data;
        String[] args = new String[m_argsNum];

        while(sc.hasNextLine()){

            data = sc.nextLine();
            args = data.split(";", 0);


            switch (args[0]){

                case "Moshav":
                    settlementsList.add(new Moshav(args[1], new Location(new Point(Integer.parseInt(args[2]), Integer.parseInt(args[3])), new Size(Integer.parseInt(args[4]), Integer.parseInt(args[5]))), Integer.parseInt(args[6])));
                    break;

                case "Kibbutz":
                    settlementsList.add(new Kibbutz(args[1], new Location(new Point(Integer.parseInt(args[2]), Integer.parseInt(args[3])), new Size(Integer.parseInt(args[4]), Integer.parseInt(args[5]))), Integer.parseInt(args[6])));
                    break;

                case "City":
                    settlementsList.add(new City(args[1], new Location(new Point(Integer.parseInt(args[2]), Integer.parseInt(args[3])), new Size(Integer.parseInt(args[4]), Integer.parseInt(args[5]))), Integer.parseInt(args[6])));
                    break;

            }

        }

        sc.close();
        settlementsArray = new Settlement [settlementsList.size()];
        settlementsList.toArray(settlementsArray);
        return settlementsArray ;

    }


    
}
