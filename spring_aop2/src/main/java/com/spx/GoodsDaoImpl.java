package com.spx;

import com.spx.GoodsDao;
import org.springframework.stereotype.Component;

@Component
public class GoodsDaoImpl  implements GoodsDao {


	@Override
	public void save() {
		/* check(); */
		System.out.println("保存操作");
	}

	@Override
	public void delete() {
		System.out.println("删除操作");
	}

	@Override
	public String update() {
		System.out.println("更新操作");
		return "update success";
	}

	@Override
	public void find() {
		System.out.println("find");
		int i = 1 / 0;
	}


}
