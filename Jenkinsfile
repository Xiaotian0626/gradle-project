pipeline {
    agent {
        node {
            label "docker-image-agent"
        }
    }


    triggers {
        pollSCM "* * * * *"
    }

    stages {
        stage("build") {
            steps {
                echo "build"
                sh '''
                ./gradlew build
                '''
            }
        }

        stage("delivery") {
             steps {
                echo "delivery"
                sh '''
                java -jar build/lib/gradle-project-0.0.1-SNAPSHOT.jar
                 '''
            }
        }
    }
}