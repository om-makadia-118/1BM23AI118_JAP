import java.util.Scanner;
class Student{
    int marks;
}
public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;
        int max=0,sum=0;
        Student[] obj = new Student[n];
        for (int i=0;i<n;i++){
            obj[i] = new Student();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();
            sum += obj[i].marks;
            if (obj[i].marks>max){
                max = obj[i].marks;
            }
        }
        System.out.println();
        System.out.println("Total sum of all marks: "+sum);
        System.out.println("Highest marks attained: "+max);
    }
}

/*
Output:

Enter marks for student 1: 10
Enter marks for student 2: 20
Enter marks for student 3: 30
Enter marks for student 4: 40
Enter marks for student 5: 50

Total sum of all marks: 150
Highest marks attained: 50
*/