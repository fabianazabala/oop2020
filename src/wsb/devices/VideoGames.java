package wsb.devices;

public class VideoGames {

  private String title;
  private int year;
  private String rating;
  private String[] platforms;

  public VideoGames(){

  }

  public VideoGames(String title, int year, String rating, String[] platforms){

    this.title = title;
    this.year = year;
    this.rating = rating;
    this.platforms = platforms;
  }
}
