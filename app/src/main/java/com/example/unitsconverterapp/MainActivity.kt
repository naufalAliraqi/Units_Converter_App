package com.example.unitsconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.view.get

class MainActivity : AppCompatActivity() {

    lateinit var radioGroupMain: RadioGroup
    lateinit var mainRadiochecked: RadioButton
    lateinit var fromRadiochecked: RadioButton
    lateinit var toRadiochecked: RadioButton


    lateinit var btn: Button
    lateinit var txt: TextView

    private lateinit var radioLength: RadioButton
    private lateinit var radioMass: RadioButton
    private lateinit var radioHeat: RadioButton

    lateinit var radioGroupLength: RadioGroup
    lateinit var radioGroupMass: RadioGroup
    lateinit var radioGroupHeat: RadioGroup

    lateinit var radioGroupLength2: RadioGroup
    lateinit var radioGroupMass2: RadioGroup
    lateinit var radioGroupHeat2: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        txt = findViewById(R.id.appNameText)

        radioGroupMain = findViewById(R.id.radioGroupMain)

        radioLength = findViewById(R.id.length)
        radioMass = findViewById(R.id.mass)
        radioHeat = findViewById(R.id.heat)

        radioGroupLength = findViewById(R.id.radioGroupLength)
        radioGroupMass = findViewById(R.id.radioMass)
        radioGroupHeat = findViewById(R.id.radioHeat)

        radioGroupLength2 = findViewById(R.id.radioGroupLength2)
        radioGroupMass2 = findViewById(R.id.radioMass2)
        radioGroupHeat2 = findViewById(R.id.radioHeat2)



        btn.setOnClickListener {
            btn.text = mainRadiochecked.text.toString()

            txt.text = fromRadiochecked.text.toString()
        }


        radioGroupMain.setOnCheckedChangeListener { radioGroup, i ->
            mainRadiochecked = findViewById<RadioButton>(radioGroupMain.checkedRadioButtonId)
        }


