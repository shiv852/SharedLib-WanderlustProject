def call(){
  timeout(time: 40, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
