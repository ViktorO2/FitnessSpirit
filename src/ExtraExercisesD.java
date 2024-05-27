public class ExtraExercisesD extends TrainingProgram {
    private TrainingProgram program;
    private String extraExerciseDescription;

    public ExtraExercisesD(TrainingProgram program, String extraExerciseDescription) {
        super(program.strategy, program.getDescription());
        this.program = program;
        this.extraExerciseDescription = extraExerciseDescription;
    }

    @Override
    public String train() {
        return program.train() + " С допълнителни упражнения.";
    }

    @Override
    public String getDescription() {
        return  extraExerciseDescription;
    }
}