def call() {
  pipeline {
    agent {
      label "${BUILD_LABEL}"
    }

    triggers {
      pollSCM('H/2 * * * *')
    }

    stages {


      stage('Check the Code Quality') {
        steps {
          script {
            common.sonarQube()
          }
        }
      }

      stage('Lint Checks') {
        steps {
          sh 'echo Lint Cases'
        }
      }

      stage('Test Cases') {
        steps {
          sh 'echo Test Cases'
        }
      }

      stage('Publish Artifacts') {
        steps {
          script {
            sh 'echo publish artifact'
            sh 'env'
          }
        }
      }

    }

    post {
      always {
        cleanWs()
      }
    }

  }
}

