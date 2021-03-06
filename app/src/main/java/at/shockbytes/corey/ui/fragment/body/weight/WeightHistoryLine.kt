package at.shockbytes.corey.ui.fragment.body.weight

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import at.shockbytes.corey.data.body.info.WeightPoint

data class WeightHistoryLine(
    @StringRes val name: Int,
    val points: List<WeightPoint>,
    @ColorRes val lineColor: Int,
    val lineThickness: Float
)