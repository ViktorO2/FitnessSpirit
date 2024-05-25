public class FlexibilityTrainee implements ExercisesStrategy {
    private String stretchType;
    private int duration;

    public FlexibilityTrainee(String stretchType, int duration) {
        this.stretchType = stretchType;
        this.duration = duration;
    }

    @Override
    public String train() {
        return "Упражнения за гъвкавост: " + stretchType + " за " + duration + " минути.";
    }

    public String getStretchType() {
        return stretchType;
    }

    public void setStretchType(String stretchType) {
        this.stretchType = stretchType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
