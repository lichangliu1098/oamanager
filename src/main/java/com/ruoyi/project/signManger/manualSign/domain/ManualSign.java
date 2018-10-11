package com.ruoyi.project.signManger.manualSign.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 签到表 manual_sign
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
public class ManualSign extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 签到ID */
	private Integer signId;
	/** 用户Id */
	private String userId;
	/** 签到时间 */
	private Date signTime;
	/** 签到描述 */
	private String signDesc;
	/** 签卡标记 */
	private Integer signTag;

	/**
	 * 设置：签到ID
	 */
	public void setSignId(Integer signId) 
	{
		this.signId = signId;
	}
	
	/**
	 * 获取：签到ID
	 */
	public Integer getSignId() 
	{
		return signId;
	}
	
	/**
	 * 设置：用户Id
	 */
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	
	/**
	 * 获取：用户Id
	 */
	public String getUserId() 
	{
		return userId;
	}
	
	/**
	 * 设置：签到时间
	 */
	public void setSignTime(Date signTime) 
	{
		this.signTime = signTime;
	}
	
	/**
	 * 获取：签到时间
	 */
	public Date getSignTime() 
	{
		return signTime;
	}
	
	/**
	 * 设置：签到描述
	 */
	public void setSignDesc(String signDesc) 
	{
		this.signDesc = signDesc;
	}
	
	/**
	 * 获取：签到描述
	 */
	public String getSignDesc() 
	{
		return signDesc;
	}
	
	/**
	 * 设置：签卡标记
	 */
	public void setSignTag(Integer signTag) 
	{
		this.signTag = signTag;
	}
	
	/**
	 * 获取：签卡标记
	 */
	public Integer getSignTag() 
	{
		return signTag;
	}
	
}
