package CodeTugasSorting

fun main() {
    println("Nama : Rosyid Mukti Wibowo")
    println("NIM : 2211104076")
    fun bubbleSort(data: IntArray): IntArray {
        var isSorted = false
        var n = data.size - 1

        while (!isSorted && n > 0) {
            isSorted = true

            for (i in 0 until n) {
                if (data[i] > data[i + 1]) {
                    val temp = data[i]
                    data[i] = data[i + 1]
                    data[i + 1] = temp

                    isSorted = false
                }
            }

            n--
        }

        return data
    }
    val data = intArrayOf(1,7,4,3,6)
    val sortedData = bubbleSort(data)

    println("Angka Ascending = ${sortedData.sorted()}")
}

