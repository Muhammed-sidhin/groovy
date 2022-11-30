def buildApp() {
    echo 'build the application'
}

def testApp() {
    echo 'testing the application'
}

def deployApp() {
    echo 'deploying the application'
    sh 'echo deploying version is ${VERSION}'
}

return this
