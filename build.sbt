enablePlugins(ScalaJSPlugin)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
//enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.8" // or any other Scala version >= 2.10.2

// This is an application with a main method
// scalaJSUseMainModuleInitializer := true
