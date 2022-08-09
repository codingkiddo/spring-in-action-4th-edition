package soundsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("blank")
public class BlankDisc implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;

  private String email = "codingkiddo@gmail.com";
  
  public String getEmail() {
	return email;
  }

  public String getTitle() {
	  return title;
  }
  
  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }

  public void play() {
    System.out.println("Playing " + title + " by " + artist);
    for (String track : tracks) {
      System.out.println("-Track: " + track);
    }
  }

}