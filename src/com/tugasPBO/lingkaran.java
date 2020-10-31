package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung luas,keliling lingkaran menggunakan objek

public class lingkaran {
    static Scanner scan = new Scanner(System.in);
    static double phi = Math.PI;
    static String diameter;

    public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran();
        lingkaran.Input();
        double jarijari = lingkaran.Hitungjarijari(diameter);
        double luas = lingkaran.hitungLuas(jarijari,phi);
        double keliling = lingkaran.hitungKeliling(jarijari,phi);
        lingkaran.tampil(jarijari,luas,keliling);
    }

    public static void tampil(double jarijari, double luas, double keliling){
        System.out.println("nilai jarijari lingkaran adalah " + jarijari);
        System.out.println("nilai luas lingkaran adalah " + luas);
        System.out.println("nilai keliling lingkaran adalah " + keliling);
    }

    public static void Input(){
        boolean valid = false;
        while(!valid) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = scan.next();
            valid = isNum(diameter);
            validasiAlert(valid);
        }
    }

    public static void validasiAlert(boolean valid){
        if(!valid){
            System.out.println("Nilai diameter tidak sesuai!");
        }
    }

    private double hitungKeliling(double jarijari, double phi){
        double keliling = 2 * phi * jarijari;
        return keliling;
    }
    private double hitungLuas(double jarijari, double phi){
        double luas = phi * jarijari * jarijari;
        return luas;
    }

    private double Hitungjarijari(String diameter){
        double d_diameter = Double.parseDouble(diameter);
        return d_diameter / 2;
    }

    public static boolean isNum(Object object) {
        if(object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();
            try {
                Integer.parseInt(string);
            } catch(Exception e) {
                return false;
            }
        }
        return true;
    }
}