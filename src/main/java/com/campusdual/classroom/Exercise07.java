package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {
        sumFirstNaturalNumbers(3);
        int i = 0;
        showFirstNaturalNumbers(3);
    }

    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

    }

    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " números naturales es: " + sum);
    }



    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        int i = 1;
        System.out.print("los N primeros números positivos son: ");
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

}
