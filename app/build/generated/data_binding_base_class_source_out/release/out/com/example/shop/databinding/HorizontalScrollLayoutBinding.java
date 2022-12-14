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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HorizontalScrollLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button horizontalScrollBtn;

  @NonNull
  public final RecyclerView horizontalScrollRecyclerview;

  @NonNull
  public final TextView horizontalScrollTitle;

  private HorizontalScrollLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button horizontalScrollBtn, @NonNull RecyclerView horizontalScrollRecyclerview,
      @NonNull TextView horizontalScrollTitle) {
    this.rootView = rootView;
    this.horizontalScrollBtn = horizontalScrollBtn;
    this.horizontalScrollRecyclerview = horizontalScrollRecyclerview;
    this.horizontalScrollTitle = horizontalScrollTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HorizontalScrollLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HorizontalScrollLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.horizontal_scroll_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HorizontalScrollLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.horizontal_scroll_btn;
      Button horizontalScrollBtn = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollBtn == null) {
        break missingId;
      }

      id = R.id.horizontal_scroll_recyclerview;
      RecyclerView horizontalScrollRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollRecyclerview == null) {
        break missingId;
      }

      id = R.id.horizontal_scroll_title;
      TextView horizontalScrollTitle = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollTitle == null) {
        break missingId;
      }

      return new HorizontalScrollLayoutBinding((ConstraintLayout) rootView, horizontalScrollBtn,
          horizontalScrollRecyclerview, horizontalScrollTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
