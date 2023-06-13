package com.abhishek.loans.service;

import com.abhishek.loans.client.ConfigProperties;
import com.abhishek.loans.model.Loan;
import reactor.core.publisher.Mono;

import java.util.List;

public interface LoanService {

    List<Loan> findLoanDetails(int customerId);
    Mono<ConfigProperties> getProperties();
}
