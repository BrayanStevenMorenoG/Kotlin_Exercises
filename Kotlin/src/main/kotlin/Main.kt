fun main() {

    println("Bienvenido a la miscelanea de ejercicios")

    var decision = 0

    do {
    println("Digite el tipo de ejercicio que desea realizar\n" +
            "1. Operadores\n" +
            "2. Condicionales\n" +
            "3. Ciclos\n" +
            "4. Salir")
    val exercises = readln().toString()

    when (exercises) {
        "1" -> operators()
        "2" -> conditional()
        "3" -> cycles()
        "4" -> {
            println("Hasta luego")
            decision = 4
        }
        else -> println("Digite una opción del menú")
    }
        println("Desea realizar otro ejercicio?\n" +
                "1. Si\n" +
                "2. No")
        decision = readln().toInt()
        if (decision == 2){
            decision = 4
            println("Hasta luego :)")
        }
    } while (decision < 4)
}

//EJERCICIOS DE OPERADORES

fun operators(){
    println("Que ejercicio desea realizar?\n" +
            "1. Calcular el area de un algoritmo.\n" +
            "2. Ingresar dos números por teclado y sumarlos.\n" +
            "3. Ingresar un número y visualizar el número elevado al cuadrado.\n" +
            "4. Escribir un algoritmo que convierta de euros a dolares.\n" +
            "5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro.\n" +
            "6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.\n" +
            "7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del circulo inscrito.\n" +
            "8. Calcular el promedio de tres números ingresados por teclado.")
    val option = readln().toString()

    when (option) {
        "1" -> firstExercise()
        "2" -> secondExercise()
        "3" -> thirdExercise()
        "4" -> fourthExercise()
        "5" -> fifthExercise()
        "6" -> sixthExercise()
        "7" -> seventhexercise()
        "8" -> eighthExercise()
        else -> println("Digite una opción del menú")
    }

}

fun conditional(){
    println("Que ejercicio desea realizar?\n" +
            "1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.\n" +
            "2.  Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál es el menor.\n" +
            "3. Escriba un programa que lea tres números enteros y que calcule e imprima en pantalla el mejor y el mayor de ellos.\n" +
            "4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.\n" +
            "5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.\n" +
            "6. Dados dos números A y B, sumarlos si al menor uno de ellos es negativo, en caso contrario multiplicarlos.\n" +
            "7. Escribir un algoritmo que determine si un año es bisiesto o no.")
    val option = readln().toString()

    when (option) {
        "1" -> ninthExercise()
        "2" -> tenthExercise()
        "3" -> eleventhExercise()
        "4" -> twelfthExercise()
        "5" -> thirtennthExercise()
        "6" -> fourteenthExercise()
        "7" -> fifteenthExercise()
        else -> println("Digite una opción del menú")
    }

}

fun cycles() {
    println(
        "Que ejercicio desea realizar?\n" +
                "1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n" +
                "2. Imprimir los números impares entre 0 y 100\n" +
                "3. Imprimir los números pares del 1 al 100\n" +
                "4. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.\n" +
                "5. Escribir un programa que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.\n" +
                "6. Dados dos números natuales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.\n" +
                "7. Sumar todos los números que se digitan por teclado mientras no sea cero."
    )
    val option = readln().toString()

    when (option) {
        "1" -> sixteenthExercise()
        "2" -> seventeenthExercise()
        "3" -> eighteenthExercise()
        "4" -> nineteenthExercise()
        "5" -> twentiethExercise()
        "6" -> twentyFirstExercise()
        "7" -> twentySecondExercise()
        else -> println("Digite una opción del menú")
    }

}
//PRIMERO
fun firstExercise(){
    println("CALCULAR AREA DE UN TRIANGULO")
    println("Digite la altura del triangulo")
    val height = readln().toDouble()
    println("Digite la base del triangulo")
    val Base = readln().toDouble()
    val Area = (height + Base) /2
    println("El area del triangulo es: $Area")
}

