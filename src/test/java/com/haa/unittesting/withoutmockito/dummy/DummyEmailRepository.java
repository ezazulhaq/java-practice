package com.haa.unittesting.withoutmockito.dummy;

public class DummyEmailRepository implements EmailRepository {

    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Method not implemented");
    }

}
