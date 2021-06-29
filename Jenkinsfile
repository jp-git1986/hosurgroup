//@Library('ecom-app-lib') _

@Library('shared-test') _
properties( [
    parameters([
        choice(choices: ['10.80.66.171','10.80.67.6','10.80.67.200'], description: 'Select a host to be delpoyed', name: 'host')
        ,string(defaultValue: 'f672054-1.x86_64', description: 'Enter app version', name: 'app_version')
    ])
] )

def _hostIp = params.host
def _appVersion = params.app_version

sayHello {
  slaveName = 'master'
  hostIp = _hostIp
  appVersion = _appVersion
//  var1 = 'jp'
//  var2 = 'shiva'
}
