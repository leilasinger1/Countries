// Leila Singer
//1/14/25
// This code creates all the countries and names in order to display it in the quiz.

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;
  // add constructors
  public Country(){
    name = "hi";
    capital = "DC";
    language = "English";
    imageFile = "idk";
  }
public Country(String name, String capital, String language, String imageFile){
  this.name= name;
  this.capital= capital;
  this.language= language;
  this.imageFile=imageFile;
}
  // Write accessor/get methods for each instance variable that returns it.
public String getName(){
  return name;}
public String getCapital(){ 
  return capital;}
public String getLanguage(){
  return language;}

public String getImageFile(){
  return imageFile;}

public void setName(String name){
  this.name=name;}
public void setCapital(String capital){
    this.capital=capital;}
public void setLanguage(String language){
      this.language=language;}
  
public void setImageFile(String imageFile){
        this.imageFile=imageFile;

}

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 public String toString(){
  return name + " 's capital is " + capital + " and its primary language is " + language;
 }


 } 
