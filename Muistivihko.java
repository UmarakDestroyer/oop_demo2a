import java.util.ArrayList;
/**
 * Luokka mallintaa jonkun henkilön muistiinpanoja. Muistiinpanoilla on on omistaja ja nimi. 
 */
public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;
    /**
     *  Alustaa luokan attribuutit
     *
     *  @param nimi muistiinpanojen nimi 
     *  @param omistaja muistiinpanojen omistajan tunniste
     */ 
    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }
    /**
     * palauttaa muistiinpanojen nimet
     * @return nimi muistiinpanojen nimi
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * asettaa muistiinpanoille uuden nime
     * @param nimi muistiinpanojen uusi nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    /**
     * palauttaa muistiinpanojen omistajan tunnisteen
     * @return omistaja muistiinpanojen omistajan tunniste
     */
    public String getOmistaja() {
        return omistaja;
    }
    /**
     * asettaa uuden omistajan tunnisteen
     * @param omistaja uuden omistajan tunniste
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }
    /**
     * lisää muistiinpanoihin uuden viestin/tekstin
     * @param viesti uusi lisättävä viesti muistiinpanoihin
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }
    /**
     * palauttaa muistiinpanojen määrän
     * @return muistiinpanot.size() muistiinpanojen määrä
     */

    public int muistiinpanoja() {
        return muistiinpanot.size();
    }
    /**
     * Tulostaa kaikki muistiinpanot, jokainen viesti uudelle riville
     */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }

