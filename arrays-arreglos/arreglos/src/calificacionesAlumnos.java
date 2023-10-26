/* Los profesores del curso de programación de Egg necesitan llevar un registro
* de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados
* y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos
* prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
* Primer trabajo práctico evaluativo 10%
* Segundo trabajo práctico evaluativo 15%
* Primer Integrador 25%
* Segundo integrador 50%
* Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
* Al final del programa los profesores necesitan obtener por pantalla la cantidad
* de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con
* promedio mayor o igual al 7 de sus notas del curso */

/* @Author Roxana Rolon*/

public class calificacionesAlumnos {
    public static void main(String[] args) {
        double[][] notas = new double[10][4];
        double[] promedios = new double[10];
        int aprobados = 0;
        int desaprobados = 0;

        // Cargar las notas de los alumnos
        // Aquí se debe implementar la lógica para cargar las notas desde el usuario

        // Calcular el promedio de cada alumno
        for (int i = 0; i < 10; i++) {
            double tp1 = notas[i][0] * 0.1;
            double tp2 = notas[i][1] * 0.15;
            double pi1 = notas[i][2] * 0.25;
            double pi2 = notas[i][3] * 0.5;
            promedios[i] = tp1 + tp2 + pi1 + pi2;
        }

        // Contar la cantidad de aprobados y desaprobados
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
