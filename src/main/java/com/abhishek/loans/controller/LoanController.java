package com.abhishek.loans.controller;

import com.abhishek.loans.client.ConfigProperties;
import com.abhishek.loans.model.Loan;
import com.abhishek.loans.service.LoanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("details/{customerId}")
    public List<Loan> loanDetails(@PathVariable int customerId){
        return this.loanService.findLoanDetails(customerId);
    }

    @GetMapping("/properties")
    public Mono<ConfigProperties> properties() {
        return loanService.getProperties();
    }
}
