pipeline {
  agent { docker { image 'ubuntu:20.04lts' }}
  stages {
    stage('source') {
      steps {
        sh 'echo testing pipeline'
      }
    }

    stage('build') {
      parallel {
        stage('build') {
          steps {
            echo 'building step'
          }
        }

        stage('buildstatus') {
          steps {
            echo 'build in progress'
          }
        }

    stage('test') {
      steps {
        timestamps() {
          sleep 5
        }

      }
    }

    stage('deploy') {
      steps {
        echo 'deployment over'
      }
    }

    stage('post section') {
      steps {
        chuckNorris()
      }
    }

  environment {
    lifecycle = 'prod'
  }
}
