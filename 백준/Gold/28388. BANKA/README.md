# [Gold II] BANKA - 28388

[문제 링크](https://www.acmicpc.net/problem/28388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 5, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Mirko radi za &scaron;alterom u banci. Jednoga dana dogodila se njegova najgora noćna mora! $N$ ljudi se istodobno pojavilo na ulazu u banku. Sada Mirko ne zna kojim ih redom primiti!</p>

<p>Mirko dobro poznaje svoje klijente. Za svaku osobu zna da može maksimalno provesti $T_i$ minuta u banci i da posao koji treba obaviti traje $P_i$ minuta.</p>

<p>Na primjer, imamo dvije osobe, jedna može biti maksimalno pet minuta u banci i trebaju joj tri minute da obavi svoj posao, dok druga može biti maksimalno &scaron;est minuta u banci i trebaju joj četiri minute da obavi svoj posao. Ako Mirko prvo primi prvu osobu i s njom provede tri minute neće moći primiti drugu jer bi ona svoj posao zavr&scaron;ila u sedmoj minuti, a u banci može biti maksimalno &scaron;est minuta.</p>

<p>Mirka zanima koliko maksimalno ljudi može stići obaviti svoj posao. Budući da nije vje&scaron;t u organizaciji, traži od tebe pomoć! Pomozi mu odgovoriti na ovo pitanje.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($1 &le; N &le; 200\,000$), broj iz teksta zadatka.</p>

<p>U $i$-tom od sljedećih $N$ redaka nalaze se dva prirodna broja $T_i$ i $P_i$ ($1 &le; P_i &le; T_i &le; 200\,000$) &ndash; maksimalno vrijeme koje $i$-ta osoba može provesti u banci i koliko vremena treba za obaviti posao.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i koliko maksimalno osoba može obaviti svoj posao u banci.</p>

### 힌트

<p>Opis prvog probnog primjera: Mirko će u prve četiri minute obaviti posao s četvrtom osobom, iduće tri će obaviti posao s trećom osobom. Sada je pro&scaron;lo ukupno sedam minuta, te prva i druga osoba vi&scaron;e svoje poslove ne stignu obaviti. U idućoj minuti Mirko obavlja posao s petom osobom. Dakle tri osobe su uspjele obaviti svoje poslove.</p>