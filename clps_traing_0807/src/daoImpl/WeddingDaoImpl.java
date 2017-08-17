package daoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.WeddingDao;
import domain.Wedding;

public class WeddingDaoImpl implements WeddingDao{

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Wedding wedding = new Wedding();	//���ڻ�ȡ��ʼ��ʱ��
	
	/**
	 * 
	 * 
	 * */
	@Override
	public int judge(Date date) {
		Date initDate = null;		//����һ���������͵ı�����������
		String initTime =wedding.getInitTime();		//��ȡ��ʼ��ʱ��
		try {
			initDate = sdf.parse(initTime);		//��ʱ��ת������������
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/*�жϣ����ʱ��һ�£�������жϲ²�����Լ�ʹ��ʱ�䣬ʱ����򷵻�2��ʱ��С�򷵻�0*/
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
	 * ���ؼα��¶ԵĴ���
	 * */
	@Override
	public int size(Date date) {
		
		return 0;
	}
	
	/**
	 * 
	 * ���ؼα��¶�ʹ�õ�ʱ�䳤��
	 * */
	@Override
	public int spent(Date date) {
		
		return 0;
	}

}
