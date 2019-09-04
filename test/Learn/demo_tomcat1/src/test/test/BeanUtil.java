package test.test;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import test.User;

import java.lang.reflect.InvocationTargetException;

public class BeanUtil {
    @Test
    public void test() throws InvocationTargetException, IllegalAccessException {
        User user = new User();
        BeanUtils.setProperty(user,"username","null");
    }
}
