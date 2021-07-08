import javax.swing.JOptionPane;

public class ejercicio4 {
    public ejercicio4(){

    }
    public void numero4() {
        int opc,n,i,result;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea saber la tabla de multiplicar?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del que desea saber la tabla de multiplicar:"));
                    for(i=0;i <= 10;i++){
                        result = n*i;
                        JOptionPane.showMessageDialog(null,n + " * " + i + " = " + result, "TABLA DE MULTIPLICAR", JOptionPane.INFORMATION_MESSAGE);
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
