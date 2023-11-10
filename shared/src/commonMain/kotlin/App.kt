import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    CategoryChipsList()
}

@Composable
private fun CategoryChipsList() {
    Column(modifier = Modifier.padding(8.dp).verticalScroll(rememberScrollState())) {
        CategoryModel.values().forEach {
            CategoryChip(color = it.surface, text = it.name, icon = it.icon, tint = it.tint)
        }
    }
}

expect fun getPlatformName(): String