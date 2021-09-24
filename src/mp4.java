/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joser
 */
public class mp4 implements ReproductorAvanzado{
    @Override
   public void playVlc(String nombreA) {
      //do nothing
   }

   @Override
   public void playMp4(String nombreA) {
      System.out.println("Reproduciendo archivo MP4. nombre: "+ nombreA);		
   }
}
