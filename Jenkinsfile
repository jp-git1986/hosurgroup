//@Library('ecom-app-lib') _

#!groovy

@Library('shared-test') _
properties( [
    parameters([
        booleanParam(name:'truefalse', defaultValue:true, description:'boolean')
        ,string(name:'stringthing', defaultValue:'mary had a little lamb', description:'string')
    ])
] )

def _booleanvalue = params.truefalse
def _stringvalue = params.stringthing

paramEcho {
    booleanvalue = _booleanvalue
    stringvalue = _stringvalue
}

sayHello {
  slaveName = 'master'
//  var1 = 'jp'
//  var2 = 'shiva'
}
