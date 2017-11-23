package controllers;

import models.Operator;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
    	new Operator();
        render();

    }

}