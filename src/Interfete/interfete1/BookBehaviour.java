package Interfete.interfete1;

public interface BookBehaviour {
    // Interfetele contin numai metode abstracte.
    // In interfete nu se utilizeaza niciun modificator de acces pentru membrii acesteia.
    // In mod implicit , toate metodele sunt publice si abstracte.


    // Metodele abstracte = trebuie specificat numai numele metodei / parantezele si / sau parametrii ceruti in paranteze
    // Exemple de metode abstracte:

    void open();
    // public void open(); -> aceasta expresie nu cauzeaza eroare, dar va fi un keyword redundant.
    int getCurrentPageNumber();
    void close();
    // private void close(); -> Aceasta expresie va cauza eroare.
    void read();
    // protected void read(String text); -> Aceasta expresie va cauza eroare.


    // O interfata seamana mai degraba cu abilitatile sau cu rolul unui obiect decat cu obiectul in sine
    // Lucruri precum masinile, avioanele, persoanele, pasarile , etc sunt reprezentate prin clase si obiecte.
    //__________________________________________________________________________________________________________






}
