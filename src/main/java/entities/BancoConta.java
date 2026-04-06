/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Fernando
 */
public class BancoConta {

    private double saldo;
    private String nome, numeroConta;
    private double tax = 5;

    public BancoConta(double saldo, String nome, String numeroConta) {
        this.nome = nome;
        Deposito(saldo);
        this.numeroConta = numeroConta;
    }

    public BancoConta(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public BancoConta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void Deposito(double deposito) {

        saldo += deposito;

    }

    public void Saque(double saque) {
        if (saldo >= 5) {
            saldo -= saque + tax;
        }

    }

    @Override
    public String toString() {
        return "BancoConta{" + "saldo= $" + saldo + ", nome= " + nome + ", numeroConta= " + numeroConta + '}';
    }

}
