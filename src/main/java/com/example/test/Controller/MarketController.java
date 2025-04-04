package com.example.test.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.Model.Market;
import com.example.test.Model.MarketList;
import com.example.test.Service.ResourceShopService;

@Controller
@RequestMapping("/shop")
public class MarketController {
	private final static String path = "shop/";

	@Autowired
	ResourceShopService resourceShopService;
	
	//전체 상점 목록
	@GetMapping("/list")
	String shopList(Model model) {
		List<MarketList> list = resourceShopService.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	//유저별 등록한 리소스 목록
	@GetMapping("{userId}/list")
	String MyshopList(@PathVariable Long userId, Model model, HttpSession session) {
		
		List<MarketList> list = resourceShopService.list(userId);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@PostMapping("{roleId}/add/{userId}")
	String uploadResource(@PathVariable Long roleId, @PathVariable Long userId, Market market, @RequestParam MultipartFile file, Model model) throws Exception {
		
		resourceShopService.addResource(userId, market, file, model);
		
		return path + roleId + "add";
	}
	
}
