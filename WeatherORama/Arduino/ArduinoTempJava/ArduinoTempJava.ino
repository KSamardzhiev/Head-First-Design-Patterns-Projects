const int sensorTempPin = A0;
const int sensorLightPin = A1;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  delay(6000);
  int sensorTempVal = analogRead(sensorTempPin);
  int sensorLightVal = analogRead(sensorLightPin);
  float temp = ((((sensorTempVal)/1024.)*5.0)-.5)*100;
  //Serial.print("Temp sensor value: ");
  Serial.print(temp);
  Serial.print(" ");
  //Serial.print("Light sensor value: ");
  Serial.println(sensorLightVal/4);

}
