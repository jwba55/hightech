package com.example.test.Model;

//주문내역
public class OrdersDetails {
	private Long ordersDetailsId;
	private ResourceShop resourceShop;
	private Orders orders;
	private Counting counting;
	
	public Long getOrdersDetailsId() {
		return ordersDetailsId;
	}
	public void setOrdersDetailsId(Long ordersDetailsId) {
		this.ordersDetailsId = ordersDetailsId;
	}
	public ResourceShop getResourceShop() {
		return resourceShop;
	}
	public void setResourceShop(ResourceShop resourceShop) {
		this.resourceShop = resourceShop;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Counting getCounting() {
		return counting;
	}
	public void setCounting(Counting counting) {
		this.counting = counting;
	}

}
