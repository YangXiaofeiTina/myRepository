package dao;

import java.util.Date;

public interface WeddingDao {
	public int judge(Date date);
	public int size(Date date);
	public int spent(Date date);
}
