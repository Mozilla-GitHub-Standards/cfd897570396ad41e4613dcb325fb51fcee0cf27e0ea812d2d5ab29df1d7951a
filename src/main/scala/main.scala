import scala.xml.XML


object Main {
  def main(args: Array[String]) = {
    
     val lines = scala.io.Source.fromFile("src/main/resources/eu-001-reg.xml").mkString
     
     val xml = XML.loadFile("src/main/resources/eu-001-reg.xml")
     
     println(xml \ "table" \ "@id")
     println(xml \ "table" \ "region" \ "@id")
     println(xml \ "table" \ "region" \ "@page")

  }
}