package com.appvengers.seoulapp.domain.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	CommonDao commonDao;
	
	@Override
	public List<Common> retrieveBankList() {
		return commonDao.retrieveBankList();
	}

	@Override
	public List<Common> retrieveTasteList() {
		return commonDao.retrieveTasteList();
	}

}
