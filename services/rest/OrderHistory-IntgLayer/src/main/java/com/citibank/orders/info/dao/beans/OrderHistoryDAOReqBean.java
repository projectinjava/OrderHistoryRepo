package com.citibank.orders.info.dao.beans;

public class OrderHistoryDAOReqBean {
	
	private String cardNumber;
	private String clientId;
	private String channelId;
	private String startDate;
	private String endDate;
	private String typeOfOrder;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTypeOfOrder() {
		return typeOfOrder;
	}
	public void setTypeOfOrder(String typeOfOrder) {
		this.typeOfOrder = typeOfOrder;
	}
	@Override
	public String toString() {
		return "OrderHistoryDAOReqBean [cardNumber=" + cardNumber + ", clientId=" + clientId + ", channelId="
				+ channelId + ", startDate=" + startDate + ", endDate=" + endDate + ", typeOfOrder=" + typeOfOrder
				+ "]";
	}
	
	
	

}
