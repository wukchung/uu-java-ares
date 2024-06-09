package com.workshop.ares;

import java.util.List;

public class AresData {
    private String ico;
    private String obchodniJmeno;
    private Sidlo sidlo;
    private String pravniForma;
    private String financniUrad;
    private String datumVzniku;
    private String datumZaniku;
    private String datumAktualizace;
    private String dic;
    private String icoId;
    private AdresaDorucovaci adresaDorucovaci;
    private SeznamRegistraci seznamRegistraci;
    private String primarniZdroj;
    private List<DalsiUdaje> dalsiUdaje;
    private List<String> czNace;
    private String subRegistrSzr;
    private String dicSkDph;

    // Getters and setters
    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getObchodniJmeno() {
        return obchodniJmeno;
    }

    public void setObchodniJmeno(String obchodniJmeno) {
        this.obchodniJmeno = obchodniJmeno;
    }

    public Sidlo getSidlo() {
        return sidlo;
    }

    public void setSidlo(Sidlo sidlo) {
        this.sidlo = sidlo;
    }

    public String getPravniForma() {
        return pravniForma;
    }

    public void setPravniForma(String pravniForma) {
        this.pravniForma = pravniForma;
    }

    public String getFinancniUrad() {
        return financniUrad;
    }

    public void setFinancniUrad(String financniUrad) {
        this.financniUrad = financniUrad;
    }

    public String getDatumVzniku() {
        return datumVzniku;
    }

    public void setDatumVzniku(String datumVzniku) {
        this.datumVzniku = datumVzniku;
    }

    public String getDatumZaniku() {
        return datumZaniku;
    }

    public void setDatumZaniku(String datumZaniku) {
        this.datumZaniku = datumZaniku;
    }

    public String getDatumAktualizace() {
        return datumAktualizace;
    }

    public void setDatumAktualizace(String datumAktualizace) {
        this.datumAktualizace = datumAktualizace;
    }

