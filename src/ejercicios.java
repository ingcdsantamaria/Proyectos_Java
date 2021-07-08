import javax.swing.JOptionPane;


public class ejercicios {
    public static void main(String[] args) throws Exception {
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "QUE DESEA HACER?\n1) Ejercicio N°1\n2) Ejercicio N°2\n3) Ejercicio N°3\n4) Ejercicio N°4\n5) Ejercicio N°5\n6) Ejercicio N°6\n7) Ejercicio N°7\n8) Ejercicio N°8\n9) Ejercicio N°9\n10) Ejercicio N°10 \n\t ¡SI DESEA SALIR PRECIONE 0!\nDigite una opcion:"));
            switch(opc){
                case 1:
                    ejercicio1 ej1 = new ejercicio1();
                    ej1.numero1();
                break;
                case 2:
                    ejercicio2 ej2 = new ejercicio2();
                    ej2.numero2();
                break;
                case 3:
                    ejercicio3 ej3 = new ejercicio3();
                    ej3.numero3();
                break;
                case 4:
                    ejercicio4 ej4 = new ejercicio4();
                    ej4.numero4();
                break;
                case 5:
                    ejercicio5 ej5 = new ejercicio5();
                    ej5.numero5();
                break;
                case 6:
                    ejercicio6 ej6 = new ejercicio6();
                    ej6.numero6();
                break;
                case 7:
                    ejercicio7 ej7 = new ejercicio7();
                    ej7.numero7();
                break;
                case 8:
                    ejercicio8 ej8 = new ejercicio8();
                    ej8.numero8();
                break;
                case 9:
                    ejercicio9 ej9 = new ejercicio9();
                    ej9.numero9();
                break;
                case 10:
                ejercicio10 ej10 = new ejercicio10();
                ej10.numero10();
                break;
                default:
                    if(opc == 0){
                        JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DIA!","FIN DEL PROGRAMA",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"ERROR","ERROR!",JOptionPane.ERROR_MESSAGE);
                    }
            break;
            }
        }while(opc != 0);
    }
}
