pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        sh 'echo testing pipelinejob'
      }
    }

    stage('build') {
      steps {
        echo 'building step second attempt'
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
