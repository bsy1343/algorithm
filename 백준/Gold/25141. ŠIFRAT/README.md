# [Gold V] ŠIFRAT - 25141

[문제 링크](https://www.acmicpc.net/problem/25141)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 28, 맞힌 사람: 25, 정답 비율: 92.593%

### 분류

문자열, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Ivica proučava <em>kriptografiju</em>, znanost koja se bavi &scaron;ifriranjem i slanjem poruka u takvom obliku da ih samo onaj kome su namijenjene može pročitati. Prona&scaron;ao je metodu za &scaron;ifriranje koja odabranu znamenku Z pretvara u zapis (<em>&scaron;ifrat</em>) koji se sastoji od K nula i jedinica. Prvo se odabere neki ključ. Ključ je uzlazno sortiran niz od K ne nužno različitih znamenki (npr. ako je K=5 tada su &bdquo;01248&ldquo;, &bdquo;12345&ldquo;, &bdquo;00122&ldquo; neki od mogućih ključeva).</p>

<p>Ako je znamenku Z moguće izraziti kao zbroj od X znamenki koje se pojavljuju u ključu, tada će na itom mjestu, gledajući s lijeva, u &scaron;ifratu znamenke Z pisati &bdquo;1&ldquo; ako je na i-tom mjestu u ključu, isto gledajući s lijeva, znamenka koja sudjeluje u zbroju. Inače na tom mjestu u &scaron;ifratu pi&scaron;e &bdquo;0&ldquo;. Ako postoji vi&scaron;e mogućih &scaron;ifrata znamenke Z, tada ih treba sve ispisati. Svaku znamenku iz ključa u zbroju smijete iskoristiti najvi&scaron;e jednom.</p>

<p>Npr. ako je Z=8, K=5, X=2, a odabrani ključ &bdquo;01236&ldquo;, tada je traženi &scaron;ifrat oblika &bdquo;00101&ldquo; jer se 8 može izraziti kao zbroj dvije znamenke iz ključa na samo jedan način (2+6=8, &bdquo;01236&ldquo; &rarr; &bdquo;00101&ldquo;).</p>

<p>Napi&scaron;i program koji za zadanu znamenku Z, brojeve K i X te ključ duljine K određuje i ispisuje &scaron;ifrat (ili &scaron;ifrate) znamenke Z na opisani način. Zadanu znamenku uvijek će biti moguće &scaron;ifrirati.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj K (1 &le; K &le; 20), duljina ključa iz teksta zadatka.</p>

<p>U drugom retku nalazi se niz od K znamenki, ključ iz teksta zadatka.</p>

<p>U trećem retku nalazi se prirodan broj X (1 &le; X &le; K) iz teksta zadatka.</p>

<p>U četvrtom retku nalazi se znamenka Z (0 &le; Z &le; 9) iz teksta zadatka.</p>

### 출력

<p>Traženi &scaron;ifrat ili &scaron;ifrati znamenke Z, svaki u svom retku. Redoslijed ispisa nije bitan.</p>

### 힌트

<p>Opis prvog test podatka: &bdquo;01247&ldquo; &rarr; 1+4=5 &rarr; 01010</p>

<p>Opis drugog test podatka: &bdquo;001234&ldquo; &rarr; 0+2+4 &rarr; 100101; &bdquo;001234&ldquo; &rarr; 0+2+4 &rarr; 010101; &bdquo;001234&ldquo; &rarr; 1+2+3 &rarr; 001110;</p>