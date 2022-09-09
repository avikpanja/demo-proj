pipeline {
    agent any
    environment {
        dockerHome = tool 'myDocker'
        mavenHome = tool 'myMaven'
        PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
    }
    stages {
        stage('Checkout'){
            steps {
                echo "PATH - $PATH"
                echo "Build Id - $env.BUILD_ID"
                echo "Build Tag - $env.BUILD_TAG"
                echo "Build Name - $env.BUILD_NAME"
                echo "Build URL - $env.BUILD_URL"
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
    }
    }
