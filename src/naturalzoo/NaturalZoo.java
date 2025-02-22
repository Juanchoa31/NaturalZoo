package naturalzoo;

import javax.swing.JOptionPane;

public class NaturalZoo {

    public static void main(String[] args) {
        Visitor[] listVisitor = new Visitor[10];
        
        
        int opc = 0;
        Visitor vis;
        int i = 0;
        int a = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Registrar un visitante\n"
                    + "2. Mostrar visitantes\n"
                    + "3. Buscar actividad\n"
                    + "4. Salir\nSeleccionar una opción"));

            switch (opc) {
                case 1:
                    if (i >= listVisitor.length) {
                        JOptionPane.showMessageDialog(null, "Supera las posiciones del vector");
                    } else {
                        String name = JOptionPane.showInputDialog("Ingrese nombre: ");
                        String activity = JOptionPane.showInputDialog("Ingrese su actividad preferida");
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));

                        boolean userFound = false;

                        for (int x = 0; x < i; x++) {
                            if (listVisitor[x].getName().equals(name)) {
                                userFound = true;
                            }
                        }

                        if (userFound) {
                            JOptionPane.showMessageDialog(null, "El nombre del usuario que desea agregar ya se encuentra creado. Inténtelo de nuevo");
                        } else {
                            vis = new Visitor(name, activity, age);

                            listVisitor[i] = vis;
                            listVisitor[i] = vis;
                            i++;
                        }
                    }
                    break;
                case 2:

                    for (int x = 0; x < i; x++) {
                        JOptionPane.showMessageDialog(null, listVisitor[x].toString());
                    }

                    break;
                case 3:
                    boolean visitorActivity = true;
                    
                    
                    String searchActivity = JOptionPane.showInputDialog("Digite la actividad que desea buscar");
                        for (int x = 0; x < i; x++) {
                            if (listVisitor[x].getActivity().equals(searchActivity)) {
                                JOptionPane.showMessageDialog(null, listVisitor[x].toString());
                            } else {
                                JOptionPane.showMessageDialog(null, "Actividad no encontrada");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Eres el primero en ingresar a la actividad");
                        visitorActivity = false;
                        
                        JOptionPane.showMessageDialog(null, "Bienvenido a la actividad");


                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opc != 4);
    }
}
