package mypackage;

import java.util.ArrayList;
import java.util.List;

/** @author user */
public class MainClass {

    public static void main(String[] args) {
        //Singer singer = new Singer("Nick", "Eye of the tiger");
//        Singer singer = new FolkSinger("Έφη Θώδη", "Sweet Home Alabama");
//        singer.sing();
        
        //Create a stage(the stage has the singers)
        List<Singer> folkSingers = ListsOfSingers.getFolkSingers("Γαρδένια");
        Stage stage = new Stage(folkSingers);
        
        //first FolkSingers are singing
        //Ok singers on the stage, startSinging
        stage.startSinging();
        
        System.out.println("\n******Stage changes to Rock*****");
        List<Singer> rockSingers = ListsOfSingers.getRockSingers("Fear of the dark");
        //change the stage to RockSingers
        stage.changeSingers(rockSingers);
        //RockSingers start Singing
        stage.startSinging();
        
        System.out.println("\n******Stage changes to All*****");
        List<Singer> allSingers = ListsOfSingers.getAllSingers("Imagine");
        //change the stage to AllSingers
        stage.changeSingers(allSingers);
        //All singers singing together
        stage.startSinging();
        
        
    }
    
    

}
