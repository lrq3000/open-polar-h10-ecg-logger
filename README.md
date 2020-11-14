# open-polar-h10-ecg-logger
An opensource Android logger for the Polar H10 sensor's ECG and accelerometer data

This app is intended to record ECG and accelerometer's data in streaming from the Polar H10 via Bluetooth BLE. It should also allow to interact with the internal memory so as to launch a recording session on the internal memory instead of using an external Android receiver phone, but note that in this case only heart rate and RR intervals (allowing to calculate heart rate variability) can be stored on the internal memory at a rate of 1 Hz, the ECG and accelerometer data cannot be stored there. For the 130 Hz ECG and up to 200 Hz accelerometer (3-axis) data, it's necessary to use a receiver phone with bluetooth to record the session.
