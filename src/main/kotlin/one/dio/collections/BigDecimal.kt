package one.dio.collections

import java.math.BigDecimal

fun Array<BigDecimal>.mySum() = this.reduce{
    acc, value -> acc + value
}

fun Array<BigDecimal>.myAverage() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.mySum() / this.size.toBigDecimal()