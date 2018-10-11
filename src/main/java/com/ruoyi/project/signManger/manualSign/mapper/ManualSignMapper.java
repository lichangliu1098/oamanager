package com.ruoyi.project.signManger.manualSign.mapper;

import com.ruoyi.project.signManger.manualSign.domain.ManualSign;
import java.util.List;	

/**
 * 签到 数据层
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
public interface ManualSignMapper 
{
	/**
     * 查询签到信息
     * 
     * @param signId 签到ID
     * @return 签到信息
     */
	public ManualSign selectManualSignById(Integer signId);
	
	/**
     * 查询签到列表
     * 
     * @param manualSign 签到信息
     * @return 签到集合
     */
	public List<ManualSign> selectManualSignList(ManualSign manualSign);
	
	/**
     * 新增签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	public int insertManualSign(ManualSign manualSign);
	
	/**
     * 修改签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	public int updateManualSign(ManualSign manualSign);
	
	/**
     * 批量删除签到
     * 
     * @param signIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteManualSignByIds(Integer[] signIds);
	
}