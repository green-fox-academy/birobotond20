package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultipleBankAccountsController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public MultipleBankAccountsController() {
        this.bankAccounts.add(new BankAccount("Simba", 20000, "lion"));
        this.bankAccounts.add(new BankAccount("Timon", 5000, "meerkat"));
        this.bankAccounts.add(new BankAccount("Pumbaa", 6000, "common warthog"));
        this.bankAccounts.add(new BankAccount("Scar", 10000, "lion"));
        this.bankAccounts.add(new BankAccount("Zazu", 3000, "red-billed hornbill"));
        this.bankAccounts.add(new BankAccount("Rafiki", 7000, "mandrill"));
    }

    @GetMapping("/list_accounts")
    public String getAccounts(Model model){
        model.addAttribute("bankAccounts", this.bankAccounts);
        return "multiple_accounts";
    }
}
