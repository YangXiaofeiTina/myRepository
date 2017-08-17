package daoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.WeddingDao;
import domain.Wedding;

public class WeddingDaoImpl implements WeddingDao{

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Wedding wedding = new Wedding();	//用于获取初始化时间
	
	/**
	 * 
	 * 
	 * */
	@Override
	public int judge(Date date) {
		Date initDate = null;		//定义一个日期类型的变量接收日期
		String initTime =wedding.getInitTime();		//获取初始化时间
		try {
			initDate = sdf.parse(initTime);		//将时间转换成日期类型
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/*判断，如果时间一致，则继续判断猜测次数以及使用时间，时间大，则返回2，时间小则返回0*/
		if(date.equals(initDate)){
			
			return 1;
		}else if(date.getTime()>initDate.getTime()){
			
			return 2;
		}else{
			
			return 0;
		}
	}
	
	/**
	 * 
	 * 返回嘉宾猜对的次数
	 * */
	@Override
	public int size(Date date) {
		
		return 0;
	}
	
	/**
	 * 
	 * 返回嘉宾猜对使用的时间长短
	 * */
	@Override
	public int spent(Date date) {
		
		return 0;
	}

}
