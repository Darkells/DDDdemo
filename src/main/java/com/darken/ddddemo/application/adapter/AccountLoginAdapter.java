package com.darken.ddddemo.application.adapter;

import com.darken.ddddemo.application.vo.AccountLoginVo;
import com.darken.ddddemo.domain.DO.AccountLoginDo;
import com.darken.ddddemo.domain.DO.AccountName;
import com.darken.ddddemo.domain.DO.AccountPassword;

/**
 * @author 86134
 */
public class AccountLoginAdapter {

   public static AccountLoginDo accountLoginVoToDo(AccountLoginVo accountLoginVo){
       AccountName name = new AccountName(accountLoginVo.getAccountName());
       AccountPassword password = new AccountPassword(accountLoginVo.getPassword());
       return new AccountLoginDo(name,password);
   }
}
