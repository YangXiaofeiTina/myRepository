package domain;

import java.io.Serializable;
/**
 * desc:
 * 
 * @author yxf
 * 
 * 2017-08-07 pm14:10:00
 * 
 * @since 1.0v
 * */
public class Wedding implements Serializable{
	
	/**
	 * �������ݣ�������Ա
	 * ����1����������ʵ�ʵļ���ʱ��
	 * 2���α��²�Ĵ���
	 * 3���α��²�ʹ�õ�ʱ��
	 * */
	private static String initTime = "2017-08-07";
	private static Integer size = 0;
	private static Integer spent = 0;
	
	public String getInitTime() {
		return initTime;
	}
	public void setInitTime(String initTime) {
		this.initTime = initTime;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getSpent() {
		return spent;
	}
	public void setSpent(Integer spent) {
		this.spent = spent;
	}
	@Override
	public String toString() {
		return "Wedding [getInitTime()=" + getInitTime() + ", getSize()=" + getSize() + ", getSpent()=" + getSpent()
				+ "]";
	}
	
	

}
