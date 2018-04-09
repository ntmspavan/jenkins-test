pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                  echo 'Building..'
                  script{
                  #def branch = sh echo origin/Jenkins_pipeline | awk -F '/' '{print ${2}}'
                        BNAME=`echo ${BRANCH_NAME} | awk -F '/' '{print $2}'`
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
