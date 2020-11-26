pipeline {
  agent { docker { image 'ubuntu:20.04lts' }}
  stages {
    stage('source') {
      steps {
        sh 'echo testing pipeline'
      }
    }

    stage('build') {
      steps {
        echo 'building step fourth attempt'
      }
    }

    stage('test') {
      steps {
        timestamps() {
          sleep 5
        }

      }
    }

  }
  environment {
    lifecycle = 'prod'
  }
}
