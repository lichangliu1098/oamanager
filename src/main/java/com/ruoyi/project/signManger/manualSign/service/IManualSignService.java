package com.ruoyi.project.signManger.manualSign.service;

import com.ruoyi.project.signManger.manualSign.domain.ManualSign;
import java.util.List;

/**
 * 签到 服务层
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
public interface IManualSignService 
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
     * 保存签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	public int saveManualSign(ManualSign manualSign);
	
	
	/**
     * 删除签到信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteManualSignByIds(String ids);
	
}
