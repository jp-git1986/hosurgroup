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
