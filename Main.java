//ADI HIDAYAT 5210505055
//EMİRHAN YILMAZ 1220505057


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Konut {
    private String address;

    public Konut(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    abstract void displayInfo();
}

class Daire extends Konut implements Comparable<Daire> {
    private int apartmentNumber;

    public Daire(String address, int apartmentNumber) {
        super(address);
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    void displayInfo() {
        System.out.println("Daire : " + getAddress() + " Apartman numarasi : " + apartmentNumber );
    }

    int getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public int compareTo(Daire otherDaire) {
        return Integer.compare(this.apartmentNumber, otherDaire.apartmentNumber);
    }
}

class Bina extends Konut {
    private int numberOfFloors;

    private List<Daire> daireList;

    public Bina(String address, int numberOfFloors) {
        super(address);
        this.numberOfFloors = numberOfFloors;
        this.daireList = new ArrayList<>();
    }

    void addDaire(Daire daire) {
        daireList.add(daire);
    }

    @Override
    void displayInfo() {
        System.out.println("Bina : " + getAddress() + " Kat sayisi: " + numberOfFloors);
    }

    void displayDaireList() {
        System.out.println("Daireler:");
        for (Daire daire : daireList) {
            daire.displayInfo();
        }
    }
    void sortDaireList() {
        Collections.sort(daireList);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}

interface Display {
    void displayInfo();
}

class Evsahibi implements Display {
    String evSahibiAdi;
    String evSahibiSoyadi;
    private Bina bina;

    public Evsahibi(String evSahibiAdi, String evSahibiSoyadi, Bina bina) {
        this.evSahibiAdi = evSahibiAdi;
        this.evSahibiSoyadi = evSahibiSoyadi;
        this.bina = bina;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bina: " + bina.getAddress() + " Kat sayisi: " + bina.getNumberOfFloors() + " Numarali " + evSahibiAdi
                        + " " + evSahibiSoyadi + "'ye aittir");
    }

    public void addApartment(Daire daire) {
        bina.addDaire(daire);
    }
}

class Kiraci implements Display {
    private String kiraciAdi;
    private String kiraciSoyadi;
    private Evsahibi evsahibi;

    public Kiraci(String kiraciAdi, String kiraciSoyadi, Evsahibi evsahibi) {
        this.kiraciAdi = kiraciAdi;
        this.kiraciSoyadi = kiraciSoyadi;
        this.evsahibi = evsahibi;
    }

    @Override
    public void displayInfo() {
        System.out.println(kiraciAdi + " " + kiraciSoyadi + " Ev Sahibi: " + evsahibi.evSahibiAdi + " "
                + evsahibi.evSahibiSoyadi);
    }
}

public class Main {
    public static void main(String[] args) {

        Bina bina = new Bina("Kirklareli", 7);
        Daire daire1 = new Daire("Daire Addres", 101);
        Daire daire2 = new Daire("Daire Addres", 102);
        Daire daire3 = new Daire("Daire Addres", 103);

        bina.addDaire(daire1);
        bina.addDaire(daire2);
        bina.addDaire(daire3);

        Evsahibi evSahibi = new Evsahibi("Emirhan ", "Yilmaz", bina);
        evSahibi.displayInfo();
        evSahibi.addApartment(daire1);

        Kiraci kiraci = new Kiraci("Adi", "Hidayet", evSahibi);
        kiraci.displayInfo();

        bina.sortDaireList();
        bina.displayDaireList();
    }
}
