package com.example.test.Service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.Model.Market;
import com.example.test.Model.MarketList;
import com.example.test.Model.Users;

public interface ResourceShopService {

	List<MarketList> list();

	List<MarketList> list(Long userId);

	void addResource(Long userId, Market market, MultipartFile file, Model model) throws Exception;

}
