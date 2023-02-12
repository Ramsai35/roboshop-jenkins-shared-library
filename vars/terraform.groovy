def call() {
    pipeline{
        agent {
            node{
                label 'workstation'
            }
        }
        parameters {
            string(name: 'INFRA_ENV', defaultValue: '', description: 'Enter ENV like dev or prod')
        }

        stages {
            stage('Terraform Init') {
                steps{
                    sh "terraform  init -backend-config=env-${INFRA-ENV}/state.tfvars"
                }

            }


        }

    }
}
