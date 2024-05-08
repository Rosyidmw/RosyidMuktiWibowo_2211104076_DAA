package CodeTugasSorting

fun main() {
    println("Nama : Rosyid Mukti Wibowo")
    println("NIM : 2211104076")

    fun selectionSort(data: IntArray): IntArray {
        for (i in 0 until data.size - 1) {
            var maxIndex = i

            for (j in i + 1 until data.size) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j
                }
            }

            if (maxIndex != i) {
                val temp = data[i]
                data[i] = data[maxIndex]
                data[maxIndex] = temp
            }
        }

        return data
    }

    val data = intArrayOf(34,42,4,16,21,9,13)
    val sortedData = selectionSort(data)

    println("Angka Descending : ${sortedData.sortedDescending()}")
}