        radioLength.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                radioGroupLength.visibility = RadioGroup.VISIBLE
                radioGroupLength2.visibility = RadioGroup.VISIBLE
            } else {
                radioGroupLength.visibility = RadioGroup.GONE
                radioGroupLength2.visibility = RadioGroup.GONE
            }
        }

        radioMass.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                radioGroupMass.visibility = RadioGroup.VISIBLE
                radioGroupMass2.visibility = RadioGroup.VISIBLE
            } else {
                radioGroupMass.visibility = RadioGroup.GONE
                radioGroupMass2.visibility = RadioGroup.GONE
            }
        }

        radioHeat.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                radioGroupHeat.visibility = RadioGroup.VISIBLE
                radioGroupHeat2.visibility = RadioGroup.VISIBLE
            } else {
                radioGroupHeat.visibility = RadioGroup.GONE
                radioGroupHeat2.visibility = RadioGroup.GONE
            }
        }

        radioGroupLength.setOnCheckedChangeListener { radioGroup, i ->
            fromRadiochecked = findViewById<RadioButton>(radioGroupLength.checkedRadioButtonId)
        }

        radioGroupMass.setOnCheckedChangeListener { radioGroup, i ->
            fromRadiochecked = findViewById<RadioButton>(radioGroupMass.checkedRadioButtonId)
        }

        radioGroupHeat.setOnCheckedChangeListener { radioGroup, i ->
            fromRadiochecked = findViewById<RadioButton>(radioGroupHeat.checkedRadioButtonId)
        }

        radioGroupLength2.setOnCheckedChangeListener { radioGroup, i ->
            toRadiochecked = findViewById<RadioButton>(radioGroupLength2.checkedRadioButtonId)
        }

        radioGroupMass2.setOnCheckedChangeListener { radioGroup, i ->
            toRadiochecked = findViewById<RadioButton>(radioGroupMass2.checkedRadioButtonId)
        }

        radioGroupHeat2.setOnCheckedChangeListener { radioGroup, i ->
            toRadiochecked = findViewById<RadioButton>(radioGroupHeat2.checkedRadioButtonId)
        }
    }

















    private fun convertKilogramToGram(kilogramValue: Double) = kilogramValue * 1000

    private fun convertKilogramToPound(kilogramValue: Double) = kilogramValue * 2.205

    private fun convertKilogramToOunce(kilogramValue: Double) = kilogramValue * 35.274





    private fun convertPoundToOunce(poundValue: Double) = poundValue * 16

    private fun convertPoundToKilogram(poundValue: Double) = poundValue / 2.205

    private fun convertPoundToGram(poundValue: Double) =
        convertKilogramToGram(convertPoundToKilogram(poundValue))





    private fun convertOunceToPound(ounceValue: Double) = ounceValue / 16

    private fun convertOunceToGram(ounceValue: Double) = ounceValue * 28.3495

    private fun convertOunceToKilogram(ounceValue: Double) = convertKilogramToGram(convertOunceToGram(ounceValue))






    private fun convertGramToKilogram(gramValue: Double) = gramValue / 1000

    private fun convertGramToOunce(gramValue: Double) = gramValue / 28.35

    private fun convertGramToPound(gramValue: Double) =
        convertKilogramToPound(convertGramToKilogram(gramValue))









    private fun convertKilometerToCentimeter(kilometerValue: Double) =
        convertMeterToCentimeter(convertKilometerToMeter(kilometerValue))

    private fun convertKilometerToInch(kilometerValue: Double) =
        convertMeterToInch(convertKilometerToMeter(kilometerValue))

    private fun convertKilometerToMeter(kilometerValue: Double) = kilometerValue * 1000

    private fun convertKilometerToMile(kilometerValue: Double) = kilometerValue * 0.62137

    private fun convertKilometerToYard(kilometerValue: Double) = kilometerValue * 1093.61




    private fun convertCentimeterToMeter(centimeterValue: Double) = centimeterValue / 100

    private fun convertCentimeterToInch(centimeterValue: Double) = centimeterValue / 2.54

    private fun convertCentimeterToKilometer(centimeterValue: Double) =
        convertMeterToKilometer(convertCentimeterToMeter(centimeterValue))

    private fun convertCentimeterToMile(centimeterValue: Double) =
        convertMeterToMile(convertCentimeterToMeter(centimeterValue))

    private fun convertCentimeterToYard(centimeterValue: Double) =
        convertMeterToYard(convertCentimeterToMeter(centimeterValue))




    private fun convertMeterToKilometer(KilometerValue: Double) = KilometerValue / 1000

    private fun convertMeterToCentimeter(MeterValue: Double) = MeterValue * 100

    private fun convertMeterToInch(MeterValue: Double) = MeterValue * 39.37

    private fun convertMeterToMile(meterValue: Double) = meterValue / 1609

    private fun convertMeterToYard(meterValue: Double) =  meterValue * 1.09361




    private fun convertMileToKilometer(mileValue: Double) = mileValue * 1.609

    private fun convertMileToMeter(mileValue: Double) = mileValue * 1609

    private fun convertMileToYard(mileValue: Double) = mileValue * 1760

    private fun convertMileToInch(mileValue: Double) =
        convertYardToInch(convertMileToYard(mileValue))

    private fun convertMileToCentimeter(mileValue: Double) =
        convertMeterToCentimeter(convertMileToMeter(mileValue))




    private fun convertYardToMile(yardValue: Double) = yardValue / 1760

    private fun convertYardToInch(yardValue: Double) = yardValue * 36

    private fun convertYardToKilometer(yardValue: Double) = yardValue / 1093.61

    private fun convertYardToMeter(yardValue: Double) =  yardValue / 1.09361

    private fun convertYardToCentimeter(yardValue: Double) =  yardValue * 91.44




    private fun convertInchToCentimeter(inchValue: Double) = inchValue * 2.54

    private fun convertInchToYard(inchValue: Double) = inchValue / 36

    private fun convertInchToMeter(inchValue: Double) =
        convertCentimeterToMeter(convertInchToCentimeter(inchValue))

    private fun convertInchToKilometer(inchValue: Double) =
        convertMeterToKilometer(convertInchToMeter(inchValue))

    private fun convertInchToMile(inchValue: Double) =
        convertYardToMile(convertInchToYard(inchValue))











    private fun convertCelsiusToFahrenheit(CelsiusValue: Double) = CelsiusValue * 1.8 + 32

    fun convertCelsiusToKelvin(CelsiusValue: Double) = CelsiusValue + 273.15

    private fun convertFahrenheitToCelsius(FahrenheitValue: Double) = (FahrenheitValue - 32) / 1.8

    private fun convertKelvinToCelsius(KelvinValue: Double) = KelvinValue - 273.15

    fun convertKelvinToFahrenheit(KelvinValue: Double) =
        convertCelsiusToFahrenheit(convertKelvinToCelsius(KelvinValue))

    fun convertFahrenheitToKelvin(KelvinValue: Double) =
        convertCelsiusToFahrenheit(convertFahrenheitToCelsius(KelvinValue))
}