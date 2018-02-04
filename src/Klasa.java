public class Klasa {

    private String nazwa;
    private int iloscUczniow;

    public Klasa(String nazwa, int iloscUczniow) {
        this.nazwa = nazwa;
        this.iloscUczniow = iloscUczniow;
    }

    public Klasa() {

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscUczniow() {
        return iloscUczniow;
    }

    public void setIloscUczniow(int iloscUczniow) {
        this.iloscUczniow = iloscUczniow;
    }

    public boolean zawiera(String nazwa, int ile, Klasa[] tab) {

        boolean zawiera = false;


        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getNazwa() != null ) {
                if (tab[i].getNazwa() == nazwa && tab[i].getIloscUczniow() == ile) zawiera = true;
            } else break;


        }

        return zawiera;
    }
}