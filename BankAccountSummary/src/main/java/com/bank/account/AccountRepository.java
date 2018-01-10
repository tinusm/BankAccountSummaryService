package com.bank.account;

import org.springframework.data.repository.CrudRepository;

import com.bank.account.Account;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AccountRepository extends CrudRepository<Account, Long> {

}
