package br.maua.testes;

import br.maua.dao.AnimeDAO;
import br.maua.dao.MangaDAO;
import br.maua.model.Anime;
import br.maua.model.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppDAO {
    private List<Anime> animes;
    private List<Manga> mangas;
    private AnimeDAO animeDAO = new AnimeDAO();
    private MangaDAO mangaDAO = new MangaDAO();
    private Scanner scanner;

    public  AppDAO() {
        animes = new ArrayList<>();
        animeDAO = new AnimeDAO();
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean rodar = true;
        do{
            menu();
            int op = Integer.parseInt(scanner.next());
            switch (op){
                case 0:
                    rodar = false;
                    break;
                case 1:
                    animes = animeDAO.getAll();
                    System.out.println("Animes: ");
                    animes.forEach(anime -> System.out.println(anime));
                    break;
                case 2:
                    mangas = mangaDAO.getAll();
                    System.out.println("Mangas: ");
                    mangas.forEach(manga -> System.out.println(manga));
            }
        }while(rodar);
    }

    private void menu(){
        System.out.println("DB_Animes:");
        System.out.println("1 - Animes Cadastrados");
        System.out.println("2 - Mangas Cadastrados");
        System.out.println("0 - Sair");
    }
}
