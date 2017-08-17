package bizImpl;

import java.util.Date;

import biz.WeddingBiz;
import dao.WeddingDao;
import daoImpl.WeddingDaoImpl;

public class WeddingBizImpl implements WeddingBiz{

	@Override
	public int judge(Date date) {
		WeddingDao weddingDao = new WeddingDaoImpl();
		return weddingDao.judge(date);
	}

}
