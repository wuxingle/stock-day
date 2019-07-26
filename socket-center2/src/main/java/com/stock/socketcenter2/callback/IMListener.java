package com.stock.socketcenter2.callback;

public interface IMListener<T> {
    public abstract void onSuccess(T response);

    public abstract void onFaild();

    public abstract void onTimeout();
}
