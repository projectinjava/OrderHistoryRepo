package com.citibank.orders.info.dao;

import com.citibank.orders.info.dao.beans.OrderHistoryDAOReqBean;
import com.citibank.orders.info.dao.beans.OrderHistoryDAOResBean;

public interface OrderHistoryDAO {
	OrderHistoryDAOResBean getOrderHistory(OrderHistoryDAOReqBean daoReq);

}
