pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                    echo 'Checked out..'
                    echo "${BRANCH_NAME}"
                    script{
                        def branch = sh(script: "echo ${BRANCH_NAME}|awk -F '/' '{print $2}' ", returnStdout:true)
                          echo "${branch}"
                        }
                    
                  
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
