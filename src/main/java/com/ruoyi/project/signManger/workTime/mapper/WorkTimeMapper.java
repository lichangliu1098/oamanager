package com.ruoyi.project.signManger.workTime.mapper;

import com.ruoyi.project.signManger.workTime.domain.WorkTime;
import java.util.List;	

/**
 * 上下班时间 数据层
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
public interface WorkTimeMapper 
{
	/**
     * 查询上下班时间信息
     * 
     * @param worktimeId 上下班时间ID
     * @return 上下班时间信息
     */
	public WorkTime selectWorkTimeById(Integer worktimeId);
	
	/**
     * 查询上下班时间列表
     * 
     * @param workTime 上下班时间信息
     * @return 上下班时间集合
     */
	public List<WorkTime> selectWorkTimeList(WorkTime workTime);
	
	/**
     * 新增上下班时间
     * 
     * @param workTime 上下班时间信息
     * @return 结果
     */
	public int insertWorkTime(WorkTime workTime);
	
	/**
     * 修改上下班时间
     * 
     * @param workTime 上下班时间信息
     * @return 结果
     */
	public int updateWorkTime(WorkTime workTime);
	
	/**
     * 批量删除上下班时间
     * 
     * @param worktimeIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteWorkTimeByIds(Integer[] worktimeIds);
	
}