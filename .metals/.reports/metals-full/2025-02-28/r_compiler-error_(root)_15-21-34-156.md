file://<WORKSPACE>/app/actions/UserAction.scala
### java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Symbols$Symbol.isModule()" because the return value of "scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.methodSym()" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.16
Classpath:
<WORKSPACE>/conf [exists ], <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-BI-ROzOgTtin7EdZnYa6UA== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/twirl-api_2.13/1.6.8/twirl-api_2.13-1.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-server_2.13/2.9.6/play-server_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-akka-http-server_2.13/2.9.6/play-akka-http-server_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-logback_2.13/2.9.6/play-logback_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-filters-helpers_2.13/2.9.6/play-filters-helpers_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-guice_2.13/2.9.6/play-guice_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-jdbc_2.13/2.9.6/play-jdbc_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.0.33/mysql-connector-j-8.0.33.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/at/favre/lib/bcrypt/0.10.2/bcrypt-0.10.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/jwt-scala/jwt-play-json_2.13/10.0.4/jwt-play-json_2.13-10.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/2.2.0/scala-xml_2.13-2.2.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play_2.13/2.9.6/play_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-streams_2.13/2.9.6/play-streams_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.5.12/logback-classic-1.5.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/6.0.0/guice-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/6.0.0/guice-assistedinject-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-jdbc-api_2.13/2.9.6/play-jdbc-api_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/5.0.1/HikariCP-5.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/googlecode/usc/jdbcdslog/1.0.6.2/jdbcdslog-1.0.6.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/tyrex/tyrex/1.0.1/tyrex-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.21.9/protobuf-java-3.21.9.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/at/favre/lib/bytes/1.5.0/bytes-1.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/jwt-scala/jwt-json-common_2.13/10.0.4/jwt-json-common_2.13-10.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-json_2.13/3.0.4/play-json_2.13-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-build-link/2.9.6/play-build-link-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-configuration_2.13/2.9.6/play-configuration_2.13-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/2.0.16/jcl-over-slf4j-2.0.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor-typed_2.13/2.6.21/akka-actor-typed_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.13/2.6.21/akka-slf4j_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-serialization-jackson_2.13/2.6.21/akka-serialization-jackson_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.3/jackson-core-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.3/jackson-annotations-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.14.3/jackson-datatype-jdk8-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.14.3/jackson-datatype-jsr310-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.3/jackson-databind-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.14.3/jackson-dataformat-cbor-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.3/jackson-module-parameter-names-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-scala_2.13/2.14.3/jackson-module-scala_2.13-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-api/0.11.5/jjwt-api-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-impl/0.11.5/jjwt-impl-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-jackson/0.11.5/jjwt-jackson-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-json_2.13/2.10.6/play-json_2.13-2.10.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/32.1.3-jre/guava-32.1.3-jre.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.6.1/ssl-config-core_2.13-0.6.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.5.12/logback-core-1.5.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.21.1/error_prone_annotations-2.21.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/jwt-scala/jwt-core_2.13/10.0.4/jwt-core_2.13-10.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-functional_2.13/3.0.4/play-functional_2.13-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.16/scala-reflect-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-exceptions/2.9.6/play-exceptions-2.9.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.3/config-1.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.0/scala-java8-compat_2.13-1.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/play/play-functional_2.13/2.10.6/play-functional_2.13-2.10.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.37.0/checker-qual-3.37.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j2objc-annotations-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar [exists ]
Options:
-deprecation -unchecked -encoding utf8 -Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 548
uri: file://<WORKSPACE>/app/actions/UserAction.scala
text:
```scala
import play.api.mvc._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import javax.inject.Inject
import models.User

class UserRequest[A](val user: Option[User], request: Request[A])
    extends WrappedRequest[A](request)

class UserAction @Inject() (val parser: BodyParsers.Default)(implicit
    val executionContext: ExecutionContext
) extends ActionBuilder[UserRequest, AnyContent]
    with ActionTransformer[Request, UserRequest] {
  def transform[A](request: Request[A]) = Future.successful {


    new UserRequest(User@@, request)
  }
}

```



#### Error stacktrace:

```
scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.methodsParams$lzycompute(ArgCompletions.scala:30)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.methodsParams(ArgCompletions.scala:29)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.allParams$lzycompute(ArgCompletions.scala:81)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.allParams(ArgCompletions.scala:81)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.params$lzycompute(ArgCompletions.scala:83)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.params(ArgCompletions.scala:82)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.isParamName$lzycompute(ArgCompletions.scala:90)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.isParamName(ArgCompletions.scala:90)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.isName(ArgCompletions.scala:96)
	scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.compare(ArgCompletions.scala:99)
	scala.meta.internal.pc.completions.Completions$$anon$1.compare(Completions.scala:236)
	scala.meta.internal.pc.completions.Completions$$anon$1.compare(Completions.scala:192)
	java.base/java.util.TimSort.countRunAndMakeAscending(TimSort.java:355)
	java.base/java.util.TimSort.sort(TimSort.java:220)
	java.base/java.util.Arrays.sort(Arrays.java:1233)
	scala.collection.SeqOps.sorted(Seq.scala:728)
	scala.collection.SeqOps.sorted$(Seq.scala:719)
	scala.collection.immutable.List.scala$collection$immutable$StrictOptimizedSeqOps$$super$sorted(List.scala:79)
	scala.collection.immutable.StrictOptimizedSeqOps.sorted(StrictOptimizedSeqOps.scala:82)
	scala.collection.immutable.StrictOptimizedSeqOps.sorted$(StrictOptimizedSeqOps.scala:82)
	scala.collection.immutable.List.sorted(List.scala:79)
	scala.meta.internal.pc.CompletionProvider.completions(CompletionProvider.scala:73)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$complete$1(ScalaPresentationCompiler.scala:224)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Symbols$Symbol.isModule()" because the return value of "scala.meta.internal.pc.completions.ArgCompletions$ArgCompletion.methodSym()" is null