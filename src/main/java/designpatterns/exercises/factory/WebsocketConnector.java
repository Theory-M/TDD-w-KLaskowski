package designpatterns.exercises.factory;

public class WebsocketConnector extends WebConnector{
    String url;

    WebsocketConnector(String url){
        this.url = url;
    }

//    @Override
//    public WebConnector create(String url) {
//        return super.create(url);
//    }

    @Override
    public void connect() {

    }
}
