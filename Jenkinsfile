pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''def build_num = env.BUILD_NUMBER as int
                if (build_num % 8 != 0) {
                    error "This is not 8th commit"
}
eslse {sh \'./mvnw compile\'}'''
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