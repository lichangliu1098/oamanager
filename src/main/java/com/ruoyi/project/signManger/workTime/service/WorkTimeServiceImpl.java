package com.ruoyi.project.signManger.workTime.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.signManger.workTime.mapper.WorkTimeMapper;
import com.ruoyi.project.signManger.workTime.domain.WorkTime;
import com.ruoyi.project.signManger.workTime.service.IWorkTimeService;
import com.ruoyi.common.support.Convert;

/**
 * 上下班时间 服务层实现
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
@Service
public class WorkTimeServiceImpl implements IWorkTimeService 
{
	@Autowired
	private WorkTimeMapper workTimeMapper;

	/**
     * 查询上下班时间信息
     * 
     * @param worktimeId 上下班时间ID
     * @return 上下班时间信息
     */
    @Override
	public WorkTime selectWorkTimeById(Integer worktimeId)
	{
	    return workTimeMapper.selectWorkTimeById(worktimeId);
	}
	
	/**
     * 查询上下班时间列表
     * 
     * @param workTime 上下班时间信息
     * @return 上下班时间集合
     */
	@Override
	public List<WorkTime> selectWorkTimeList(WorkTime workTime)
	{
	    return workTimeMapper.selectWorkTimeList(workTime);
	}
	
    /**
     * 新增上下班时间
     * 
     * @param workTime 上下班时间信息
     * @return 结果
     */
	@Override
	public int insertWorkTime(WorkTime workTime)
	{
	    return workTimeMapper.insertWorkTime(workTime);
	}
	
	/**
     * 修改上下班时间
     * 
     * @param workTime 上下班时间信息
     * @return 结果
     */
	@Override
	public int updateWorkTime(WorkTime workTime)
	{
	    return workTimeMapper.updateWorkTime(workTime);
	}
	
	/**
     * 保存上下班时间
     * 
     * @param workTime 上下班时间信息
     * @return 结果
     */
	@Override
	public int saveWorkTime(WorkTime workTime)
	{
	    Integer worktimeId = workTime.getWorktimeId();
		int rows = 0;
		if (StringUtils.isNotNull(worktimeId))
        {
		    rows = workTimeMapper.updateWorkTime(workTime);
		}
		else
        {
		    rows = workTimeMapper.insertWorkTime(workTime);
		}
		return rows;
	}
	
	/**
     * 删除上下班时间对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteWorkTimeByIds(String ids)
	{
		return workTimeMapper.deleteWorkTimeByIds(Convert.toIntArray(ids));
	}
	
}
