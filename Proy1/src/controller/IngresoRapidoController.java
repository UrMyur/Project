/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author SynM3
 */
// Controlador.java
public class Controlador {
    private PanelDatosPersonales panelDatosPersonales;
    private PanelPreguntas panelPreguntas;
    private PanelResultados panelResultados;
    private PanelGrafico panelGrafico;

    public Controlador() {
        // Inicializa las pantallas
    }

    public void mostrarPanelDatosPersonales() {
        // Muestra la pantalla de datos personales
    }

    public void mostrarPanelPreguntas() {
        // Muestra la pantalla de preguntas
    }

    public void mostrarPanelResultados() {
        // Muestra la pantalla de resultados
    }

    public void calcularPorcentaje() {
        // Calcula el porcentaje de consumo recomendado
    }

    public void crearGrafico() {
        // Crea el gráfico de barras
    }

    public void actionPerformed(ActionEvent e) {
        // Gestiona los eventos de los botones
        if (e.getSource() == inicioButton) {
            // Vuelve a la pantalla de datos personales
        } else if (e.getSource() == atrasButton) {
            // Muestra un mensaje de advertencia
        } else if (e.getSource() == siguienteButton) {
            // Avanza a la siguiente pantalla
        }
    }
}
