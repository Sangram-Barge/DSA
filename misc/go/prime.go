package main

import (
	"fmt"
	"math"
)

func main() {
  for i := 0; i < 100; i++ {
    fmt.Println(i, "is prime", isPrime(uint(i)))
  }
}

func isPrime(num uint) bool {
  var c uint = 2
  if num < c {
    return true
  }
  for ; float64(c) <= math.Sqrt(float64(num)); c++ {
    if num % c == 0 {
      return false
    }
  }
  return true
}
