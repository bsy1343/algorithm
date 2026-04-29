# [Silver III] Tim - 34599

[문제 링크](https://www.acmicpc.net/problem/34599)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

구현, 문자열, 백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>Upravo su završili prvi u nizu izbora u ovoj super izbornoj, 2024. godini. U saboru je $150$ vrućih fotelja pa mandataru (budućem predsjedniku Vlade) za sastavljanje većine i pobjedničkog <em>tima</em> treba $76$ ruku. Svaka stranačka lista dobila je neki broj mandata i, barem u ovom zadatku, će svi zastupnici s neke liste, tj. stranke biti složni i zajedno se prikloniti vlasti ili oporbi. Ti se želiš umiliti svom šefu stranke i reći mu sve kombinacije stranaka od kojih se može sastojati nova većina. Ako dobro odradiš posao, možda i ti u sljedećoj rošadi postaneš ministar. Sretno!</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($3 ≤ N ≤ 20$), broj listi na izborima.</p>

<p>U sljedećih $N$ redaka su redom riječ $S$, ime liste, te prirodan broj $X$ ($1 ≤ X ≤ 150$), broj mandata koje je ta lista dobila. Ime liste $S$ biti će riječ s najviše $5$ velikih slova engleske abecede.</p>

<p>Ukupan broj dobivenih mandata iznosit će $150$.</p>

### 출력

<p>U prvom retku ispiši $K$, broj kombinacija stranaka koje mogu sastaviti vladu.</p>

<p>U sljedećih $K$ redaka ispiši, leksikografskim poretkom (abecednim redom) kombinacije stranaka koje zajedno imaju potreban broj mandata. Svaka kombinacija je predstavljena imenima stranaka redom kojim su se <strong>pojavile u ulazu</strong>, međusobno spojenih znakom “-” (minus).</p>

### 힌트

<p>Opis trećeg probnog primjera: Demokrati Roberta Kumerlea<sup>1</sup> osvojili su $49$ mandata kao i Stranka liposuktiranih i naočitih antifeministica, a Aco Tudum Favorit $52$ mandata. Sve kombinacije u kojima su barem dvije liste mogu sastaviti većinu.</p>

<hr>
<p><sup>1</sup> Referenca iz jedne od najboljih domaćih serija – Bitange i princeze (sezona 2, epizoda 4)</p>