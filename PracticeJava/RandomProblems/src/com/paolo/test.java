package com.paolo;

public class test {

    input birthDate;
    input birthMonth;

    if (birthMonth == "January"){
        if (birthDate <= 19)
            zodiacSign = "Capricorn";
        else zodiacSign = "Aquarius";
    } else if (birthMonth == "February"){
        if (birthDate <= 19)
            zodiacSign = "Aquarius";
        else zodiacSign = "Pisces";
    }else if (birthMonth == "March"){
        if (birthDate <= 20)
            zodiacSign = "Pisces";
        else zodiacSign = "Aries";
    }else if (birthMonth == "April"){
        if (birthDate <= 20)
            zodiacSign = "Aries";
        else zodiacSign = "Taurus";
    }else if (birthMonth == "May"){
        if (birthDate <= 20)
            zodiacSign = "Taurus";
        else zodiacSign = "Gemini";
    }else if (birthMonth == "June"){
        if (birthDate <= 20)
            zodiacSign = "Gemini";
        else zodiacSign = "Cancer";
    }else if (birthMonth == "July"){
        if (birthDate <= 22)
            zodiacSign = "Cancer";
        else zodiacSign = "Leo";
    }else if (birthMonth == "August"){
        if (birthDate <= 22)
            zodiacSign = "Leo";
        else zodiacSign = "Virgo";
    }else if (birthMonth == "September"){
        if (birthDate <= 22)
            zodiacSign = "Virgo";
        else zodiacSign = "Libra";
    }else if (birthMonth == "October"){
        if (birthDate <= 22)
            zodiacSign = "Libra";
        else zodiacSign = "Scorpio";
    }else if (birthMonth == "November"){
        if (birthDate <= 22)
            zodiacSign = "Scorpio";
        else zodiacSign = "Sagittarius";
    }else if (birthMonth == "December"){
        if (birthDate <= 21)
            zodiacSign = "Sagittarius";
        else zodiacSign = "Capricorn";
    }
}
