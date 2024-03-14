package Student_sb;

import java.util.Scanner;


public class Student_final2 {
	    public static void main(String[] args) {
	        Student_final stu = new Student_final();
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.println("1. 학생정보입력");
	            System.out.println("2. 학생정보수정");
	            System.out.println("3. 학생정보검색");
	            System.out.println("4. 학생전체출력");
	            System.out.println("5.  종료");
	            
	            int choice = sc.nextInt();
	            
	            switch(choice) {
	                case 1: stu.setStudent(); break;
	                case 2: stu.setModify(); break;
	                case 3: stu.setSearch(); break;
	                case 4: stu.setDisp(); break;
	                case 5: System.exit(0);; break;
	            }
	        } while(true); 
	    }
	}



