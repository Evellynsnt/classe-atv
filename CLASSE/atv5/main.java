package atv12;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;
        ArrayList<Cachorro> cachorros = new ArrayList<>();
        ArrayList<Gato> gatos = new ArrayList<>();
        String tipo;
        int contador = 0;
        while (op!=3) {

            System.out.println("\n====MENU====");
            System.out.println("1 - Adicionar novo animal\r\n" + //
                                "2 - Fazer um animal emitir som\r\n" + //
                                "3 - Sair\r\n"+//
                                "Escolha uma Opção: ");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Nome do Animal: ");
                    String nome = input.next();
                    System.out.println("Tipo do Animal\r\n"+//
                                        "1 - Cachorro\n2 - Gato");
                    int tipoAnimal = input.nextInt();          
                    switch (tipoAnimal) {
                        case 1:
                            System.out.println("Raça: ");
                            String raca = input.next();
                            tipo = "Cachorro";
                            cachorros.add(new Cachorro(nome, tipo, raca));
                            break;
                        case 2: 
                            System.out.println("Cor: ");
                            String cor = input.next();
                            tipo = "Gato";
                            gatos.add(new Gato(nome, tipo, cor));
                            break;
                        default:
                            System.out.println("Opção Inválida.");
                            break;
                    }
                break;
                case 2:
                    System.out.print("\nEmitir Som");
                    System.out.println("\n1 - Cachorro");
                    System.out.println("2 - Gato");
                    System.out.println("Escolha uma opção: ");  
                    tipoAnimal = input.nextInt();
                    switch (tipoAnimal) {
                        case 1:
                            if (cachorros.isEmpty()) {
                                System.out.println("Não há nenhum cachorro cadastrado.");
                            }else{
                                System.out.println("Lista de Cachorros Cadastrados: ");
                                contador = 0;
                                for (Cachorro cachorro : cachorros) {
                                    System.out.println((contador+1)+" - Nome: "+ cachorro.getNome()+ " - Tipo: "+ cachorro.getTipo());
                                    contador++;
                                }
                                System.out.println("Indice que deseja emitir som: ");
                                int indice = input.nextInt();
                                cachorros.get(indice-1).fazerSom();
                                break;
                            }
                        break;
                        
                        case 2:
                            if (gatos.isEmpty()) {
                                System.out.println("Não há nenhum gato cadastrado.");
                            }else{
                                for (Gato gato : gatos) {
                                    contador = 0;
                                    System.out.println("Lista de Gatos Cadastrados: ");
                                    System.out.println((contador+1)+" - Nome: "+ gato.getNome()+ " - Tipo: "+ gato.getTipo());
                                    contador++;
                                }
                                System.out.println("Indice que deseja emitir som: ");
                                int indice = input.nextInt();
                                gatos.get(indice-1).fazerSom();
                                break;
                            }
                            break;
                        default:
                        System.out.println("Opção Inválida.");
                            break;
                    
                    } 
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }
        input.close();
    }
}
