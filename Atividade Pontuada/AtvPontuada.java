/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepontuada;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AtvPontuada {

    /*import java.util.Scanner;
    import javax.swing.JOptionPane;*/ //ESSES IMPORTS ficam emcima da 'public class'
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ContadorProgram = 0;
        int CPaciente = 0;//Contador Paciente
        int CMedico = 0;//Contador M�dico
        int CTratamento = 0;//Contador Tratamento

        int CadastTipo = 0;//Tipo de cadastro
        String SairPrograma;//Sair do programa
        int AnoAtual = 2020;//Serve para descobrir idade
        int IdMedico = 0;//"Idade Medico" Ajuda na no calculo da idade
        int IdPaciente = 0;//"Idade Paciente" Ajuda na no calculo da idade
        int CalcIdade = 0;

        //Dados do paciente
        String NomePaciente[] = new String[10];
        int IdadePaciente[] = new int[10];
        String DoencaPaciente[] = new String[10];

        //Dados do m�dico
        String NomeMedico[] = new String[10];
        String EspecMedico[] = new String[10];
        int IdadeMedico[] = new int[10];

        //Dados de tratamento
        String Medico[] = new String[10];
        String Paciente[] = new String[10];
        String Tratamento[] = new String[10];

        System.out.println("Digite 'Cadastro' para ir para a area de cadastramento, caso n�o queira, Digite 'Sair'.");
        SairPrograma = ler.next();

        while (!"Sair".equals(SairPrograma) || ContadorProgram == 10) {
            System.out.println(" ");
            System.out.println("Bem vindo ao cadastramento! Tecle 1 para cadastramento de M�dico, 2 para cadastro de paciente "
                    + " ou 3 para cadastro de tratamento. Ou digite 0 para finalizar.");
            CadastTipo = ler.nextInt();
            System.out.println(" ");
            if (CadastTipo == 0) {
                System.out.println("Digite Sair para Finalizar!");
                SairPrograma = ler.next();
                if (SairPrograma.equals("Sair")) {
                    Runtime.getRuntime().exit(0);
                }
            } else {

                switch (CadastTipo) {
                    case 1:
                        System.out.println("Ol� m�dico! Digite seu Nome. ");
                        NomeMedico[CMedico] = ler.next();//Guardar Nome do m�dico

                        System.out.println("Digite sua especialidade. ");
                        EspecMedico[CMedico] = ler.next();//Guardar Especialiddade do m�dico

                        System.out.println("Digite seu ano de nascimento. ");
                        IdMedico = ler.nextInt();
                        CalcIdade = AnoAtual - IdMedico;//Calcular idade
                        IdadeMedico[CMedico] = CalcIdade;//Guardar Idade do m�dico

                        System.out.println("Cadastro Realizado com sucesso!");

                        if ((CPaciente != 0) && (CMedico != 1)) {
                            if ("Covid-19".equals(DoencaPaciente[CPaciente - 1])) {
                                JOptionPane.showMessageDialog(null, "Aten��o Dr.(a) " + NomeMedico[CMedico] + " "
                                        + " O paciente " + NomePaciente[CPaciente - 1] + " Est� com " + DoencaPaciente[CPaciente - 1]
                                        + " Preparar Isolamento!!");
                            }
                        }

                        CalcIdade = 0;
                        CMedico++;
                        break;
                    case 2:
                        System.out.println("Ol� Paciente! Digite seu Nome.");
                        NomePaciente[CPaciente] = ler.next();//Guardar Nome paciente

                        System.out.println("Digite seu ano de nascimento.");
                        IdPaciente = ler.nextInt();
                        CalcIdade = AnoAtual - IdPaciente;//Calcular idade
                        IdadePaciente[CPaciente] = CalcIdade;//Guardar Idade do paciente

                        System.out.println("Qual a sua doen�a?");
                        DoencaPaciente[CPaciente] = ler.next();//Guardar Doen�a do paciente

                        if (DoencaPaciente[CPaciente].equals("Covid-19")) {
                            if (CMedico == 0) {
                                if ((NomeMedico[CMedico] == null)) { //|| (NomeMedico[CMedico] == null)) {
                                    System.out.println("Infelizmente n�o temos nenhum m�dico. Quando um m�dico for cadastrado"
                                            + " Enviaremos uma alerta para ele. Enquanto isso, fique de quarentena.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Aten��o Dr.(a) " + NomeMedico[CMedico - 1] + " "
                                            + " O paciente " + NomePaciente[CPaciente] + " Est� com Covid-19"
                                            + " Preparar Isolamento!!");
                                }
                            } else {
                                if ((NomeMedico[CMedico - 1] == null)) {
                                    System.out.println("Infelizmente n�o temos nenhum m�dico."
                                            + " Enquanto isso, fique de quarentena.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Aten��o Dr.(a) " + NomeMedico[CMedico - 1] + " "
                                            + " O paciente " + NomePaciente[CPaciente] + " Est� com Covid-19"
                                            + " Preparar Isolamento!!");
                                }
                            }
                        }

                        System.out.println("Cadastro Realizado com sucesso!");
                        CalcIdade = 0;
                        CPaciente++;
                        break;
                    case 3:
                        System.out.println("�rea de cadastro de tratamento. Escreva o Nome do m�dico abaixo: ");
                        Medico[CTratamento] = ler.next();//Guardar nome do medico no cadastr de tratamento

                        System.out.println("Nome do paciente. ");
                        Paciente[CTratamento] = ler.next();//Guardar nome do paciente no cadastr de tratamento

                        System.out.println("Tipo de tratamento a ser realizado pelo Dr(a) " + Medico[CTratamento] + " ?");
                        Tratamento[CTratamento] = ler.next();//Tipo de tratamento

                        System.out.println("Cadastro Realizado com sucesso!");
                        CTratamento++;
                        break;
                    default:
                        System.out.println("Erro! Verifique se digitou o n�mero certo.");
                }
            }
            System.out.println("Deseja Procurar paciente ou um m�dico? 'Paciente', 'Medico' ou 'Nenhum' ");
            String Procurar = ler.next(); // vari�vel Procurar
            if ("Paciente".equals(Procurar)) {
                if (CPaciente == 0) {
                    if ((NomePaciente[CPaciente] == null)) {
                        System.out.println("Nenhum paciente cadastrado! Voltando para area de cadastro.");
                    }
                } else {
                    if ((NomePaciente[CPaciente - 1] == null)) {
                        System.out.println("Nenhum paciente cadastrado! Voltando para area de cadastro.");
                    } else {
                        System.out.println("Escolha um dos nomes abaixo.");
                        System.out.println(" ");
                        System.out.println("Pacientes: ");
                        for (int i = 0; i <= CPaciente - 1; i++) {
                            System.out.println(NomePaciente[i]);
                            System.out.println("-----------");
                        }
                        System.out.println(" ");
                        System.out.println("Escreva um dos nomes acima.");
                        String DPaciente = ler.next(); //Mostra os dados do paciente escolhido
                        for (int j = 0; j <= CPaciente - 1; j++) {
                            if (DPaciente.equals(NomePaciente[j])) {
                                System.out.println("Nome encontrado: ");
                                System.out.println("Dados do paciente, Nome: " + NomePaciente[j] + ", Idade: "
                                        + IdadePaciente[j] + ", Doen�a: " + DoencaPaciente[j]);
                            } else {
                                System.out.println("Nome n�o encontrado! Ou fora de alcance.");
                            }
                        }
                    }
                }
            }
            if ("M�dico".equals(Procurar)) {
                if (CMedico == 0) {
                    if ((NomeMedico[CMedico] == null)) {
                        System.out.println("Nenhum M�dico cadastrado! Voltando para area de cadastro.");
                    }
                } else {
                    if (NomeMedico[CMedico - 1] == null) {
                        System.out.println("Nenhum m�dico cadastrado! Voltando para area de cadastro.");
                    } else {
                        System.out.println("Escolha um dos nome abaixo: ");
                        System.out.println(" ");
                        System.out.println("M�dicos: ");
                        for (int i = 0; i <= CMedico - 1; i++) {
                            System.out.println(NomeMedico[i]);
                            System.out.println("-----------");
                        }
                        System.out.println(" ");
                        System.out.println("Escreva um dos nome acima: ");
                        String DMedico = ler.next(); //Mostra os dados do Medico escolhido
                        for (int j = 0; j <= CMedico - 1; j++) {
                            if (DMedico.equals(NomeMedico[j])) {
                                System.out.println("Nome encontrado: ");
                                System.out.println("Dados do M�dico, Nome: " + NomeMedico[j] + ", Idade: "
                                        + IdadeMedico[j] + ", Especialidade: " + EspecMedico[j]);
                            } else {
                                System.out.println("Nome n�o encontrado! Ou fora de alcance.");
                            }
                        }
                    }
                }
            } else {
                System.out.println(" ");
                System.out.println("Certo Voltando para area de cadastramento.");
            }

            ContadorProgram++;
        }
    }
}
