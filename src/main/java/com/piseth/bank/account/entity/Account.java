package com.piseth.bank.account.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection= "accounts")
@Data
public class Account {

    private String accountNumber;
    private String customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
    private LocalDate updateDate;
}
