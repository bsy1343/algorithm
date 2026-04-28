# [Silver V] Ekscentrična enkripcija - 25131

[문제 링크](https://www.acmicpc.net/problem/25131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 39, 맞힌 사람: 27, 정답 비율: 72.973%

### 분류

구현, 문자열

### 문제 설명

<p>Gospodin Malnar jučer je održao predavanje o Cezarovoj &scaron;ifri te zaključio da bi bila pogodna za &scaron;ifriranje njegovih tajnih poruka. No, kako se ipak radi o Gospodinu Malnaru, odlučio ju je malo unaprijediti te stvorio takozvanu <em>Malnarovu &scaron;ifru</em>. Ključ se sastoji od tri broja $a$, $b$, $c$ ($0 &le; a, b, c &lt; 26$). Za zadanu riječ engleske abecede S, Gospodin Malnar prvo slovo ciklički pomakne za $a$, drugo za $b$, treće za $c$, i ponovno četvrto za $a$, peto za $b$ te tako dokgod nije &scaron;ifrirao cijelu riječ te time dobio novu riječ T.</p>

<p>Ciklički pomak za jedno mjesto pretvara slovo $a$ u slovo $b$, slovo $b$ u slovo $c$ i sve do slova z koje pretvara u slovo $a$. Ciklički pomak za neki drugi prirodan broj primjena je cikličkog pomaka za jedan taj broj puta, odnosno ciklički pomak za $0$ ne mijenja ni jedan znak.</p>

<p>Sada Gospodina Malnara zanima za par riječi S i T postoji li ključ takav da se &scaron;ifriranjem riječi S Malnarovom &scaron;ifrom dobije riječ T. U slučaju da postoji takav ključ, moli vas da ispi&scaron;ete neki.</p>

### 입력

<p>U prvom retku nalazi se riječ $S$ ($3 &le; |S| &le; 3 &middot; 10^5$).</p>

<p>U drugom retku nalazi se riječ $T$ ($3 &le; |T| &le; 3 &middot; 10^5$).</p>

### 출력

<p>Potrebno je ispisati tri broja $a$, $b$, $c$ ako postoji takav ključ, odnosno $-1$ ako ne postoji. Ako postoji vi&scaron;e točnih ključeva, moguće je ispisati bilo koji.</p>