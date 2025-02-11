package day06.collection.listEx;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //글을 보관 운영하는 arrayList 하나 만듬
        List<Board> boards = new ArrayList<>();

        //객체 추가
        boards.add(new Board("제목1", "kbg0", "아 오늘 넘 힘듬"));
        boards.add(new Board("제목2", "kbg1", "아 오늘 넘 힘듬"));
        boards.add(new Board("제목3", "kbg2", "아 오늘 넘 힘듬"));

        //저장된 글 목록 수
        int size = boards.size();
        System.out.println("총 글의 수 : " + size);

        // 특정 인덱스 객체 가져오기
        Board board = boards.get(1);
//        System.out.printf("주제 : %s 내용 : %s 작성자 : %s",board.getSubject(), board.getContent() , board.getWriter());


        //전체 게시판 목록 가져오기
        for(Board board1 : boards){
            System.out.printf("주제 : %s 내용 : %s 작성자 : %s\n",board1.getSubject(), board1.getContent() , board1.getWriter());

        }

        boards.remove(1); //해당 인덱스 위치 삭제 , 자동 인덱싱 처리
     }
}
