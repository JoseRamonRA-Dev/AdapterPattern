/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joser
 */
public class PatronAdapter {
    public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "La chona.mp3");
      audioPlayer.play("mp4", "Vas a querer volver.mp4");
      audioPlayer.play("vlc", "Sola dan.vlc");
      audioPlayer.play("avi", "Vals 15 anios.avi");
   }
}
