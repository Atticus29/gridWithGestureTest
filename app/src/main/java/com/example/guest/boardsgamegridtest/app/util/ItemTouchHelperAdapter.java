package com.example.guest.boardsgamegridtest.app.util;

/**
 * Created by Guest on 6/12/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
