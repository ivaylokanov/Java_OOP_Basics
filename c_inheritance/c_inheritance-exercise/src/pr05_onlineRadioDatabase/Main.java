package pr05_onlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Song> songs = new ArrayList<>();
        Song song = null;
        int duration = 0;
        int input = Integer.valueOf(reader.readLine());
        while (0 < input--) {
            try {
                String[] songArgs = reader.readLine().split(";");
                String artistName = songArgs[0];
                String songName = songArgs[1];
                String[] length = songArgs[2].split(":");
                int minutes = Integer.valueOf(length[0]);
                int seconds = Integer.valueOf(length[1]);
                song = new Song(artistName, songName, minutes, seconds);
                songs.add(song);
                duration +=song.getDuration();
                System.out.println("Song added.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.printf("Songs added: %d%n",songs.size());
        int hours = duration / 3600;
        duration %= 3600;
        int minutes = duration / 60;
        int seconds = duration % 60;
        System.out.printf("Playlist length: %dh %dm %ds",hours,minutes,seconds);

    }

}

