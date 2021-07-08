import javax.swing.JOptionPane;

public class ejercicio6 {
    public ejercicio6(){

    }
    public void numero6() {
        int opc;
        char sex;
        float h,h1,pi;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber su peso ideal?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    sex = JOptionPane.showInputDialog(null, "Ingrese su tipo de genero \"H/M\"").charAt(0);
                    h = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su estatura:"));
                    if(sex == 'H' || sex == 'h'){
                        h1 = h*100;
                        pi = h1-110;
                        JOptionPane.showMessageDialog(null, "Su genero es masculino su altura es: " + h + "m Su peso ideal es de: " + pi, "PESO IDEAL", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        if(sex == 'M' || sex == 'm'){
                            h1 = h*100;
                            pi = h1-110;
                        JOptionPane.showMessageDialog(null, "Su genero es femenino su altura es: " + h + "m Su peso ideal es de: " + pi, "PESO IDEAL", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                        JOptionPane.showMessageDialog(null, "VERIFIQUE EL GENERO QUE INGRESO Y LOS PARAMETROS ALLI SOLICITADOS", "ERROR", JOptionPane.ERROR_MESSAGE);
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
