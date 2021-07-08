import javax.swing.JOptionPane;

public class ejercicio9 {
    public ejercicio9(){

    }
    public static void numero9() {
        int opc,e,s;
        double suel;
        String n;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber el salario de algun empleado?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    n = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
                    e = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del empleado:"));
                    s = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:"));
                    if(e < 18){
                        JOptionPane.showMessageDialog(null, "NO TIENE EDAD DE TRABAJAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        if(e <= 50){
                            suel = s+(s*0.05);
                            JOptionPane.showMessageDialog(null, "El empleado: " + n + " Tiene un salario de: " + suel, "SUELDO", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            if(e <= 60){
                                suel = s+(s*0.1);
                                JOptionPane.showMessageDialog(null, "El empleado: " + n + " Tiene un salario de: " + suel, "SUELDO", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                if(e > 60){
                                    suel = s+(s*0.15);
                                    JOptionPane.showMessageDialog(null, "El empleado: " + n + " Tiene un salario de: " + suel, "SUELDO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
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
