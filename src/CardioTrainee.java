public class CardioTrainee implements ExercisesStrategy {
    private String typeOfCardio;
    private String timeCardio;
    private int weeklyCardio;

    public CardioTrainee(String typeOfCardio, String timeCardio, int weeklyCardio) {
        this.typeOfCardio = typeOfCardio;
        this.timeCardio = timeCardio;
        this.weeklyCardio = weeklyCardio;
    }

    @Override
    public String train() {
        return "Кардио тренировка: " + typeOfCardio + " за " + timeCardio + " минути, " + " по " + weeklyCardio + " пъти.";
    }

    public String getTypeOfCardio() {
        return typeOfCardio;
    }

    public void setTypeOfCardio(String typeOfCardio) {
        this.typeOfCardio = typeOfCardio;
    }

    public String getTimeCardio() {
        return timeCardio;
    }

    public void setTimeCardio(String timeCardio) {
        this.timeCardio = timeCardio;
    }

    public int getWeeklyCardio() {
        return weeklyCardio;
    }

    public void setWeeklyCardio(int weeklyCardio) {
        this.weeklyCardio = weeklyCardio;
    }
}
