import java.util.ArrayList;
import java.util.List;

public class Fitness {
    private static Fitness instance;
    private List<TrainingProgram> programs;
    private List<Trainee> trainees;

    private Fitness() {
        programs = new ArrayList<>();
        trainees = new ArrayList<>();
    }

    public static Fitness getInstance() {
        if (instance == null) {
            instance = new Fitness();
        }
        return instance;
    }

    public void addProgram(TrainingProgram program) {
        if (!programs.contains(program)) {
            programs.add(program);
            notifyTrainees();
        }
    }

    public void attachTrainee(Trainee trainee) {
       if(!trainees.contains(trainee)){
        trainees.add(trainee);
       }
    }

    public void detachTrainee(Trainee trainee) {
        trainees.remove(trainee);
    }

    private void notifyTrainees() {
        for (Trainee trainee : trainees) {
            trainee.update(programs);
        }
    }
    public List<Trainee> getTrainees() {
        return trainees;
    }

    public List<TrainingProgram> getPrograms() {
        return programs;
    }
}