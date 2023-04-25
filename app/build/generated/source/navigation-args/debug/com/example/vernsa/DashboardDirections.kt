package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class DashboardDirections private constructor() {
  public companion object {
    public fun actionDashboardToFundAccount(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboard_to_fundAccount)
  }
}
