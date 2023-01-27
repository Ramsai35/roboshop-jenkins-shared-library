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




    }

    }

}
