// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyAddressesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout addNewAddressLayout;

  @NonNull
  public final RecyclerView addressesRecyclerview;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Button devBtn;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMyAddressesBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout addNewAddressLayout, @NonNull RecyclerView addressesRecyclerview,
      @NonNull AppBarLayout appBarLayout, @NonNull Button devBtn, @NonNull TextView textView7,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.addNewAddressLayout = addNewAddressLayout;
    this.addressesRecyclerview = addressesRecyclerview;
    this.appBarLayout = appBarLayout;
    this.devBtn = devBtn;
    this.textView7 = textView7;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyAddressesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyAddressesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_addresses, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyAddressesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_new_address_layout;
      LinearLayout addNewAddressLayout = ViewBindings.findChildViewById(rootView, id);
      if (addNewAddressLayout == null) {
        break missingId;
      }

      id = R.id.addresses_recyclerview;
      RecyclerView addressesRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (addressesRecyclerview == null) {
        break missingId;
      }

      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.dev_btn;
      Button devBtn = ViewBindings.findChildViewById(rootView, id);
      if (devBtn == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMyAddressesBinding((ConstraintLayout) rootView, addNewAddressLayout,
          addressesRecyclerview, appBarLayout, devBtn, textView7, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
