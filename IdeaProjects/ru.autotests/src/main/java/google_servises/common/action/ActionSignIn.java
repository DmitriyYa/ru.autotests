package google_servises.common.action;

import google_servises.common.page.PageStartUp;

/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class ActionSignIn {

    public static void signin() {
        PageStartUp.buttonSignIn().click();

    }
}
