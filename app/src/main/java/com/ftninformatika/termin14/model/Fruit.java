package com.ftninformatika.termin14.model;

public class Fruit {

    private int id;
    private String naziv;
    private String opis;
    private String imageFileName;


    public static Fruit[] FRUITS = new Fruit[]{
        new Fruit(0, "Apple", "red apple", "apples.jpg"),
        new Fruit(1, "Bannanas", "Yellow bannanas", "bananas.jpg"),
        new Fruit(2, "Oranges", "Fresh oranges", "oranges.jpg")
    };

    public Fruit(int id, String naziv, String opis, String imageFileName) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.imageFileName = imageFileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
