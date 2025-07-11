package com.zosh.repository;

import com.zosh.domain.AccountStatus;
import com.zosh.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Seller findByEmail(String email); // SELECT * FROM seller WHERE email = ? LIMIT 1
    List<Seller> findByAccountStatus(AccountStatus accountStatus);
}
