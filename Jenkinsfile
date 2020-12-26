pipeline {
  agent { docker { image 'centos:latest' }}
  stages {
    stage('source') {
      steps {
        git branch: 'v1.0', url: 'https://github.com/jp-git1986/hosurgroup/'
        sh 'echo testing pipeline'
      }
    }
  }
}
