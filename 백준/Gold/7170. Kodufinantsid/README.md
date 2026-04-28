# [Gold III] Kodufinantsid - 7170

[문제 링크](https://www.acmicpc.net/problem/7170)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Juku peab oma kulude kohta arvestust tekstifailis, mis on j&auml;rgmises vormingus (arvepidamine ei tarvite alati 3-tasemeline olla):</p>

<pre>
M&auml;rtsi kulud - 1000
   Toit - 500
      Kohukesed - 250
      Liha - 250
   L&otilde;bu - 400
      Pidu - 200
      Kino - 200
   Tervis - 100</pre>

<p>J&auml;rjekordsel faili salvestamisel kaotas tema tekstiredaktor milligip&auml;rast k&otilde;ik taanded ja n&uuml;&uuml;d n&auml;eb fail v&auml;lja selline:</p>

<pre>
M&auml;rtsi kulud - 1000
Toit - 500
Kohukesed - 250
Liha - 250
L&otilde;bu - 400
Pidu - 200
Kino - 200
Tervis - 100</pre>

<p>Kirjutada programm, mis aitab Jukul arvepidamise taastada, kui on teada, et faili esimene rida on k&otilde;igi kulude summa.</p>

### 입력

<p>Tekstifaili esimesel real on arvepidamises olnud ridade arv N (1 &le; N &le; 20) ja j&auml;rgmisel N real iga&uuml;hel &uuml;he kululiigi summa A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 1 000 000 000).</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt N rida, reale number i sisendfaili real i + 1 oleva summa taane. Pange t&auml;hele, et esimene taane on alati 0 ja teine taane (kui arvepidamises on rohkem kui &uuml;ks rida) alati 1. Kui v&otilde;imalikke vastuseid on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist.</p>