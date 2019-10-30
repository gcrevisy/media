package fr.gcrevisy.media.controller;

import org.junit.Assert;
import org.junit.Test;

public class HealthCheckControllerTest {

    @Test
    public void checkOk() {
        HealthCheckController controller = new HealthCheckController();
        String result = controller.check();

        Assert.assertEquals("Alive !", result);
    }

}