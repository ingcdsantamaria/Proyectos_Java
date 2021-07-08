import javax.swing.JOptionPane;

public class ejercicio2 {
    public ejercicio2 (){

    }
    public static void numero2() {
        int opc;
        float prom,eva1,eva2,eva3;
        String nom;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber el promedio de algun estudiante y si aprobo?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch(opc){
                case 1:
                    nom = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante:");
                    eva1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la primera evaluacion:"));
                    eva2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la segunda evaluacion:"));
                    eva3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la tercera evaluacion:"));
                    prom = (eva1+eva2+eva3)/3;
                    if (prom >= 3){
                        JOptionPane.showMessageDialog(null, "El estudiante: " + nom + " Fue aprobado con un promedio de: " + prom, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El estudiante: " + nom + " Fue reprobado con un promedio de: " + prom, "RESULTADO", JOptionPane.WARNING_MESSAGE);
                    }
                break;
                case 2:
                    opc = 0;
                break;
                default:
                    if(opc != 0){
                        JOptionPane.showMessageDialog(null,"ERROR","ERROR!",JOptionPane.ERROR_MESSAGE);
                    }
                break;
            }
        }while(opc != 0);
    }
}
