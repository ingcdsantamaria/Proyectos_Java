import javax.swing.JOptionPane;

public class ejercicio3 {
    public ejercicio3(){

    }
    public void numero3() {
        int opc;
        float nht, sueldo;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber el sueldo de algun trabajador y su numero de horas trabajadas?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    nht = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el numero de horas trabajadas:"));
                    sueldo = nht*30000;
                    JOptionPane.showMessageDialog(null, "Las horas trabajadas fueron: " + nht + " El sueldo a pagar es de: " + sueldo, "SUELDO A PAGAR", JOptionPane.INFORMATION_MESSAGE);
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
