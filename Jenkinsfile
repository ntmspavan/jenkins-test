pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                    echo 'Checked out..'
                    echo "${BRANCH_NAME}"
                    script{
                        def branch = sh(script: "echo ${BRANCH_NAME} ", returnStdout:true)
                          echo "${branch}"
                        }
                    
                  
} }
          stage('Test') {
              steps {
                  echo 'Testing..'
                    script{
                          echo "${branch} from Test"
                    }
              }
          }
          stage('Deploy') {
              steps {
                  echo 'Deploying....'
} }
} }
