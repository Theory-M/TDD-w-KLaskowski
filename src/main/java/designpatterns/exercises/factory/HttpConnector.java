package designpatterns.exercises.factory;

public class HttpConnector extends WebConnector{
    String url;

    HttpConnector(String url){
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
