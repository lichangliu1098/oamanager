package com.ruoyi.project.signManger.workTime.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.project.signManger.workTime.domain.WorkTime;
import com.ruoyi.project.signManger.workTime.service.IWorkTimeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 上下班时间 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
@Controller
@RequestMapping("/signManger/workTime")
public class WorkTimeController extends BaseController
{
    private String prefix = "signManger/workTime";
	
	@Autowired
	private IWorkTimeService workTimeService;
	
	@RequiresPermissions("signManger:workTime:view")
	@GetMapping()
	public String workTime()
	{
	    return prefix + "/workTime";
	}
	
	/**
	 * 查询上下班时间列表
	 */
	@RequiresPermissions("signManger:workTime:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(WorkTime workTime)
	{
		startPage();
        List<WorkTime> list = workTimeService.selectWorkTimeList(workTime);
		return getDataTable(list);
	}
	
	/**
	 * 新增上下班时间
	 */
	@RequiresPermissions("signManger:workTime:add")
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}

	/**
	 * 修改上下班时间
	 */
	@RequiresPermissions("signManger:workTime:edit")
	@GetMapping("/edit/{worktimeId}")
	public String edit(@PathVariable("worktimeId") Integer worktimeId, Model model)
	{
		WorkTime workTime = workTimeService.selectWorkTimeById(worktimeId);
		model.addAttribute("workTime", workTime);
	    return prefix + "/edit";
	}
	
	/**
	 * 保存上下班时间
	 */
	@RequiresPermissions("signManger:workTime:save")
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(WorkTime workTime)
	{
		if (workTimeService.saveWorkTime(workTime) > 0)
		{
			return success();
		}
		return error();
	}
	
	/**
	 * 删除上下班时间
	 */
	@RequiresPermissions("signManger:workTime:remove")
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		int rows = workTimeService.deleteWorkTimeByIds(ids);
		if (rows > 0)
        {
            return success();
        }
        return error();
	}
	
}
