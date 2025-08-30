package com.mycompany.exercicio2profpaulo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exercicio2profpaulo {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Calculadora de IMC");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel labelMassa = new JLabel("Massa (Kg):");
        JTextField campoMassa = new JTextField(10);
        
        JLabel labelAltura = new JLabel("Altura (m):");
        JTextField campoAltura = new JTextField(10);

        JButton btnCalcular = new JButton("Calcular IMC");
        
        JLabel labelResultado = new JLabel("Seu IMC: ");

        painel.add(labelMassa);
        painel.add(campoMassa);
        painel.add(labelAltura);
        painel.add(campoAltura);
        painel.add(btnCalcular);
        painel.add(labelResultado);
        
        janela.add(painel);
        
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double massa = Double.parseDouble(campoMassa.getText());
                    double altura = Double.parseDouble(campoAltura.getText());
                    
                    double imc = massa / (altura * altura);
                    
                    String classificacao = "";
                    if (imc < 18.5) {
                        classificacao = "Baixo peso";
                    } else if (imc >= 18.5 && imc <= 24.99) {
                        classificacao = "Normal";
                    } else if (imc >= 25 && imc <= 29.99) {
                        classificacao = "Sobrepeso";
                    } else {
                        classificacao = "Obesidade";
                    }
                    
                    labelResultado.setText(String.format("Seu IMC: %.2f - %s", imc, classificacao));
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira valores numéricos válidos.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        

    }
}