package eleven;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutMainClass extends Frame { //Second
	public FlowLayoutMainClass() {
		//setLayout(null) 은 개발지 임의대로
		this.setLayout(new FlowLayout());
		//가로 중앙정렬, 상호좌우 5픽셀 간겨
		//즉, 좌에서 우로 배치, 다시 다음줄 우로 배추, 같은 줄에서는 가운데 정렬
		// 실행한 윈도우를 크기를 줄이거나 늘었을때 자동적용
		this.add(new Button("눌러봐"));
		this.add(new Button("골라봐"));
		this.add(new Button("웬열?"));
		this.add(new Button("뭥미?"));
		this.add(new Button("뭘 눌러?"));
		this.add(new Button("아무거나"));
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		
		FlowLayoutMainClass flc1=new FlowLayoutMainClass();
		
		
	}

}
