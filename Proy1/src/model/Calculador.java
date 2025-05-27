/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SynM3
 */
public class Calculador {
    private static final int CONSUMO_RECOMENDADO = 2000; // litros

    public static int calcularPorcentaje(Consumo consumo) {
        int porcentaje = (consumo.getLitros() * 100) / CONSUMO_RECOMENDADO;
        return porcentaje;
    }
    public static String getNivel(Consumo consumo) {
        if (consumo.getLitros() > 2000) {
            return "mayor";
        } else if (consumo.getLitros() < 2000) {
            return "menor";
        } else {
            return "igual";
        }
    }
}
