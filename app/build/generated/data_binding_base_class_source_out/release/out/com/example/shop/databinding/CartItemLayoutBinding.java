// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class CartItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView couponAppliedCart;

  @NonNull
  public final ImageView couponIcon;

  @NonNull
  public final TextView couponText;

  @NonNull
  public final TextView discountPriceCart;

  @NonNull
  public final ConstraintLayout discountPriceCartDivider;

  @NonNull
  public final View divider8;

  @NonNull
  public final TextView offersApplied;

  @NonNull
  public final ImageView productImageCart;

  @NonNull
  public final TextView productPriceCart;

  @NonNull
  public final TextView productQuantityCart;

  @NonNull
  public final TextView productTitleCart;

  @NonNull
  public final LinearLayout removeItemCartBtn;

  private CartItemLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView couponAppliedCart, @NonNull ImageView couponIcon,
      @NonNull TextView couponText, @NonNull TextView discountPriceCart,
      @NonNull ConstraintLayout discountPriceCartDivider, @NonNull View divider8,
      @NonNull TextView offersApplied, @NonNull ImageView productImageCart,
      @NonNull TextView productPriceCart, @NonNull TextView productQuantityCart,
      @NonNull TextView productTitleCart, @NonNull LinearLayout removeItemCartBtn) {
    this.rootView = rootView;
    this.couponAppliedCart = couponAppliedCart;
    this.couponIcon = couponIcon;
    this.couponText = couponText;
    this.discountPriceCart = discountPriceCart;
    this.discountPriceCartDivider = discountPriceCartDivider;
    this.divider8 = divider8;
    this.offersApplied = offersApplied;
    this.productImageCart = productImageCart;
    this.productPriceCart = productPriceCart;
    this.productQuantityCart = productQuantityCart;
    this.productTitleCart = productTitleCart;
    this.removeItemCartBtn = removeItemCartBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.coupon_applied_cart;
      TextView couponAppliedCart = ViewBindings.findChildViewById(rootView, id);
      if (couponAppliedCart == null) {
        break missingId;
      }

      id = R.id.coupon_icon;
      ImageView couponIcon = ViewBindings.findChildViewById(rootView, id);
      if (couponIcon == null) {
        break missingId;
      }

      id = R.id.coupon_text;
      TextView couponText = ViewBindings.findChildViewById(rootView, id);
      if (couponText == null) {
        break missingId;
      }

      id = R.id.discount_price_cart;
      TextView discountPriceCart = ViewBindings.findChildViewById(rootView, id);
      if (discountPriceCart == null) {
        break missingId;
      }

      ConstraintLayout discountPriceCartDivider = (ConstraintLayout) rootView;

      id = R.id.divider8;
      View divider8 = ViewBindings.findChildViewById(rootView, id);
      if (divider8 == null) {
        break missingId;
      }

      id = R.id.offers_applied;
      TextView offersApplied = ViewBindings.findChildViewById(rootView, id);
      if (offersApplied == null) {
        break missingId;
      }

      id = R.id.product_image_cart;
      ImageView productImageCart = ViewBindings.findChildViewById(rootView, id);
      if (productImageCart == null) {
        break missingId;
      }

      id = R.id.product_price_cart;
      TextView productPriceCart = ViewBindings.findChildViewById(rootView, id);
      if (productPriceCart == null) {
        break missingId;
      }

      id = R.id.product_quantity_cart;
      TextView productQuantityCart = ViewBindings.findChildViewById(rootView, id);
      if (productQuantityCart == null) {
        break missingId;
      }

      id = R.id.product_title_cart;
      TextView productTitleCart = ViewBindings.findChildViewById(rootView, id);
      if (productTitleCart == null) {
        break missingId;
      }

      id = R.id.remove_item_cart_btn;
      LinearLayout removeItemCartBtn = ViewBindings.findChildViewById(rootView, id);
      if (removeItemCartBtn == null) {
        break missingId;
      }

      return new CartItemLayoutBinding((ConstraintLayout) rootView, couponAppliedCart, couponIcon,
          couponText, discountPriceCart, discountPriceCartDivider, divider8, offersApplied,
          productImageCart, productPriceCart, productQuantityCart, productTitleCart,
          removeItemCartBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
