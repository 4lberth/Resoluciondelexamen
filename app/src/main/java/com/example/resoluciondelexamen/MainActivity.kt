package com.example.resoluciondelexamen

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.StructuredName
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.resoluciondelexamen.ui.theme.ResolucionDelExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Pregunta01()
            //Pregunta02()
            //Pregunta03()
            Pregunta06()
        }
    }
}

////////////////////////////////// Pregunta 1 ////////////////////////////////

@Composable
fun Pregunta01() {
    var nro: Int by remember { mutableIntStateOf(0) }

    Button(
        onClick = {
        for (i in 0 until 10) {
            nro += (i + 1000)
        }
    }) {
        Text("$nro")
    }
}

//////////////////////////////// Pregunta 2 ////////////////////////////////

@Composable
fun Pregunta02() {
    var lista = arrayListOf("Uno", "Dos", "Tres", "Cuatro")
    var msg by remember { mutableStateOf("Click Me!") }

    Button(onClick = {
        msg = lista[lista.size - 3].substring(1)
    }) {
        Text(msg)
    }
}

/////////////////////////////// Pregunta 3 ////////////////////////////////

open class A (var a: Int) {
    open fun pget(): Int { return 3 * a }
}

class B(a: Int, var b: Int): A(a) {
    override fun pget(): Int {return super.pget() + b }
}

@Composable
fun Pregunta03() {
    var w : A = B(3,4)
    Text("${w.pget()}")
}

//////////////////////////////// Pregunta 4 ////////////////////////////////////
//La clase A tiene un constructor de tipo:
//open class A (var a: Int) {
    //open fun pget(): Int { return 3 * a }
//}
//1) Nativo
//2) Primario (Respuesta Correcta)
//3) Secundario
//4) No tiene ningun constructor
//5) Su constructor se denomina pget()

//////////////////////////////// Pregunta 5////////////////////////////////////

//Elija la declaracion de clase que define una clase descendiente de la clase B
//open class A (var a: Int) {
  //  open fun pget(): Int { return 3 * a }
//}

//class B(a: Int, var b: Int): A(a) {
  //  override fun pget(): Int {return super.pget() + b }
//}
// a) class C extends B { ... }
// b) class C: B { ... }
// c) class C(a: Int, b : Int: B(a,b) { ... }
// d) Las opciones (b) y (c) son correctas
// e) Ninguna es correcta (Respuesta Correcta)

//////////////////////////////// Pregunta 6 //////////////////////////////////
@Composable
fun Pregunta06() {
    var valor by remember { mutableStateOf(25)}
    Column {
        Spacer(Modifier.height(30.dp))
        Boton6(valor, {rpta:Int -> valor = rpta})
        Etiqueta6(valor)
    }
}

@Composable
fun Boton6(dato: Int, evento: (Int)-> Unit ) {
    Button(onClick = { evento((dato + 1234561) % 5) }
    ) {Text("Click Me!") }
}

@Composable
fun Etiqueta6(k: Int) = Text("$k")

//////////////////////////////// Pregunta 7 ////////////////////////////////
// Indique la sentencia que permite almacenar el valor 125 en la variable answer
// val answer = remember {mutableStateOf(0)}
// a) answer = 125
// b) answer = 100 + 25
// c) Las opciones (a) y (b) son correctas
// d) answer.value = 181 % 26 (Respuesta Correcta)
// e) Ninguna de las anteriores

////////////////////////////////// Pregunta 8 ///////////////////////////////////
// Complete el siguiente párrafo:
//Se puede almacenar una imagen en la carpeta --------(res/drawable)--------
//y para poder visualizar dicha imagen en JetPack Compose se
//debe utilizar el control denominado ------(Image)--------

////////////////////////////////// Pregunta 9 ///////////////////////////////////
// Cual de las siguientes funciones se utiliza para cargar una imagen para luego
// poder visualizarla en el control correspondiente:
// a) PainterResource()
// b) LoadResource()
// c) painterResource() (Respuesta Correcta)
// d) loadResource()
// e) Ninguna de las anteriores

///////////////////////////////////// (Pregunta 10) //////////////////////////////
// Cuales de las siguientes declaraciones de funciones corresponden a funciones
// que no devuelven valor:
// a) fun A(): Unit { ... } ---- void
// b) fun B() = J() // Considere que la funcion J() existe
// c) fun C(a: Int, b:Boolean) { ... }
// d) Las opciones (a) y (c) son correctas (Respuesta Correcta)
// e) Todas son correctas