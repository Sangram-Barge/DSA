package main

import "fmt"

func main() {
  fmt.Println("c", whatCase('c'))
  fmt.Println("D", whatCase('D'))
  fmt.Println("u", whatCase('u'))
  fmt.Println("0", whatCase('0'))
  fmt.Println("T", whatCase('T'))
}

func whatCase(c int) string {
  if c > 64 && c < 91  {
    return "Uppercase"
  } else if c > 96 && c < 123 {
    return "Lowercase"
  }
  return "invalid input"
}
