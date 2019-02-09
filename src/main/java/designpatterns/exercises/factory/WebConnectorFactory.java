package designpatterns.exercises.factory;

public class WebConnectorFactory {

    public static WebConnector create(String url){
        if(url.contains("http://")){
            return new HttpConnector(url);
        } else if(url.contains("websocket:")){
            return new WebsocketConnector(url);
        } else{
            throw new IllegalStateException("Unsupported protocol");
        }
    }

}
