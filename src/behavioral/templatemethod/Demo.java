package behavioral.templatemethod;

import behavioral.templatemethod.bankingtransaction.TransferMoneyTask;

public class Demo {
   public static void show(){
       var task = new TransferMoneyTask();
       task.exceute();
   }
}
