package com.longyan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longyan.dao.impl.BbsDaoImpl;
import com.longyan.entity.Bbs;

/**
 * 发帖服务服务管理
 * @author tracyqiu
 *
 */
@Service
public class BbsService {

	@Autowired
	private BbsDaoImpl bbsDaoImpl;

	public BbsDaoImpl getBbsDaoImpl() {
		return bbsDaoImpl;
	}

	public void setBbsDaoImpl(BbsDaoImpl bbsDaoImpl) {
		this.bbsDaoImpl = bbsDaoImpl;
	}
	
	/**
	 * 新增发帖
	 * @param bbs
	 * @return
	 */
	public String addBbs(Bbs bbs){
		return bbsDaoImpl.insert(bbs);
	}
	
	/**
	 * 修改帖子内容
	 * @param bbs
	 * @return
	 */
	public String modifyBbs(Bbs bbs){
		return bbsDaoImpl.update(bbs);
	}
	
	/**
	 * 更改帖子状态
	 * @param bbs
	 * @return
	 */
	public String modifyBbsStatus(Bbs bbs){
		return bbsDaoImpl.changeStatus(bbs);
	}
	
	/**
	 * 更新帖子时间
	 * @param bbs
	 */
	public String modifyBbsTime(Bbs bbs){
		return bbsDaoImpl.updateTime(bbs);
	}
	
	/**
	 * 根据状态吗取得相应的帖子
	 * @return
	 */
	public List<Bbs> getBbsByStatus(Integer status, Integer start, Integer count){
		return bbsDaoImpl.findByStatus(status, start, count);
	}
	
	/**
	 * 取得审核通过的帖子供前段展现
	 * @return
	 */
	public List<Bbs> getPassedAndTimeoutedBbs(Integer start, Integer count){
		return bbsDaoImpl.findPassedAndTimeoutedBbs(start, count);
	}
	
	
	/**
	 * 取得某个用户发的帖子
	 * @param customer_id
	 * @return
	 */
	public List<Bbs> getBbsByCustomerId(Integer customer_id, Integer start, Integer count){
		return bbsDaoImpl.findByCustomerId(customer_id, start, count);
	}
	
	/**
	 * 根据帖子类型查找帖子
	 * @param type
	 * @param start
	 * @param count
	 * @return
	 */
	public List<Bbs> getBbsByType(Integer type, Integer start, Integer count){
		return bbsDaoImpl.findByType(type, start, count);
	}
	
	/**
	 * 根据帖子类型查找帖子
	 * @param type
	 * @param start
	 * @param count
	 * @return
	 */
	public List<Bbs> getPassedAndTimeoutByType(Integer type, Integer start, Integer count){
		return bbsDaoImpl.findPassedAndTimeoutByType(type, start, count);
	}
	
	/**
	 * 根据帖子类型查找帖子
	 * @param type
	 * @param start
	 * @param count
	 * @return
	 */
	public List<Bbs> getHotBbsByType(Integer type, Integer start, Integer count){
		return bbsDaoImpl.findHotBbsByType(type, start, count);
	}
	
	/**
	 * 取得所有帖子
	 * @return
	 */
	public List<Bbs> getAllBbs(Integer start, Integer count){
		return bbsDaoImpl.findAll(start, count);
	}
	
	/**
	 * 增加浏览量
	 * @param bbs
	 * @return
	 */
	public String addViewCount(Bbs bbs){
		return bbsDaoImpl.addViewCount(bbs);
	}
	
	/**
	 * 增加回复量
	 * @param bbs
	 * @return
	 */
	public String addReplyCount(Bbs bbs){
		return bbsDaoImpl.addReplyCount(bbs);
	}
	
	/**
	 * 取得能展现帖子总数
	 * @param type
	 * @return
	 */
	public int getBbsCountByType(Integer type){
		return bbsDaoImpl.getBbsCountByType(type);
	}
	
	/**
	 * 取得能展现帖子总数
	 * @param type
	 * @return
	 */
	public int getBbsCountByCustomerId(Integer customer_id){
		return bbsDaoImpl.getBbsCountByCustomerId(customer_id);
	}
	
	/**
	 * 取得能展现帖子总数
	 * @param type
	 * @return
	 */
	public Bbs getBbsById(Integer id){
		return bbsDaoImpl.getBbsById(id);
	}
	
	/**
	 * 后台取得所有帖子
	 * @return
	 */
	public List<Bbs> getAllBbs(){
		return bbsDaoImpl.findAll();
	}
	
	/**
	 * 根据条件查询帖子
	 * @param type
	 * @param status
	 * @return
	 */
	public List<Bbs> getBbsByParam(Integer type, Integer status){
		return bbsDaoImpl.getBbsByParam(type, status);
	}
}
