# [Silver III] Klasična Karantena - 20326

[문제 링크](https://www.acmicpc.net/problem/20326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 21, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Uslijed globalne pandemije <em>COVID-19</em>, nacionalni je stožer civilne za&scaron;tite donio novi niz smjernica i uputa s ciljem prevencije daljnjeg &scaron;irenja zaraze među populacijom. Jedna od smjernica odnosi se na obavezno no&scaron;enje za&scaron;titnih maski u svim ugostiteljskim objektima, &scaron;to uključuje i gostionice, odnosno birtije.</p>

<p>Na vratima jedne lokalne birtije odmah je osvanuo natpis <strong>OBAVEZNO NO&Scaron;ENJE MASKI!!!</strong>. Međutim, budući da se radi samo o smjernicama, vlasnici birtije ne mogu natjerati svoje posjetitelje da nose maske. Primijetili su da se u birtiji trenutno nalazi a ljudi koji nose maske i b ljudi koji ne nose maske, te im je također poznato da će tijekom večeri u birtiju doći jo&scaron; n ljudi. Duboko razumijevanje ljudske prirode uz dobro poznavanje vlastitih mu&scaron;terija omogućilo je vlasnicima da s nevjerojatnom prezino&scaron;ću zaključe kako će i-ti novoprido&scaron;li gost staviti masku ako i samo ako je birtija prije njegovog ulaska prazna ili se u birtiji nalazi barem p<sub>i</sub>% ljudi koji nose maske.</p>

<p>Nažalost, vlasnici birtije ne znaju kojim će redoslijedom gosti dolaziti u birtiju, ali znaju da nitko neće otići. Stoga ih zanima koji je najmanji, a koji najveći broj ljudi koji će u birtiji nositi maske nakon &scaron;to uđe svih n gostiju.</p>

### 입력

<p>U prvom se retku nalaze dva cijela broja a i b (0 &le; a, b &le; 10<sup>9</sup>) iz teksta zadatka.</p>

<p>U drugom se retku nalazi prirodan broj n (1 &le; n &le; 500 000) iz teksta zadatka.</p>

<p>U i-tom od sljedećih n redaka nalazi se realan broj p<sub>i</sub> (0 &le; p<sub>i</sub> &le; 100) iz teksta zadatka. Svaki od brojeva p<sub>i</sub> bit će zapisan na dvije decimale te će slijediti znak &#39;<code>%</code>&#39; (ASCII 37).</p>

### 출력

<p>U jednom je retku potrebno ispisati dva cijela broja koji redom označavaju najmanji i najveći broj ljudi koji će u birtiji nositi maske nakon &scaron;to uđe svih n gostiju.</p>