//SEGUNDO
fun secondExercise(){
    println("SUMAR DOS NÚMEROS")
    println("Digite el primer número")
    val number1 = readln().toDouble()
    println("Digite el segundo número")
    val number2 = readln().toDouble()
    val sum = number1 + number2
    println(sum)
}

//TERCERO
fun thirdExercise(){
    println("ELEVAR UN NÚMERO AL CUADRADO")
    println("Digite el número")
    val number = readln().toDouble()
    val sum = number*number
    println("El número elevado al cuadrado es: $sum")
}

//CUARTO
fun fourthExercise(){
    println("EUROS A DOLARES")
    println("Digite los euros")
    val euros = readln().toDouble()
    val dolars = euros * 1.12
    println("$euros€ son $$dolars")
}

//QUINTO
fun fifthExercise(){
    println("ÁREA Y PERÍMETRO DE UN CUADRADO")
    println("Digite el lado del cuadrado")
    val side = readln().toDouble()
    val area = side*side
    val perimeter = side*4
    println("El area del cuadrado es: $area")
    println("El perímetro del cudrado es: $perimeter")
}

//SEXTO
fun sixthExercise(){
    println("ÁREA Y VOLÚMEN DE UN CILINDRO")
    println("Digite el radio del cilindro")
    val radio = readln().toDouble()
    println("Digite la altura del cilindro")
    val height = readln().toDouble()
    val area = (2*(3.1416)*(radio))*(radio+height)
    println("El área del cilindro es: $area")
    val volume = (3.1416*(radio*radio))*height
    println("El volúmen del cilindro es: $volume")
}

//SEPTIMO
fun seventhexercise(){
    println("LONGITUD Y AREA DE UNA CIRCUNFERENCIA")
    println("Digite el radio de la circunferencia")
    val radio = readln().toDouble()
    val longitude = (2*(3.1416))*radio
    println("La longitud de la circunferencia es: $longitude")
    val area = (3.14*radio)*(3.14*radio)
    println("El area de la circunferencia es: $area")
}

//OCTAVO
fun eighthExercise(){
    println("PROMEDIO DE TRES NÚMEROS")
    println("Digite el primer número")
    val number1 = readln().toDouble()
    println("Digite el segundo número")
    val number2 = readln().toDouble()
    println("Digite el tercer número")
    val number3 = readln().toDouble()
    val average = (number1+number2+number3)/3
    println("El promedio de los números es: $average")
}


//EJERCICIOS DE CONDICIONALES

//PRIMERO
fun ninthExercise(){
    println("NUMERO POSITIVO O NEGATIVO")
    println("Digite el número")
    val number = readln().toDouble()
    if (number>0){
        println("El número $number es positivo")
    } else if (number<0){
        println("El número $number es negativo")
    } else {
        println("El número $number es neutro")
    }
}

//SEGUNDO
fun tenthExercise(){
    println("MAYOR Y MENOR")
    println("Digit el primer número")
    val number1 = readln().toDouble()
    println("Digit el segundo número")
    val number2 = readln().toDouble()
    if (number1>number2){
        println("El número mayor es: $number1" +
                "El número menor es: $number2")
    } else {
        println("El número mayor es: $number2" +
                "El número menor es: $number1")
    }
}

//TERCERO
fun eleventhExercise(){
    println("MAYOR/MENOR TRES NÚMEROS")
    println("Digite el primer número")
    val number1 = readln().toInt()
    println("Digite el segundo número")
    val number2 = readln().toInt()
    println("Digite el tercer número")
    val number3 = readln().toInt()
    if((number1>0)&&(number2>0)&&(number3>0)){
        if ((number1 > number2) && (number1 > number3)) {
            println("El número mayor es: $number1")
            if (number2 > number3) {
                println("El número menor es: $number3")
            } else {
                println("El número menor es: $number2")
            }
        }
        if ((number2 > number1) && (number2 > number3)) {
            println("El número mayor es: $number2")
            if (number1 > number3) {
                println("El número menor es: $number3")
            } else {
                println("El númeor menor es: $number1")
            }
        }
        if ((number3 > number1) && (number3 > number2)) {
            println("El número mayor es: $number3")
            if (number1 > number2) {
                println("El número menor es: $number2")
            } else {
                println("El número menor es: $number1")
            }
        }
    }
}

