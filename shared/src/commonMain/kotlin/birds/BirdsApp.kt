package birds

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import getPlatformName
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun BirdsApp() {
    MaterialTheme {
        var greetingText by remember { mutableStateOf("Hello, ${getPlatformName()}!") }
        var showImage by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                greetingText = "Hello Zenjob by ${getPlatformName()}"
                showImage = !showImage
            }) {
                Text(greetingText)
            }
            AnimatedVisibility(showImage) {
                KamelImage(
                    // Hardcoding the URL for now
                    asyncPainterResource("http://sebi.io/demo-image-api/pigeon/vladislav-nikonov-yVYaUSwkTOs-unsplash.jpg"),
                    "Some image"
                )
            }
            KamelImage(
                // Hardcoding the URL for now
                asyncPainterResource("http://sebi.io/demo-image-api/pigeon/vladislav-nikonov-yVYaUSwkTOs-unsplash.jpg"),
                "Some image"
            )
        }
    }
}