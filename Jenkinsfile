node('master') {
stage('checkout') {
 git 'https://github.com/tomek401273/jenkins_sample'
}

stage('checkout2') {
sh label: '', script: 'docker build -t pipe/jenkins:4 .'
}

stage('checkout3') {
 sh label: '', script: 'docker run -d -p 1000:8080 pipe/jenkins:4'
}
}