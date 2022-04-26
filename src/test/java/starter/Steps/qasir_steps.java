package starter.Steps;

import starter.Pages.qasir_pages;

public class qasir_steps {
    qasir_pages qp;

    public void openHomePage(){
        qp.open();
    }
    public void clickBtnFlag(){
        qp.btnFlag();
    }
    public void clickFlagIndo(){
        qp.indoFlag();
    }
    public void inputNumberPhone(){
        qp.phoneField();
    }
    public void inputPin(){
        qp.passField();
    }
    public void clickBtnLogin(){
        qp.btnLogin();
    }
    public void clickOutlet(){
        qp.outletField();
    }
    public void clickImageProfile(){
        qp.imgProfile();
    }
    public void clickButtonUserProfile(){
        qp.btnUserProfile();
    }
    public void changeLastName(){
        qp.lastname();
    }
    public void clickBtnSave(){
        qp.btnTextSave();
    }
    public void alertMessage(){
        qp.alertSave();
    }
}