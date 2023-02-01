def call() {

    pipeline {
        agent {
            label 'workstation'
        }
    stages {
        stage('Compile/Build') {
            steps{
                script{
                    common.compile()
                }
            }
        }

        stage('Unit Test') {
            steps{
                common.unittests()
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
