package com.abhishek.loans.service.impl;

import com.abhishek.loans.client.ConfigProperties;
import com.abhishek.loans.config.LoansConfig;
import com.abhishek.loans.model.Loan;
import com.abhishek.loans.repository.LoanRepository;
import com.abhishek.loans.service.LoanService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final LoansConfig loansConfig;

    public LoanServiceImpl(LoanRepository loanRepository, LoansConfig loansConfig) {
        this.loanRepository = loanRepository;
        this.loansConfig = loansConfig;
    }


    @Override
    public List<Loan> findLoanDetails(int customerId) {
        return this.loanRepository.findByCustomerIdOrderByStartDtDesc(customerId);
    }

    @Override
    public Mono<ConfigProperties> getProperties() {
        ConfigProperties configProperties = new ConfigProperties(this.loansConfig.getMsg());
        return Mono.just(configProperties);
    }
}
