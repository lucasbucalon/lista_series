package com.series;

public class Series {

    private String name;
    private String genre;






    public Series(String name, String genre) {
        this.name = name;
        this.genre = genre;



    }













    public String getName() {
        return name;
    }












    public void setGenre(String genre) {
        this.genre = genre;
    }




    @Override
    public String toString() {
        return "Série: " + name + ", Gênero: " + genre; // Sobrescrevendo toString para exibir informações
    }





}