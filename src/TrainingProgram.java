public class TrainingProgram {
    protected ExercisesStrategy strategy;
    private String description;

    public TrainingProgram(ExercisesStrategy strategy, String description) {
        this.strategy = strategy;
        this.description = description;
    }

    public String train() {
        return strategy.train();
    }

    public String getDescription() {
        return description;
    }
}