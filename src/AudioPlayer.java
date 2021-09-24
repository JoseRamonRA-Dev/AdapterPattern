/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joser
 */
public class AudioPlayer implements Reproductor{
    MediaAdapter mediaAdapter; 
   @Override
   public void play(String audioType, String fileName) {		
      //cuando toca mp3
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Reproducciendo archivo mp3. nombre: " + fileName);	
         //Para los formatos establecidos 
      } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      
      else{
         System.out.println("No valido " + audioType + " Formato no soportado");
      }
   }   
}
