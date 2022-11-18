/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprogramacao3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Particular
 */
public class Reserva {
        public Hospede listaHospedes[] = new Hospede[10];
        public Suite novaSuite= new Suite();
        public int posicaoAtual;
        private int quantidadePessoas = 0;
        public void setQuantidadePessoas(int quantidadePessoas){
            this.quantidadePessoas=quantidadePessoas;
        }
        public int getQuantidadePessoas(){
            return this.quantidadePessoas;
        }
        private int quantidadeDias;
        public void setQuantidadeDias(int quantidadeDias){
            this.quantidadeDias=quantidadeDias;
        }
        public int getQuantidadeDias(){
            return this.quantidadeDias;
        }
        public void criarSuite(){
            System.out.println("Digite as informações sobre a suite:");
            System.out.println("Digite o numero da suite:");
            Scanner lerNumero = new Scanner(System.in);
            novaSuite.setNumero(lerNumero.nextInt());
            System.out.println("Digite o tipo da suite:");
            Scanner lerTipo = new Scanner(System.in);
            novaSuite.setTipo(lerTipo.nextLine());
            System.out.println("Digite a capacidade da suite:");
            Scanner lerCapacidade = new Scanner(System.in);
            novaSuite.setCapacidade(lerCapacidade.nextInt());
            System.out.println("Digite o valor da diaria:");
            Scanner lerDiaria = new Scanner(System.in);
            novaSuite.setValorDiaria(lerDiaria.nextDouble());
        }
        public void verSuite(){
            System.out.println("As informações da suite são:");
            System.out.println("O numero da suite é :"+novaSuite.getNumero());
            System.out.println("O tipo da suite é :"+novaSuite.getTipo());
            System.out.println("A capcidade da suite é :"+novaSuite.getCapacidade());
            System.out.println("O valor da diaria é :"+novaSuite.getValorDiaria());
        }
        public void criarReserva(){
            Hospede hospede = new Hospede();
            System.out.println("Digite as informações sobre a reserva");
            System.out.println("Digite o codigo do hospede");
            Scanner lerCodigo= new Scanner(System.in);
            hospede.setCodigo(lerCodigo.nextInt());
            System.out.println("Digite o nome do hospede");
            Scanner lerNome = new Scanner(System.in);
            hospede.setNome(lerNome.nextLine());
            System.out.println("Digite o endereco do hospede");
            Scanner lerEndereco = new Scanner(System.in);
            hospede.setEndereco(lerEndereco.nextLine());
            System.out.println("Digite a idade do hospede");
            Scanner lerIdade = new Scanner(System.in);
            hospede.setIdade(lerIdade.nextInt());
            System.out.println("Digite a quantidade de pessoas,note que bebês a´te 2 anos não contam na capacidade da suite");
            Scanner lerPessoas = new Scanner(System.in);
            int quantidade = lerPessoas.nextInt();
            if(quantidade >novaSuite.getCapacidade()){
                System.out.println("Numero excede a capacidade.");
            }
            else{
                this.setQuantidadePessoas(quantidade);
            }
            System.out.println("Digite a quantidade de dias reservados:");
            Scanner lerDias = new Scanner(System.in);
            this.setQuantidadeDias(lerDias.nextInt());
            
            listaHospedes[posicaoAtual]=hospede;

        }
        public double calcularDiaria(){
            double custoTotal=novaSuite.getValorDiaria()*this.getQuantidadeDias();
            if(this.getQuantidadeDias()>7){
                double custoDesconto = (custoTotal*10)/100;
                double totalDesconto = custoTotal-custoDesconto;
                return totalDesconto;
            }
            else{
                return custoTotal;
            }
        }
        public void VerReserva(){
         System.out.println("Revisando as informações sobre a reserva:");
         System.out.println("Codigo do hospede:"+listaHospedes[posicaoAtual].getCodigo());
         System.out.println("Nome do hospede :"+listaHospedes[posicaoAtual].getNome());
         System.out.println("Endereco do hospede:"+listaHospedes[posicaoAtual].getEndereco());
         System.out.println("Numero de pessoas = "+this.getQuantidadePessoas());
         System.out.println("Valor da reserva: "+this.calcularDiaria());
        }
    }
