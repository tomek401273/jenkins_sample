job("seed-my") {
    description()
    keepDependencies(false)
    scm {
        git {
            remote {
                github("tomek401273/jenkins_sample", "https")
            }
            branch("*/master")
        }
    }
    disabled(false)
    concurrentBuild(false)

    steps {
        shell("docker build -t tomek/jenkins:1 .")
        shell("docker run -d -p 1000:8080 tomek/jenkins:1")
    }
}
