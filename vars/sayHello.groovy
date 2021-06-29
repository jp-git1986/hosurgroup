def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    pipeline {
        agent 
        { 
            node
  		{
  			label "${params.slaveName}"
  		}
        }
        stages {
            stage("reading properties from properties file") {
    steps {
        // Use a script block to do custom scripting
        script {
          //  def props = readProperties file: 'extravars.properties'
         //   script {
  readProperties(file: extravars.properties).each {key, value -> env[key] = value }
//}
        //    env.var1 = props.var1
        //    env.var2 = props.var2
        }
        echo "The variable 1 value  is $var1"
        echo "The variable 2 value  is $var2"
    }
}
          stage ('stage2') {
            steps {
                sh "echo ${var1}"
                sh "echo ${var2}"
            }
    }
        }
      }
}
