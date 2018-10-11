package com.ruoyi.project.signManger.workTime.domain;

import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 上下班时间表 work_time
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
public class WorkTime extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 工作时间ID */
	private Integer worktimeId;
	/** 上班时间 */
	private String ondutyTime;
	/** 下班时间 */
	private String offdutyTime;

	/**
	 * 设置：工作时间ID
	 */
	public void setWorktimeId(Integer worktimeId) 
	{
		this.worktimeId = worktimeId;
	}
	
	/**
	 * 获取：工作时间ID
	 */
	public Integer getWorktimeId() 
	{
		return worktimeId;
	}
	
	/**
	 * 设置：上班时间
	 */
	public void setOndutyTime(String ondutyTime) 
	{
		this.ondutyTime = ondutyTime;
	}
	
	/**
	 * 获取：上班时间
	 */
	public String getOndutyTime() 
	{
		return ondutyTime;
	}
	
	/**
	 * 设置：下班时间
	 */
	public void setOffdutyTime(String offdutyTime) 
	{
		this.offdutyTime = offdutyTime;
	}
	
	/**
	 * 获取：下班时间
	 */
	public String getOffdutyTime() 
	{
		return offdutyTime;
	}
	
}
