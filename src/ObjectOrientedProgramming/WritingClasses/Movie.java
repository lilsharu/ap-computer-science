/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.WritingClasses;

/**
 *
 * @author shourya.bansal
 */
public class Movie {
    
    private String name;
    private String genre;
    private String rating;
    private String director;
    private double IMDB;
    private int duration;
    private int rottenTomato;
    private int cost;
    private int revenue;
    private int age;
    private boolean inTheatres;
    private boolean awardWinning;
    
    //Constructors
    public Movie(String name, String genre, String rating, String director, double IMDB, int duration, int rottenTomato, int cost, int revenue, int age, boolean inTheatres, boolean awardWinning){
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.director = director;
        this.IMDB = IMDB;
        this.duration = duration;
        this.rottenTomato = rottenTomato;
        this.cost = cost;
        this.revenue = revenue;
        this.age = age;
        this.inTheatres = inTheatres;
        this.awardWinning = awardWinning;
    }
    public Movie(String name, String rating, int duration, boolean awardWinning) {
        this(name, "undeclared", rating, "undeclared", 0, duration, 0, 0, 0, 0, true, awardWinning);
    }
    public Movie(String name, int duration){
        this(name, "Not Rated", duration, false);
    }
    public Movie(String name){
        this(name, 0);
    }
    
    //Get Variables
    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getRating(){
        return this.rating;
    }
    public String getDirector(){
        return this.director;
    }
    public double getIMDB(){
        return this.IMDB;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getRottenTomato(){
        return this.rottenTomato;
    }
    public int getCost(){
        return this.cost;
    }
    public int getRevenue(){
        return this.revenue;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getInTheatres(){
        return this.inTheatres;
    }
    public boolean getAwardWinning(){
        return this.awardWinning;
    }
    
    @Override
    public String toString(){
        return "The Movie is " + name + " is a " + genre + "Movie directed by " + director + ". \n"
                + "It is " + duration + " minutes long and is rated "
                + rating + ". \nIt is " + awardWinning + " that it is award winning. \n"
                + "It has an IMDB of " + IMDB + " and a Rotten Tomato Score of " + rottenTomato + ". \n" 
                + "The cost to make it was " + cost + " yet the revenue was " + revenue + ". \n" + "Now, it is " + age + " years old. It is " + inTheatres + " that is it still in theatres.";
    }
    
    //change variables
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setIMDB(double IMDB){
        this.IMDB = IMDB;
    }
    public void setDuration(double duration){
        int duration1 = (int) duration;
        this.duration = duration1;
    }
    public void setRottenTomato(double score){
        int rottenTomato1 = (int) score;
        this.rottenTomato = rottenTomato1;
    }
    public void setCost(double cost){
        int intCost = (int) cost;
        this.cost = intCost;
    }
    public void setRevenue(double revenue){
        int intRevenue = (int) revenue;
        this.revenue = intRevenue;
    }
    public void setAge(double age){
        int intAge = (int) age;
        this.age = intAge;
    }
    public void setInTheatres(boolean inTheatres){
        this.inTheatres = inTheatres;
    }
    public void setAwardWinning(boolean awardWinning){
        this.awardWinning = awardWinning;
    }
}
