/* JAVA 는 100% 상속구조
 *  JAVA는 100% 객체지향언어이다. 무조건 객체를 사용. → class
 *  시작과 끝을 담당하는 함수 → main
 *  시작과 끝을 담당하는 함수 -> main 함수
 *   함수 -> function -> method
 *   
 * <규칙>
 * 1)클래스의 첫문자는 대문자로 작성한다.
 * 2)메소드,변수 : 소문자로 작성한다. 변수는 상수를 저장하는 메모리 공간이 변수이다, 메모리 공간이다. ((변하는 값이 아님))
 * 3)상수: 전부 대문자로 작성한다-> 변하지 않는 값 ex) MAX
 * 4) 단어가 이어질때 두번째 단어에 첫글자는 대문자로 작성해야한다. ex) blackWhite 또는  BlackWhite 등등
 * 
 * <DataType>
 * 1.
 *    문자형 char(2byte)
 *    정수형 byte,short,int(디폴트값),long      
 *    실수형 float, double 3.7 
 * 2.Reforence Ty
 * Casting
 * 1.자동변환 3(int) + 4*2 (double)   
 * 2.강제변환 3/4 = 0 {int/int =int 0} , (double)3/(double)4 = (double)0.7 이 중 하나만 (double)해도 나머지 하나는 바뀐다.
 *
 * static은 
 * 
 * "."으로 나눠져있는 것은 패키지라는 의미이다.
 * 자세하게 보려면 ctrl누르고 단어 선택 
 * 
 * print
 * printf
 * println
 */

//첫번째 패키지(파일 위치를 알려주는 폴더)
//두번째 임포트(api 가져다 쓰겠다.)
//import java.lang.*;
//프로그램을 시작해주고 끝내줌.

/*정적 메서드는 클래스 레벨에서 사용되며, 해당 클래스의 인스턴스를 생성하지 않고도 사용할 수 있습니다. 
 * 이러한 특성 때문에 주로 유틸리티 함수나 헬퍼 함수를 작성할 때 사용됩니다.
 */

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			int j = 2;
			System.out.print(j + "*" + i + "=" + (i * j) + "\t");
		}  System.out.println();
		i++;
			}
		}

/*
 * int box = 1; int count = 0;
 * 
 * for(count = 0;box <10;count++) { box *= 2; // box = box * 2; 또는 box <<= ; }
 * 
 * System.out.println(box); System.out.println(count); } //for(int = 0; i<2;i++)
 * { //for(int j = 0; j<3;j++) { // System.out.println(i*j); // } //
 * System.out.println(); // } //}
 */

/*
 * Scanner sc; sc = new Scanner(System.in);
 * System.out.println("첫 번째 숫자를 입력해주세요."); int a = sc.nextInt();
 * System.out.println("두 번째 숫자를 입력해주세요."); int b = sc.nextInt();
 * System.out.println("연산자를 입력해주세요."); //char c = sc.next().charAt(0); String op
 * = sc.next(); //char op = op2.CharAt(0); //char op3 = sc.next().charAt(0);
 * 
 * if(op.equals ("+")){ System.out.println("a+b="+(a+b)); }else if (op.equals
 * ("+")) { System.out.println("a-b="+(a-b)); }else if (op.equals ("-")) {
 * System.out.println("a/b="+(a/b)); }else if (op.equals ("/")) {
 * System.out.println("a*b="+(a*b)); }else {op.equals ("*");
 * System.out.println("올바른 연산자를 입력해주세요");
 * System.out.println("사칙연산 계산기를 종료합니다."); }
 * 
 * } }
 * 
 * 
 * /*public static void main(String []args){ Scanner sc; sc = new
 * Scanner(System.in); System.out.println("첫 번쨰 숫자를 입력해주세요"); int a =
 * sc.nextInt(); System.out.println("두 번쨰 숫자를 입력해주세요"); int b = sc.nextInt();
 * 
 * if (a>b) { System.out.println("첫 번쨰가 두 번째 수보다 큽니다."); } else
 * System.out.println("두 번쨰가 첫 번째 수보다 큽니다.");
 */

//Datatype 변수명 ;
// 변수명 = 값 ; '=' 대입을 하겠다 '==' 같다
// 변수 - 지역변수
// local variable : method 안에 선언되어지는 변수 **** 지역변수는 꼭 초기화 !!! 를 해야한다.*******
// int num;
// System.out.println(num); -> 오류가 난다.
// ((int)ch -> 아스키코드의 65가 나온다. 대문자 A가 아님.

// int num;
// num=10;
// char ch = 'A'; // "" 문자열
// System.out.println(num);
// System.out.println((int)ch);

// Hello hello; //변수 hello = **레퍼런스 변수**
// Hello= new hello(); //객체 생성

// System.out.println("Hello"); //println은 각자의 결과값을 내어준다.
// System.out.println(333);

// System.out.print("Hello"+333); //print은 합쳐서 결과값을 내어준다. ("Hello"+333) 문자열 결합 !
// System.out.print(333);

// Scanner sc;
// sc = new Scanner(System.in); //키보드에 입력하는 것을 반영해주겠다 !
// String str = sc.next();
// int num =sc.nextInt();

// System.out.println(str);
// System.out.println(num);}
