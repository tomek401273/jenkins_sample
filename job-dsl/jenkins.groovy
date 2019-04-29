pipelineJob("simple-pipeline") {
    description()
    keepDependencies(false)
    definition {
        cpsScm {
            """node('master') {
stage('checkout') {
 git 'https://github.com/tomek401273/jenkins_sample'
}

stage('checkout2') {
sh label: '', script: 'docker build -t tomek/jenkins:1 .'
}

stage('checkout3') {
 sh label: '', script: 'docker run -d -p 1000:8080 tomek/jenkins:1'
}
}"""		}
    }
    disabled(false)
}
