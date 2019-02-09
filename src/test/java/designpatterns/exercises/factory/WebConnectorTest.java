package designpatterns.exercises.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebConnectorTest {

    @Test
    public void testCreateHttpConnector() {
        WebConnector connector = WebConnectorFactory.create("http://google.pl");
        assertTrue(connector instanceof HttpConnector);
    }

    @Test
    public void testCreateWebsocketConnector() {
        WebConnector connector = WebConnectorFactory.create("websocket://127.0.0.1:8083");
        assertTrue(connector instanceof WebsocketConnector);
    }
}