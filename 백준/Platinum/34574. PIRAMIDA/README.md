# [Platinum III] PIRAMIDA - 34574

[문제 링크](https://www.acmicpc.net/problem/34574)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 24, 정답: 9, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

그리디 알고리즘, 세그먼트 트리, 애드 혹, 자료 구조

### 문제 설명

<p>Mirko ima niz od $N$ prirodnih brojeva. Želi od njega napraviti piramidu. To je niz u kojem postoji neka pozicija $k$ za koju vrijedi $A_1 ≤ \dots ≤ A_{k-1} ≤ A_k ≥ A_{k+1} ≥ \dots ≥ A_n$. Drugim riječima, želi ulazni niz prepraviti tako da do neke pozicije svaki element bude veći ili jednak prethodnom, a nakon te pozicije svaki bude manji ili jednak prethodnom. U jednom potezu može zamijeniti dva susjedna elementa niza. Koliko najmanje poteza mu je potrebno da ulazni niz pretvori u piramidu?</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($1 ≤ N ≤ 500\, 000$), broj iz teksta zadatka.</p>

<p>U drugom je retku niz od $N$ prirodnih brojeva $A_i$ ($1 ≤ A_i ≤ 10^9$), niz iz teksta zadatka.</p>

### 출력

<p>Prirodan broj iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Niz je rastući tj. piramida jer za poziciju $k = 4$ vrijedi traženi uvjet.</p>

<p>Opis drugog probnog primjera: Niz možemo pretvoriti u piramidu u četiri poteza. Npr. ovako:</p>

<ul>
<li><code>9 9 8 8 12 12 11</code> ← početni niz</li>
<li><code>9 8 9 8 12 12 11</code> ← nakon $1$. poteza</li>
<li><code>9 8 8 9 12 12 11</code> ← nakon $2$. poteza</li>
<li><code>8 9 8 9 12 12 11</code> ← nakon $3$. poteza</li>
<li><code>8 8 9 9 12 12 11</code> ← nakon $4$. poteza imamo piramidu.</li>
</ul>