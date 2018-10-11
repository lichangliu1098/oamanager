package com.ruoyi.project.signManger.manualSign.controller;

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
import com.ruoyi.project.signManger.manualSign.domain.ManualSign;
import com.ruoyi.project.signManger.manualSign.service.IManualSignService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 签到 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-10-10
 */
@Controller
@RequestMapping("/signManger/manualSign")
public class ManualSignController extends BaseController
{
    private String prefix = "signManger/manualSign";
	
	@Autowired
	private IManualSignService manualSignService;
	
	@RequiresPermissions("signManger:manualSign:view")
	@GetMapping()
	public String manualSign()
	{
	    return prefix + "/manualSign";
	}
	
	/**
	 * 查询签到列表
	 */
	@RequiresPermissions("signManger:manualSign:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ManualSign manualSign)
	{
		startPage();
        List<ManualSign> list = manualSignService.selectManualSignList(manualSign);
		return getDataTable(list);
	}
	
	/**
	 * 新增签到
	 */
	@RequiresPermissions("signManger:manualSign:add")
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}

	/**
	 * 修改签到
	 */
	@RequiresPermissions("signManger:manualSign:edit")
	@GetMapping("/edit/{signId}")
	public String edit(@PathVariable("signId") Integer signId, Model model)
	{
		ManualSign manualSign = manualSignService.selectManualSignById(signId);
		model.addAttribute("manualSign", manualSign);
	    return prefix + "/edit";
	}
	
	/**
	 * 保存签到
	 */
	@RequiresPermissions("signManger:manualSign:save")
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(ManualSign manualSign)
	{
		if (manualSignService.saveManualSign(manualSign) > 0)
		{
			return success();
		}
		return error();
	}
	
	/**
	 * 删除签到
	 */
	@RequiresPermissions("signManger:manualSign:remove")
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		int rows = manualSignService.deleteManualSignByIds(ids);
		if (rows > 0)
        {
            return success();
        }
        return error();
	}
	
}
