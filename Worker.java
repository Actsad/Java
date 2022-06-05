package office;

public class Worker {
    private String FullName;
    private String Post;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;

    public Worker(String fullName, String post, String email, String phone, int salary, int age) {
        FullName = fullName;
        Post = post;
        Email = email;
        Phone = phone;
        Salary = salary;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void printInfo(Worker a) {
        System.out.printf("ФИО: %s, Должность %s, ПЯ: %s, телефон: %s, ЗП: %d, Возраст: %d%n", a.FullName, a.Post, a.Email, a.Phone, a.Salary, a.Age);
    }
}

