// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

public final class RatingLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView averageRating;

  @NonNull
  public final ImageView averageRatingStar;

  @NonNull
  public final View divider7;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView13;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView productAvailable;

  @NonNull
  public final TextView productRatingMark1;

  @NonNull
  public final TextView productRatingMark2;

  @NonNull
  public final TextView productRatingMark3;

  @NonNull
  public final TextView productRatingMark4;

  @NonNull
  public final TextView productRatingMark5;

  @NonNull
  public final ProgressBar progressBarMark1;

  @NonNull
  public final ProgressBar progressBarMark2;

  @NonNull
  public final ProgressBar progressBarMark3;

  @NonNull
  public final ProgressBar progressBarMark4;

  @NonNull
  public final ProgressBar progressBarMark5;

  @NonNull
  public final LinearLayout rateNowContainer;

  @NonNull
  public final LinearLayout ratingNumbersContainer;

  @NonNull
  public final LinearLayout ratingProgressbarContainer;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView totalRatingFigure;

  @NonNull
  public final TextView totalRatings;

  @NonNull
  public final TextView yourRatings;

  private RatingLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView averageRating,
      @NonNull ImageView averageRatingStar, @NonNull View divider7, @NonNull ImageView imageView10,
      @NonNull ImageView imageView11, @NonNull ImageView imageView13,
      @NonNull ImageView imageView15, @NonNull ImageView imageView17, @NonNull ImageView imageView4,
      @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8,
      @NonNull ImageView imageView9, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout3, @NonNull TextView productAvailable,
      @NonNull TextView productRatingMark1, @NonNull TextView productRatingMark2,
      @NonNull TextView productRatingMark3, @NonNull TextView productRatingMark4,
      @NonNull TextView productRatingMark5, @NonNull ProgressBar progressBarMark1,
      @NonNull ProgressBar progressBarMark2, @NonNull ProgressBar progressBarMark3,
      @NonNull ProgressBar progressBarMark4, @NonNull ProgressBar progressBarMark5,
      @NonNull LinearLayout rateNowContainer, @NonNull LinearLayout ratingNumbersContainer,
      @NonNull LinearLayout ratingProgressbarContainer, @NonNull TextView textView12,
      @NonNull TextView textView14, @NonNull TextView textView16, @NonNull TextView textView5,
      @NonNull TextView textView8, @NonNull TextView totalRatingFigure,
      @NonNull TextView totalRatings, @NonNull TextView yourRatings) {
    this.rootView = rootView;
    this.averageRating = averageRating;
    this.averageRatingStar = averageRatingStar;
    this.divider7 = divider7;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView13 = imageView13;
    this.imageView15 = imageView15;
    this.imageView17 = imageView17;
    this.imageView4 = imageView4;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.linearLayout = linearLayout;
    this.linearLayout3 = linearLayout3;
    this.productAvailable = productAvailable;
    this.productRatingMark1 = productRatingMark1;
    this.productRatingMark2 = productRatingMark2;
    this.productRatingMark3 = productRatingMark3;
    this.productRatingMark4 = productRatingMark4;
    this.productRatingMark5 = productRatingMark5;
    this.progressBarMark1 = progressBarMark1;
    this.progressBarMark2 = progressBarMark2;
    this.progressBarMark3 = progressBarMark3;
    this.progressBarMark4 = progressBarMark4;
    this.progressBarMark5 = progressBarMark5;
    this.rateNowContainer = rateNowContainer;
    this.ratingNumbersContainer = ratingNumbersContainer;
    this.ratingProgressbarContainer = ratingProgressbarContainer;
    this.textView12 = textView12;
    this.textView14 = textView14;
    this.textView16 = textView16;
    this.textView5 = textView5;
    this.textView8 = textView8;
    this.totalRatingFigure = totalRatingFigure;
    this.totalRatings = totalRatings;
    this.yourRatings = yourRatings;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RatingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RatingLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rating_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RatingLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.average_rating;
      TextView averageRating = ViewBindings.findChildViewById(rootView, id);
      if (averageRating == null) {
        break missingId;
      }

      id = R.id.average_rating_star;
      ImageView averageRatingStar = ViewBindings.findChildViewById(rootView, id);
      if (averageRatingStar == null) {
        break missingId;
      }

      id = R.id.divider7;
      View divider7 = ViewBindings.findChildViewById(rootView, id);
      if (divider7 == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView13;
      ImageView imageView13 = ViewBindings.findChildViewById(rootView, id);
      if (imageView13 == null) {
        break missingId;
      }

      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.linear_layout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.product_available;
      TextView productAvailable = ViewBindings.findChildViewById(rootView, id);
      if (productAvailable == null) {
        break missingId;
      }

      id = R.id.product_rating_mark_1;
      TextView productRatingMark1 = ViewBindings.findChildViewById(rootView, id);
      if (productRatingMark1 == null) {
        break missingId;
      }

      id = R.id.product_rating_mark_2;
      TextView productRatingMark2 = ViewBindings.findChildViewById(rootView, id);
      if (productRatingMark2 == null) {
        break missingId;
      }

      id = R.id.product_rating_mark_3;
      TextView productRatingMark3 = ViewBindings.findChildViewById(rootView, id);
      if (productRatingMark3 == null) {
        break missingId;
      }

      id = R.id.product_rating_mark_4;
      TextView productRatingMark4 = ViewBindings.findChildViewById(rootView, id);
      if (productRatingMark4 == null) {
        break missingId;
      }

      id = R.id.product_rating_mark_5;
      TextView productRatingMark5 = ViewBindings.findChildViewById(rootView, id);
      if (productRatingMark5 == null) {
        break missingId;
      }

      id = R.id.progressBar_mark_1;
      ProgressBar progressBarMark1 = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMark1 == null) {
        break missingId;
      }

      id = R.id.progressBar_mark_2;
      ProgressBar progressBarMark2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMark2 == null) {
        break missingId;
      }

      id = R.id.progressBar_mark_3;
      ProgressBar progressBarMark3 = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMark3 == null) {
        break missingId;
      }

      id = R.id.progressBar_mark_4;
      ProgressBar progressBarMark4 = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMark4 == null) {
        break missingId;
      }

      id = R.id.progressBar_mark_5;
      ProgressBar progressBarMark5 = ViewBindings.findChildViewById(rootView, id);
      if (progressBarMark5 == null) {
        break missingId;
      }

      id = R.id.rate_now_container;
      LinearLayout rateNowContainer = ViewBindings.findChildViewById(rootView, id);
      if (rateNowContainer == null) {
        break missingId;
      }

      id = R.id.rating_numbers_container;
      LinearLayout ratingNumbersContainer = ViewBindings.findChildViewById(rootView, id);
      if (ratingNumbersContainer == null) {
        break missingId;
      }

      id = R.id.rating_progressbar_container;
      LinearLayout ratingProgressbarContainer = ViewBindings.findChildViewById(rootView, id);
      if (ratingProgressbarContainer == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.total_rating_figure;
      TextView totalRatingFigure = ViewBindings.findChildViewById(rootView, id);
      if (totalRatingFigure == null) {
        break missingId;
      }

      id = R.id.total_ratings;
      TextView totalRatings = ViewBindings.findChildViewById(rootView, id);
      if (totalRatings == null) {
        break missingId;
      }

      id = R.id.your_ratings;
      TextView yourRatings = ViewBindings.findChildViewById(rootView, id);
      if (yourRatings == null) {
        break missingId;
      }

      return new RatingLayoutBinding((ConstraintLayout) rootView, averageRating, averageRatingStar,
          divider7, imageView10, imageView11, imageView13, imageView15, imageView17, imageView4,
          imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout3,
          productAvailable, productRatingMark1, productRatingMark2, productRatingMark3,
          productRatingMark4, productRatingMark5, progressBarMark1, progressBarMark2,
          progressBarMark3, progressBarMark4, progressBarMark5, rateNowContainer,
          ratingNumbersContainer, ratingProgressbarContainer, textView12, textView14, textView16,
          textView5, textView8, totalRatingFigure, totalRatings, yourRatings);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
