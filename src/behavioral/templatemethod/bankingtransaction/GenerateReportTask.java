package behavioral.templatemethod.bankingtransaction;

public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}
