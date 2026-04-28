# [Gold IV] Kocka - 14066

[문제 링크](https://www.acmicpc.net/problem/14066)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 171, 정답: 116, 맞힌 사람: 88, 정답 비율: 62.857%

### 분류

구현

### 문제 설명

<p>Potrebno je, pomoću ASCII znakova, napraviti grafički prostorni prikaz hrpe poslaganih kockica. Kocke su pravilno složene u m redaka i n stupaca, a na nekim kockama se nalazi jedna ili vi&scaron;e drugih kocaka koje na taj način formiraju tornjeve. Redci su označeni redom brojevima od 1 do m tako da redak broj 1 označava najudaljeniji, a redak broj m najbliži redak na grafičkom prikazu. Stupci su označeni redom brojevima od 1 do n, slijeva na desno. Neke kocke zaklanjaju druge kocke koje su onda djelomično ili potpuno skrivene. Jednu kocku prikazujemo pomoću znakova &ldquo;+&rdquo; (plus), &ldquo;-&rdquo; (minus), &ldquo;|&rdquo; (okomita crta), &ldquo;/&rdquo; (kosa crta) i &ldquo; &rdquo; (razmak) u 6 redaka i 7 stupaca na sljedeći način:</p>

<pre>
  +---+
 /   /| 
+---+ |
|   | +
|   |/
+---+
</pre>

<p>Napi&scaron;ite program koji će odrediti grafički prikaz cijele zadane konfiguracije, koristeći pri tome &scaron;to je moguće manje redaka i stupaca. Prazna polja označite znakom &ldquo;.&rdquo; (točka).</p>

### 입력

<p>U prvom redu se nalaze prirodni brojevi m i n (1 &le; m, n &le; 50). U svakom od sljedećih m redova nalazi se n prirodnih brojeva. Svaki od njih je manji od ili jednak 50, a označava visinu tj. ukupni broj naslaganih kockica na toj poziciji.</p>

### 출력

<p>Ispi&scaron;ite grafički prikaz zadanih kocaka u prostoru kako je opisano u tekstu zadatka.</p>