package com.darken.ddddemo.application.query.adapter;

import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.domain.valueObject.AccountLogin;
import com.darken.ddddemo.domain.valueObject.AccountName;
import com.darken.ddddemo.domain.valueObject.AccountPassword;

/**
 * @author 86134
 */
public class AccountLoginAdapter {

   public static AccountLogin accountLoginVoToDp(AccountLoginVo accountLoginVo){
       AccountName name = new AccountName(accountLoginVo.getAccountName());
       AccountPassword password = new AccountPassword(accountLoginVo.getPassword());
       return new AccountLogin(name,password);
   }
}
