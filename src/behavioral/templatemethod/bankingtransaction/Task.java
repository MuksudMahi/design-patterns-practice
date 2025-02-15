package behavioral.templatemethod.bankingtransaction;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void exceute(){
        auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();
}
