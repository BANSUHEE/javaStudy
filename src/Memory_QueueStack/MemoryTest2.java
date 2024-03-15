package Memory_QueueStack;
import java.util.Scanner;

public class MemoryTest2 {

	        public static void main(String args[]) {
	                Scanner sc = new Scanner(System.in);
	                MemoryExam2 op = new MemoryExam2();
	                int choice = 0;
	                int select = 0;
	                do {
	                	System.out.println("----시 작 --- ");
	        			System.out.println("어떤 구조로 데이터를 저장하시겠습니까 ? ");
	        			System.out.print("1.Stack 2.Queue 3.exit");
	                        choice = sc.nextInt();
	                        switch (choice) {


	                        case 1: // 메모리 DATA PUSH
	                        	System.out.print("1.push(저장) 2.pop(출력) 3.back(뒤로가기)");
	                                select = sc.nextInt();
	                                op.dynamic(select);
	                                op.input();
	                                break;
	                        case 2: // 메모리 DATE POP
	                        	System.out.print("1.push(저장) 2.pop(출력) 3.back(뒤로가기)");
	                                select = sc.nextInt();
	                                op.dynamic(select);
	                                op.pop();
	                                break;
	                        case 3: // 메모리 DATA VIEW
	                        	System.out.print("1.push(저장) 2.pop(출력) 3.back(뒤로가기)");
	                                select = sc.nextInt();
	                                op.dynamic(select);
	                                op.allView();
	                                break;
	                        case 4:
	                                break;
	                                
	                        }
	                } while (choice != 4);


	        }
	}

