public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println("Значение переменной friend :" + friend);
        friend = friend + 2;
        System.out.println("Значение переменной friend :" + friend);
        friend = friend / 7;
        System.out.println("Значение переменной friend :" + friend);

        var frog = 3.5;
        System.out.println("Значение переменной frog:" + frog);
        frog = frog * 10;
        System.out.println("Значение переменной frog:" + frog);
        frog = frog / 3.5;
        System.out.println("Значение переменной frog:" + frog);
        frog = frog + 4;
        System.out.println("Значение переменной frog:" + frog);

        var boxer1Weight = 78.2;
        System.out.println(boxer1Weight);
        var boxer2Weight = 82.7;
        System.out.println(boxer2Weight);

        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Total weight : " + totalWeight);
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Weight difference : " + weightDifference);

        var remainder = boxer2Weight % boxer1Weight;
        System.out.println(remainder);

        var workTime = 640;
        System.out.println(workTime);
        var timePerDay = 8;
        System.out.println(timePerDay);

        var employeeCount = workTime / timePerDay;
        System.out.println(employeeCount);
        System.out.println("Всего работников в компании - " + employeeCount + " человек");

        employeeCount += 94;
        System.out.println(employeeCount);
        var newWorkTime = workTime / employeeCount;
        System.out.println("Если в компании работает " + employeeCount + " человек " + " то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}