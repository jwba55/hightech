package com.example.test.Model;

//리소스 마켓 정보
public class Market {
	private ResourceShop resourceShop;
	private ResourceCategory resourceCategory;
	private ResourceSubCategory resourceSubCategory;
	
	public ResourceShop getResourceShop() {
		return resourceShop;
	}
	public void setResourceShop(ResourceShop resourceShop) {
		this.resourceShop = resourceShop;
	}
	public ResourceCategory getResourceCategory() {
		return resourceCategory;
	}
	public void setResourceCategory(ResourceCategory resourceCategory) {
		this.resourceCategory = resourceCategory;
	}
	public ResourceSubCategory getResourceSubCategory() {
		return resourceSubCategory;
	}
	public void setResourceSubCategory(ResourceSubCategory resourceSubCategory) {
		this.resourceSubCategory = resourceSubCategory;
	}
}
