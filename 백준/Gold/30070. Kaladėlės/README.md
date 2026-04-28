# [Gold V] Kaladėlės - 30070

[문제 링크](https://www.acmicpc.net/problem/30070)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 30, 맞힌 사람: 28, 정답 비율: 59.574%

### 분류

해 구성하기, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Linas gimtadienio proga gavo <em>Lego</em> konstruktorių, sudarytą i&scaron; $N$ įvairiaspalvių kaladėlių. Visas kaladėles Linas sudėliojo į eilę ir užra&scaron;ė kiekvienos spalvą kaip didžiąją lotyni&scaron;ką raidę:</p>

<p><code>B D A A R A R B K A A</code></p>

<p>Bežaisdamas su kaladėlėmis, Linas jas perdėliojo taip, kad jokios tos pačios spalvos kaladėlės nebūtų viena &scaron;alia kitos:</p>

<p><code>A B R A K A D A B R A</code></p>

<p>Linui kilo klausimas: ar kito konstruktoriaus kaladėles taip pat pavyktų perdėlioti taip, kad tos pačios spalvos kaladėlės nebūtų greta?</p>

<p>Para&scaron;ykite progamą, kuri nustatytų, ar įmanoma perdėlioti kaladėles norimu būdu, ir jei įmanoma, i&scaron;vestų perdėliotų kaladėlių spalvų seką.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas kaladėlių kiekis $N$.</p>

<p>Antroje eilutėje įra&scaron;yta $N$ tarpais atskirtų didžiųjų lotyni&scaron;kų raidžių.</p>

### 출력

<p>Jeigu įmanoma seką perdėlioti taip, kad greta nebūtų vienspalvių kaladėlių, i&scaron;veskite $N$ tarpais atskirtų raidžių, atitinkančių kaladėlių spalvas. Jeigu yra daugiau nei vienas teisingas atsakymas, i&scaron;veskite bet kurį.</p>

<p>Jeigu neįmanoma &ndash; i&scaron;veskite žodį <code>NE</code>.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1\,000$</li>
</ul>