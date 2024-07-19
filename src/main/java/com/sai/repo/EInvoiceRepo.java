package com.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.model.EInvoice;
@Repository
public interface EInvoiceRepo extends JpaRepository<EInvoice, Integer> {

}
