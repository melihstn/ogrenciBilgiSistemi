public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuno;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuno = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int sozlu1, int sozlu2, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        }
        if (sozlu1 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        }
        if (sozlu1 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
    }

        void isPass() {
            System.out.println("-----------------------------------------------");
            this.avarage = ((this.c1.note * 0.8 + this.c1.sozlu * 0.2) + (this.c2.note * 0.8 + this.c2.sozlu * 0.2) + (this.c3.note * 0.8 + this.c3.sozlu * 0.2)) / 3.0;
            if (this.avarage > 55) {
                System.out.println("sınıfı geçtiniz..");
                this.isPass = true;

            }
            else {
                System.out.println("sınıfta kaldınız..");
                this.isPass = false;
            }
            printNote();
        }
        void printNote(){

            System.out.println(this.c1.name + " SINAV Notu\t :" + this.c1.note + "\nSÖZLÜ Notu\t :" + this.c1.sozlu);
            System.out.println(this.c2.name + " SINAV Notu\t :" + this.c2.note + "\nSÖZLÜ Notu\t :" + this.c2.sozlu);
            System.out.println(this.c3.name + " SINAV Notu\t :" + this.c3.note + "\nSÖZLÜ Notu\t :" + this.c3.sozlu);
            System.out.println("ORTALAMANIZ: " + this.avarage);

        }
    }

