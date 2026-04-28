# [Bronze I] Pabėgimo kambarys - 30063

[문제 링크](https://www.acmicpc.net/problem/30063)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 62, 맞힌 사람: 52, 정답 비율: 83.871%

### 분류

구현, 문자열

### 문제 설명

<p>Norėdami at&scaron;vęsti Lietuvos informatikos olimpiadų trisde&scaron;imtmetį, Vertinimo komisijos nariai sugalvojo sau pramogą: pabėgimo kambarį. Pabėgimo kambarys &ndash; tai seka užuominų, kurių kiekviena yra pažymėta didžiąja lotyni&scaron;ka raide.</p>

<p>Užuominos yra atskleidžiamos po vieną, nuo pirmos iki paskutinės pateikta tvarka. Komisijos nariai i&scaron; kambario i&scaron;trūkti gali tuomet, kai i&scaron; surinktų užuominų pavyksta sudaryti žodį <code>RAKTAS</code>.</p>

<p>Įsivaizduokime pabėgimo kambarį, kurio užuominų seka yra tokia:</p>

<p style="text-align: center;"><code>RAUDONASNYKSTUKAS</code></p>

<p>I&scaron; &scaron;io pabėgimo kambario komisija gali i&scaron;trūkti įveikusi $13$ užuominų:</p>

<p style="text-align: center;"><code><u>RA</u>UDON<u>A</u>SNY<u>KST</u>UKAS</code></p>

<p>Keturios paskutinės užuominos (pažymėtos pilkai) nėra būtinos, nes žodį <code>RAKTAS</code> pavyks sudaryti i&scaron; jau surinktų užuominų (raidės pabrauktos).</p>

<p>Para&scaron;ykite programą, kuri rastų, kiek mažiausiai užuominų reikia atskleisti norint i&scaron;trūkti i&scaron; pabėgimo kambario.</p>

### 입력

<p>Pirmoje eilutėje pateiktas vienintelis skaičius &ndash; užuominų kiekis $N$.</p>

<p>Antroje eilutėje pateikta $N$ ilgio simbolių eilutė &ndash; užuominų seka. Užuominos žymimos didžiosiomis lotyni&scaron;komis raidėmis nuo <code>A</code> iki <code>Z</code>. Pa&scaron;alinių simbolių nebus.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; mažiausią reikalingų užuominų kiekį.</p>

<p>Pradiniai duomenys bus tokie, kad atsakymas visada egzistuos.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 100$</li>
</ul>