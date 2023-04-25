package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class FundAccountDirections private constructor() {
  public companion object {
    public fun actionFundAccountToFlutterWave2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fundAccount_to_flutterWave2)

    public fun actionFundAccountToDashboard(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fundAccount_to_dashboard)
  }
}
