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
//        shell("docker build -t tomek/jenkins:1 .")
//        shell("docker run -d -p 1000:8080 tomek/jenkins:1")


        def env = System.getenv()


            println("This script will not work without a properly set up docker environment. Please define the environment variable 'DOCKER_HOST'")
            false

            runningDockers = "docker ps -q".execute().text.split(/\n/)
            runningDockers.each {id -> println("docker stop ${id}".execute().text)}
        println('end of message!!')

//            stoppedDockers = "docker ps -a -f status=exited -q".execute().text.split(/\n/)
//            stoppedDockers.each {id -> println("docker rm ${id}".execute().text)}
//
//            dockerImages = "docker images".execute().text.split(/\n/)
//            snapshotImages = dockerImages.findAll{ it.contains("SNAPSHOT") || it.contains("<none>") }
//            snapshotImages.each {output -> println("docker rmi ${output.split()[2]}".execute().text)}





    }
}
