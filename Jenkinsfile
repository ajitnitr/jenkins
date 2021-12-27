//node {
//  stage('One') {
//    sh 'echo Hello'
//  }
//  stage('Two') {
//    sh 'echo Hello'
//  }
//}
//

// Agent example

//pipeline {
//  agent any
//  agent none
//  agent {
//    node { 'workstation'}
//  }
//  agent {
//    label { 'ANSIBLE && CENTOS' }
//  }
//
//  stages {
//    stage('sample') {
//      agent { label 'UBUNTU' }
//      steps {
//        sh 'echo heloo'
//      }
//    }
//  }
//
//}

// options example

//pipeline {
//  agent any
//  options { disableConcurrentBuilds() }
//  stages {
//    stage('ONE') {
//      steps {
//        sh 'sleep 10'
//      }
//    }
//  }
//}

// environment example

//pipeline {
//  agent any
//  environment {
//    URL1 = "google.com"
//    SSH = credentials("CENTOS")
//    SSH1 = credentials("common/ssh")
//  }
//  stages {
//    stage('ONE') {
//      environment {
//        URL1 = "yahoo.com"
//      }
//      steps {
//        sh 'echo ${URL1}'
//        sh 'env'
//        echo SSH
//        sh 'echo ${SSH1} | base64'
//      }
//    }
//  }
//}

// Parameters example

//
//pipeline {
//  agent any
//  parameters {
//    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
//
//    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')
//
//    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')
//
//    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')
//
//    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
//  }
//  stages {
//    stage('Example') {
//      steps {
//        echo "Hello ${params.PERSON}"
//
//        echo "Biography: ${params.BIOGRAPHY}"
//
//        echo "Toggle: ${params.TOGGLE}"
//
//        echo "Choice: ${params.CHOICE}"
//
//        echo "Password: ${params.PASSWORD}"
//      }
//    }
//  }
//}

// tools example

pipeline {
  agent any
  stages {
    stage('Maven') {
      steps {
        sh 'mvn --version'
      }
    }
  }
}

