package com.mycompany.exerciciosprofpaulo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exercicio1ProfPaulo {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Exercício 1");
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        

        JPanel painel = new JPanel(new GridLayout(0, 1, 10, 10)); 
        
        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(20);
        
        JLabel labelIdade = new JLabel("Idade:");
        JTextField campoIdade = new JTextField(20);
        
        JLabel labelProfissao = new JLabel("Profissão:");
        JTextField campoProfissao = new JTextField(20);
        
        JButton btnCadastrar = new JButton("CADASTRAR");
        JButton btnLimpar = new JButton("LIMPAR");
        
        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelIdade);
        painel.add(campoIdade);
        painel.add(labelProfissao);
        painel.add(campoProfissao);
        painel.add(btnCadastrar);
        painel.add(btnLimpar);
        
        janela.add(painel);
        janela.setVisible(true);

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoIdade.setText("");
                campoProfissao.setText("");
            }
        });
        
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String idade = campoIdade.getText();
                String profissao = campoProfissao.getText();
                
                JFrame novaJanela = new JFrame("Dados do Usuário");
                novaJanela.setSize(400, 200);
                novaJanela.setLocationRelativeTo(null);
                
                JPanel painelNovaJanela = new JPanel(new GridLayout(0, 1, 10, 10));
                
                JLabel labelExibirNome = new JLabel("Nome: " + nome);
                JLabel labelExibirIdade = new JLabel("Idade: " + idade);
                JLabel labelExibirProfissao = new JLabel("Profissão: " + profissao);
                
                painelNovaJanela.add(labelExibirNome);
                painelNovaJanela.add(labelExibirIdade);
                painelNovaJanela.add(labelExibirProfissao);
                
                novaJanela.add(painelNovaJanela);
                novaJanela.setVisible(true);
            }
        });
    }
}