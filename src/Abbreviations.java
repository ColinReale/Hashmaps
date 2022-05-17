import java.util.HashMap;

public class Abbreviations {
private HashMap<String, String> abbreviationsDirectory;
//    constructor!
    public Abbreviations(){
this.abbreviationsDirectory = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationsDirectory.put(abbreviation, explanation);

    }
    public boolean hasAbbreviation(String abbreviation){
     return this.abbreviationsDirectory.containsKey(abbreviation);

    }
    public String findExplanationFor(String explanation){

   return this.abbreviationsDirectory.get(explanation);


    }
}
