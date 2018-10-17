package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {
	@Autowired
	private LoadBalancerClient loadbalancer;
	
	@GetMapping("/employee1")
	
	public String details()
	{
		
		
		final String uri="http://localhost:9005/employee";
		RestTemplate restTemplate=new RestTemplate();
		String result=restTemplate.getForObject(uri, String.class);
		return result;
		
	}
	/*@Autowired
	private DiscoveryClient discoveryClient;
	
	public void getEmployee() throws RestClientException, IOException {
		
		List<ServiceInstance> instances=discoveryClient.getInstances("emp-producer");
		ServiceInstance serviceInstance=instances.get(0);
		
		String baseUrl=serviceInstance.getUri().toString();
		
		baseUrl=baseUrl+"/employee";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}*/

}
