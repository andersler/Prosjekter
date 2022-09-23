import java.util.Arrays;
import java.util.List;
/**
 * @Author Anders Lerang
 */
public class Bilutleieselskap {

    private String navn;
    private long telefonnummer;
    private FirmaAdresse adresse;
    private List<Utleiekontor> utleiekontorer = Arrays.asList();

    public Bilutleieselskap(String navn, long telefonnummer,FirmaAdresse adresse, List<Utleiekontor> utleiekontorer){
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
        this.utleiekontorer = utleiekontorer;
    }
}
