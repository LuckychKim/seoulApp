package com.appvengers.seoulapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.user.LoginInfo;
import com.appvengers.seoulapp.domain.user.User;
import com.appvengers.seoulapp.domain.user.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger( UserController.class );
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public List<LoginInfo> loginOrJoin(@RequestBody User user) {
		return userService.loginOrJoin(user);
	}
	
	
	
//	@PostMapping("/user/login")
//	public boolean login(HttpServletRequest request, HttpServletResponse response) {
//		try {
//			// 1. 함수 호출 및 입력 param 분석
//			BufferedReader bf = request.getReader();
//			if(bf == null){
//				LOGGER.debug("buffer = null");
//				//System.out.println("buffer = null");
//				return false;
//			}
//			
//			///Object obj = JSONValue.parse(bf);t
//			JSONObject param = (JSONObject)JSONValue.parse(bf);
//			if(param != null)
//			{
//				Iterator it = param.keySet().iterator();
//				while(it.hasNext())
//				{
//					String key = (String) it.next();
//					LOGGER.debug("key : " + key);
//				}
//			}
//			JSONObject jsonUserProfile = (JSONObject)param.get("login");
//			ObjectMapper mapper = new ObjectMapper();
//			Map userProfile = mapper.readValue(jsonUserProfile.toString(), new TypeReference<Map<String, Object>>() {});
//			
//			//2. Data 가져오기
//			List resultList = userDao.login(userProfile);
//			
//			//3. 결과 값
//			JSONObject json = new JSONObject();
//			String result = "success";
//			JSONArray dataTable = new JSONArray();
//			for(int i = 0; i < resultList.size(); i++)
//			{
//				JSONObject dataRow = new JSONObject();
//				LinkedHashMap<String, Object> row = (LinkedHashMap<String, Object>) resultList.get(i);
//				for(String key : row.keySet()){
//					dataRow.put(key, row.get(key));
//				}
//				dataTable.add(dataRow);
//			}
//			json.put("dataTable", dataTable);
//			json.put("result", "success");
//			response.setContentType("application/json");
//			response.setCharacterEncoding("UTF-8");
//			//response.getWriter().write(json.toString());
//			response.getOutputStream().print(json.toString());
//			//response.getOutputStream().
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		return true;
//	}
//	
//	@RequestMapping("/test/testMethod2")
//	public void login2(HttpServletRequest request, HttpServletResponse response) {
//		LOGGER.debug("login2");
//	
//	}
	

}