    public String getDic() {
        return dic;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public String getIcoId() {
        return icoId;
    }

    public void setIcoId(String icoId) {
        this.icoId = icoId;
    }

    public AdresaDorucovaci getAdresaDorucovaci() {
        return adresaDorucovaci;
    }

    public void setAdresaDorucovaci(AdresaDorucovaci adresaDorucovaci) {
        this.adresaDorucovaci = adresaDorucovaci;
    }

    public SeznamRegistraci getSeznamRegistraci() {
        return seznamRegistraci;
    }

    public void setSeznamRegistraci(SeznamRegistraci seznamRegistraci) {
        this.seznamRegistraci = seznamRegistraci;
    }

    public String getPrimarniZdroj() {
        return primarniZdroj;
    }

    public void setPrimarniZdroj(String primarniZdroj) {
        this.primarniZdroj = primarniZdroj;
    }

    public List<DalsiUdaje> getDalsiUdaje() {
        return dalsiUdaje;
    }

    public void setDalsiUdaje(List<DalsiUdaje> dalsiUdaje) {
        this.dalsiUdaje = dalsiUdaje;
    }

    public List<String> getCzNace() {
        return czNace;
    }

    public void setCzNace(List<String> czNace) {
        this.czNace = czNace;
    }

    public String getSubRegistrSzr() {
        return subRegistrSzr;
    }

    public void setSubRegistrSzr(String subRegistrSzr) {
        this.subRegistrSzr = subRegistrSzr;
    }

    public String getDicSkDph() {
        return dicSkDph;
    }

    public void setDicSkDph(String dicSkDph) {
        this.dicSkDph = dicSkDph;
    }

    // Nested classes with getters and setters
    public static class Sidlo {
        private String kodStatu;
        private String nazevStatu;
        private int kodKraje;
        private String nazevKraje;
        private int kodOkresu;
        private String nazevOkresu;
        private int kodObce;
        private String nazevObce;
        private int kodSpravnihoObvodu;
        private String nazevSpravnihoObvodu;
        private int kodMestskehoObvodu;
        private String nazevMestskehoObvodu;
        private int kodMestskeCastiObvodu;
        private int kodUlice;
        private String nazevMestskeCastiObvodu;
        private String nazevUlice;
        private int cisloDomovni;
        private String doplnekAdresy;
        private int kodCastiObce;
        private int cisloOrientacni;
        private String cisloOrientacniPismeno;
        private String nazevCastiObce;
        private int kodAdresnihoMista;
        private int psc;
        private String textovaAdresa;
        private String cisloDoAdresy;
        private String typCisloDomovni;
        private boolean standardizaceAdresy;
        private String pscTxt;

        // Getters and setters
        public String getKodStatu() {
            return kodStatu;
        }

        public void setKodStatu(String kodStatu) {
            this.kodStatu = kodStatu;
        }

        public String getNazevStatu() {
            return nazevStatu;
        }

        public void setNazevStatu(String nazevStatu) {
            this.nazevStatu = nazevStatu;
        }

        public int getKodKraje() {
            return kodKraje;
        }

        public void setKodKraje(int kodKraje) {
            this.kodKraje = kodKraje;
        }

        public String getNazevKraje() {
            return nazevKraje;
        }

        public void setNazevKraje(String nazevKraje) {
            this.nazevKraje = nazevKraje;
        }

        public int getKodOkresu() {
            return kodOkresu;
        }

        public void setKodOkresu(int kodOkresu) {
            this.kodOkresu = kodOkresu;
        }

        public String getNazevOkresu() {
            return nazevOkresu;
        }

        public void setNazevOkresu(String nazevOkresu) {
            this.nazevOkresu = nazevOkresu;
        }

        public int getKodObce() {
            return kodObce;
        }

        public void setKodObce(int kodObce) {
            this.kodObce = kodObce;
        }

        public String getNazevObce() {
            return nazevObce;
        }

        public void setNazevObce(String nazevObce) {
            this.nazevObce = nazevObce;
        }

        public int getKodSpravnihoObvodu() {
            return kodSpravnihoObvodu;
        }

        public void setKodSpravnihoObvodu(int kodSpravnihoObvodu) {
            this.kodSpravnihoObvodu = kodSpravnihoObvodu;
        }

        public String getNazevSpravnihoObvodu() {
            return nazevSpravnihoObvodu;
        }

        public void setNazevSpravnihoObvodu(String nazevSpravnihoObvodu) {
            this.nazevSpravnihoObvodu = nazevSpravnihoObvodu;
        }

        public int getKodMestskehoObvodu() {
            return kodMestskehoObvodu;
        }

        public void setKodMestskehoObvodu(int kodMestskehoObvodu) {
            this.kodMestskehoObvodu = kodMestskehoObvodu;
        }

        public String getNazevMestskehoObvodu() {
            return nazevMestskehoObvodu;
        }

        public void setNazevMestskehoObvodu(String nazevMestskehoObvodu) {
            this.nazevMestskehoObvodu = nazevMestskehoObvodu;
        }

        public int getKodMestskeCastiObvodu() {
            return kodMestskeCastiObvodu;
        }

        public void setKodMestskeCastiObvodu(int kodMestskeCastiObvodu) {
            this.kodMestskeCastiObvodu = kodMestskeCastiObvodu;
        }

        public int getKodUlice() {
            return kodUlice;
        }

        public void setKodUlice(int kodUlice) {
            this.kodUlice = kodUlice;
        }

        public String getNazevMestskeCastiObvodu() {
            return nazevMestskeCastiObvodu;
        }

        public void setNazevMestskeCastiObvodu(String nazevMestskeCastiObvodu) {
            this.nazevMestskeCastiObvodu = nazevMestskeCastiObvodu;
        }

        public String getNazevUlice() {
            return nazevUlice;
        }

        public void setNazevUlice(String nazevUlice) {
            this.nazevUlice = nazevUlice;
        }

        public int getCisloDomovni() {
            return cisloDomovni;
        }

        public void setCisloDomovni(int cisloDomovni) {
            this.cisloDomovni = cisloDomovni;
        }

        public String getDoplnekAdresy() {
            return doplnekAdresy;
        }

        public void setDoplnekAdresy(String doplnekAdresy) {
            this.doplnekAdresy = doplnekAdresy;
        }

        public int getKodCastiObce() {
            return kodCastiObce;
        }

        public void setKodCastiObce(int kodCastiObce) {
            this.kodCastiObce = kodCastiObce;
        }

        public int getCisloOrientacni() {
            return cisloOrientacni;
        }

        public void setCisloOrientacni(int cisloOrientacni) {
            this.cisloOrientacni = cisloOrientacni;
        }

        public String getCisloOrientacniPismeno() {
            return cisloOrientacniPismeno;
        }

        public void setCisloOrientacniPismeno(String cisloOrientacniPismeno) {
            this.cisloOrientacniPismeno = cisloOrientacniPismeno;
        }

        public String getNazevCastiObce() {
            return nazevCastiObce;
        }

        public void setNazevCastiObce(String nazevCastiObce) {
            this.nazevCastiObce = nazevCastiObce;
        }

        public int getKodAdresnihoMista() {
            return kodAdresnihoMista;
        }

        public void setKodAdresnihoMista(int kodAdresnihoMista) {
            this.kodAdresnihoMista = kodAdresnihoMista;
        }

        public int getPsc() {
            return psc;
        }

        public void setPsc(int psc) {
            this.psc = psc;
        }

        public String getTextovaAdresa() {
            return textovaAdresa;
        }

        public void setTextovaAdresa(String textovaAdresa) {
            this.textovaAdresa = textovaAdresa;
        }

        public String getCisloDoAdresy() {
            return cisloDoAdresy;
        }

        public void setCisloDoAdresy(String cisloDoAdresy) {
            this.cisloDoAdresy = cisloDoAdresy;
        }

        public String getTypCisloDomovni() {
            return typCisloDomovni;
        }

        public void setTypCisloDomovni(String typCisloDomovni) {
            this.typCisloDomovni = typCisloDomovni;
        }

        public boolean isStandardizaceAdresy() {
            return standardizaceAdresy;
        }

        public void setStandardizaceAdresy(boolean standardizaceAdresy) {
            this.standardizaceAdresy = standardizaceAdresy;
        }

        public String getPscTxt() {
            return pscTxt;
        }

        public void setPscTxt(String pscTxt) {
            this.pscTxt = pscTxt;
        }
    }

    public static class AdresaDorucovaci {
        private String radekAdresy1;
        private String radekAdresy2;
        private String radekAdresy3;

        // Getters and setters
        public String getRadekAdresy1() {
            return radekAdresy1;
        }

        public void setRadekAdresy1(String radekAdresy1) {
            this.radekAdresy1 = radekAdresy1;
        }

        public String getRadekAdresy2() {
            return radekAdresy2;
        }

        public void setRadekAdresy2(String radekAdresy2) {
            this.radekAdresy2 = radekAdresy2;
        }

        public String getRadekAdresy3() {
            return radekAdresy3;
        }

        public void setRadekAdresy3(String radekAdresy3) {
            this.radekAdresy3 = radekAdresy3;
        }
    }

    public static class SeznamRegistraci {
        private String stavZdrojeVr;
        private String stavZdrojeRes;
        private String stavZdrojeRzp;
        private String stavZdrojeNrpzs;
        private String stavZdrojeRpsh;
        private String stavZdrojeRcns;
        private String stavZdrojeSzr;
        private String stavZdrojeDph;
        private String stavZdrojeSd;
        private String stavZdrojeIr;
        private String stavZdrojeCeu;
        private String stavZdrojeRs;
        private String stavZdrojeRed;

        // Getters and setters
        public String getStavZdrojeVr() {
            return stavZdrojeVr;
        }

        public void setStavZdrojeVr(String stavZdrojeVr) {
            this.stavZdrojeVr = stavZdrojeVr;
        }

        public String getStavZdrojeRes() {
            return stavZdrojeRes;
        }

        public void setStavZdrojeRes(String stavZdrojeRes) {
            this.stavZdrojeRes = stavZdrojeRes;
        }

        public String getStavZdrojeRzp() {
            return stavZdrojeRzp;
        }

        public void setStavZdrojeRzp(String stavZdrojeRzp) {
            this.stavZdrojeRzp = stavZdrojeRzp;
        }

        public String getStavZdrojeNrpzs() {
            return stavZdrojeNrpzs;
        }

        public void setStavZdrojeNrpzs(String stavZdrojeNrpzs) {
            this.stavZdrojeNrpzs = stavZdrojeNrpzs;
        }

        public String getStavZdrojeRpsh() {
            return stavZdrojeRpsh;
        }

        public void setStavZdrojeRpsh(String stavZdrojeRpsh) {
            this.stavZdrojeRpsh = stavZdrojeRpsh;
        }

        public String getStavZdrojeRcns() {
            return stavZdrojeRcns;
        }

        public void setStavZdrojeRcns(String stavZdrojeRcns) {
            this.stavZdrojeRcns = stavZdrojeRcns;
        }

        public String getStavZdrojeSzr() {
            return stavZdrojeSzr;
        }

        public void setStavZdrojeSzr(String stavZdrojeSzr) {
            this.stavZdrojeSzr = stavZdrojeSzr;
        }

        public String getStavZdrojeDph() {
            return stavZdrojeDph;
        }

        public void setStavZdrojeDph(String stavZdrojeDph) {
            this.stavZdrojeDph = stavZdrojeDph;
        }

        public String getStavZdrojeSd() {
            return stavZdrojeSd;
        }

        public void setStavZdrojeSd(String stavZdrojeSd) {
            this.stavZdrojeSd = stavZdrojeSd;
        }

        public String getStavZdrojeIr() {
            return stavZdrojeIr;
        }

        public void setStavZdrojeIr(String stavZdrojeIr) {
            this.stavZdrojeIr = stavZdrojeIr;
        }

        public String getStavZdrojeCeu() {
            return stavZdrojeCeu;
        }

        public void setStavZdrojeCeu(String stavZdrojeCeu) {
            this.stavZdrojeCeu = stavZdrojeCeu;
        }

        public String getStavZdrojeRs() {
            return stavZdrojeRs;
        }

        public void setStavZdrojeRs(String stavZdrojeRs) {
            this.stavZdrojeRs = stavZdrojeRs;
        }

        public String getStavZdrojeRed() {
            return stavZdrojeRed;
        }

        public void setStavZdrojeRed(String stavZdrojeRed) {
            this.stavZdrojeRed = stavZdrojeRed;
        }
    }

    public static class DalsiUdaje {
        private List<ObchodniJmeno> obchodniJmeno;
        private List<SidloWrapper> sidlo;
        private String pravniForma;
        private String spisovaZnacka;
        private String datovyZdroj;

        // Getters and setters
        public List<ObchodniJmeno> getObchodniJmeno() {
            return obchodniJmeno;
        }

        public void setObchodniJmeno(List<ObchodniJmeno> obchodniJmeno) {
            this.obchodniJmeno = obchodniJmeno;
        }

        public List<SidloWrapper> getSidlo() {
            return sidlo;
        }

        public void setSidlo(List<SidloWrapper> sidlo) {
            this.sidlo = sidlo;
        }

        public String getPravniForma() {
            return pravniForma;
        }

        public void setPravniForma(String pravniForma) {
            this.pravniForma = pravniForma;
        }

        public String getSpisovaZnacka() {
            return spisovaZnacka;
        }

        public void setSpisovaZnacka(String spisovaZnacka) {
            this.spisovaZnacka = spisovaZnacka;
        }

        public String getDatovyZdroj() {
            return datovyZdroj;
        }

        public void setDatovyZdroj(String datovyZdroj) {
            this.datovyZdroj = datovyZdroj;
        }
    }

    public static class ObchodniJmeno {
        private String platnostOd;
        private String platnostDo;
        private String obchodniJmeno;
        private boolean primarniZaznam;

        // Getters and setters
        public String getPlatnostOd() {
            return platnostOd;
        }

        public void setPlatnostOd(String platnostOd) {
            this.platnostOd = platnostOd;
        }

        public String getPlatnostDo() {
            return platnostDo;
        }

        public void setPlatnostDo(String platnostDo) {
            this.platnostDo = platnostDo;
        }

        public String getObchodniJmeno() {
            return obchodniJmeno;
        }

        public void setObchodniJmeno(String obchodniJmeno) {
            this.obchodniJmeno = obchodniJmeno;
        }

        public boolean isPrimarniZaznam() {
            return primarniZaznam;
        }

        public void setPrimarniZaznam(boolean primarniZaznam) {
            this.primarniZaznam = primarniZaznam;
        }
    }

    public static class SidloWrapper {
        private Sidlo sidlo;
        private boolean primarniZaznam;
        private String platnostOd;
        private String platnostDo;

        // Getters and setters
        public Sidlo getSidlo() {
            return sidlo;
        }

        public void setSidlo(Sidlo sidlo) {
            this.sidlo = sidlo;
        }

        public boolean isPrimarniZaznam() {
            return primarniZaznam;
        }

        public void setPrimarniZaznam(boolean primarniZaznam) {
            this.primarniZaznam = primarniZaznam;
        }

        public String getPlatnostOd() {
            return platnostOd;
        }

        public void setPlatnostOd(String platnostOd) {
            this.platnostOd = platnostOd;
        }

        public String getPlatnostDo() {
            return platnostDo;
        }

        public void setPlatnostDo(String platnostDo) {
            this.platnostDo = platnostDo;
        }
    }
}

