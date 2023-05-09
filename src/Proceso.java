import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;

public class Proceso {
    private int t1 = 10;
    private int t2 = 50;
    private int t3 = 150;
    private int t4 = 450;
    private int t5 = 1050;
    private int t6 = 25550;
    private int t7 = 500070;
    private int[] a1 = new int[10];
    private int[] a2 = new int[100];
    private int[] a3 = new int[1000];
    private int[] a4 = new int[10000];
    private int[] a5 = new int[100000];
    private int[] a6 = new int[1000000];
    private int[] a7 = new int[10000000];

    public Proceso(int t1, int t2, int t3, int t4, int t5, int t6, int t7, int[] a1, int[] a2, int[] a3, int[] a4, int[] a5, int[] a6, int[] a7) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
    }

    void ImprimirDatosLineal(){
        System.out.println("Lineal:\n\n");
    }

    void ImprimirDatosBinario(){
        System.out.println("Lineal:\n\n");
    }

    void busquedaBinaria(int[] a, int target){
        int res = -1;
        int izq = 0;
        int dere = a.length - 1;


        long tInicio = System.nanoTime();

        while (izq <= dere) {
            int mid = (izq + dere) / 2;

            if (a[mid] == target) {
                res = mid;
                break;
            } else if (a[mid] < target) {
                izq = mid + 1;
            } else {
                dere = mid - 1;
            }
        }

        long tFinal = System.nanoTime();

        System.out.println("\nTarget: " + target + "\n");

        System.out.println("Tiempo: " + (tFinal - tInicio) + "ns\n");

        if(res != -1){
            System.out.println("Posicion: " + res + "\n\n");
        }else{
            System.out.println("No se encontro el target\n\n");
        }
    }

    void busquedaLineal(int[] a, int target){
        int res = -1;

        System.out.println("Busqueda lineal: " + a.length + " ---\n");

        long tInicio = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            if(a[i] == target){
                res = i;
                break;
            }
        }

        long tFinal = System.nanoTime();

        System.out.println("\nTarget: " + target + "\n");

        System.out.println("Tiempo: " + (tFinal - tInicio) + "ns\n");

        if(res != -1){
            System.out.println("Posicion: " + res + "\n\n");
        }else{
            System.out.println("No se encontro el target\n\n");
        }
    }

}
