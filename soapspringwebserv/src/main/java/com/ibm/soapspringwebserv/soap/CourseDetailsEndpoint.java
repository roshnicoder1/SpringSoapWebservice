package com.ibm.soapspringwebserv.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ibm.com.courses.CourseDetails;
import ibm.com.courses.GetCourseDetailsRequest;
import ibm.com.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {
	

	// method
	// input - GetCourseDetailsRequest
	// output - GetCourseDetailsResponse

	// http://www.com.ibm/courses
	// GetCourseDetailsRequest
	//public @interface PayloadRoot
	//Marks an endpoint method as the handler for an incoming request. The annotation values signify the the request payload root element that is handled by the method.
	//payloadroot tells webservice we have to process this namespace with this request
	//It supports http://www.com.ibm/courses namespace and GetCourseDetailsRequest,GetCourseDetailsResponse that we defined in course-details.xsd 
	//@PayloadRoot(namespace = "http://www.com.ibm/courses", localPart = "GetCourseDetailsRequest")
	// method
		// input - GetCourseDetailsRequest
		// output - GetCourseDetailsResponse

		// http://in28minutes.com/courses
		// GetCourseDetailsRequest
		@PayloadRoot(namespace = "http://www.com.ibm/courses", localPart = "GetCourseDetailsRequest")
		@ResponsePayload
		public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
			GetCourseDetailsResponse response = new GetCourseDetailsResponse();
			
			CourseDetails courseDetails = new CourseDetails();
			courseDetails.setId(request.getId());
			courseDetails.setName("Microservices Course");
			courseDetails.setDescription("That would be a wonderful course!");
			
			response.setCourseDetails(courseDetails);
			
			return response;
		}

}
