package controller;

import java.text.ParseException;
import model.RegisterModel;
import view.RegisterView;

public interface IRegisterController{
	public void notifyView(RegisterModel form);
	public void addUser(RegisterView form) throws ParseException;
}
