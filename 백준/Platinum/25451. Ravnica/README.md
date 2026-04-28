# [Platinum V] Ravnica - 25451

[문제 링크](https://www.acmicpc.net/problem/25451)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 우선순위 큐, 트리

### 문제 설명

<p>U jednom maloj državi živi Stjepan, čovjek koji mrzi raskrižja. Stjepan je nedavno postao apsolutni vladar države te je odlučio da će prva stvar koju će napraviti na vlasti biti uni&scaron;tavanje cesta kako vi&scaron;e ne bi bilo raskrižja.</p>

<p>Država se sastoji od $N$ gradova i $N-1$ cesta između gradova. Između svaka dva grada moguće je doći nekim jedinstvenim nizom cesta. Stjepan sada želi uni&scaron;titi neke ceste tako da nakon uni&scaron;tavanja svaki grad ima iz sebe najvi&scaron;e dvije ceste.</p>

<p>Iako će uni&scaron;tavati ceste, Stjepan je dobar čovjek i ne želi puno problema pa će uni&scaron;titi najmanji mogući broj cesta tako da ostvari svoj cilj. Odredite broj cesta koje će Stjepan uni&scaron;titi.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($2 &le; N &le; 100\,000$), broj gradova.</p>

<p>U sljedećih $N-1$ redaka nalaze se dva različita prirodna broja $A$ i $B$ ($1 &le; A, B &le; N$), oznake gradova koje spaja $i$-ta cesta.</p>

### 출력

<p>U prvi redak ispi&scaron;i traženi broj iz zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Stjepan može npr. uni&scaron;titi cestu između grada $1$ i grada $2$.</p>