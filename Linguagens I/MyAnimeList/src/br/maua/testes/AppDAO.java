package br.maua.testes;

import br.maua.PARSER.AnimeParser;
import br.maua.PARSER.MangaParser;
import br.maua.dao.AnimeDAO;
import br.maua.dao.MangaDAO;
import br.maua.model.Anime;
import br.maua.model.Manga;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.maua.API.LeituraAPI.leituraAPI;

public class AppDAO {
    private List<Anime> animes;
    private List<Manga> mangas;
    private AnimeDAO animeDAO = new AnimeDAO();
    private MangaDAO mangaDAO = new MangaDAO();
    private Scanner scanner;

    public AppDAO() {
        animes = new ArrayList<>();
        animeDAO = new AnimeDAO();
        scanner = new Scanner(System.in);
    }

    /**
     * Método que contém a parte lógica do projeto.
     * @throws Exception
     */
    public void run() throws Exception {
        boolean rodar = true;
        do {
            menu();
            int op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 0:
                    rodar = false;
                    break;
                /**
                 * O caso 1 mostra todos os animes cadastrados no banco de dados local.
                 */
                case 1:
                    animes = animeDAO.getAll();
                    System.out.println("Animes: ");
                    animes.forEach(anime -> System.out.println(anime));
                    break;
                /**
                 * O caso 2 mostra todos os mangas cadastrados no banco de dados local.
                 */
                case 2:
                    mangas = mangaDAO.getAll();
                    System.out.println("Mangas: ");
                    mangas.forEach(manga -> System.out.println(manga));
                    break;
                /**
                 * O caso 3 pega o nome de um anime desejado pelo usuário e busca no banco de dados local para mostrar as informações.
                 * Caso o anime não seja encontrado, é feita uma busca na API para coleta de dados e inserção destes no banco local, logo após são mostradas as informações na tela.
                 */
                case 3:
                    animes = animeDAO.getAll();
                    System.out.println("Digite o nome: ");
                    String nomeAnime = scanner.nextLine();
                    String nomeAnimeFormat = nomeAnime.replaceAll(" ", "-");
                    Anime animeNovo = AnimeParser.fromJson(leituraAPI("anime", nomeAnimeFormat));
                    boolean help = true;

                    for (Anime anime : animes) {
                        if (anime.getTitulo().equals(animeNovo.getTitulo())) {
                            System.out.println(animeNovo);
                            help = false;
                        }
                    }
                    if (help) {

                        //Inserir no Banco
                        animeDAO.insert(animeNovo);

                        //Printar
                        System.out.println(animeNovo);
                    }


                    break;

                /**
                 * O caso 4 pega o nome de um manga desejado pelo usuário e busca no banco de dados local para mostrar as informações.
                 * Caso o manga não seja encontrado, é feita uma busca na API para coleta de dados e inserção destes no banco local, logo após são mostradas as informações na tela.
                 */
                case 4:
                    mangas = mangaDAO.getAll();
                    System.out.println("Digite o nome: ");
                    String nomeManga = scanner.nextLine();
                    String nomeMangaFormat = nomeManga.replaceAll(" ", "-");
                    Manga mangaNovo = MangaParser.fromJson(leituraAPI("manga", nomeMangaFormat));
                    boolean aux = true;

                    for (Anime anime : animes) {
                        if (anime.getTitulo().equals(mangaNovo.getTitulo())) {
                            System.out.println(mangaNovo);
                            aux = false;
                        }
                    }
                    if (aux) {
                        //Inserir no Banco
                        mangaDAO.insert(mangaNovo);
                        //Printar
                        System.out.println(mangaNovo);
                    }
                    break;
            }
        } while (rodar);
    }

    /**
     * Método criado para mostrar o menu na tela, de forma a não poluir o programa
     */
    private void menu() {
        System.out.println("DB_Animes:");
        System.out.println("1 - Animes Cadastrados");
        System.out.println("2 - Mangas Cadastrados");
        System.out.println("3 - Procurar anime");
        System.out.println("4 - Procurar manga");
        System.out.println("0 - Sair");
    }
}
