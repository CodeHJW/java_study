import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    long phone;
    Scanner sc = new Scanner(System.in);

    Student(){
        System.out.printf("학생의 학번,이름,전공,전화번호를 입력하세요: ");
    }
    void setId(){
        this.id = Integer.parseInt(sc.next());
    }
    void setName(){
        this.name = sc.next();
    }
    void setMajor(){
        this.major = sc.next();
    }
    void setPhone(){
        this.phone = Long.parseLong(sc.next());
    }

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    String getMajor(){
        return this.major;
    }
    String getPhone(){
        String phoneString = Long.toString(this.phone);;
        String result;

        result = 0 + phoneString.substring(0,2);
        result += ("-" +phoneString.substring(2,6));
        result += ("-" +phoneString.substring(6,10));
        return result;
    }

    void print(int i){
        if(i == 0)
            System.out.print("첫번째 ");
        else if (i == 1)
            System.out.print("두번째 ");
        else
            System.out.print("세번째 ");
        System.out.print("학생: ");

        System.out.printf("%d %s %s %s\n", getId(),getName(),getMajor(),getPhone());
    }

}

public class Homework2 {
    public static void main(String[] args){
        Student[] students = new Student[3];
        for(int i = 0; i< 3 ; i++){
            students[i] = new Student();
            students[i].setId();
            students[i].setName();
            students[i].setMajor();
            students[i].setPhone();
        }
        for(int i = 0; i < 3 ; i++){
            students[i].print(i);
        }
    }
}
