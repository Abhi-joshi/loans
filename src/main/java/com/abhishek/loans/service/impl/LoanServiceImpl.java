package com.abhishek.loans.service.impl;

import com.abhishek.loans.model.Loan;
import com.abhishek.loans.repository.LoanRepository;
import com.abhishek.loans.service.LoanService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }


    @Override
    public Flux<Loan> findLoanDetails(int customerId) {
        return Flux.fromIterable(this.loanRepository.findByCustomerIdOrderByStartDtDesc(customerId));
    }
}
