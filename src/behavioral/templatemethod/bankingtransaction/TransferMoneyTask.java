package behavioral.templatemethod.bankingtransaction;

public class TransferMoneyTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
