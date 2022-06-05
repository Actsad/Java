package office;

public class Main {
    public static void main(String[] args) {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Макеев Александр Сергеевич", "Космонавт", "doxonnimewou-1823@yopmail.ru", "74776995449", 320000, 48);
        persArray[1] = new Worker("Ершов Артур Александрочив", "Строитель", "peibogeunogro-3994@yopmail.ru", "72176660631", 80000, 26);
        persArray[2] = new Worker("Шишкина Амина Марковна", "Шахтёр", "trafreibetretu-2690@yopmail.ru", "77023005649", 42000,18);
        persArray[3] = new Worker("Борисов Дмитрий Владимирович", "Дефектолог", "frefusaununni-9667@yopmail.ru", "72746599426", 65000, 32);
        persArray[4] = new Worker("Селиванов Георгий Демидович", "Машинист", "hiprameijoke-9415@yopmail.ru", "75543921497", 70000, 42);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo(persArray[i]);
            }
            }
        }
}
