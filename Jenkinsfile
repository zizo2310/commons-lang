pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'sh \'./mvnw compile\''
      }
    }

    stage('test ') {
      steps {
        sh ' sh \'./mvnw test\''
      }
    }

    stage('package') {
      steps {
        sh 'sh \'./mvnw package\''
      }
    }

  }
}