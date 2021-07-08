import javax.swing.JOptionPane;

public class ejercicio10 {
    public ejercicio10(){

    }
    public static void numero10() {
        int opc,n,i,a,b,c;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber la serie de fibonacci?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero al que quiere que llegue la serie de fibonacci"));
                    i=0;
                    a=1;
                    b=0;
                    c=0;
                    for(i=0;i <= 1000000;i++){
                        if(c>=n){
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "La serie es: " + c, "FIBONACCI", JOptionPane.INFORMATION_MESSAGE);
                        b=c;
                        c=a+b;
                        a=b;
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
