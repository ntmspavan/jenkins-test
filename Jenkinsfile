pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                    echo 'Checked out..'
                    echo "${BRANCH_NAME}"
                    script{
                        def BNAME = sh(script: "echo 'Pavan'", returnStdout:true).trim()
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
