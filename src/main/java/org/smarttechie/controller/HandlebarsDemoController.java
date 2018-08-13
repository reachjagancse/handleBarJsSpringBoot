package org.smarttechie.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.smarttechie.loader.HandlebarsDemoTemplateLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jknack.handlebars.Template;

@RestController
@RequestMapping("/")
public class HandlebarsDemoController {

	@Autowired
	private HandlebarsDemoTemplateLoader handlebarsDemoTemplateLoader;
	
	@RequestMapping(value="/home", method=RequestMethod.GET, produces="text/html")
	public String getHomeTemplate(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException {
		String responseJson = "{\"objects\":[{\n" + 
				"  \"id\": \"dashboard-wrapper-container1\",\n" + 
				"  \"type\": \"remix.common.div-control\",\n" + 
				"  \"input\": {\n" + 
				"    \"attributes\": {\n" + 
				"      \"id\": \"dashboard-wrapper-container\",\n" + 
				"      \"className\": \"dashboard-tab-group-wrap main-tab-wrap gssp-row\"\n" + 
				"    }\n" + 
				"  },\n" + 
				"  \"children\": [{\n" + 
				"    \"id\": \"application-root\",\n" + 
				"    \"type\": \"remix.common.div-control\",\n" + 
				"    \"input\": {\n" + 
				"      \"attributes\": {\n" + 
				"        \"id\": \"application-root\",\n" + 
				"        \"className\": \"dashboard-cards\"\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"children\": [{\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-2\",\n" + 
				"        \"type\": \"app.enrollmentForms\",\n" + 
				"        \"input\": {\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"You're eligible for great group benefits!\",\n" + 
				"          \"statusText\": \"learn all about these benefit plans and enroll in just a few steps. You can start now and finish any time within the enrollment period.\",\n" + 
				"          \"buttonLabel\": \"Let's Gets Started\",\n" + 
				"          \"linkLabel\": \"How Do I Enroll?\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"image\": \"/images/GroupPersonalAccident.png\",\n" + 
				"              \"field\": \"Group Personal Accident\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"              \"image\": \"/images/enrollment.png\",\n" + 
				"              \"field\": \"Group Credit Life/Bank Assurance\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"image\": \"/images/enrollment.png\",\n" + 
				"              \"field\": \"Group Life Insurance\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"3\",\n" + 
				"              \"image\": \"/images/GroupPension.png\",\n" + 
				"              \"field\": \"Group Pension\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card\",\n" + 
				"        \"input\": {\n" + 
				"          \"type\": \"app.infocard\",\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Personal Information\",\n" + 
				"          \"statusText\": \"To update this information call your HR Administrator at 1-XXX-XXX-XXXX.\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"label\": \"Name\",\n" + 
				"              \"field\": \"John Doe\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"              \"label\": \"Date of Birth\",\n" + 
				"              \"field\": \"11/11/1988\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"label\": \"Unique ID\",\n" + 
				"              \"field\": \"xxx-xx-2212\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"3\",\n" + 
				"              \"label\": \"Address\",\n" + 
				"              \"field\": \"101 MetLife Way\\r\\nCary, NC 27153\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-1\",\n" + 
				"        \"attributes\": {},\n" + 
				"        \"input\": {\n" + 
				"          \"type\": \"app.dependentInfo\",\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Dependents\",\n" + 
				"          \"statusText\": \"Save your time by checking your dependent Information before you start.\",\n" + 
				"          \"linkLabel\": \"ADD A DEPENDENT\",\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"name\": \"John Doe Dependent\",\n" + 
				"              \"relationship\": \"Spouse\",\n" + 
				"              \"dateofbirth\": \"11/11/1988\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"name\": \"Jason Joe Dependent\",\n" + 
				"              \"relationship\": \"Child\",\n" + 
				"              \"dateofbirth\": \" 11/11/2000\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-3\",\n" + 
				"        \"type\": \"app.enrollmentDocs\",\n" + 
				"        \"input\": {\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Enrollment Forms\",\n" + 
				"          \"linkLabel\": \"\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"label\": \"Enrollment Form - Pensions Plus\",\n" + 
				"              \"file\": \"/images/promo-skinny-clico-3-x.png\",\n" + 
				"              \"hidden\": true,\n" + 
				"              \"filetype\": \"pdf\",\n" + 
				"              \"filesize\": \"12KB\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"             \"label\": \"Enrollment Form - Pensions\",\n" + 
				"              \"file\": \"/images/promo-skinny-clico-3-x.png\",\n" + 
				"              \"hidden\": true,\n" + 
				"              \"filetype\": \"pdf\",\n" + 
				"              \"filesize\": \"11KB\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  }]\n" + 
				"},\n" + 
				"{\n" + 
				"  \"id\": \"dashboard-wrapper-container2\",\n" + 
				"  \"type\": \"remix.common.div-control\",\n" + 
				"  \"input\": {\n" + 
				"    \"attributes\": {\n" + 
				"      \"id\": \"dashboard-wrapper-container\",\n" + 
				"      \"className\": \"dashboard-tab-group-wrap main-tab-wrap gssp-row\"\n" + 
				"    }\n" + 
				"  },\n" + 
				"  \"children\": [{\n" + 
				"    \"id\": \"application-root\",\n" + 
				"    \"type\": \"remix.common.div-control\",\n" + 
				"    \"input\": {\n" + 
				"      \"attributes\": {\n" + 
				"        \"id\": \"application-root\",\n" + 
				"        \"className\": \"dashboard-cards\"\n" + 
				"      }\n" + 
				"    },\n" + 
				"    \"children\": [{\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-2\",\n" + 
				"        \"type\": \"app.enrollmentForms\",\n" + 
				"        \"input\": {\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"You're eligible for great group benefits!\",\n" + 
				"          \"statusText\": \"learn all about these benefit plans and enroll in just a few steps. You can start now and finish any time within the enrollment period.\",\n" + 
				"          \"buttonLabel\": \"Let's Gets Started\",\n" + 
				"          \"linkLabel\": \"How Do I Enroll?\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"image\": \"/images/GroupPersonalAccident.png\",\n" + 
				"              \"field\": \"Group Personal Accident\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"              \"image\": \"/images/enrollment.png\",\n" + 
				"              \"field\": \"Group Credit Life/Bank Assurance\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"image\": \"/images/enrollment.png\",\n" + 
				"              \"field\": \"Group Life Insurance\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"3\",\n" + 
				"              \"image\": \"/images/GroupPension.png\",\n" + 
				"              \"field\": \"Group Pension\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card\",\n" + 
				"        \"input\": {\n" + 
				"          \"type\": \"app.infocard\",\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Personal Information\",\n" + 
				"          \"statusText\": \"To update this information call your HR Administrator at 1-XXX-XXX-XXXX.\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"label\": \"Name\",\n" + 
				"              \"field\": \"John Doe\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"              \"label\": \"Date of Birth\",\n" + 
				"              \"field\": \"11/11/1988\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"label\": \"Unique ID\",\n" + 
				"              \"field\": \"xxx-xx-2212\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"3\",\n" + 
				"              \"label\": \"Address\",\n" + 
				"              \"field\": \"101 MetLife Way\\r\\nCary, NC 27153\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-1\",\n" + 
				"        \"attributes\": {},\n" + 
				"        \"input\": {\n" + 
				"          \"type\": \"app.dependentInfo\",\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Dependents\",\n" + 
				"          \"statusText\": \"Save your time by checking your dependent Information before you start.\",\n" + 
				"          \"linkLabel\": \"ADD A DEPENDENT\",\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"name\": \"John Doe Dependent\",\n" + 
				"              \"relationship\": \"Spouse\",\n" + 
				"              \"dateofbirth\": \"11/11/1988\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"2\",\n" + 
				"              \"name\": \"Jason Joe Dependent\",\n" + 
				"              \"relationship\": \"Child\",\n" + 
				"              \"dateofbirth\": \" 11/11/2000\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"id\": \"application-dashboard-quick-access-card-3\",\n" + 
				"        \"type\": \"app.enrollmentDocs\",\n" + 
				"        \"input\": {\n" + 
				"          \"className\": \"application-dashboard-card\",\n" + 
				"          \"cardTitle\": \"Enrollment Forms\",\n" + 
				"          \"linkLabel\": \"\",\n" + 
				"          \"attributes\": {},\n" + 
				"          \"data\": [{\n" + 
				"              \"id\": \"0\",\n" + 
				"              \"label\": \"Enrollment Form - Pensions Plus\",\n" + 
				"              \"file\": \"/images/promo-skinny-clico-3-x.png\",\n" + 
				"              \"hidden\": true,\n" + 
				"              \"filetype\": \"pdf\",\n" + 
				"              \"filesize\": \"12KB\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"1\",\n" + 
				"             \"label\": \"Enrollment Form - Pensions\",\n" + 
				"              \"file\": \"/images/promo-skinny-clico-3-x.png\",\n" + 
				"              \"hidden\": true,\n" + 
				"              \"filetype\": \"pdf\",\n" + 
				"              \"filesize\": \"11KB\"\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  }]\n" + 
				"}]\n" + 
				"}";
		
		JsonNode jsonNode = new ObjectMapper().readValue(responseJson, JsonNode.class);
		Template template = handlebarsDemoTemplateLoader.getTemplate("home");
		
		return template.apply(handlebarsDemoTemplateLoader.getContext(jsonNode));
	}
}
