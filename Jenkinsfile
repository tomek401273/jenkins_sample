node('master') {


stage('checkout') {
 git 'https://github.com/tomek401273/jenkins_sample'
}

 def commit_id
   stage('Preparation') {
     checkout scm
     sh "git rev-parse --short HEAD > .git/commit-id"
     commit_id = readFile('.git/commit-id').trim()
     println(commit_id);
     println(commit_id);
   }

def app
stage('checkout2') {
 app = docker.build("pipe/jenkins:${commit_id}", '.')
}

stage('checkout3') {
 app.run()
}

stage('checkout4') {
    def ubuntu = docker.image('rabbitmq:3.7.6-management')
    ubuntu.inside {
    sh 'touch lubie-placki-123.txt'
    }
}


}