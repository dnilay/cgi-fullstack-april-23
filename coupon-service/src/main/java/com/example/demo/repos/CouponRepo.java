package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	@Query
	Coupon findByCode(String code);

}
