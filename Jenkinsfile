pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                    echo 'Checked out..'
                    echo "${BRANCH_NAME}"
                    script{
                        def BNAME = sh(script: "${BRANCH_NAME} | awk -F '/' '{print $2}'", returnStdout:true).trim()
                        }
                    echo "${BNAME}"
                  
} }
          stage('Test') {
              steps {
                  echo 'Testing..'
              }
          }
          stage('Deploy') {
              steps {
                  echo 'Deploying....'
} }
} }
