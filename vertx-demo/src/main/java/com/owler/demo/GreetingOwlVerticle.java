package com.owler.demo;

/**
 * Created by kumaran on 1/5/17.
 */
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class GreetingOwlVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> fut) {
        vertx
                .createHttpServer()
                .requestHandler(r -> {
                    System.out.println("Request received");
                    vertx.setTimer(1000,result -> {
                        System.out.println("Request Processed");
                        r.response().end("<h1>Hello Little Owl, yenna Kodi parakkudhaa ??? </h1>");
                    });
                })
                .listen(8081, result -> {
                    if (result.succeeded()) {
                        fut.complete();
                    } else {
                        fut.fail(result.cause());
                    }
                });
    }
}