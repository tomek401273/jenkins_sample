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
            println("This script will not work without a properly set up docker environment. Please define the environment variable 'DOCKER_HOST'")
            runningDockers = "docker ps -q".execute().text.split(/\n/)
            runningDockers.each {id -> println("docker stop ${id}".execute().text)}
            println('end of message!!')
    }
}
