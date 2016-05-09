publishMavenStyle := false

publishArtifact in Test := false

bintrayPackageLabels := Seq("sbt", "jacoco")

bintrayOrganization := Some("mediacluster")

bintrayVcsUrl := Some("git@github.com:maichler/jacoco4sbt.git")

licenses += ("EPL-1.0", url("https://opensource.org/licenses/eclipse-1.0.php"))
