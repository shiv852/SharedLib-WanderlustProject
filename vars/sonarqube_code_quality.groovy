def call(){
  timeout(time: 25, unit: "MINUTES"){
       waitForQualityGate abortPipeline: true
  }
}
