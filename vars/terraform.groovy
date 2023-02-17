def call() {
    pipeline{
        agent {
            node {
                label 'workstation'
            }
        }
        options {
            ansiColor('xterm')
        }


        parameters {
            string(name: 'INFRA_ENV', defaultValue: '', description: 'Enter ENV like dev or prod')
        }

        stages {

            stage('Terraform Init') {
                steps {
                    sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
                }
            }


        }

    }
}
