package com.company;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1965, levTolstoy);
        warAndPeace.setPublishDate(1865);
        System.out.println(warAndPeace);
        Author terryGoodkaind = new Author("Terry", "Goodkaind");
        Book swordOfTruth = new Book("Sword of truth", 1997, terryGoodkaind);
        System.out.println(swordOfTruth);
    }
}