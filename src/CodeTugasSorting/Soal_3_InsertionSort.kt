package CodeTugasSorting

fun main() {
    println("Nama : Rosyid Mukti Wibowo")
    println("NIM : 2211104076")
    val data = intArrayOf(3, 8, 1, 2, 23, 6, 4, 0, 11, 3, -2, 5)

    // Insertion Sort Ascending
    val dataAscending = insertionSortAscending(data.copyOf())
    println("Angka Ascending: ${dataAscending.contentToString()}")

    // Insertion Sort Descending
    val dataDescending = insertionSortDescending(data.copyOf())
    println("Angka Descending: ${dataDescending.contentToString()}")
}

fun insertionSortAscending(data: IntArray): IntArray {
    for (i in 1 until data.size) {
        val currentElement = data[i]
        var j = i - 1
        while (j >= 0 && data[j] > currentElement) {
            data[j + 1] = data[j]
            j--
        }
        data[j + 1] = currentElement
    }
    return data
}

fun insertionSortDescending(data: IntArray): IntArray {
    for (i in 1 until data.size) {
        val currentElement = data[i]
        var j = i - 1
        while (j >= 0 && data[j] < currentElement) {
            data[j + 1] = data[j]
            j--
        }
        data[j + 1] = currentElement
    }
    return data
}
