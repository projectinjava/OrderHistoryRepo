package com.citibank.orders.info.process;

import com.citibank.orders.info.process.beans.OrderHistoryProcessReqBean;
import com.citibank.orders.info.process.beans.OrderHistoryProcessResBean;

public interface OrderHistoryProcess {
	
	OrderHistoryProcessResBean getOrderHistory(OrderHistoryProcessReqBean processReq);

}
