package com.cht.ssh.action;

import com.cht.ssh.dao.ICostDao;
import com.cht.ssh.entity.Cost;
import com.opensymphony.xwork2.ActionSupport;

public class CostAction extends ActionSupport {
	private String username;
    private ICostDao dao;
    
	public ICostDao getDao() {
		return dao;
	}

	public void setDao(ICostDao dao) {
		this.dao = dao;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    public String execute() {
    	System.out.println(username);
    	Cost cost=new Cost();
    	cost.setCost_id(111);
    	cost.setName("test ssh");;
    	dao.saveCost(cost);
		return "cost";
    	
    }
}
