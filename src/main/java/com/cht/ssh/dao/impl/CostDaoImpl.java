package com.cht.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.cht.ssh.dao.ICostDao;
import com.cht.ssh.entity.Cost;

@Transactional
public class CostDaoImpl implements ICostDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void saveCost(Cost cost) {
		System.out.println(1111111);
		hibernateTemplate.save(cost);
	}

}
