package view;
/**
 * desc:
 * 
 * @author yxf
 * 
 * 2017-08-07 pm14:01:00
 * 
 * @since 1.0v
 * */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import biz.WeddingBiz;
import bizImpl.WeddingBizImpl;
/*
 * 显示层，显示嘉宾需要输入的信息以及判断方法判断后的
 * */
public class WeddingView {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static Date date;
	
	/**
	 * 
	 * 猜数游戏，写入嘉宾猜测的内容，输出猜测的时间和次数
	 * 
	 * 
	 * */
	public static void host() {
		//初始时间，即准确的见面时间
		int count = 0;
		while(true){
			
			Scanner input = new Scanner(System.in);
			
			//司仪令游戏的人猜测时间
			System.out.print("请您猜测新郎新娘第一次见面时间:");
			
			Date startTime = new Date(); // 嘉宾开始猜时的时间
			
			//输入猜测的时间，并将时间变成日期类型
			String a = input.next();
			count++;
			
			try {
				date = sdf.parse(a);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//调用判断函数，判断时间早了还是晚了，并判断猜测的时间长短
			WeddingBiz weddingBiz = new WeddingBizImpl();
			int message = weddingBiz.judge(date);
			if(message == 1){
				System.out.println("恭喜您，猜对了！");
				Date endTime = new Date(); // 嘉宾猜对时的时间
				System.out.println
				("猜测需要的时间："+(endTime.getTime()-startTime.getTime())+"毫秒");		//求时间差
				System.out.println("猜测的次数："+count+"次");
				break;
			}else if(message == 2){
				System.out.println("猜测的日期过大，请重新猜测！");
			}else{
				System.out.println("您猜测的日期过小，请重新猜测！");
			}
		}
		
	}
	public static void main(String[] args) {
		WeddingView.host();
	}

}
