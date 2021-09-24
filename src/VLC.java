/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joser
 */
public class VLC implements ReproductorAvanzado{
   @Override
   public void playVlc(String nombreA) {
      System.out.println("Reproduciendo Vlc, Nombre: "+ nombreA);		
   }

   @Override
   public void playMp4(String nombreA) {
      //
   }

}
