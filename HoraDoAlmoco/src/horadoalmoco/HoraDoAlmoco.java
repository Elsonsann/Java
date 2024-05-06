/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadoalmoco;

import java.time.LocalTime;

/**
 *
 * @author elson
 */
public class HoraDoAlmoco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime horarioAlmoco = LocalTime.of(12, 0);
        
        LocalTime horarioAtual = LocalTime.now();
        
        
       if(horarioAtual.isAfter(horarioAlmoco) || horarioAtual.equals(horarioAlmoco)){
           System.out.println("Ja e hora do almoço");
       }else{
           System.out.println("Nao e hora de comer");
       }
    }

    private static class horarioAtual {

        public horarioAtual() {
        }
    }
    
}
