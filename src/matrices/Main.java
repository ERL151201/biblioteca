
package matrices;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class Main {
    public static void main (String [] args ) throws IOException {
        JOptionPane.showMessageDialog(null, "Diferentes Matrices");
        Scanner lectura = new Scanner (System.in);
        
        int a, op, op1;
        double d; 
        
        String menu = "Opcion 1: Suma de Matrices\n" + "Opcion 2: Resta de Matrices\n"+
                "Opcion 3: Multiplicacion de Matrices\n" + "Opcion 4:Matriz ordenada por Insercion \n" +
                "Opcion 5: Matriz en forma de espiral\n" + "Opcion 6: Matriz Adjunta\n" +
                "Opcion 7: Matriz Inversa\n" + "Opcion 8: un vector A la suma de sus columnas y en un vector B la suma de filas\n" + 
                "Opcion 9: Dada una matriz intercambiar \n" + "Opcion 10: Calcular moda\n" +
                "Opcion 11: Shell sort\n" + "Opcion 12: Bubble Sort";
        
        op =  Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch(op){
            case 1:
                operacion suma = new operacion();
                suma.llenarMatrices(op);
                
                break;
            case 2:
                operacion resta = new operacion();
                resta.llenarMatrices(op);
                
                break;
            case 3:
                operacion multi = new operacion();
                multi.llenarMatrices(op);
                
                break;
             
            case 4:
                operacion id = new operacion();
                id.datos6(op);
                
                break;
             case 5:
                espiral espiral = new espiral();
                espiral.main(args);
                
                break;
                
             case 6:
                operacion ad = new operacion();
                ad.datos(op);
                
                break;
                
             case 7:
                operacion in = new operacion();
                in.datos1(op);
                
                break;
                
             case 8:
                operacion ab = new operacion();
                ab.datos2(op);
               
                break;
             case 9:
                operacion inter = new operacion();
                inter.datos3(op);
                
                break;
             
             case 10:
                operacion sim = new operacion();
                sim.datos4(op);
                
                break;
              case 11:
                operacion mag = new operacion();
                mag.datos7(op);
                
                break;
                
                case 12:
                operacion bu = new operacion();
                bu.datos5(op);
                
                break;
                
               case 13:
               JOptionPane.showMessageDialog(null, "Cerrando Programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
        }
        
    }
    }


