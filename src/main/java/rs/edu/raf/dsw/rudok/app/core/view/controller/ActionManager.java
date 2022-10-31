package rs.edu.raf.dsw.rudok.app.core.view.controller;

public class ActionManager {

    private StudentInfoAction studentInfoAction;

    public ActionManager() {
        initActions();
    }

    public void initActions(){
        studentInfoAction = new StudentInfoAction();
    }

    public StudentInfoAction getStudentInfoAction() {
        return studentInfoAction;
    }
}
