public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        ninja.train();
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        academicStudent.train();
        Chuunin chuunin = new Chuunin("Iruka", "Umino", "Treinar XYZ");
        chuunin.train();
        chuunin.goToMission();
    }

}