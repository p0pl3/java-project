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

public final class AddressesItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addressItem;

  @NonNull
  public final ImageView iconCheck;

  @NonNull
  public final TextView indexAddressItem;

  @NonNull
  public final TextView nameAddressItem;

  @NonNull
  public final LinearLayout option;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  private AddressesItemLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView addressItem, @NonNull ImageView iconCheck,
      @NonNull TextView indexAddressItem, @NonNull TextView nameAddressItem,
      @NonNull LinearLayout option, @NonNull TextView textView25, @NonNull TextView textView26) {
    this.rootView = rootView;
    this.addressItem = addressItem;
    this.iconCheck = iconCheck;
    this.indexAddressItem = indexAddressItem;
    this.nameAddressItem = nameAddressItem;
    this.option = option;
    this.textView25 = textView25;
    this.textView26 = textView26;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddressesItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddressesItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.addresses_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddressesItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_item;
      TextView addressItem = ViewBindings.findChildViewById(rootView, id);
      if (addressItem == null) {
        break missingId;
      }

      id = R.id.icon_check;
      ImageView iconCheck = ViewBindings.findChildViewById(rootView, id);
      if (iconCheck == null) {
        break missingId;
      }

      id = R.id.index_address_item;
      TextView indexAddressItem = ViewBindings.findChildViewById(rootView, id);
      if (indexAddressItem == null) {
        break missingId;
      }

      id = R.id.name_address_item;
      TextView nameAddressItem = ViewBindings.findChildViewById(rootView, id);
      if (nameAddressItem == null) {
        break missingId;
      }

      id = R.id.option;
      LinearLayout option = ViewBindings.findChildViewById(rootView, id);
      if (option == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      return new AddressesItemLayoutBinding((ConstraintLayout) rootView, addressItem, iconCheck,
          indexAddressItem, nameAddressItem, option, textView25, textView26);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}