package gof.designpatterns._02_structural_patterns._01_adapter._02_after;

import gof.designpatterns._02_structural_patterns._01_adapter._01_before.Account;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.AccountService;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.security.UserDetails;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
