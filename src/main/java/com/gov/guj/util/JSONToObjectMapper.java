package com.tablabs.util;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class JSONToObjectMapper {
	
//	public SMSObjectResponse jsonToObjectMapper(String json) throws JsonParseException, JsonMappingException, IOException{
//		ObjectMapper mapper = new ObjectMapper();//"{'name' : 'mkyong'}"
//		SMSObjectResponse obj = mapper.readValue(json, SMSObjectResponse.class);
//		return obj;
//	}
	
//	public String objectToJson(SMSObjectResponse smsObjectResponse) throws JsonProcessingException{
//		ObjectMapper mapper = new ObjectMapper();
//		 String jsonString = mapper.writeValueAsString(smsObjectResponse);
//		 return jsonString;
//	}
//	
	
	
}
