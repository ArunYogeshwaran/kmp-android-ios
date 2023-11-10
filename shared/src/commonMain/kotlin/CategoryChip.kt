import androidx.compose.foundation.layout.padding
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryChip(
    color: Color,
    text: String,
    icon: ImageVector,
    tint: Color
) {
    Chip(
        border = ChipDefaults.outlinedBorder,
        colors = ChipDefaults.outlinedChipColors(backgroundColor = color),
        leadingIcon = {
            Icon(
                modifier = Modifier.padding(start = 8.dp),
                imageVector = icon,
                contentDescription = "Localized description"
            )
        },
        onClick = {

        },
    ) {
        Text(
            text = text,
            color = tint
        )
    }
}