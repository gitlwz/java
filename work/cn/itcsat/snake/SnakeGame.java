package cn.itcsat.snake;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

public class SnakeGame {

	public static final int  WIDTH = 35; //��ͼ�Ŀ�
	
	//��ͼ��(����)
	public static final int HEIGHT = 8;  
	
	//��ͼ
	private char[][] background = new char[HEIGHT][WIDTH];
	
	
	//���м��ϱ����߽ڵ��������Ϣ
	LinkedList<Point>  snake = new LinkedList<Point>();
	
	//ʳ��
	Point food;
	
	//ʹ��4��������ʾ4������
	public static final int UP_DIRECTION = 1;
	
	public static final int DOWN_DIRECTION = -1;
	
	public static final int LEFT_DIRECTION = 2;
	
	public static final int RIGHT_DIRECTION = -2;
	
	//�ߵ�ǰ�ķ���
	int currentDrection = -2; //��Ĭ���������ƶ�
	
	//��¼��Ϸ�Ƿ������
	static boolean isGameOver = false; //Ĭ����Ϸû�н���
	
	public void move() {
		//��ȡԭ����ͷ
		Point head = snake.getFirst();
		
		switch (currentDrection) {
		case UP_DIRECTION:
			snake.addFirst(new Point(head.x,head.y-1));
			break;
		case DOWN_DIRECTION:
			
			snake.addFirst(new Point(head.x,head.y + 1));
			break;
		case LEFT_DIRECTION:
			if(head.x == 0){
				snake.addFirst(new Point(WIDTH-1,head.y));
			}else {
				snake.addFirst(new Point(head.x - 1,head.y));
			}
			
			break;
		case RIGHT_DIRECTION:
			if(head.x == WIDTH -1){
				snake.addFirst(new Point(0,head.y));
			}else {
				snake.addFirst(new Point(head.x + 1,head.y));
			}
			
			break;
		}
		if(eatFood()){
			//�Ե���ʳ��
			createFood();
		}else {
			snake.removeLast();
		}
		
	}
	
	//�ı䵱ǰ����ķ���
	
	public void changeDirection(int newDirection) {
		//�ж��·����Ƿ��뵱ǰ�����Ƿ��෴���򣬲�������ı�
		if(newDirection + currentDrection != 0){
			this.currentDrection = newDirection;
		}
	}

	//����ʳ��
	public void createFood() {
		//����һ�����������
		Random random = new Random();
		while (true) {
			int x = random.nextInt(WIDTH);  
			int y = random.nextInt(HEIGHT);
			if(background[y][x] != '*' && background[y][x] != '#' && background[y][x] != '$'){
				food  = new Point(x,y);
				break;
			}
			
		}	
	}
	//��ʾʳ��
	public void showFood() {
		background[food.y][food.x] = '@';
	}
	
	
	//��ʼ����
	public void initSnake() {
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snake.addFirst(new Point(x-1,y));
		snake.addFirst(new Point(x,y));
		snake.addFirst(new Point(x+1,y));
	}
	//��ʾ�� ----ʵ���Ͼ��Ǽ����߽ڵ�������Ϣ��������ͼ��
	public void showSnake() {
		//ȡ����ͷ
		Point head = snake.getFirst();
		background[head.y][head.x] = '$';
		//������
		for(int i = 1;i<snake.size();i++){
			Point body = snake.get(i);
			background[body.y][body.x] = '#';
		}
	}
	
	//��ʼ����ͼ
	public void initBackground() {
		for (int row = 0; row < background.length; row++) {
			
			for (int cols = 0; cols < background[row].length; cols++) {
				if(row == 0|| row == (HEIGHT - 1 )){
					background[row][cols] = '*';
				}else {
					background[row][cols] = ' ';
				}
			}
		}
	}
	public void showBackground() {
		for (int row = 0; row < background.length; row++) {
			for (int cols = 0; cols < background[row].length; cols++) {
				System.out.print(background[row][cols]); 
			}
			System.out.println();
		}
	}
	//������Ϸ��״̬
	public void refrash() {
		//�����Ϸ֮ǰ������״̬��Ϣ
		initBackground();
		//�������µ�״̬��������ͼ��
		showSnake();
		showFood();
		//��ʾ��ǰ��ͼ����Ϣ
		showBackground();
	}
	
	public boolean eatFood() {
		//��ȡ��ԭ������ͷ
		Point head = snake.getFirst();
		if(head.equals(food)){
			return true;
		}
		return false;
	}
	//��Ϸ�����ķ���
	public void isGameOver() {
		//ײǽ����
		Point head = snake.getFirst();
		if(background[head.y][head.x] == '*'){
			isGameOver = true;
		}
		//ҧ���Լ�
		for (int i = 1; i < snake.size(); i++) {
			Point body = snake.get(i);
			if(head.equals(body)){
				isGameOver = true;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		SnakeGame snake = new SnakeGame();
		//��ʼ����ͼ
		snake.initBackground();
		//��ʼ����
		snake.initSnake();
		//���ߵ���Ϣ��������ͼ��
		snake.showSnake();
		
		//��ʼ��ʳ��
		snake.createFood();
		//��ʾʳ��
		snake.showFood();
		snake.showBackground();
		
		
		JFrame frame = new JFrame("������");
		frame.add(new JButton("��"),BorderLayout.NORTH);
		frame.add(new JButton("��"),BorderLayout.SOUTH);
		frame.add(new JButton("��"),BorderLayout.WEST);
		frame.add(new JButton("��"),BorderLayout.EAST);
		JButton button = new JButton("������Ʒ���");
		frame.add(button);
		FrameUtil.initFrame(frame, 300, 300);
		//����ť����¼�������
				button.addKeyListener(new KeyAdapter(){
					@Override
					public void keyPressed(KeyEvent e) {
						int code = e.getKeyCode();
						switch (code) {
							case KeyEvent.VK_UP:
								snake.changeDirection(UP_DIRECTION);
								break;
							case KeyEvent.VK_DOWN:
								snake.changeDirection(DOWN_DIRECTION);
								break;
							case KeyEvent.VK_LEFT:
								snake.changeDirection(LEFT_DIRECTION);
								break;
							case KeyEvent.VK_RIGHT:
								snake.changeDirection(RIGHT_DIRECTION);
								break;
							default:
								break;
						}
						snake.move();
						
						snake.isGameOver(); //�ж���Ϸ�Ƿ����
						snake.refrash();
						if(isGameOver){
							System.out.println("��Ϸ������...");
							System.exit(0);
						}
						
					}
				});
		
		
		
	}
}
