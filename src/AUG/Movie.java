package AUG;

public class Movie {
    String Title;
    String Director;
    String Genre;
    Double Rating;

    public Movie (){
        Title ="Kanguva";
        Director="Siva";
        Genre="Action";
        Rating=4.5;

    }
    public Movie(String title,String Director,String genre,double rating){
        this.Title=title;
        this.Director=Director;
        this.Genre=genre;
        this.Rating=rating;

    }

    void movieDET(){
        System.out.println("Title of the movie is:" +Title);
        System.out.println("Director of movie is:" +Director);
        System.out.println("Genre:" +Genre);
        System.out.println("Rating :"+Rating);
    }





}

