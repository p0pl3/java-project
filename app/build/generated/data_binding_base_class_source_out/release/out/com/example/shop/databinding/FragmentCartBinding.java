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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cart;

  @NonNull
  public final Button cartContinueBtn;

  @NonNull
  public final RecyclerView cartItemsRecyclerview;

  @NonNull
  public final LinearLayout endCart;

  @NonNull
  public final TextView totalCartAmount;

  private FragmentCartBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout cart,
      @NonNull Button cartContinueBtn, @NonNull RecyclerView cartItemsRecyclerview,
      @NonNull LinearLayout endCart, @NonNull TextView totalCartAmount) {
    this.rootView = rootView;
    this.cart = cart;
    this.cartContinueBtn = cartContinueBtn;
    this.cartItemsRecyclerview = cartItemsRecyclerview;
    this.endCart = endCart;
    this.totalCartAmount = totalCartAmount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cart = (ConstraintLayout) rootView;

      id = R.id.cart_continue_btn;
      Button cartContinueBtn = ViewBindings.findChildViewById(rootView, id);
      if (cartContinueBtn == null) {
        break missingId;
      }

      id = R.id.cart_items_recyclerview;
      RecyclerView cartItemsRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (cartItemsRecyclerview == null) {
        break missingId;
      }

      id = R.id.end_cart;
      LinearLayout endCart = ViewBindings.findChildViewById(rootView, id);
      if (endCart == null) {
        break missingId;
      }

      id = R.id.total_cart_amount;
      TextView totalCartAmount = ViewBindings.findChildViewById(rootView, id);
      if (totalCartAmount == null) {
        break missingId;
      }

      return new FragmentCartBinding((ConstraintLayout) rootView, cart, cartContinueBtn,
          cartItemsRecyclerview, endCart, totalCartAmount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
