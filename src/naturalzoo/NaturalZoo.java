package naturalzoo;

import javax.swing.JOptionPane;

public class NaturalZoo {

    public static void main(String[] args) {
        Visitor[] listVisitor = new Visitor[10];

        int opc;
        int i = 0;

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

                        // Verificar si el visitante ya existe
                        boolean userFound = false;
                        for (int x = 0; x < i; x++) {
                            if (listVisitor[x].getName().equals(name)) {
                                userFound = true;
                            }
                        }

                        // Contar cuántas personas ya están registradas en la actividad
                        int activityCount = 0;
                        for (int x = 0; x < i; x++) {
                            if (listVisitor[x].getActivity().equals(activity)) {
                                activityCount++;
                            }
                        }

                        if (userFound) {
                            JOptionPane.showMessageDialog(null, "El nombre del usuario que desea agregar ya se encuentra creado. Inténtelo de nuevo");
                        } else if (activityCount >= 5) {
                            JOptionPane.showMessageDialog(null, "La actividad '" + activity + "' ya está llena (máximo 5 personas).");
                        } else {
                            listVisitor[i] = new Visitor(name, activity, age);
                            i++;
                            JOptionPane.showMessageDialog(null, "Visitante registrado con éxito.");
                        }
                    }
                    break;
                case 2:
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "No hay visitantes registrados.");
                    } else {
                        for (int x = 0; x < i; x++) {
                            JOptionPane.showMessageDialog(null, listVisitor[x].toString());
                        }
                    }
                    break;
                case 3:
                    String searchActivity = JOptionPane.showInputDialog("Digite la actividad que desea buscar");
                    boolean foundActivity = false;

                    for (int x = 0; x < i; x++) {
                        if (listVisitor[x].getActivity().equals(searchActivity)) {
                            JOptionPane.showMessageDialog(null, listVisitor[x].toString());
                            foundActivity = true;
                        }
                    }

                    if (!foundActivity) {
                        JOptionPane.showMessageDialog(null, "No hay visitantes registrados en la actividad '" + searchActivity + "'.");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opc != 4);
    }
}
