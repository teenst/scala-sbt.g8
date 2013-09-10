import sbt._
import sbt.Keys._
import sbtassembly.Plugin._
import AssemblyKeys._

object $name;format="Camel"$Build extends Build {
    lazy val $name;format="camel"$ = Project(
        id = "$name;format="norm"$",
        base = file("."),
        settings = Project.defaultSettings ++ Seq(
            name := "$name$",
            organization := "$organization$",
            version := "$version$",
            scalaVersion := "$scala_version$",
            libraryDependencies ++= Seq(
                "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
            )
        ) ++ assemblySettings
    )
}
