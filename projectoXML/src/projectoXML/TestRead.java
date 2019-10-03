package projectoXML;

import java.util.List;


public class TestRead {
    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<guardar> readConfig = read.readConfig("C:\\Users\\Antonino\\eclipse-workspace\\projectoXML\\lector.xml");
        for (guardar item : readConfig) {
            System.out.println(item);
        }
    }
}