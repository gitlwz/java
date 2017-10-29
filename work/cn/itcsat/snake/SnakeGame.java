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

	public static final int  WIDTH = 35; //地图的款
	
	//地图高(行数)
	public static final int HEIGHT = 8;  
	
	//地图
	private char[][] background = new char[HEIGHT][WIDTH];
	
	
	//单列集合保存蛇节点的所有信息
	LinkedList<Point>  snake = new LinkedList<Point>();
	
	//食物
	Point food;
	
	//使用4个常量表示4个方向
	public static final int UP_DIRECTION = 1;
	
	public static final int DOWN_DIRECTION = -1;
	
	public static final int LEFT_DIRECTION = 2;
	
	public static final int RIGHT_DIRECTION = -2;
	
	//蛇当前的方向
	int currentDrection = -2; //蛇默认是向右移动
	
	//记录游戏是否结束的
	static boolean isGameOver = false; //默认游戏没有结束
	
	public void move() {
		//获取原来蛇头
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
			//吃到了食物
			createFood();
		}else {
			snake.removeLast();
		}
		
	}
	
	//改变当前方向的方法
	
	public void changeDirection(int newDirection) {
		//判断新放心是否与当前方向是否相反方向，才允许其改变
		if(newDirection + currentDrection != 0){
			this.currentDrection = newDirection;
		}
	}

	//生成食物
	public void createFood() {
		//创建一个随机数对象
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
	//显示食物
	public void showFood() {
		background[food.y][food.x] = '@';
	}
	
	
	//初始化蛇
	public void initSnake() {
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snake.addFirst(new Point(x-1,y));
		snake.addFirst(new Point(x,y));
		snake.addFirst(new Point(x+1,y));
	}
	//显示蛇 ----实际上就是激昂蛇节点的最表信息反馈到地图上
	public void showSnake() {
		//取出蛇头
		Point head = snake.getFirst();
		background[head.y][head.x] = '$';
		//画蛇身
		for(int i = 1;i<snake.size();i++){
			Point body = snake.get(i);
			background[body.y][body.x] = '#';
		}
	}
	
	//初始化地图
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
	//舒心游戏的状态
	public void refrash() {
		//清空游戏之前的所有状态信息
		initBackground();
		//把蛇最新的状态反馈到地图上
		showSnake();
		showFood();
		//显示当前地图的信息
		showBackground();
	}
	
	public boolean eatFood() {
		//获取到原来的蛇头
		Point head = snake.getFirst();
		if(head.equals(food)){
			return true;
		}
		return false;
	}
	//游戏结束的方法
	public void isGameOver() {
		//撞墙死亡
		Point head = snake.getFirst();
		if(background[head.y][head.x] == '*'){
			isGameOver = true;
		}
		//咬到自己
		for (int i = 1; i < snake.size(); i++) {
			Point body = snake.get(i);
			if(head.equals(body)){
				isGameOver = true;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		SnakeGame snake = new SnakeGame();
		//初始化地图
		snake.initBackground();
		//初始化蛇
		snake.initSnake();
		//把蛇的信息反馈到地图上
		snake.showSnake();
		
		//初始化食物
		snake.createFood();
		//显示食物
		snake.showFood();
		snake.showBackground();
		
		
		JFrame frame = new JFrame("方向盘");
		frame.add(new JButton("↑"),BorderLayout.NORTH);
		frame.add(new JButton("↓"),BorderLayout.SOUTH);
		frame.add(new JButton("←"),BorderLayout.WEST);
		frame.add(new JButton("→"),BorderLayout.EAST);
		JButton button = new JButton("点击控制方向");
		frame.add(button);
		FrameUtil.initFrame(frame, 300, 300);
		//给按钮添加事件监听器
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
						
						snake.isGameOver(); //判断游戏是否结束
						snake.refrash();
						if(isGameOver){
							System.out.println("游戏结束了...");
							System.exit(0);
						}
						
					}
				});
		
		
		
	}
}
