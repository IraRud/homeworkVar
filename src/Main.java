public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №6:");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весом боксеров " + differenceWeight + " кг.");

        System.out.println("Задача №7:");
        var differenceWeightMethodOne = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весом боксеров " + differenceWeightMethodOne + " кг.");
        var differenceWeightMethodOTwo = weightSecondBoxer  % weightFirstBoxer;
        System.out.println("Разница между весом боксеров " + differenceWeightMethodOTwo + " кг.");
    }
}