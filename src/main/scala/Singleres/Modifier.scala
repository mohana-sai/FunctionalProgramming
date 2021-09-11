package Singleres

  import java.util.Scanner
  import scala.annotation.tailrec

  object Modifier extends App {

    val text = (text: String) => text

    // S1r3
    val modifiedText = (textToBeModified: String) =>  {

      @tailrec
      def modify(accumulator: String, index: Int): String = {

        if (index == textToBeModified.length)
          return accumulator
        var temporaryVariable: String = textToBeModified.charAt(index).toString
        if (index % 2 != 0)
          temporaryVariable = index.toString

        modify(accumulator + temporaryVariable, index + 1)

      }
      modify("",0)
    }


    val reversedText = (text: String) => text.reverse
    //print(text())

    (new Print).print(modifiedText(text("Mohana sai ")))

    (new Print).print(reversedText(text("Kumar reddy")))

  }

