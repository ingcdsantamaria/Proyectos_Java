import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ejercicio1 {
    public ejercicio1 () {
        
    }
    public void numero1() {
        String o,n,nd;
        int opc;
        float n1,n2;
        double result;
        DecimalFormat df = new DecimalFormat("#.0");
        //JOptionPane.showInputDialog(null, "1) Suma:\n2) Resta:\n3) Division:\n4) Multiplicacion:\nDigite una opcion:", "QUE DESEA HACER?", JOptionPane.QUESTION_MESSAGE);
        do{
            o = JOptionPane.showInputDialog(null, "QUE DESEA HACER?\n1) Suma:\n2) Resta:\n3) Division:\n4) Multiplicacion:\n \t 5) Precione \"5\" para volver al menu anterior\nDigite una opcion:");
            opc = Integer.parseInt(o);
            switch(opc){
                case 1:
                    n = JOptionPane.showInputDialog(null, "Digite el primer numero que desea sumar:");
                    n1 = Float.parseFloat(n);
                    nd = JOptionPane.showInputDialog(null, "Digite el segundo numero que desea sumar:");
                    n2 = Float.parseFloat(nd);
                    result = n1 + n2;
                    JOptionPane.showMessageDialog(null, "La suma de: " + n1 + " y " + n2 + " es igual a: " + df.format(result), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 2:
                    n = JOptionPane.showInputDialog(null, "Digite el primer numero que desea restar:");
                    n1 = Float.parseFloat(n);
                    nd = JOptionPane.showInputDialog(null, "Digite el segundo numero que desea restar:");
                    n2 = Float.parseFloat(nd);
                    result = n1 - n2;
                    JOptionPane.showMessageDialog(null, "La resta de: " + n1 + " y " + n2 + " es igual a: " + df.format(result), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 3:
                    n = JOptionPane.showInputDialog(null, "Digite el primer numero que sera el dividendo:");
                    n1 = Float.parseFloat(n);
                    nd = JOptionPane.showInputDialog(null, "Digite el segundo numero que sera el divisor:");
                    n2 = Float.parseFloat(nd);
                    result = n1 / n2;
                    JOptionPane.showMessageDialog(null, "La division de: " + n1 + " y " + n2 + " es igual a: " + df.format(result), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 4:
                    n = JOptionPane.showInputDialog(null, "Digite el primer numero que desea multiplicar:");
                    n1 = Float.parseFloat(n);
                    nd = JOptionPane.showInputDialog(null, "Digite el segundo numero que desea multiplicar:");
                    n2 = Float.parseFloat(nd);
                    result = n1 * n2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion de: " + n1 + " y " + n2 + " es igual a: " + df.format(result), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 5:
                    opc = 0;
                break;
                default:
                    if(opc != 0){
                        JOptionPane.showMessageDialog(null,"ERROR","ERROR!",JOptionPane.ERROR_MESSAGE);
                    }
                break;
            }
        }while (opc != 0);
    }
}
