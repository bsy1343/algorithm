# [Gold IV] Slike - 28591

[문제 링크](https://www.acmicpc.net/problem/28591)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

자료 구조, 그리디 알고리즘, 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Jedna se umjetnička galerija na&scaron;la u financijskim problemima te je odlučila prodati $N$ slika koje posjeduje. Svaka slika ima svoju starost $S_i$ &ndash; broj dana koji su pro&scaron;li od kada je slika napravljena. Pravo otkupa su dobili stari kolekcionari Mirko i Slavko koji su, da bi kupovina bila zanimljivija, dogovorili sljedeća pravila.</p>

<p>Slike će kupovati tijekom $M$ dana. Svaki će dan u galeriju prvo doći Mirko s namjerom da kupi najvi&scaron;e $CM_i$ slika starosti veće ili jednake od $SM_i$. Nakon &scaron;to je on kupio slike koje je želio, dolazi Slavko koji želi kupiti najvi&scaron;e $CS_i$ slika starosti manje ili jednake od $SS_i$. Obojici je cilj kupiti &scaron;to vi&scaron;e slika, a da onaj drugi pritom kupi &scaron;to manje.</p>

<p>Ako obojica znaju unaprijed svoje i prijateljeve planove za kupovinu slika za svih $M$ dana, koliko će slika kupiti Mirko, a koliko Slavko ako obojica kupuju optimalno?</p>

### 입력

<p>U prvom su retku dva prirodna broja $N$, $M$ ($1 &le; N, M &le; 200\,000$), brojevi iz teksta zadatka.</p>

<p>U drugom se retku nalazi $N$ prirodnih brojeva $S_i$ ($1 &le; S_i &le; 10^9$) &ndash; starosti slika redom od $1$ do $N$.</p>

<p>U $i$-tom od sljedećih $M$ redaka nalaze se četiri broja $CM_i$, $SM_i$, $CS_i$, $SS_i$ ($1 &le; CM_i, CS_i &le; N$, $1 &le; SM_i, SS_i &le; 10^9$), brojevi iz teksta zadatka.</p>

### 출력

<p>U prvi redak ispi&scaron;i dva broja &ndash; koliko će slika kupiti Mirko, a koliko Slavko.</p>

### 힌트

<p>Opis prvog probnog primjera: Kupovina se mogla odvijati ovako: Mirko će u prvom danu kupiti slike starosti $4$ i $5$, a Slavko će kupiti sliku starosti $1$.</p>