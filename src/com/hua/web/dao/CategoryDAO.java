package com.hua.web.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import com.hua.web.model.Category;

/**
 *@author coolszy
 *@date Feb 19, 2012
 *@blog http://blog.92coding.com
 */
public class CategoryDAO
{
	SqlManager manager;
	String sql = "";
	ResultSet rs;
	
	public CategoryDAO() throws IOException, ClassNotFoundException
	{
		manager = SqlManager.createInstance();
	}
	
	/**
	 * 获取新闻类型
	 * @param startTid 起始类型编号
	 * @param count 数量
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Category> getTypes(int startTid,int count) throws SQLException
	{
		ArrayList<Category> list = new ArrayList<Category>();
		sql = "select cid,title from t_category where deleted = false order by sequnce LIMIT ?,?";
		Object[] params = new Object[]{startTid,count};
		manager.connectDB();
		rs = manager.executeQuery(sql, params);
		while(rs.next())
		{
			Category category = new Category(rs.getInt("cid"), rs.getString("title"));
			list.add(category);
		}
		manager.closeDB();
		return list;
	}
	
}
