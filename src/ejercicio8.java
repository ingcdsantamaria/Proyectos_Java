import javax.swing.JOptionPane;

public class ejercicio8 {
    public ejercicio8(){

    }
    public static void numero8() {
        int opc;
        char m1,m2;
        String n1,n2;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "LEA CON ATENCION Y SELECCIONE LA OPCION QUE DESEA\n \t 1) Desea jugar piedra papel y tijera?\n \t 2) Precione \"2\" para volver al menu anterior"));
            switch (opc){
                case 1:
                    n1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del primer jugador");
                    m1 = JOptionPane.showInputDialog(null, "Ingrese \"P\"(piedra)\"L\"(papel)\"T\"(tijera)").charAt(0);
                    n2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo jugador");
                    m2 = JOptionPane.showInputDialog(null, "Ingrese \"P\"(piedra)\"L\"(papel)\"T\"(tijera)").charAt(0);
                    if(m1 == m2){
                        JOptionPane.showMessageDialog(null, "EMPATE!", "JUEGO", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        if(((m1 == 'p'|| m1 == 'P') && (m2 == 'l' || m2 == 'L'))||((m1 == 't'|| m1 == 'T') && (m2 == 'p' || m2 == 'P'))||((m1 == 'l'|| m1 == 'L') && (m2 == 't' || m2 == 'T'))){
                            JOptionPane.showMessageDialog(null, "El GANADOR ES:  " + n2 + " FELICITACIONES GANASTE!", "JUEGO", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            if(((m2 == 'p'|| m2 == 'P') && (m1 == 'l' || m1 == 'L'))||((m2 == 't'|| m2 == 'T') && (m1 == 'p' || m1 == 'P'))||((m2 == 'l'|| m2 == 'L') && (m1 == 't' || m1 == 'T'))){
                                JOptionPane.showMessageDialog(null, "El GANADOR ES:  " + n1 + " FELICITACIONES GANASTE!", "JUEGO", JOptionPane.INFORMATION_MESSAGE);
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
