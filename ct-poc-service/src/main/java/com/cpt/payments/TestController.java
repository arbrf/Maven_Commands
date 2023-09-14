package com.cpt.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, World!";
	    }
	 @GetMapping("/addGet")
	public int addGet(@RequestParam(value="num1")int val1,@RequestParam(value="num2")int val2) {
		System.out.println("Calling addGet : : Val1: "+val1+" Val2 : "+val2);
		int res=val1+val2;
		System.out.println("Add res= "+res);
		return res;
	}
	public String initPayment(int paymentMethod, int amount, String Curr) {
		return "Payment Processed Successful";
	}
	 @PostMapping("/addPost")
		public int addPost(@RequestParam(value="num1")int val1,@RequestParam(value="num2")int val2) {
			System.out.println("Calling : :addPost: :Val1: "+val1+" Val2 : "+val2);
			int res=val1+val2;
			System.out.println("Add res= "+res);
			return res;
		}

}
