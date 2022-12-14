// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentResetPasswordBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EditText emailForgotPassword;

  @NonNull
  public final Button resetPasswordBtn;

  @NonNull
  public final LinearLayout sendMessageContainer;

  @NonNull
  public final ImageView sendMessageIco;

  @NonNull
  public final ProgressBar sendMessageProgressBar;

  @NonNull
  public final TextView sendMessageText;

  @NonNull
  public final TextView signInForgotPassword;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private FragmentResetPasswordBinding(@NonNull FrameLayout rootView,
      @NonNull EditText emailForgotPassword, @NonNull Button resetPasswordBtn,
      @NonNull LinearLayout sendMessageContainer, @NonNull ImageView sendMessageIco,
      @NonNull ProgressBar sendMessageProgressBar, @NonNull TextView sendMessageText,
      @NonNull TextView signInForgotPassword, @NonNull TextView textView3,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.emailForgotPassword = emailForgotPassword;
    this.resetPasswordBtn = resetPasswordBtn;
    this.sendMessageContainer = sendMessageContainer;
    this.sendMessageIco = sendMessageIco;
    this.sendMessageProgressBar = sendMessageProgressBar;
    this.sendMessageText = sendMessageText;
    this.signInForgotPassword = signInForgotPassword;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reset_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_forgot_password;
      EditText emailForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (emailForgotPassword == null) {
        break missingId;
      }

      id = R.id.reset_password_btn;
      Button resetPasswordBtn = ViewBindings.findChildViewById(rootView, id);
      if (resetPasswordBtn == null) {
        break missingId;
      }

      id = R.id.send_message_container;
      LinearLayout sendMessageContainer = ViewBindings.findChildViewById(rootView, id);
      if (sendMessageContainer == null) {
        break missingId;
      }

      id = R.id.send_message_ico;
      ImageView sendMessageIco = ViewBindings.findChildViewById(rootView, id);
      if (sendMessageIco == null) {
        break missingId;
      }

      id = R.id.send_message_progressBar;
      ProgressBar sendMessageProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (sendMessageProgressBar == null) {
        break missingId;
      }

      id = R.id.send_message_text;
      TextView sendMessageText = ViewBindings.findChildViewById(rootView, id);
      if (sendMessageText == null) {
        break missingId;
      }

      id = R.id.sign_in_forgot_password;
      TextView signInForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (signInForgotPassword == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new FragmentResetPasswordBinding((FrameLayout) rootView, emailForgotPassword,
          resetPasswordBtn, sendMessageContainer, sendMessageIco, sendMessageProgressBar,
          sendMessageText, signInForgotPassword, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
