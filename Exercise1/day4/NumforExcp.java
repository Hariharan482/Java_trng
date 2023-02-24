package day4;

import java.util.*;

public class NumforExcp {

	public static void main(String[] args) throws Out_of_range{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of stud and no of subj");
		int stud_no = sc.nextInt();
		int subj_cnt = sc.nextInt();

		int mark[][] = new int[stud_no][subj_cnt];
		int avg[] = new int[stud_no];
		int cnt = 0;

		while (cnt < stud_no) {

			for (int i = 0; i < stud_no; i++) {
				System.out.println("enter the marks");
				int total=0;
				for (int j = 0; j < subj_cnt; j++) {
					
					try {
						int mrk = Integer.parseInt(sc.next());
						if(mrk>0 && mrk<100) {
						mark[i][j] = mrk;
						total+= mrk;}
						else {
							throw new Out_of_range("out of range");
						}
					} catch (NumberFormatException e) {
						System.out.println("enter a valid number");
						sc.reset();
						j--;
					}
					catch(Out_of_range e) {
						System.out.println(e);
						j--;
					}

				}
				avg[i]=total/subj_cnt;
				cnt++;

			}
		}

		for (int i = 0; i < stud_no; i++) {
			System.out.println("id:" + i + "\tAvg-" + avg[i]);
		}
	}

}
