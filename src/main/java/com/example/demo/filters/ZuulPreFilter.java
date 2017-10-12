package com.example.demo.filters;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.spi.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ZuulPreFilter extends ZuulFilter {
	
	
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		System.out.println("===========================================");
		System.out.println("Inside Pre Filter");
		System.out.println("===========================================");
		
		System.out.println("===========================================");
		System.out.println("%s request to %s " + request.getMethod() +"  request url " +  request.getRequestURL().toString());
		System.out.println("===========================================");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
