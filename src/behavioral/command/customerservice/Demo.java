package behavioral.command.customerservice;

import behavioral.command.fx.Button;

public class Demo {
    public static void show(){
        var addCustomerCommand = new AddCustomerCommand(new CustomerService());
        var button = new Button(addCustomerCommand);
        button.click();
    }
}
