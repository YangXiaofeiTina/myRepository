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
 * ��ʾ�㣬��ʾ�α���Ҫ�������Ϣ�Լ��жϷ����жϺ��
 * */
public class WeddingView {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static Date date;
	
	/**
	 * 
	 * ������Ϸ��д��α��²�����ݣ�����²��ʱ��ʹ���
	 * 
	 * 
	 * */
	public static void host() {
		//��ʼʱ�䣬��׼ȷ�ļ���ʱ��
		int count = 0;
		while(true){
			
			Scanner input = new Scanner(System.in);
			
			//˾������Ϸ���˲²�ʱ��
			System.out.print("�����²����������һ�μ���ʱ��:");
			
			Date startTime = new Date(); // �α���ʼ��ʱ��ʱ��
			
			//����²��ʱ�䣬����ʱ������������
			String a = input.next();
			count++;
			
			try {
				date = sdf.parse(a);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//�����жϺ������ж�ʱ�����˻������ˣ����жϲ²��ʱ�䳤��
			WeddingBiz weddingBiz = new WeddingBizImpl();
			int message = weddingBiz.judge(date);
			if(message == 1){
				System.out.println("��ϲ�����¶��ˣ�");
				Date endTime = new Date(); // �α��¶�ʱ��ʱ��
				System.out.println
				("�²���Ҫ��ʱ�䣺"+(endTime.getTime()-startTime.getTime())+"����");		//��ʱ���
				System.out.println("�²�Ĵ�����"+count+"��");
				break;
			}else if(message == 2){
				System.out.println("�²�����ڹ��������²²⣡");
			}else{
				System.out.println("���²�����ڹ�С�������²²⣡");
			}
		}
		
	}
	public static void main(String[] args) {
		WeddingView.host();
	}

}
