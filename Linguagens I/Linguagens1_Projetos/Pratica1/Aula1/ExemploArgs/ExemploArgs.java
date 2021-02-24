package Linguagens1_Projetos.Pratica1.Aula1.ExemploArgs;
class ExemploArgs {

    public static void main (String[] args) {
        int i;
        for(i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}