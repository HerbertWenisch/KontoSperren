/**
 * Klasse Kunde, Lösung Kap. 4.10 Aufgabe 10
 * 
 * @author Barbara Wieczorek
 * @version 2022-09-12
 */
public class Kunde
{
    String vorname;
    String name;

    public Kunde(String einVorname, String einName)
    {
        vorname = einVorname;
        name = einName;
    }

    public void frageNachKontonummer(Konto einKonto)
    {
        int dieNummer = einKonto.gibKontonummer();
        System.out.println("Die Nummer ist: "+ dieNummer);
    }

    public void frageKontostandAb(Konto einKonto, int einePin)
    {
        //System.out.println(einKonto.pruefePin(einePin)); //Aufruf privater Methode aus Konto-Klasse erzeugt einen Fehler
        einKonto.zeigeKontostand(einePin);
    }

    public void zahleEin(Konto einKonto, double betrag)
    {
        einKonto.erhoeheKontostand(betrag);
    }

    public void hebeAb(Konto einKonto, double betrag, int einePin)
    {
        einKonto.verringereKontostand(betrag, einePin);
    }
}
