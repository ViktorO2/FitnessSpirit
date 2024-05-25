public class Main {
    public static void main(String[] args) {
        Fitness fitness = Fitness.getInstance();

        // Създаване на различни стратегии за тренировки
        ExercisesStrategy cardio = new CardioTrainee("бягане", "30", 3);
        ExercisesStrategy strength = new StrengthTrainee("лежанка", "4");
        ExercisesStrategy flexibility = new FlexibilityTrainee("стречинг", 20);

        // Създаване на тренировъчни програми
        TrainingProgram cardioProgram = new TrainingProgram(cardio, "Кардио програма");
        TrainingProgram strengthProgram = new TrainingProgram(strength, "Силова програма");
        TrainingProgram flexibilityProgram = new TrainingProgram(flexibility, "Гъвкавост програма");

        // Добавяне на тренировъчните програми във фитнеса
        fitness.addProgram(cardioProgram);
        fitness.addProgram(strengthProgram);
        fitness.addProgram(flexibilityProgram);

        // Създаване на трениращи
        Trainee ivan = new Trainee("Иван", 25, 2);
        Trainee alex = new Trainee("Алекс", 18, 0);
        Trainee nikol = new Trainee("Никол", 38, 15);

        // Прикрепване на трениращите към фитнеса
        fitness.attachTrainee(ivan);
        fitness.attachTrainee(alex);
        fitness.attachTrainee(nikol);

        // Добавяне на нови тренировъчни програми и уведомяване на трениращите
        TrainingProgram extraCardioProgram1 = new ExtraExercisesD(cardioProgram, "Допълнително кардио за напреднали");
        fitness.addProgram(extraCardioProgram1);

        ExercisesStrategy extraCardio = new CardioTrainee("стълби", "25", 4);
        TrainingProgram extraCardioProgram2 = new ExtraExercisesD(new TrainingProgram(extraCardio, "Допълнителна кардио програма"), "Допълнително стълби");
        fitness.addProgram(extraCardioProgram2);

        // Промяна на програмите на трениращите и показване на техните тренировки
        ivan.setPrograms(fitness.getPrograms());
        alex.setPrograms(fitness.getPrograms());
        nikol.setPrograms(fitness.getPrograms());

        // Показване на тренировките за всеки трениращ
        System.out.println(ivan.getName() + " следва тренировъчните програми:");
        for (TrainingProgram program : ivan.getPrograms()) {
            System.out.println(program.train());
        }

        System.out.println("\n" + alex.getName() + " следва тренировъчните програми:");
        for (TrainingProgram program : alex.getPrograms()) {
            System.out.println(program.train());
        }

        System.out.println("\n" + nikol.getName() + " следва тренировъчните програми:");
        for (TrainingProgram program : nikol.getPrograms()) {
            System.out.println(program.train());
        }
    }
}
