pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                  echo 'Building..'
                  script{
                        def BNAME= sh 'echo ${BRANCH_NAME} | awk -F '/' '{print $2}''
                  }

                 echo "$BNAME"
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
