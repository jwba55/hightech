package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.Model.MarketCategory;
import com.example.test.Model.ResourceSubCategory;
import com.example.test.Service.ShopCategoryService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private final static String path = "admin/";
	
	@Autowired
	ShopCategoryService shopCategoryService;
	
	@GetMapping("/index")
	String getAdmin() {
		
		return path + "index";
	}
	
	//리소스 상점 카테고리 전부 불러오기
	@GetMapping("/shop")
	String list(Model model) {
		List<MarketCategory> list = shopCategoryService.list();
		
		model.addAttribute("list", list);
		
		return path + "shop";
	}
	
	//리소스 상점 세부 카테고리 정보 불러오기
	@GetMapping("/shop/{resourceCategoryId}")
	String getAdminShop(@PathVariable Long resourceCategoryId, Model model) {
		
		MarketCategory item = shopCategoryService.item(resourceCategoryId);
		
		model.addAttribute("item", item);
		
		return path + "shop";
	}
	
	//리소스 상점 세부 카테고리 변경하기
	@PostMapping("/shop/{resourceCategoryId}")
	String updateAdminShop(@PathVariable Long resourceCategoryId, MarketCategory item) {
		item.getResourceCategory().setResourceCategoryId(resourceCategoryId);
		
		shopCategoryService.updateAdminCategory(item);
		
		return path + "shop";
	}
	
	//리소스 상점 카테고리 추가
	@PostMapping("/shop/add")
	String addAdminShop(MarketCategory item) {
		
		shopCategoryService.addAdminCategory(item);
		
		return path + "shop";
	}
	
	//리소스 상점 카테고리 추가 페이지
	@GetMapping("/shop/add")
	String getAddAdminShop() {
		
		return path + "shop/add";
	}
	
	

}
