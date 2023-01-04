fun main() {
    var numbers: List<Int> = listOf(2, 5, 3, 7)
    var number: Int = numbers[numbers.size]
    println(number)

    // Es wird eine "IndexOutOfBoundExeption" ausgegeben!
    // Es wird nach Wert 4 gefragt, aber es gibt nur Wert 0 bis 3. Wert 4 ist nicht festgelegt!

}