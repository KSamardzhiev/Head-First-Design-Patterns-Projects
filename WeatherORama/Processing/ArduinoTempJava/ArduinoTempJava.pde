import processing.serial.*;
Serial mySerial;
PrintWriter output;
void setup() {
   //println(Serial.list());
   mySerial = new Serial( this, Serial.list()[2], 9600 );
   output = createWriter( "data.txt" );
}
void draw() {
    if (mySerial.available() > 0 ) {
         String value = mySerial.readString();
        //println(value);
         if ( value != null ) {
           println(value);
           output.print( value );
           output.flush();
         }
    }
}

void keyPressed() {
    output.flush();  // Writes the remaining data to the file
    output.close();  // Finishes the file
    exit();  // Stops the program
}