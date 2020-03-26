package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ListsOfSingers {
    
    public static List<Singer> getRockSingers(String song){
        List<Singer> rockSingers = new ArrayList();
        //String song = "Fear of the dark";
        rockSingers.add(new RockSinger("Bruce Dickinson", song));
        rockSingers.add(new RockSinger("Ozzy Osbourne", song));
        rockSingers.add(new RockSinger("Εφη Θώδη", song));
        return rockSingers;
    }
    
    public static List<Singer> getFolkSingers(String song){
        List<Singer> folkSingers = new ArrayList();
        //String song = "Γαρδένια";
        folkSingers.add(new FolkSinger("Βασίλης Τερλέγκας", song));
        folkSingers.add(new FolkSinger("Εφη Θώδη", song));
        return folkSingers;
    }
    
    public static List<Singer> getAllSingers(String song){
        List<Singer> allSingers = new ArrayList();
        //String song = "Imagine";
        allSingers.addAll(getRockSingers(song));
        allSingers.addAll(getFolkSingers(song));
        return allSingers;
    }
}
