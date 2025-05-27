/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SynM3
 */
public class Preguntas {
    private boolean reducirTiempo;
    private boolean instalarReductores;
    private boolean cerrarGrifo;
    private boolean repararFugas;
    private String frecuenciaReportes;

    public Preguntas(boolean reducirTiempo, boolean instalarReductores, boolean cerrarGrifo, boolean repararFugas, String frecuenciaReportes) {
        this.reducirTiempo = reducirTiempo;
        this.instalarReductores = instalarReductores;
        this.cerrarGrifo = cerrarGrifo;
        this.repararFugas = repararFugas;
        this.frecuenciaReportes = frecuenciaReportes;
    }

    public boolean isReducirTiempo() {
        return reducirTiempo;
    }

    public boolean isInstalarReductores() {
        return instalarReductores;
    }

    public boolean isCerrarGrifo() {
        return cerrarGrifo;
    }

    public boolean isRepararFugas() {
        return repararFugas;
    }

    public String getFrecuenciaReportes() {
        return frecuenciaReportes;
    }
}