//CUARTO
fun twelfthExercise() {
    println("SUMAR O RESTAR")
    println("Digite el primer número")
    val A = readln().toInt()
    println("Digite el segundo número")
    val B = readln().toInt()
    if (A < B) {
        val sum = A + B
        println("La suma de los números es: $sum")
    } else {
        val subtraction = A - B
        println("La resta de los números es: $subtraction")
    }
}

//QUINTO
fun thirtennthExercise(){
    println("COCIENTE")
    println("Digite el primer número")
    val A = readln().toInt()
    println("Digite el segundo número")
    val B = readln().toInt()
    if (B==0){
        println("La división por 0 no está definida")
    } else {
        val quotient = A / B
        println("El valor del cociente es: $quotient")
    }
}

//SEXTO
fun fourteenthExercise(){
    println("SUMAR O MULTIPLICAR")
    println("Digite el primer número")
    val A = readln().toInt()
    println("Digite el segundo número")
    val B = readln().toInt()
    if ((A<0)||(B<0)){
        val sum = A + B
        println("La suma de los números es: $sum")
    } else {
        val multiplication = A * B
        println("La multiplicación de los números es: $multiplication")
    }
}

//SEPTIMO
fun fifteenthExercise(){
    println("AÑO BISIESTO?")
    println("Digite el año")
    val year = readln().toInt()
    if (year % 4 == 0) {
        if (year % 100 == 0){
            if (year % 400 == 0){
                println("El año $year es bisieto")
            } else {
                println("El año $year o es bisiesto")
            }
        } else {
            println("El año $year es bisiesto")
        }
    } else {
        println("El año $year no es bisiesto")
    }
}


//EJERCICIOS DE CICLOS

//PRIMERO
fun sixteenthExercise(){
    println("MULTIPLOS DE 3 (1-100)")
    for (i in 1..100){
        if (i % 3 == 0) {
            println(i)
        }
    }
}

//SEGUNDO
fun seventeenthExercise(){
    println("NUMEROS IMPARES DE 0 A 100")
    for (odd in 0..100){
        if (odd % 2 !== 0){
            println(odd)
        }
    }
}

//TERCERO
fun eighteenthExercise(){
    println("NUMEROS PARES DE 0 A 100")
    for (pairs in 1..100){
        if (pairs % 2 == 0){
            println(pairs)
        }
    }
}

//CUARTO
fun nineteenthExercise() {
    println("CUADRADOS DE 1 A 30")
    for (i in 1..30) {
        val result = i * i
        println("El cuadrado de $i es: $result")
    }
}

//QUINTO
fun twentiethExercise(){
    var result = 0
    println("SUMA CUADRADOS DE 1 A 100")
    for (i in 1..100){
        val square = i * i
        result += square
    }
    println("La suma es: $result")
}

//SEXTO
fun twentyFirstExercise(){
    println("NÚMEROS COMPERNDIDOS ENTRE DOS NÚMEROS")
    println("Digite el número menor")
    val minor = readln().toInt()
    println("Digite el número mayor")
    var elder = readln().toInt()
    for (i in minor..elder){
        println(i)
    }
}

//SEPTIMO
fun twentySecondExercise(){
    println("SUMA DE NÚMEROS SI NO ES 0")
    /*
    println("Digite el número que desea agregar a la suma")
    val number = readln().toInt()
    while (number !== 0){
        println("Digite el número que desea agregar a la suma")
    }
    println("Se finaliza la suma")
    */
    var sum = 0

    while (true){
        println("Digite el numero que desea agregar a la suma")
        val number = readln().toInt()
        sum += number
        if (number==0){
            break
        }
    }
    println("La suma de los números es: $sum")
}
