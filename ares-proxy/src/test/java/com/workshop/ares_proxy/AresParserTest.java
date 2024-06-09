package com.workshop.ares_proxy;

import org.junit.jupiter.api.Test;

import com.workshop.ares.AresData;
import com.workshop.ares.AresParser;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AresParserTest {

    @Test
    public void testParse() throws IOException {
        String jsonData = "{  \"ico\": \"60914912\",  \"obchodniJmeno\": \"string\",  \"sidlo\": {    \"kodStatu\": \"str\",    \"nazevStatu\": \"string\",    \"kodKraje\": 999,    \"nazevKraje\": \"string\",    \"kodOkresu\": 9999,    \"nazevOkresu\": \"string\",    \"kodObce\": 999999,    \"nazevObce\": \"string\",    \"kodSpravnihoObvodu\": 999,    \"nazevSpravnihoObvodu\": \"string\",    \"kodMestskehoObvodu\": 999,    \"nazevMestskehoObvodu\": \"string\",    \"kodMestskeCastiObvodu\": 999999,    \"kodUlice\": 9999999,    \"nazevMestskeCastiObvodu\": \"string\",    \"nazevUlice\": \"string\",    \"cisloDomovni\": 9999,    \"doplnekAdresy\": \"string\",    \"kodCastiObce\": 999999,    \"cisloOrientacni\": 999,    \"cisloOrientacniPismeno\": \"s\",    \"nazevCastiObce\": \"string\",    \"kodAdresnihoMista\": 999999999,    \"psc\": 0,    \"textovaAdresa\": \"string\",    \"cisloDoAdresy\": \"string\",    \"typCisloDomovni\": \"string\",    \"standardizaceAdresy\": true,    \"pscTxt\": \"string\"  },  \"pravniForma\": \"781\",  \"financniUrad\": \"955\",  \"datumVzniku\": \"2024-06-09\",  \"datumZaniku\": \"2024-06-09\",  \"datumAktualizace\": \"2024-06-09\",  \"dic\": \"string\",  \"icoId\": \"ARES_73118490\",  \"adresaDorucovaci\": {    \"radekAdresy1\": \"string\",    \"radekAdresy2\": \"string\",    \"radekAdresy3\": \"string\"  },  \"seznamRegistraci\": {    \"stavZdrojeVr\": \"string\",    \"stavZdrojeRes\": \"string\",    \"stavZdrojeRzp\": \"string\",    \"stavZdrojeNrpzs\": \"string\",    \"stavZdrojeRpsh\": \"string\",    \"stavZdrojeRcns\": \"string\",    \"stavZdrojeSzr\": \"string\",    \"stavZdrojeDph\": \"string\",    \"stavZdrojeSd\": \"string\",    \"stavZdrojeIr\": \"string\",    \"stavZdrojeCeu\": \"string\",    \"stavZdrojeRs\": \"string\",    \"stavZdrojeRed\": \"string\"  },  \"primarniZdroj\": \"string\",  \"dalsiUdaje\": [    {      \"obchodniJmeno\": [        {          \"platnostOd\": \"2024-06-09\",          \"platnostDo\": \"2024-06-09\",          \"obchodniJmeno\": \"string\",          \"primarniZaznam\": true        }      ],      \"sidlo\": [        {          \"sidlo\": {            \"kodStatu\": \"str\",            \"nazevStatu\": \"string\",            \"kodKraje\": 999,            \"nazevKraje\": \"string\",            \"kodOkresu\": 9999,            \"nazevOkresu\": \"string\",            \"kodObce\": 999999,            \"nazevObce\": \"string\",            \"kodSpravnihoObvodu\": 999,            \"nazevSpravnihoObvodu\": \"string\",            \"kodMestskehoObvodu\": 999,            \"nazevMestskehoObvodu\": \"string\",            \"kodMestskeCastiObvodu\": 999999,            \"kodUlice\": 9999999,            \"nazevMestskeCastiObvodu\": \"string\",            \"nazevUlice\": \"string\",            \"cisloDomovni\": 9999,            \"doplnekAdresy\": \"string\",            \"kodCastiObce\": 999999,            \"cisloOrientacni\": 999,            \"cisloOrientacniPismeno\": \"s\",            \"nazevCastiObce\": \"string\",            \"kodAdresnihoMista\": 999999999,            \"psc\": 0,            \"textovaAdresa\": \"string\",            \"cisloDoAdresy\": \"string\",            \"typCisloDomovni\": \"string\",            \"standardizaceAdresy\": true,            \"pscTxt\": \"string\"          },          \"primarniZaznam\": true,          \"platnostOd\": \"2024-06-09\",          \"platnostDo\": \"2024-06-09\"        }      ],      \"pravniForma\": \"203\",      \"spisovaZnacka\": \"string\",      \"datovyZdroj\": \"string\"    }  ],  \"czNace\": [    \"strin\"  ],  \"subRegistrSzr\": \"string\",  \"dicSkDph\": \"string\"}";

        AresData aresData = AresParser.parse(jsonData);

        assertNotNull(aresData);
        assertEquals("60914912", aresData.getIco());
        assertEquals("string", aresData.getObchodniJmeno());
        
        // Test serialization
        String serializedJson = AresParser.serialize(aresData);
        assertNotNull(serializedJson);
        System.out.println(serializedJson);
    }
}