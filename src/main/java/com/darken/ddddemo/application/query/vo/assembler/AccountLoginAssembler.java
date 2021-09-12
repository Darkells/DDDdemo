package com.darken.ddddemo.application.query.vo.assembler;

import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.domain.valueObject.AccountLogin;
import com.darken.ddddemo.domain.valueObject.AccountName;
import com.darken.ddddemo.domain.valueObject.AccountPassword;

/**
 * @author 86134
 */
public class AccountLoginAssembler {

   public static AccountLogin toDp(AccountLoginVo accountLoginVo){
       AccountName name = new AccountName(accountLoginVo.getAccountName());
       AccountPassword password = new AccountPassword(accountLoginVo.getPassword());
       return new AccountLogin(name,password);
   }
}
