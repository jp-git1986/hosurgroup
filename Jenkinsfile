pipeline {
  agent { docker { image 'centos:latest' }}
  stages {
    stage('source') {
      steps {
        tool name: 'git1', type: 'git'
        git branch: 'v1.0', url: 'https://github.com/jp-git1986/hosurgroup/'
        sh 'echo testing pipeline'
      }
    }
  }
}
