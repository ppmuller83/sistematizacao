package sistematizacao;

import java.util.ArrayList;
import java.util.Scanner;

public class empregados_mgs {

    // Atributos
    private int matricula;
    private String nome;
    private String telefone;
    private String email;
    private String nomeContatoEmergencia;
    private String telefoneContatoEmergencia;
    private String alergias;
    private String problemasMedicos;
    private String plano;

    // Construtor
    public empregados_mgs(int matricula, String nome, String telefone, String email, String nomeContatoEmergencia, String telefoneContatoEmergencia, String alergias, String problemasMedicos, String plano) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nomeContatoEmergencia = nomeContatoEmergencia;
        this.telefoneContatoEmergencia = telefoneContatoEmergencia;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.plano = plano;
    }

    // Método para exibir informações sobre o empregado
    public void exibirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Contato de Emergência: " + nomeContatoEmergencia + "  Telefone: " + telefoneContatoEmergencia);
        System.out.println("Alergias: " + alergias);
        System.out.println("Problemas Médicos: " + problemasMedicos);
        System.out.println("Plano de Saúde: " + plano);
    }

    // Método para obter a matrícula
    public int getMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        ArrayList<empregados_mgs> listaEmpregados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar novo empregado");
            System.out.println("2. Exibir informações de empregado pela matrícula");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                System.out.print("Digite a matrícula: ");
                int matricula = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("Digite o email: ");
                String email = scanner.nextLine();

                System.out.print("Digite o nome do contato de emergência: ");
                String nomeContatoEmergencia = scanner.nextLine();

                System.out.print("Digite o telefone do contato de emergência: ");
                String telefoneContatoEmergencia = scanner.nextLine();

                System.out.print("Digite as alergias: ");
                String alergias = scanner.nextLine();

                System.out.print("Digite os problemas médicos: ");
                String problemasMedicos = scanner.nextLine();

                System.out.print("Digite o plano de saúde: ");
                String plano = scanner.nextLine();

                empregados_mgs novoEmpregado = new empregados_mgs(matricula, nome, telefone, email, nomeContatoEmergencia, telefoneContatoEmergencia, alergias, problemasMedicos, plano);
                listaEmpregados.add(novoEmpregado);
                System.out.println("Empregado adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite a matrícula do empregado: ");
                int matricula = scanner.nextInt();

                boolean encontrado = false;
                for (empregados_mgs empregado : listaEmpregados) {
                    if (empregado.getMatricula() == matricula) {
                        empregado.exibirInformacoes();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Empregado não encontrado.");
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}