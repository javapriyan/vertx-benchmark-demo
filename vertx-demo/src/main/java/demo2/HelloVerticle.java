package demo2;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Created by kumaran on 16/5/17.
 */
public class HelloVerticle extends AbstractVerticle {

    @Override
    public void start(){
        vertx.createHttpServer().requestHandler(
                        r ->System.out.println("Request received"))
        .listen(8085);
    }
}
