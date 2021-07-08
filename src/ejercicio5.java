import javax.swing.JOptionPane;

public class ejercicio5 {
    public ejercicio5(){

    }
    public static void numero5() {
        int opc,n,i,n1;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea jugar a adivinar el numero?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    n = (int) (Math.random()*5+1);
                    for(i = 1;i <= 3; i++){
                        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que cree que es:"));
                        if (n == n1){
                            JOptionPane.showMessageDialog(null, "FELICITACIONES GANO!", "JUEGO", JOptionPane.INFORMATION_MESSAGE);
                            i=4;
                        }
                        else{
                            if(n < n1){
                                JOptionPane.showMessageDialog(null, "El numero es menor al que ingreso", "JUEGO", JOptionPane.WARNING_MESSAGE);
                                
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "El numero es mayor al que ingreso", "JUEGO", JOptionPane.WARNING_MESSAGE);
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
