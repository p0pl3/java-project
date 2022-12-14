// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class QueueRoomItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button openQueueRoomBtn;

  @NonNull
  public final TextView queueTicketRoomTitle;

  private QueueRoomItemBinding(@NonNull ConstraintLayout rootView, @NonNull Button openQueueRoomBtn,
      @NonNull TextView queueTicketRoomTitle) {
    this.rootView = rootView;
    this.openQueueRoomBtn = openQueueRoomBtn;
    this.queueTicketRoomTitle = queueTicketRoomTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static QueueRoomItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QueueRoomItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.queue_room_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QueueRoomItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.openQueueRoomBtn;
      Button openQueueRoomBtn = ViewBindings.findChildViewById(rootView, id);
      if (openQueueRoomBtn == null) {
        break missingId;
      }

      id = R.id.queueTicketRoomTitle;
      TextView queueTicketRoomTitle = ViewBindings.findChildViewById(rootView, id);
      if (queueTicketRoomTitle == null) {
        break missingId;
      }

      return new QueueRoomItemBinding((ConstraintLayout) rootView, openQueueRoomBtn,
          queueTicketRoomTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
