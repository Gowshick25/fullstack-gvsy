package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CurdRepository;

@Repository
public class ProductRepository implements CurdRepository<Product>{
	
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	private JdbcTemplate template;

	@Override
	public int add(Product t) {
		String sql = "insert into gowshick_product values(?,?,?)";
		
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
	}

	@Override
	public List<Product> findAll() {
		String sql = "select * from gowshick_product";
		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	
	@Override
	public Product findById(int id)
	{ String sql="select * from gowshick_product where product_Id=?";
	return template.queryForObject(sql,
			BeanPropertyRowMapper.newInstance(Product.class),id);
	}

	@Override
	public int update( Product t) {
		String sql = "UPDATE gowshick_product SET Product_Name=?, price=? WHERE Product_id=?";
	    return template
	            .update(sql,
	           new Object[] { t.getProductName(),t.getPrice(),t.getProductId() });
	}

	@Override
	public int remove(int id) {
		String sql ="DELETE FROM gowshick_product WHERE product_id=?";
	    return template.update(sql,id);

	}
	
	
}