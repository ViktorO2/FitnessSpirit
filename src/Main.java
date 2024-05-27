public class Main {
    public static void main(String[] args) {
        Fitness fitness = Fitness.getInstance();

        // Създаване на различни стратегии за тренировки
        ExercisesStrategy cardio = new CardioTrainee("плуване", "45", 4);
        ExercisesStrategy strength = new StrengthTrainee("кросфит", "5");
        ExercisesStrategy flexibility = new FlexibilityTrainee("йога", 30);

        // Създаване на тренировъчни програми
        TrainingProgram cardioProgram = new TrainingProgram(cardio, "Кардио програма за напреднали");
        TrainingProgram strengthProgram = new TrainingProgram(strength, "Силова програма за начинаещи");
        TrainingProgram flexibilityProgram = new TrainingProgram(flexibility, "Програма за гъвкавост");

        // Добавяне на тренировъчните програми във фитнеса
        fitness.addProgram(cardioProgram);
        fitness.addProgram(strengthProgram);
        fitness.addProgram(flexibilityProgram);

        // Създаване на нови трениращи
        Trainee emily = new Trainee("Емили", 30, 5);
        Trainee max = new Trainee("Макс", 22, 2);
        Trainee sophia = new Trainee("София", 40, 10);

        // Прикрепване на трениращите към фитнеса
        fitness.attachTrainee(emily);
        fitness.attachTrainee(max);
        fitness.attachTrainee(sophia);

        // Присвояване на програмите на трениращите
        emily.setPrograms(fitness.getPrograms());
        max.setPrograms(fitness.getPrograms());
        sophia.setPrograms(fitness.getPrograms());

        ExercisesStrategy extraCardio = new CardioTrainee("стълби", "25", 4);
        TrainingProgram extraCardioProgram = new ExtraExercisesD(new TrainingProgram(extraCardio, "Допълнителна кардио програма"), "Допълнително стълби");
        fitness.addProgram(extraCardioProgram);;

        // Показване на информация за всички трениращи
        System.out.println("Списък на трениращите:");
        for (Trainee trainee : fitness.getTrainees()) {
            System.out.println(trainee.getName() + " - Възраст: " + trainee.getAge() + ", Опит: " + trainee.getYearExperience());
        }

        // Показване на тренировките за всеки трениращ
        System.out.println("\nТренировъчни програми за трениращите:");
        for (Trainee trainee : fitness.getTrainees()) {
            System.out.println(trainee.getName() + " следва следните тренировъчни програми:");
            for (TrainingProgram program : trainee.getPrograms()) {
                System.out.println(program.train());
            }
            System.out.println();
        }
    }
}
