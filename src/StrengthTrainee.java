public class StrengthTrainee implements ExercisesStrategy {
    private String strengthEx;
    private String weeklyTrainee;

    public StrengthTrainee(String strengthEx, String weeklyTrainee) {
        this.strengthEx = strengthEx;
        this.weeklyTrainee = weeklyTrainee;
    }

    @Override
    public String train() {
        return "Тренировка за сила: " + strengthEx + " по " + weeklyTrainee + " пъти в седмицата.";
    }
}