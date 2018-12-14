package stringSyntax;


public class stringSyntax {

    public static void main(String[] args) {
       String kelime = "Denizdeki";
       System.out.println("Kelime:Denizdeki");
       System.out.println("Kelimenin karakter uzunluğu:"+kelime.length());
       System.out.println("İndisi 3 olan karakter:"+kelime.charAt(3));
       System.out.println("İkinci ve beşinci indis arası:"+kelime.substring(2,5));
       System.out.println("k karakterinin konumu:"+(kelime.indexOf('k')));
       System.out.println("e karakterinin 0. indisten sonraki konumu:"+kelime.indexOf('e',0));
       System.out.println("Son k karakterinin index numarası:"+kelime.lastIndexOf('k'));
       System.out.println("k ile m harflerinin yerlerini değiştir"+kelime.replace('k', 'm'));
       System.out.println("kelimeleri büyük harfe dönüştür:"+kelime.toUpperCase());
       System.out.println("kelimeleri büyük harfe dönüştür:"+kelime.toLowerCase());
       String say ="34526";
       System.out.println("say değeri:"+Integer.parseInt(say));
       double rakam =15.42;
       System.out.println("rakamın string değeri:"+String.valueOf(rakam));
       String kelime2="DenizdeKi";//Kelimelerin küçük/büyük harf duyarlılığı var
        if (kelime.equals(kelime2)) {
            System.out.println("Kelimeler eşittir.");
        }
        else{System.out.println("Kelimeler eşit değildir.");}
       
    }
    
}
