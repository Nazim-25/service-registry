pipeline {
    agent any
    tools{
        maven 'Maven3'
    }
     stages{
        stage('Build Maven'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Nazim-25/service-registry']]])
                bat 'mvn clean install'
            }
        }
         stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t nazimdocker01a/service-registry:latest .'
                }
            }
        }
        
            stage('Push image to Hub'){
            steps{
                script{
               
                   bat 'docker login -u nazimdocker01a -p dckr_pat_cFb-miojUMbr5aCt54P45orpVgY'

                
                   bat 'docker push  nazimdocker01a/service-registry'
                }
            }
        }
    }
}