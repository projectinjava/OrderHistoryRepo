package com.citibank.orders.info.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.citibank.orders.info.process.OrderHistoryProcess;
import com.citibank.orders.info.process.beans.OrderDetailsProcessBean;
import com.citibank.orders.info.process.beans.OrderHistoryProcessReqBean;
import com.citibank.orders.info.process.beans.OrderHistoryProcessResBean;
import com.citibank.orders.info.process.impl.OrderHistoryProcessImpl;
import com.citibank.orders.info.service.OrderHistoryService;
import com.citibank.orders.info.service.beans.OrderHistory;
import com.citibank.orders.info.service.beans.OrderHistoryDetails;
import com.citibank.orders.info.service.beans.OrderHistoryServiceReqBean;
import com.citibank.orders.info.service.beans.OrderHistoryServiceResBean;
import com.citibank.orders.info.service.beans.StatusBlock;

public class OrderHistoryServiceImpl implements OrderHistoryService {

	public OrderHistoryServiceResBean getOrderHistory(OrderHistoryServiceReqBean serviceReq) {
	
		
		//1. get the request from consumer
		
		//2. validate the request
		
		//3. prepare the  process request
			
		//4. create the process object
		
		//5. call the processorder method and get the response
		
		OrderHistoryProcessReqBean processReq = new OrderHistoryProcessReqBean();
		OrderHistoryProcess process = new OrderHistoryProcessImpl();
		
		OrderHistoryProcessResBean processResp  = process.getOrderHistory(processReq);
		
	
		
		//6. prepare the service layer response
		
		OrderHistoryServiceResBean serviceResp = new OrderHistoryServiceResBean();
		
		StatusBlock  statusBlock = new StatusBlock();
		statusBlock.setRespCode(processResp.getRespCode());
		statusBlock.setRespMessage(processResp.getRespMesssage());
		
		OrderHistoryDetails orderDetails = new OrderHistoryDetails();
		List<OrderHistory> orderHistoryList = new ArrayList<OrderHistory>();
		
		List<OrderDetailsProcessBean> processOrderList = processResp.getOrderDetailsProcessBean();
		for(OrderDetailsProcessBean orderDetailsProcessBean : processOrderList) {
			
			OrderHistory orderHistory = new OrderHistory();
			orderHistory.setOid(orderDetailsProcessBean.getOid());
			orderHistory.setName(orderDetailsProcessBean.getName());
			orderHistory.setDesc(orderDetailsProcessBean.getDesc());
			orderHistory.setDate(orderDetailsProcessBean.getDate());
			orderHistory.setPrice(orderDetailsProcessBean.getPrice());
			orderHistory.setStatus(orderDetailsProcessBean.getStatus());
			orderHistory.setType(orderDetailsProcessBean.getType());
			orderHistoryList.add(orderHistory);
			
		}
		orderDetails.setOrderHistory(orderHistoryList);
		
		//7. set the serviceResp using processResp	
		
		serviceResp.setStatusBlock(statusBlock);
		serviceResp.setOrderHistoryDetails(orderDetails);
		
		return serviceResp;
	}

}
