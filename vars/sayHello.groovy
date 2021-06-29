def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    pipeline {
      agent any
        stages {
          stage ('stage1') {
            steps {
                sh 'echo ${pipelineParams.var1}'
                sh 'echo ${pipelineParams.var2}'
            }
    }
        }
      }
}
