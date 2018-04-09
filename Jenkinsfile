pipeline {
agent any

      stages {
          stage('Build') {
              steps {
                  echo 'Building..'
                  script{
                  def branch = sh echo origin/Jenkins_pipeline | awk -F '/' '{print ${2}}'
                  }

                 echo "$branch"
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
