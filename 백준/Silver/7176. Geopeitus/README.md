# [Silver II] Geopeitus - 7176

[문제 링크](https://www.acmicpc.net/problem/7176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>Geopeituse m&auml;ngus antakse aarete koordinaadid m&otilde;nikord valemina, kus m&otilde;ned numbrid on asendatud t&auml;htedega, n&auml;iteks <code>N58 24.1ab E26 44.3c</code>.</p>

<p>Kirjutada programm, mis v&auml;ljastab k&otilde;ik antud valemile ja muutujate v&otilde;imalikele v&auml;&auml;rtustele vastavad koordinaadid.</p>

### 입력

<p>Tekstifaili esimesel real on valem, mis koosneb laius- ja pikkuskraadi esitusest, mis omakorda koosnevad ilmakaare t&auml;hisest (<code>N</code>, <code>S</code>, <code>E</code>, <code>W</code>) ning kraadide, minutite ja minuti murdosa n&auml;itudest n&auml;ites antud vormingus. Valemi pikkus ei &uuml;leta 25~m&auml;rki.</p>

<p>Faili teisel real on muutujate arv $N$ ($1 \le N \le 3$) ja j&auml;rgmisel $N$ real iga&uuml;hel &uuml;he muutuja kirjeldus: muutuja nimi, v&otilde;rdusm&auml;rk ja komadega eraldatud loetelu, mille elemendid on kas &uuml;ksikud v&auml;&auml;rtused v&otilde;i v&auml;&auml;rtuste vahemikud. Muutuja nimi on alati &uuml;ks v&auml;ike ladina t&auml;ht. V&auml;&auml;rtused ja vahemike otspunktid v&otilde;ivad olla &uuml;he- v&otilde;i kahekohalised arvud. V&otilde;ib eeldada, et &uuml;hegi muutuja kirjeldus ei tekita korduvaid v&auml;&auml;rtusi.</p>

### 출력

<p>Tekstifaili v&auml;ljastada k&otilde;ik koordinaadid, mis on v&otilde;imalik saada muutujate lubatud v&auml;&auml;rtustega asendamisel. Koordinaadid v&auml;ljastada iga&uuml;ks eraldi reale, ridade j&auml;rjekord failis pole oluline.</p>