import java.util.Scanner;
class Media {
    void play() {
        System.out.println("Playing Media");
    }
}
class Audio extends Media {
    void playAudio() {
        System.out.println("Playing Audio");
    }
}
class Video extends Audio {
    void playVideo(String resolution) {
        System.out.println("Playing Video in " + resolution);
    }
}
public class Inherit0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Resolution: ");
        String resolution = sc.nextLine();
        Video video = new Video();
        video.playVideo(resolution);
    }
}
