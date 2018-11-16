package com.citibank.orders.info.service.beans;

public class OrderHistoryServiceReqBean {
	private ClientContext clientContext;
	private CardDetails cardDetails;
	private DateRange dateRange;
	private OrdersInfo ordersInfo;
	private ServiceDetails serviceDetails;
	public ClientContext getClientContext() {
		return clientContext;
	}
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public CardDetails getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}
	public DateRange getDateRange() {
		return dateRange;
	}
	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}
	public OrdersInfo getOrdersInfo() {
		return ordersInfo;
	}
	public void setOrdersInfo(OrdersInfo ordersInfo) {
		this.ordersInfo = ordersInfo;
	}
	public ServiceDetails getServiceDetails() {
		return serviceDetails;
	}
	public void setServiceDetails(ServiceDetails serviceDetails) {
		this.serviceDetails = serviceDetails;
	}
	@Override
	public String toString() {
		return "OrderHistoryServiceReqBean [clientContext=" + clientContext + ", cardDetails=" + cardDetails
				+ ", dateRange=" + dateRange + ", ordersInfo=" + ordersInfo + ", serviceDetails=" + serviceDetails
				+ "]";
	}
	
	
	
	

}
