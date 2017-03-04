package google_servises.email;

import google_servises.common.action.ActionSignIn;
import org.junit.Test;

/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class TestRegistration {
    /**
     * Тест проверяет регистрацию нового аккаунта.
     * Сценарий.
     * 1.
     */
    @Test
    public void testRegistration(){
       ActionSignIn.signin();
    }
}
