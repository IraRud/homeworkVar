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


        System.out.println("Задача №8:");
        var hours = 640;
        var hoursEmployee = 8;
        var employees = hours / hoursEmployee;
        System.out.println("Всего работников в компании " + employees + " человек.");

        var additionalEmployees = 94;
        employees = employees + additionalEmployees;
        hours = employees * hoursEmployee ;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками.");

    }
}