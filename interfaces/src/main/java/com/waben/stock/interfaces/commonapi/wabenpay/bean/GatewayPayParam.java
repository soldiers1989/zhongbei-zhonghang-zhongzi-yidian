package com.waben.stock.interfaces.commonapi.wabenpay.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayPayParam {
	/**
	 * 应用id
	 */
	@JsonProperty("AppId")
	private String appId;
	/**
	 * 用户ID
	 */
	@JsonProperty("User_id")
	private String userId;
	/**
	 * 签名
	 * <p>
	 * md5(AppId+appSecre+timestamp+out_order_no)大写
	 * </p>
	 */
	@JsonProperty("sign")
	private String sign;
	/**
	 * 版本号，目前为1.0
	 */
	@JsonProperty("version")
	private String version;
	/**
	 * 金额，单位元,小数精确到分
	 */
	@JsonProperty("total_fee")
	private BigDecimal totalFee;
	/**
	 * 商品名称
	 */
	@JsonProperty("subject")
	private String subject;
	/**
	 * 商品描述
	 */
	@JsonProperty("body")
	private String body;
	/**
	 * 接入方订单编号
	 */
	@JsonProperty("out_order_no")
	private String outOrderNo;
	/**
	 * 回调地址
	 */
	@JsonProperty("return_url")
	private String returnUrl;
	/**
	 * 前端回调url
	 */
	@JsonProperty("front_skip_url")
	private String frontSkipUrl;
	/**
	 * 时间戳，yyyyMMddHHmmss
	 */
	@JsonProperty("timestamp")
	private String timestamp;
	/**
	 * 银行缩写
	 */
	@JsonProperty("bank_code")
	private String bankCode;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getFrontSkipUrl() {
		return frontSkipUrl;
	}

	public void setFrontSkipUrl(String frontSkipUrl) {
		this.frontSkipUrl = frontSkipUrl;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}
