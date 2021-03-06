package com.longyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longyan.dao.impl.BbsReplyDaoImpl;
import com.longyan.entity.BbsReply;


/**
 * 跟帖管理
 * @author tracyqiu
 *
 */
@Service
public class BbsReplyService {

	@Autowired
	private BbsReplyDaoImpl bbsReplyDaoImpl;

	public BbsReplyDaoImpl getBbsReplyDaoImpl() {
		return bbsReplyDaoImpl;
	}

	public void setBbsReplyDaoImpl(BbsReplyDaoImpl bbsReplyDaoImpl) {
		this.bbsReplyDaoImpl = bbsReplyDaoImpl;
	}
	
	/**
	 * 新增跟帖
	 * @param bbsReply
	 * @return
	 */
	public String addBbsReply(BbsReply bbsReply){
		return bbsReplyDaoImpl.insert(bbsReply);
	}
	
	/**
	 * 更改回帖状态
	 * @param bbsReply
	 * @return
	 */
	public String modifyBbsReplyStatus(BbsReply bbsReply){
		return bbsReplyDaoImpl.changeStatus(bbsReply);
	}
	
	/**
	 * 取得某个帖子下面的所有跟帖
	 * @param bbs_id
	 * @return
	 */
	public List<BbsReply> getBbsReplyByBbsId(Integer bbs_id, Integer start, Integer count){
		return bbsReplyDaoImpl.findByBbsId(bbs_id, start, count);
	}
	
	/**
	 * 取得某个帖子下面的所有跟帖
	 * @param bbs_id
	 * @return
	 */
	public List<BbsReply> getBbsReplyByBbsId(Integer bbs_id){
		return bbsReplyDaoImpl.findByBbsId(bbs_id);
	}
	
	/**
	 * 通过ID取得跟帖
	 * @param id
	 * @return
	 */
	public BbsReply getBbsReplyById(Integer id){
		return bbsReplyDaoImpl.getBbsReplyById(id);
	}
	
	/**
	 * 取得某个帖子下面可见的所有跟帖
	 * @param bbs_id
	 * @return
	 */
	public List<BbsReply> getPasssedBbsReplyByBbsId(Integer bbs_id, Integer start, Integer count){
		return bbsReplyDaoImpl.findPassedByBbsId(bbs_id, start, count);
	}
	
	/**
	 * 有效跟帖数量
	 * @param bbs_id
	 * @return
	 */
	public int getPassedReplyCountByBbsId(Integer bbs_id){
		return bbsReplyDaoImpl.getPassedReplyCountByBbsId(bbs_id);
	}
}
