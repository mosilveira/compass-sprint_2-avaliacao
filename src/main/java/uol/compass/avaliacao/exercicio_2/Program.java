package uol.compass.avaliacao.exercicio_2;

import uol.compass.avaliacao.exercicio_2.controller.FilmeController;
import uol.compass.avaliacao.exercicio_2.model.Filme;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FilmeController filmeController = new FilmeController();
        List<Filme> filmes;
        int position = 0;

        insertMovie(filmeController);

        System.out.println("Olá! Seja bem-vindo(a)!");
        System.out.println("Temos 20 filmes cadastrados. Quantos filmes você deseja ver?");
        int movie = sc.nextInt();
        System.out.println("Temos 4 páginas. Qual página você quer acessar?");
        int page = sc.nextInt();

        switch (page) {
            case 1:
                break;
            case 2:
                position = 5;
                break;
            case 3:
                position = 10;
                break;
            case 4:
                position = 15;
                break;
            default:
                System.out.println("Não existe esta página!");
        }

        List<Filme> list = filmeController.getList();

        if ((position + movie) > list.size()) {
            list.subList(position, list.size()).forEach(System.out::println);
            System.out.println("Você acessou todos os filmes até o final da lista!");
        } else {
            list.subList(position, position + movie).forEach(System.out::println);
        }

        sc.close();
    }

    private static void insertMovie(FilmeController filmeController) {
        filmeController.create(new Filme("Venom - Tempo de Carnificina", "O relacionamento entre Eddie e Venom (Tom Hardy) está evoluindo. Buscando a melhor forma de lidar com a inevitável simbiose, esse dois lados descobrem como viver juntos.", 2021));
        filmeController.create(new Filme("Homem-Aranha: Sem Volta para Casa", "Continuação do filme \"Homem-Aranha: Longe de Casa\", com Tom Holland.", 2021));
        filmeController.create(new Filme("Eternos", "Uma tragédia faz com que os Eternos, alienígenas que vivem em segredo na Terra há milhares de anos, saiam das sombras para lutar contra o seu inimigo mais antigo, os Deviantes.", 2021));
        filmeController.create(new Filme("Casa Gucci", "Baseado na história de Patrizia Reggiano e o assassinato de seu ex-marido Maurizio Gucci, Casa Gucci revela segredos de uma das casas de moda mais famosas e respeitadas.", 2021));
        filmeController.create(new Filme("Marighella", "Cinebiografia de Carlos Marighella, ex-deputado, poeta e guerrilheiro brasileiro que foi assassinado pela ditadura militar em 1969.", 2021));
        filmeController.create(new Filme("Ghostbusters – Mais Além", "Uma mãe se muda para uma cidade do interior com seus filhos e descobre uma conexão com os Caça-Fantasmas originais e o legado de seu avô.", 2021));
        filmeController.create(new Filme("Resident Evil: Bem-Vindo a Raccoon City", "Passando no ano de 1998, Resident Evil: Bem-Vindo a Raccoon City é o filme que explica os segredos da Mansão Spencer e da cidade de Raccoon City.", 2021));
        filmeController.create(new Filme("Encanto", "A animação acompanha Mirabel, uma jovem de uma família extraordinário onde todos tem dons especiais, menos ela. Ela acredita que é a única que pode impedir as forças do mal.", 2021));
        filmeController.create(new Filme("Escritores da Liberdade", "Uma jovem professora, através de métodos não tão tradicionais de ensino, ajuda jovens alunos de uma violenta comunidade a se encontrarem.", 2007));
        filmeController.create(new Filme("Amor Sem Medida", "Ivana é recém divorciada, mas acaba se apaixonando por Ricardo após ela perder seu celular. O único impasse é a diferença de altura entre eles, o que causa alguns problemas com a família dela.", 2021));
        filmeController.create(new Filme("Noite Passada em Soho", "Uma jovem apaixonada por moda consegue voltar à decada de 1960, contudo, a Londres dessa década pode não ser o que parece.", 2021));
        filmeController.create(new Filme("Tick, Tick…Boom!", "A história de um jovem compositor que trabalha como garçom em Nova York, enquanto sonha em escrever um grande musical americano que o vai levar ao estrelato.", 2021));
        filmeController.create(new Filme("Este é o Meu Garoto", "Quando ainda era adolescente, Donny (Adam Sandler) teve um filho, Todd (Andy Samberg), e cuidou dele até completar 18 anos. Após este período eles ficaram anos sem se ver.", 2012));
        filmeController.create(new Filme("Harry Potter e a Pedra Filosofal", "Harry Potter (Daniel Radcliffe) é um garoto órfão de 10 anos que vive infeliz com seus tios, os Dursley.", 2001));
        filmeController.create(new Filme("Alerta Vermelho", "Com seu aviso mais alto e grave, o Red Notice, a Interpool enfrenta uma procurada criminosa.", 2021));
        filmeController.create(new Filme("Uma Família de Dois", "Um rapaz sem muita responsabilidade passa a ter que lidar com a maior de todas: cuidar de uma filha.", 2017));
        filmeController.create(new Filme("Duna","Em um futuro distópico, uma nobre família comanda um planeta desértico chamado de Duna, uníca fonte da especiaria mais rara do universo, a disputada melange, que concede longevidade e grandes poderes a quem a usa.", 2021));
        filmeController.create(new Filme("A Família Addams 2: Pé na Estrada", "A Família Addams 2 é a sequência da animação A Família Addams, lançada em 2019.", 2021));
        filmeController.create(new Filme("Velozes & Furiosos 9", "Dom precisa reunir a equipe novamente para enfrentar seu irmão desaparecido Jakob, um assassino habilidoso e motorista excelente, que está trabalhando ao lado de Cipher.", 2021));
        filmeController.create(new Filme("After 3 - Depois do Desencontro", "Agora que Tessa tomou uma das decisões mais importantes de sua vida, tudo mudou completamente.", 2021));
    }
}
