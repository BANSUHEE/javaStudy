package Student_sb;

import java.util.Scanner;
			/*
			* 인원수대로 성적 처리 프로그램. 
			* 입력 : 이름 국,영,수 
			* 연산 : 총점, 평균 출력 :
			*  이름,국,영,수,총,평
			*/
			public class Student_method {
				
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					Student_method arr = new Student_method();
					
					//input 함수 호출 후 인원수 값 할당
					int count = arr.input_headcnt(sc);
					
					//배열 객체
					String []name = new String[count];
					int [][]score = new int[count][4]; 
					float []avg = new float[count];
					String []scoName = {"Name","Kor","Eng","Mat","Total","Abg"};
					
					//매개변수로 스캐너 객체와, 인원수, 이름, 점수 배열을 전달.
					//학생 이름과 점수 각각 인원수별 입력.
					arr.input_value(sc, count, name, score,scoName);
					
					//합계 함수 호출
					arr.sum_score(count, score);
					//평균 함수 호출
					arr.avg_score(count, score, avg);
					//결과 출력
					arr.result(count, name, score, avg);

				}
				
				
				private void result(int cnt, String[] name, int[][] score, float[] avg) {
					System.out.println("================= 성 적 표 ===================");
					System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
					
					for(int i=0; i<cnt; i++) { // 3사람이면.. 0,1,2
							System.out.print(name[i]+"\t");
						for(int j=0; j<4; j++) { //4과목이기때문에, 0,1,2,3..
								System.out.print(score[i][j]+"\t"); // [0][0], [0][1], ....
							} 
								System.out.printf("%.2f\n",avg[i]);// 3명이면, 3명꺼출력. 0,1,2
							}
							
						}
				


				public int input_headcnt(Scanner sc) {
					System.out.println("학생 수를 입력해주세요 : ");
					int cnt = sc.nextInt();
					return cnt;
				}
				
				
				// 학생 이름과 성적 배열을 매개변수로 받아,
				// 데이터를 입력하는 함수 구현 
				public void input_value(Scanner sc, int cnt,String []name,int [][]score,String []scoName) {
					
					System.out.println("이름,국어,영어,수학 순서대로 입력해주세요.");

					for(int i=0; i<cnt; i++) { //2명이면, 0,1
						System.out.println(scoName[0]+"  : ");
						name[i] = sc.next(); 
						
						for(int j=0; j<3 ; j++) { //과목수는 3개. 0,1,2 실행.
						System.out.println(scoName[j+1]+" Score : ");
							score[i][j] = sc.nextInt();
						}
						
					System.out.println("성적 입력이 완료되었습니다.");
					}
				}
				
				//학생 성적 총합을 구하는 함수
				public void sum_score(int cnt,int [][]score) {
					for(int i=0; i<cnt; i++) { 
						for(int j=0; j<3; j++) {
							score[i][3] += score[i][j]; // [0][0]/[0][1]/[0][2] 전부 합산해서 [0][3] 넣기
						}
					}
				}
				
				//학생 성적 평균을 구하는 함수
				
				public void avg_score(int cnt,int [][]score,float []avg) {
					for(int i=0; i<cnt; i++) {
						avg[i] = score[i][3] / 3.0f;  
					}
				}
			}

