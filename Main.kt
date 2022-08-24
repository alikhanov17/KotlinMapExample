fun main() {
    val car = HashMap<Int,Car>()
    val car2 = HashMap<Int,Car>()
    val map = HashMap<Int,Car>()

    car.put(1,Car("bmw",1434333))
    car.put(2,Car("mazda",746433))
    map.putAll(car2)
    map.putAll(car)


    map.forEach{r->
        println(r.value.name)
        println(r.value.price)
    }



}