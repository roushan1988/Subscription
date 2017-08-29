package com.awarti.bean;

public class PlanBean {
	private Integer id;
	private String code;
	private String name;
	private String short_name;
	private String partnercode;
	private String price_code;
	private Integer duration;
	
	private String duration_unit;
	private Integer trial_days;
	private Integer refund_days;
	private Integer renewal_days;
	private Integer recurring;
	
	private String services;
	private Integer status;
	private String ptype;
	private String addongroup;
	private Integer locked;
	private Integer is_upgradable;
	private String description;
	private String mailer_descr;
	private String term_url;
	private String app_ids;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getPartnercode() {
		return partnercode;
	}
	public void setPartnercode(String partnercode) {
		this.partnercode = partnercode;
	}
	public String getPrice_code() {
		return price_code;
	}
	public void setPrice_code(String price_code) {
		this.price_code = price_code;
	}
	public String getServices() {
		return services;
	}
	
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	
	
	public String getDuration_unit() {
		return duration_unit;
	}
	public void setDuration_unit(String duration_unit) {
		this.duration_unit = duration_unit;
	}
	public Integer getTrial_days() {
		return trial_days;
	}
	public void setTrial_days(Integer trial_days) {
		this.trial_days = trial_days;
	}
	public Integer getRefund_days() {
		return refund_days;
	}
	public void setRefund_days(Integer refund_days) {
		this.refund_days = refund_days;
	}
	public Integer getRenewal_days() {
		return renewal_days;
	}
	public void setRenewal_days(Integer renewal_days) {
		this.renewal_days = renewal_days;
	}
	public Integer getRecurring() {
		return recurring;
	}
	public void setRecurring(Integer recurring) {
		this.recurring = recurring;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getAddongroup() {
		return addongroup;
	}
	public void setAddongroup(String addongroup) {
		this.addongroup = addongroup;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public Integer getIs_upgradable() {
		return is_upgradable;
	}
	public void setIs_upgradable(Integer is_upgradable) {
		this.is_upgradable = is_upgradable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMailer_descr() {
		return mailer_descr;
	}
	public void setMailer_descr(String mailer_descr) {
		this.mailer_descr = mailer_descr;
	}
	public String getTerm_url() {
		return term_url;
	}
	public void setTerm_url(String term_url) {
		this.term_url = term_url;
	}
	public String getApp_ids() {
		return app_ids;
	}
	public void setApp_ids(String app_ids) {
		this.app_ids = app_ids;
	}
	
}
