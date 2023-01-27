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




    }

    }

}
