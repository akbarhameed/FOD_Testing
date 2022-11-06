package mwgl.fod.bean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class MyOrderBean {
    public MyOrderBean() {
    }

    public void invokeCancelOrder(ActionEvent actionEvent) {
        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("cancelOrder");
        ob.execute();
    }
}
