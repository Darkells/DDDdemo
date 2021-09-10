package com.darken.ddddemo.application.query.adapter;

import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.infrastructure.db.dataObject.AccountLoginDo;
import com.darken.ddddemo.infrastructure.db.dataObject.AccountName;
import com.darken.ddddemo.infrastructure.db.dataObject.AccountPassword;

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
