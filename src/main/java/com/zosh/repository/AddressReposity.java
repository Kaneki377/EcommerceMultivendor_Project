package com.zosh.repository;

import com.zosh.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressReposity extends JpaRepository<Address,Long> {

}
