// Generated by view binder compiler. Do not edit!
package com.kumulinovations.trail004.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kumulinovations.trail004.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustomerLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText email;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText password;

  @NonNull
  public final Button registration;

  private ActivityCustomerLoginBinding(@NonNull LinearLayout rootView, @NonNull EditText email,
      @NonNull Button login, @NonNull EditText password, @NonNull Button registration) {
    this.rootView = rootView;
    this.email = email;
    this.login = login;
    this.password = password;
    this.registration = registration;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomerLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomerLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_customer_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomerLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      EditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = rootView.findViewById(id);
      if (login == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.registration;
      Button registration = rootView.findViewById(id);
      if (registration == null) {
        break missingId;
      }

      return new ActivityCustomerLoginBinding((LinearLayout) rootView, email, login, password,
          registration);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}