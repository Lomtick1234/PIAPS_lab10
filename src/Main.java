import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute() ;
        institute.setName("Institute 1");
        Researcher researcher = new Researcher();
        researcher.setName("Researcher1");
        List<Researcher> researchers = new ArrayList<>();
        researchers.add(researcher);
        institute.setEmployees(researchers);
        System.out.println(institute.getEmployees().get(0).getName());
    }
}