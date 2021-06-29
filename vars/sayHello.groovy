class jsParams implements Serializable {
  //
  static giveMeParameters (script) {
    return [
      // Some parms
      script.string(defaultValue: 'f672054-1.x86_64', description: 'Enter app version', name: 'app_version'),
      script.choice(choices: ['10.80.66.171','10.80.67.6','10.80.67.200'], description: 'Select a host to be delpoyed', name: 'host'),
    ]
  }
}


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
  			label "${pipelineParams.slaveName}"
  		}
        }
        stages {
          stage('Setup parameters') {
            steps {
                script { 
				properties [(
  parameters [(
    jsParams.giveMeParameters (this)
  )]
					)]
  }
  }
	  }
            stage("reading properties from properties file") {
    steps {
        // Use a script block to do custom scripting
        script {
          //  def props = readProperties file: 'extravars.properties'
         //   script {
  readProperties(file: 'extravars.properties').each {key, value -> env[key] = value }
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
