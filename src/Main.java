import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//exercise 1
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "art");

        String shortname = nicknames.get("matthew");
        System.out.println(shortname);
        System.out.println(nicknames.get("michael"));
        System.out.println(nicknames.get("arthur"));

//exercise 2
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

//exercise 3
        Program.printKeys(nicknames);
        Program.printKeysWhere(nicknames, "m");
        Program.printValuesOfKeysWhere(nicknames, "m");
    }

    }