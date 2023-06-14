package com.boyka.demo.config;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Configuration
public class WebSocketHandlerConfig extends AbstractWebSocketHandler {

    private Gson gson = new Gson();
    private static final Logger log = LoggerFactory.getLogger(WebSocketHandlerConfig.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("Connection Established from ID: {} - {}", session.getId(), session.getPrincipal().getName());
        super.afterConnectionEstablished(session);
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        log.info("message from ID {}: {}", session.getId(), message.getPayload());
        super.handleMessage(session, message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("ID {} disconnected, with status code {}", session.getId(), status.getCode());
        super.afterConnectionClosed(session, status);
    }
}
