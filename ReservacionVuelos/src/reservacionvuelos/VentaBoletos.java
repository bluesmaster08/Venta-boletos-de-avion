/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservacionvuelos;

/**
 *
 * @author equipo
 */
import javax.swing.JProgressBar;

public class VentaBoletos implements Runnable {
    private String destino;
    private int asientos;
    private double precioBoleto;
    private JProgressBar progressBar;

    // El constructor toma como parámetros el destino, la cantidad de asientos, el
    // precio del boleto y la barra de progreso asociada.
    public VentaBoletos(String destino, int asientos, double precioBoleto, JProgressBar progressBar) {
        this.destino = destino;
        this.asientos = asientos;
        this.precioBoleto = precioBoleto;
        this.progressBar = progressBar;
    }

    // Métodos para acceder y modificar los atributos
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        // Simulación de la venta de boletos en un bucle
        int boletosVendidos = 0;
        int totalAsientos = asientos;
        while (boletosVendidos < totalAsientos) {
            // Realiza la venta de un boleto solo si hay asientos disponibles
            if (boletosVendidos < totalAsientos) {
                boletosVendidos++;// El bucle continúa hasta que se han vendido todos los boletos disponibles.
            }
            // Calcula el porcentaje de boletos vendidos
            int porcentaje = (boletosVendidos * 100) / totalAsientos;
            // Actualiza la barra de progreso, el porcentaje y la cantidad de boletos
            // vendidos
            progressBar.setValue(porcentaje);
            progressBar.setString(boletosVendidos + " boletos vendidos");
            try {
                // Pausa el hilo para simular el tiempo de venta de boletos
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}