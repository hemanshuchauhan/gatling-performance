pipeline {
    agent any
	tools {
        maven 'Maven-3.6'
    }
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test'
            }
            post {
                always {
                    dir('target') {
                        archive includes: 'gatling/*'
                        archive includes: 'gatling/**/*'
                        gatlingArchive()
                    }
                }
            }
        }
    }
}