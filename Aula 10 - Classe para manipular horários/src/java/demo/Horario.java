/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;


/**
 *
 * @author Guilherme Neves
 */
public class Horario {
private int hora,minuto,segundo;


   
   public Horario(int h,int m,int s)
   {
      hora = h;
      minuto = m;
      segundo = s;
   }

   public void incrementa()
   {
     if(++segundo>59)
     {
        segundo = 0;
        if(++minuto>59)
        {
          minuto = 0;
          if(++hora>23)
            hora = 0;
        }
     }
   }

   public void decrementa()
   {
     if(--segundo<0)
     {
        segundo = 59;
        if(--minuto<0)
        {
          minuto = 59;
          if(--hora<0)
            hora = 23;
        }
     }
   }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
     
   public  String  getHoraIntervalo (){
        return  hora + ":" + minuto + ":" + segundo ;
    }   
}
