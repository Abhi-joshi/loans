package com.abhishek.loans.service;

import com.abhishek.loans.model.Loan;
import reactor.core.publisher.Flux;

public interface LoanService {

    Flux<Loan> findLoanDetails(int customerId);
}
