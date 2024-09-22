pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator'
        GITHUB_REPO_URL = 'https://github.com/Suyashchavan10/Calculator_Mini_Project.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Maven Project') {
            steps {
                script {
                    // create the jar file
                    sh 'mvn clean package'
                    // dir("Calculator_Maven") {
                        // sh 'mvn clean package'
                    // }
                }
            }
        }

//         stage('Unit Testing') {
//             steps {
//                 script {
//                     // do unit testing
//                     dir("Calculator_Maven") {
//                         sh 'mvn test'
//                     }
//                 }
//             }
//         }

//         stage('Build Docker Image') {
//             steps {
//                 script {
//                     // Build Docker image
//                     docker.build("${DOCKER_IMAGE_NAME}", '.')
//                 }
//             }
//         }

//         stage('Push Docker Images') {
//             steps {
//                 script{
//                     docker.withRegistry('', 'DockerHubCred') {
//                     sh 'docker tag calculator suyash1910/calculator:latest'
//                     sh 'docker push suyash1910/calculator'
//                     }
//                  }
//             }
//         }

//    stage('Run Ansible Playbook') {
//             steps {
//                 script {
//                     ansiblePlaybook(
//                         installation: 'Ansible',
//                         playbook: 'deploy.yml',
//                         inventory: 'inventory.ini'
//                      )
//                 }
//             }
//         }

    }
}