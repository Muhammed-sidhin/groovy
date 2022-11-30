def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0', '1.1', '1.2'], description: 'Choice names' )
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Boolean name')
    }
    stages {
        stage ("Init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage ("Build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage ("Test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage ("Deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
