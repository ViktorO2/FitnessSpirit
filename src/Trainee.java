import java.util.ArrayList;
import java.util.List;

public class Trainee {
    private String name;
    private int age;
    private int yearExperience;
    private List<TrainingProgram> programs;

    public Trainee(String name, int age, int yearExperience) {
        this.name = name;
        this.age = age;
        this.yearExperience = yearExperience;
        this.programs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public void update(List<TrainingProgram> programs) {
        this.programs = programs;
        System.out.println("Трениращият " + name + " е уведомен за новите програми.");
    }

    public void setPrograms(List<TrainingProgram> programs) {
        this.programs = programs;
    }

    public List<TrainingProgram> getPrograms() {
        return programs;
    }
}