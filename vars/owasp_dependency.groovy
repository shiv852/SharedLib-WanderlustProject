def call() {
    stage('OWASP: Dependency check') {
        script {
            nodejs('Node16') {
                // Install dependencies for backend
                dir('backend') {
                    sh 'npm install'
                }

                // Install dependencies for frontend
                dir('frontend') {
                    sh 'npm install'
                }
            }

            // Run OWASP Dependency-Check
            dependencyCheck additionalArguments: '''
                --disableNodeAudit 
                --disableAssembly 
                --disableYarnAudit 
                --scan ./backend 
                --scan ./frontend 
                --format XML
            ''', odcInstallation: 'OWASP'

            // Publish the results
            dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
        }
    }
}
