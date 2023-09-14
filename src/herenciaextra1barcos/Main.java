/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1barcos;

import Entity.Boat;
import Entity.LuxuryYatch;
import Entity.MotorBoat;
import Entity.SailBoat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 * @author David
 */
public class Main {

   
    public static void main(String[] args) {
        String string1 = "2023-06-12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        LocalDate fecha1 = LocalDate.parse(string1, formatter);
        String string2 = "2023-06-19";   
        LocalDate fecha2 = LocalDate.parse(string2, formatter);                
//        Long longBetweenDates = ChronoUnit.DAYS.between(fecha1,fecha2);
//        System.out.println(longBetweenDates);
        
        
        
        Rent("jorge","4356456456",fecha1,fecha2, 4, boat1, 456.0);
    }
    
    public static void createBoats(){
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Boat boat3 = new MotorBoat();
        Boat boat4 = new LuxuryYatch();
        Boat boat5 = new SailBoat();
        Boat boat6 = new SailBoat();
    }
    
    

}
