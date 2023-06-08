// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("melih", "5359000", "TRH");
        Teacher t2 = new Teacher("ahmet", " 0000", "FZK");
        Teacher t3 = new Teacher("külyutmaz", "111","BIO");

        Course tarih = new Course("tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("inek şabah" , "123" , "4" , tarih,fizik,biyo);
        s1.addBulkExamNote(100,73,56,56,31,89);
        s1.isPass();

        Student s2 = new Student("güdük necmi", "444", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(56,79,21,67,75,13);
        s2.isPass();

    }
}