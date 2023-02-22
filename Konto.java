/**
 * Klasse Konto, für Kap. 4.10 Aufgabe 10
 * 
 * @author Barbara Wieczorek 
 * @version 2022-09-12
 */
public class Konto
{
    private double kontostand;
    int kontonummer;
    int pin;
    boolean gesperrt;
    int falscheVersuche;

    public Konto(int eineNummer, int einePin)
    {
        kontostand = 0;
        kontonummer = eineNummer;
        pin = einePin;
        gesperrt = false;
        falscheVersuche = 0; 
    }

    int gibKontonummer()
    {
        return kontonummer;
    }

    void erhoeheKontostand(double betrag)
    {
        kontostand = kontostand + betrag;
    }

    private int pruefePin(int einePin)
    {
        if (einePin == pin) 
        {
            return 1;
        }
        else
        {
            falscheVersuche++;
            if (falscheVersuche >= 3) gesperrt = true;
            return 0;
        }
    }

    void zeigeKontostand(int einePin)
    {
        if (pruefePin(einePin) == 1)
        {
            System.out.println(kontostand);
        }
        else    
        {
            System.out.println("falsche Pin-Eingabe");
        }
    }

    void verringereKontostand(double betrag, int einePin)
    {
        if (pruefePin(einePin) == 1)
        {
            kontostand = kontostand - betrag;
        }
        else    
        {
            System.out.println("falsche Pin-Eingabe");
        }
    }
}
