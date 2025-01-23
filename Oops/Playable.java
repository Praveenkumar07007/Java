interface Playables{
  default void stop() {
      System.out.println("Stopping playback...");
  }
}

class VideoPlayer implements Playables {
  @Override
  public void stop() {
      System.out.println("Stopping video playback...");
  }
}

public class Playable {
  public static void main(String[] args) {
      Playable videoPlayer = new VideoPlayer();
      videoPlayer.stop();
  }
}
