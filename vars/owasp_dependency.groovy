def call() {
    // Install dependencies before scanning
    dir('backend') {
        sh 'npm install'
    }
    dir('frontend') {
        sh 'npm install'
    }

    // Run Dependency-Check
    dependencyCheck additionalArguments: '''
        --disableNodeAudit 
        --scan ./backend 
        --scan ./frontend 
        --format XML
    ''', odcInstallation: 'OWASP'

    // Publish the results
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
