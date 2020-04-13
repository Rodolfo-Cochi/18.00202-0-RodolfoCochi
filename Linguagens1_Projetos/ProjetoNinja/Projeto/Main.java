public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        ninja.train();
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chuunin chuunin = new Chuunin("Iruka", "Umino", "Treinar XYZ");
        mostrarTreino(chuunin);
        chuunin.goToMission();
        Jounin jounin = new Jounin("Kakashi", "Hatake","O demonio do gas oculto");
        mostrarTreino(jounin);
    }


    //funcoes
    static void mostrarTreino(Ninja ninja){
        ninja.train();
    }

}