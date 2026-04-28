# [Platinum I] Kratki - 14074

[문제 링크](https://www.acmicpc.net/problem/14074)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 19, 맞힌 사람: 13, 정답 비율: 35.135%

### 분류

분할 정복, 분할 정복을 사용한 최적화, 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Zadan je niz cijelih brojeva a<sub>1</sub>, a<sub>2</sub>, ... ,a<sub>N</sub>. Za prirodan broj K definiramo niz b kao niz ne nužno cijelih brojeva b<sub>1</sub>, b<sub>2</sub>, ... , b<sub>K</sub> takav da izraz S ima najmanju moguću vrijednost:&nbsp;</p>

<p>&nbsp;\[ S=\sum^{N}_{i=1} min_{1 \le j \le K} |a_i - b_j| &nbsp;\]</p>

<p>Za svaki K od 1 do N ispi&scaron;ite najmanju moguću vrijednost izraza S.&nbsp;</p>

### 입력

<p>Prvi red sadrži prirodni broj N (1 &le; N &le; 5000). U drugom redu nalazi se N cijelih brojeva iz intervala [0, 200 000] koji predstavljaju niz a.&nbsp;</p>

### 출력

<p>Izlaz se sastoji od jednog reda u kojem se nalazi N brojeva. K-ti broj predstavlja najmanju moguću vrijednost izraza S ako je duljina niza b jednaka K.</p>

<p>Test podaci će biti takvi da su rje&scaron;enja uvijek cijeli brojevi.&nbsp;</p>

### 힌트

<p>Npr, za K = 3 možemo uzeti niz b = {0, 6, 13}, a za K = 4 niz {0, 5, 9, 13}.&nbsp;</p>