package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Product;
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
	public Optional<Product> findbyId(int id) {
		
		Optional<Product> opt = Optional.empty();
		try {
			String sql ="Select * from gowshick_product where product_id= ? ";
			Product prd= template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Product.class),id);
			opt=Optional.of(prd);
		} catch (Exception e) {
			
		}
		return opt;
	}

	@Override
	public int update( Product t) {
		String sql = "UPDATE Gowshick_product SET Product_Name=?, price=? WHERE Product_id=?";
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