package Student_sb;

import java.util.Scanner;
import java.util.ArrayList;

public class Student_final{

	    private Name name;
	    private Subject kor;
	    private Subject eng;
	    private Subject mat;
	    private int total;
	    private float avg;
	    private int index;
	    private ArrayList<Student_final> arr;

	    public Student_final() {
	        //this(100);
	        name = new Name();
	        kor = new Subject();
	        eng = new Subject();
	        mat = new Subject();
	        arr = new ArrayList<Student_final>();
	    }

	    public Student_final(Name name, Subject kor, Subject eng, Subject mat) {
	        this.name = name;
	        this.kor = kor;
	        this.eng = eng;
	        this.mat = mat;
	    }
	    
	 
	    public int getIndex() {
	        return index;
	    }
	    
//	    public ArrayList<Student_final> getStu() {
//	        return stu;
//	    }

	    public void setName(String name) {
	        this.name.setName(name);
	    }

	    public void setKor(int kor) {
	        this.kor.setSubject(kor);
	    }

	    public void setEng(int eng) {
	        this.eng.setSubject(eng);
	    }

	    public void setMat(int mat) {
	        this.mat.setSubject(mat);
	    }

	    public String getName() {
	        return name.getName();
	    }

	    public int getKor() {
	        return kor.getSubject();
	    }

	    public int getEng() {
	        return eng.getSubject();
	    }

	    public int getMat() {
	        return mat.getSubject();
	    }

	    public void setTotal(int total) {
	        this.total = total;
	    }

	    public int getTotal() {
	        return total = getKor() + getEng() + getMat();
	    }

	    public float getAvg() {
	        return avg = total / 3.0f;
	    }
	

	    public void setModify() {
	    	Scanner sc = new Scanner(System.in);
	    	   System.out.println("누구의 점수를 수정할까요? ");
	    	   String name = sc.next();
	    	   
	    	   int i=0;
	    	   while(true) {
	    	      if(arr) {
	    	         System.out.println("검 색 완 료 ");
	    	         
	    	         while(true) {
	    	            System.out.println("1.국어점수수정");
	    	            System.out.println("2.영어점수수정");
	    	            System.out.println("3.수학점수수정");
	    	            System.out.println("4.수정안함");
	    	            
	    	            int n = sc.nextInt();
	    	            switch(n) {
	    	            case 1: arr.add(setKor).setKor(sc.nextInt()); break;
	    	            case 2: arr.add(setEng)(sc.nextInt()); break;
	    	            case 3: arr[i].setMat(sc.nextInt()); break;
	    	            
	    	            }
	    	            if(n == 4) break; 
	    	         }
	    	         break;
	    	      }
	    	      i++;
	    	   }
	    }

	    public void setSearch() {
	    	 Scanner sc = new Scanner(System.in);
	    	   System.out.println("찾는 학생 이름을 검색해주세요 :");
	    	   String name = sc.next();
	    	   
	    	   int i=0;
	    	   while(true) {
	    	      if( name.equals(arr.add(getName)) {
	    	         System.out.println("검 색 완 료");
	    	         System.out.println("-----이름 국어점수 영어점수 수학점수 총점수 평균 -----");
	    	         System.out.print(arr.get(getName())+"\t");
	    	         System.out.print(arr.get(getKor())+"\t");
	    	         System.out.print(arr.get(getEng())+"\t");
	    	         System.out.print(arr.get(getMat())+"\t");
	    	         System.out.print(arr.get(getTotal())+"\t");
	    	         System.out.println(arr.get(getAvg());
	    	         
	    	         break;
	    	         
	    	      }
	    	      
	    	      i++;
	    	   }
	    }

	    public void setDisp() {
	    	 for(Student_final s:arr) {
	    	      if(s == null) break;
	    	      System.out.print(s.getName()+"\t");
	    	      System.out.print(s.getKor()+"\t");
	    	      System.out.print(s.getEng()+"\t");
	    	      System.out.print(s.getMat()+"\t");
	    	      System.out.print(s.getTotal()+"\t");
	    	      System.out.println(s.getAvg());}
	    	   
	    }

	    public void setStudent() {
	    	Student_final stu = new Student_final(); // 학생객체생성
	    	   Scanner sc = new Scanner(System.in);
	    	   ArrayList<Student_final> arr = new ArrayList<>();
	    	   System.out.println("학생 이름,국어,영어,수학 점수를 순서대로 입력해주세요");
	    	   stu.setName(sc.next());
	    	   stu.setKor(sc.nextInt());
	    	   stu.setEng(sc.nextInt());
	    	   stu.setMat(sc.nextInt());
	    	   stu.getTotal();
	    	   stu.getAvg();
	    	   
	    	   arr=stu;  // 연결

	    }
	}
