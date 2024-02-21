package org.example;

public class Greeter {

    public String getGreetingInSelectedLanguage(Greetings language) {
        return language.getGreeting();
    }

    enum Greetings {
        ENGLISH("Hello"),

        FRENCH("Bonjour"),

        SPANISH("Hola"),

        GERMAN("Hallo"),

        RUSSIAN("Привет"),

        ITALIAN("Ciao"),

        CHINESE("你好"),

        JAPANESE("こんにちは"),

        KOREAN("안녕하세요"),

        ARABIC("مرحبا"),

        PORTUGUESE("Olá"),

        DUTCH("Hallo"),

        SWEDISH("Hej"),

        HINDI("नमस्ते"),

        TURKISH("Merhaba"),

        POLISH("Cześć"),

        VIETNAMESE("Xin chào"),

        GREEK("Γεια σας"),

        THAI("สวัสดี"),

        HEBREW("שלום"),

        CZECH("Ahoj"),

        DANISH("Hej"),

        FINNISH("Hei"),

        NORWEGIAN("Hei"),

        INDONESIAN("Halo"),

        MALAY("Hello"),

        SWAHILI("Habari"),

        TAGALOG("Kamusta"),

        MALAYALAM("ഹലോ"),

        BENGALI("হ্যালো"),

        URDU("ہیلو"),

        PERSIAN("سلام"),

        ROMANIAN("Salut"),

        HUNGARIAN("Szia"),

        BULGARIAN("Здравейте"),

        SERBIAN("Здраво"),

        SLOVAK("Ahoj"),

        SLOVENIAN("Živjo"),

        CROATIAN("Bok"),

        ESTONIAN("Tere"),

        LATVIAN("Sveiki"),

        LITHUANIAN("Sveiki"),

        MALTESE("Bongu"),

        ALBANIAN("Përshëndetje"),

        MACEDONIAN("Здраво"),

        GEORGIAN("გამარჯობა");

        private final String greeting;

        Greetings(String greeting) {
            this.greeting = greeting;
        }

        public String getGreeting() {
            return greeting;
        }
    }
}
