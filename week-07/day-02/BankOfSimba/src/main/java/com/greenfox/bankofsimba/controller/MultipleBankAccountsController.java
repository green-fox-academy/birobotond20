package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultipleBankAccountsController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public MultipleBankAccountsController() {
        this.bankAccounts.add(new BankAccount("Simba", 20000, "lion", true, true));
        this.bankAccounts.add(new BankAccount("Timon", 5000, "meerkat", false, true));
        this.bankAccounts.add(new BankAccount("Pumbaa", 6000, "common warthog", false, true));
        this.bankAccounts.add(new BankAccount("Scar", 10000, "lion", false, false));
        this.bankAccounts.add(new BankAccount("Zazu", 3000, "red-billed hornbill", false, true));
        this.bankAccounts.add(new BankAccount("Rafiki", 7000, "mandrill", false, true));
    }

    @GetMapping("/list_accounts")
    public String getAccounts(Model model) {
        model.addAttribute("newAccount", new BankAccount());
        model.addAttribute("bankAccounts", this.bankAccounts);
        return "multiple_accounts";
    }

    @PostMapping("/raise")
    public String raiseAccountBalance(Integer index) {
        this.bankAccounts.get(index).raiseBalance();
        return "redirect:/list_accounts";
    }

    @PostMapping("/add_account")
    public String addNewAccount(BankAccount newBankAccount) {
        if (newBankAccount != null && !(newBankAccount.getName().isEmpty())){
            this.bankAccounts.add(newBankAccount);
        }
        return "redirect:/list_accounts";
    }
}