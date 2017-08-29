package com.awarti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Plan")
public class Plan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1669809586163753475L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "short_name")
	private String short_name;
	@Column(name = "partnercode")
	private String partnercode;
	@Column(name = "price_code")
	private String price_code;
	@Column(name = "duration")
	private Integer duration;
	
	@Column(name = "duration_unit")
	private String duration_unit;
	@Column(name = "trial_days")
	private Integer trial_days;
	@Column(name = "refund_days")
	private Integer refund_days;
	@Column(name = "renewal_days")
	private Integer renewal_days;
	@Column(name = "recurring")
	private Integer recurring;
	
	@Column(name = "services")
	private String services;
	
	@Column(name = "status")
	private Integer status;
	@Column(name = "ptype")
	private String ptype;
	@Column(name = "addongroup")
	private String addongroup;
	@Column(name = "locked")
	private Integer locked;
	@Column(name = "is_upgradable")
	private Integer is_upgradable;
	@Column(name = "description")
	private String description;
	@Column(name = "mailer_descr")
	private String mailer_descr;
	@Column(name = "term_url")
	private String term_url;
	@Column(name = "app_ids")
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
	public String getServices() {
		return services;
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
