package com.citibank.orders.info.service;

import com.citibank.orders.info.service.beans.OrderHistoryServiceReqBean;
import com.citibank.orders.info.service.beans.OrderHistoryServiceResBean;

public interface OrderHistoryService {
	OrderHistoryServiceResBean getOrderHistory(OrderHistoryServiceReqBean serviceReq);

}

