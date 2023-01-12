pipeline{
    agent any
    tools{
        maven "MAVEN_HOME"
    }
    
    stages {
        stage('Git Clone'){
            steps {
                git branch: 'main', url: 'https://github.com/abhishek793/spring-boot-project.git'
                echo "Cloning code from github"
            }
        }
        stage('Maven Build'){
            steps{
                bat 'mvn compile'
                echo 'Building maven project'
            }
        }
        stage('Maven Test'){
            steps{
                bat 'mvn test'
                echo 'Testing maven project'
            }
        }
    }
}
