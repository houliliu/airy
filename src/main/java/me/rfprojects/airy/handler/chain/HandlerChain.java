package me.rfprojects.airy.handler.chain;

import me.rfprojects.airy.handler.Handler;

public interface HandlerChain extends Handler {

    boolean appendHandler(Handler handler);
}
