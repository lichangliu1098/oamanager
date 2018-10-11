package com.ruoyi.project.signManger.manualSign.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.signManger.manualSign.mapper.ManualSignMapper;
import com.ruoyi.project.signManger.manualSign.domain.ManualSign;
import com.ruoyi.project.signManger.manualSign.service.IManualSignService;
import com.ruoyi.common.support.Convert;

/**
 * 签到 服务层实现
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
@Service
public class ManualSignServiceImpl implements IManualSignService 
{
	@Autowired
	private ManualSignMapper manualSignMapper;

	/**
     * 查询签到信息
     * 
     * @param signId 签到ID
     * @return 签到信息
     */
    @Override
	public ManualSign selectManualSignById(Integer signId)
	{
	    return manualSignMapper.selectManualSignById(signId);
	}
	
	/**
     * 查询签到列表
     * 
     * @param manualSign 签到信息
     * @return 签到集合
     */
	@Override
	public List<ManualSign> selectManualSignList(ManualSign manualSign)
	{
	    return manualSignMapper.selectManualSignList(manualSign);
	}
	
    /**
     * 新增签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	@Override
	public int insertManualSign(ManualSign manualSign)
	{
	    return manualSignMapper.insertManualSign(manualSign);
	}
	
	/**
     * 修改签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	@Override
	public int updateManualSign(ManualSign manualSign)
	{
	    return manualSignMapper.updateManualSign(manualSign);
	}
	
	/**
     * 保存签到
     * 
     * @param manualSign 签到信息
     * @return 结果
     */
	@Override
	public int saveManualSign(ManualSign manualSign)
	{
	    Integer signId = manualSign.getSignId();
		int rows = 0;
		if (StringUtils.isNotNull(signId))
        {
		    rows = manualSignMapper.updateManualSign(manualSign);
		}
		else
        {
		    rows = manualSignMapper.insertManualSign(manualSign);
		}
		return rows;
	}
	
	/**
     * 删除签到对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteManualSignByIds(String ids)
	{
		return manualSignMapper.deleteManualSignByIds(Convert.toIntArray(ids));
	}
	
}
