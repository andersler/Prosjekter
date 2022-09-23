import java.util.Arrays;
import java.util.List;
/**
 * @Author Anders Lerang 
 */
public class Utleiekontor {
    private UtleierAdresse adresse;
    private long telefonnummer;
    private List<Bil> biler;


    public Utleiekontor(UtleierAdresse adresse, long telefonnummer,List<Bil> biler){
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.biler = biler;

    }

    public String toString() {
        return "Utleiekontor:" +
                "adresse:" + adresse +
                ", telefonnummer:" + telefonnummer;
    }
}
