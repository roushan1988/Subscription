package com.awarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.awarti.bean.PlanBean;
import com.awarti.model.Plan;
import com.awarti.service.PlanService;

@Controller
public class PlanController {
   @Autowired 
   private PlanService planService;
   @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savePlan(@ModelAttribute("command") PlanBean planBean, 
			BindingResult result) {
		Plan plan = prepareModel(planBean);
		planService.addPlan(plan);
		return new ModelAndView("redirect:/add.html");
	}
   @RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addPlan(@ModelAttribute("command")  PlanBean planBean,
			BindingResult result) {
		/*Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));*/
		return new ModelAndView("addPlan");
	}
   @RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	private Plan prepareModel(PlanBean planBean){
		Plan plan = new Plan();
		plan.setCode(planBean.getCode());
		plan.setName(planBean.getName());
		plan.setShort_name(planBean.getShort_name());
		plan.setPartnercode(planBean.getPartnercode());
		plan.setPrice_code(planBean.getPrice_code());
		plan.setDuration(planBean.getDuration());
		
		plan.setDuration_unit(planBean.getDuration_unit());
		plan.setTrial_days(planBean.getTrial_days());
		plan.setRefund_days(planBean.getRefund_days());
		plan.setRenewal_days(planBean.getRenewal_days());
		plan.setRecurring(planBean.getRecurring());
		
		plan.setServices(planBean.getServices());
		
		plan.setStatus(planBean.getStatus());
		plan.setPtype(planBean.getPtype());
		plan.setAddongroup(planBean.getAddongroup());
		plan.setLocked(planBean.getLocked());
		plan.setIs_upgradable(planBean.getIs_upgradable());
		plan.setDescription(planBean.getDescription());
		plan.setMailer_descr(planBean.getMailer_descr());
		plan.setTerm_url(planBean.getTerm_url());
		plan.setApp_ids(planBean.getApp_ids());
		plan.setId(plan.getId());
		plan.setId(null);
		return plan;
	}
}
