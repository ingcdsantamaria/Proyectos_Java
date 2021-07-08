import javax.swing.JOptionPane;

public class ejercicio7 {
    public ejercicio7(){

    }
    public static void numero7() {
        int opc,n,i,a;
        char n1;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber si un numero es primo?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    do{
                        a=0;
                        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea saber si es primo"));
                        for(i = 1;i <= n;i++){
                            if((n % i) == 0){
                                a++;
                            }
                        }
                        if(a == 2){
                            JOptionPane.showMessageDialog(null, "El numero ingresado es primo", "VALIDACION", JOptionPane.INFORMATION_MESSAGE);
                            n1 = JOptionPane.showInputDialog(null, "Desea intentar con otro numero? \"S/N\"").charAt(0);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El numero ingresado no es primo", "ERROR", JOptionPane.WARNING_MESSAGE);
                            n1 = JOptionPane.showInputDialog(null, "Desea intentar con otro numero? \"S/N\"").charAt(0);
                        }
                        if(n1 != 'n'&& n1 != 'N' && n1 != 's'&& n1 != 'S'){
                            JOptionPane.showMessageDialog(null, "VERIFIQUE EL DATO INGRESADO CON LO REQUERIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }while(n1 != 'n'&& n1 != 'N');
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
