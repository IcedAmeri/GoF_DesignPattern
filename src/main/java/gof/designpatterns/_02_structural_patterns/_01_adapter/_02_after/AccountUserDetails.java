package gof.designpatterns._02_structural_patterns._01_adapter._02_after;

import gof.designpatterns._02_structural_patterns._01_adapter._01_before.Account;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
