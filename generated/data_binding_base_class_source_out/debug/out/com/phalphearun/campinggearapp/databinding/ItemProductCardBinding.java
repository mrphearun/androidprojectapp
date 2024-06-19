// Generated by view binder compiler. Do not edit!
package com.phalphearun.campinggearapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phalphearun.campinggearapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemProductCardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView productImageView;

  @NonNull
  public final TextView productPriceTextView;

  @NonNull
  public final TextView productTitleTextView;

  @NonNull
  public final Button viewDetailsButton;

  private ItemProductCardBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView productImageView, @NonNull TextView productPriceTextView,
      @NonNull TextView productTitleTextView, @NonNull Button viewDetailsButton) {
    this.rootView = rootView;
    this.productImageView = productImageView;
    this.productPriceTextView = productPriceTextView;
    this.productTitleTextView = productTitleTextView;
    this.viewDetailsButton = viewDetailsButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProductCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProductCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_product_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProductCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.productImageView;
      ImageView productImageView = ViewBindings.findChildViewById(rootView, id);
      if (productImageView == null) {
        break missingId;
      }

      id = R.id.productPriceTextView;
      TextView productPriceTextView = ViewBindings.findChildViewById(rootView, id);
      if (productPriceTextView == null) {
        break missingId;
      }

      id = R.id.productTitleTextView;
      TextView productTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (productTitleTextView == null) {
        break missingId;
      }

      id = R.id.viewDetailsButton;
      Button viewDetailsButton = ViewBindings.findChildViewById(rootView, id);
      if (viewDetailsButton == null) {
        break missingId;
      }

      return new ItemProductCardBinding((LinearLayout) rootView, productImageView,
          productPriceTextView, productTitleTextView, viewDetailsButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}