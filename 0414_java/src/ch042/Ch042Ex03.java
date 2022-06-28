package ch042;

import java.util.Scanner;

/*
 * 게시판 개념 모델링 : 게시글, 공지사항, 날짜, 주번, 시험D데이, QnA, 댓글, 작성자, 글쓴이, 제목, 수정, 내용...
 * 게시판 논리 모델링 : 게시글(제목, 작성자, 내용, 댓글, 날짜, 구분(공지, QnA))
 * 게시판 물리 모델링 : board (title, writer, contents, reply, date, gubun) 
 */

class Ch042Board {//접근 제한자가 없으면 같은 폴더에서만 접근 가능. 
	
	String title; 
	String writer; 
	String contents; 
	String date; 
	String gubun;
	
	void print() {
		System.out.println("구분 :" + gubun);
		System.out.println("제목 :" + title);
		System.out.println("작성자 :" + writer);
		System.out.println("작성일 :" + date);
		System.out.println("내용 :" + contents);
	}
}//class

public class Ch042Ex03 {
	public static void main(String[] args) {
		
		
		Ch042Board [] bArr = new Ch042Board[10];
		Scanner scan = new Scanner(System.in);
		int menuNo = 0, bangBunHo = 0;
		
		while(true) {
			System.out.print("0: 종료 / 1: 작성 / 2: 출력, 선택 :");
			menuNo = scan.nextInt();
			scan.nextLine(); //nextInt()앱서 입력된 엔터 값을 갖고 없어지는 표현. 
			
			if(menuNo == 0) {
				scan.close();
				break;
			} else if(menuNo == 1) {
				if(bangBunHo == 10) {
					System.out.println("게시글이 꽉 찼습니다. 관리자에게 문의하세요~");
					continue;
				}
				bArr [bangBunHo] = new Ch042Board();
				System.out.print("제목입력 : ");
				bArr[bangBunHo].title = scan.nextLine();
				//* nextLine은 enter값을 가져간다. enter값을 지워줘야함.
				System.out.print("작성자 : ");
				bArr[bangBunHo].writer = scan.nextLine();
				System.out.print("내용 : ");
				bArr[bangBunHo].contents = scan.nextLine();
				System.out.print("날짜 : ");
				bArr[bangBunHo].date = scan.nextLine();
				System.out.print("공지 / QnA / 자유 , 구분 : ");
				bArr[bangBunHo].gubun = scan.nextLine();
				bangBunHo++;
			} else if(menuNo == 2) {
				for (int i = 0; i < bangBunHo; i++) {
					bArr[i].print();
				}//for
			} else {
				System.out.println("wrong input. try again!");
			}
			
		}//while
		
	}//main
}//class
