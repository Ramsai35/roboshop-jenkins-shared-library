def call() {

    pipeline {
        agent {
            label 'workstation'
        }
    stages {
        stage('Compile/Build') {
            steps{
                echo 'compile'
            }
        }

        stage('Unit Test') {
            steps{
                echo 'unit Test'
            }
        }

        stage('Quality Control') {
            steps {
                echo 'Quality control'
            }
        }

        stage('Upload Code Into S3 bucket'){
            steps {
                echo 'Upload'
            }
        }
    }

    }

}
