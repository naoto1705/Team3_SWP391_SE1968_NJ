package com.example.PCOnlineShop.repository.account;

import com.example.PCOnlineShop.model.account.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Page<Account> findAllByRole(String role, Pageable pageable);
}

