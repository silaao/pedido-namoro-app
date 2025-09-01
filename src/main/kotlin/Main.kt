import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition.PlatformDefault.x
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlin.random.Random
import kotlin.random.nextInt

private const val WIDTH = 1280
private const val HEITH = 720

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun App() {
    var answerYes by remember { mutableStateOf(false) }
    var buttonPos by remember { mutableStateOf(IntOffset(50, 0)) }
    var buttonSize by remember { mutableStateOf(IntSize.Zero) }
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize().background(Color(.95f, .95f, .95f))
        ) {
            Text(
                "Quer namorar comigo?", modifier = Modifier
                    .align(Alignment.Center).offset(y = (-50).dp)
            )
            Button(
                onClick = {
                    answerYes = true
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD32F2F)),
                modifier = Modifier.align(Alignment.Center).offset(x = (-50).dp)
            ) {
                Text("Sim")
            }
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD32F2F)),
                modifier = Modifier
                .align(Alignment.Center)
                .offset { buttonPos }
                .onSizeChanged { buttonSize = it }
                .onPointerEvent(PointerEventType.Enter) {
                    val xo = (WIDTH / 2)
                    val yo = (HEITH / 2)
                    val x = Random.nextInt(-xo + buttonSize.width..xo - buttonSize.width)
                    val y = Random.nextInt(-yo + buttonSize.width..yo - buttonSize.height)
                    buttonPos = IntOffset(x, y)
                }) {
                Text("Não")
            }
            if (answerYes) {
                Text("Sabia que você não ia resistir ", modifier = Modifier.align(Alignment.Center).offset(y = (50).dp))

            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(size = DpSize(width = 1280.dp, height = 720.dp)),
        title = "Pedido Especial ️",
        icon = painterResource("ic.png")
    ) {
        App()
    }
}
