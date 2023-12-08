pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', '', 'Backend docker image tag')
        stringParam('frontendDockerTag', '', 'Frontend docker image tag')
}
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url('https://github.com/ukaszzz/App_of_apps')
                    }
                    branches('master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}