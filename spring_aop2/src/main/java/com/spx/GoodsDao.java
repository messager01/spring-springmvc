package com.spx;

import org.springframework.stereotype.Component;


public interface GoodsDao {
	
	void save();

	void delete();


	String update();

	void find();

}
