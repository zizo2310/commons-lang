pipeline
    agent any
    stages {
        stage('Check 8 commits') {
            steps {
                def build_num = env.BUILD_NUMBER as int
                if (build_num % 8 != 0) { error "This is not 8th commit" }
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
