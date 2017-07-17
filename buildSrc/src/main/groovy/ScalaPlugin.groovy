import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/06
 */
class ScalaPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.apply {
            plugin: 'groovy'
            plugin: "com.github.maiflai.scalatest"
        }

        project.dependencies {
            compile "org.scala-lang:scala-library:$scalaVersion"
            testCompile "org.scalatest:scalatest_2.12:$scalaTestVersion"
            testRuntime "org.pegdown:pegdown:$pegdownVersion"
        }

    }

}
