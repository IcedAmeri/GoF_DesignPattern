package gof.designpatterns._02_structural_patterns._01_adapter._02_after;

import gof.designpatterns._02_structural_patterns._01_adapter._01_before.AccountService;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.security.LoginHandler;
import gof.designpatterns._02_structural_patterns._01_adapter._01_before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("keesun", "keesun");
        System.out.println("login = " + login);
    }
}
