object ScalaFilesInDirectory extends App {
  val filesHere = (new java.io.File(".")).listFiles
  
  for (
    file <- filesHere
    if file.getName.endsWith(".scala")
    if file.isFile
  )
    println(file)
}