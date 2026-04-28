# [Platinum III] Trade - 21090

[문제 링크](https://www.acmicpc.net/problem/21090)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 125, 정답: 32, 맞힌 사람: 29, 정답 비율: 28.713%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>It is the last day of your vacation and you decided to buy some memorabilia to remind you about these nice times. There are $n$ merchants, you liked one item from each one. The price written beside the item from $i$-th merchant is $c_{i}$. You have $S$ money with you, and you are ready to spend them on the souvenirs. You don&#39;t have any preference so you just want to buy as many different items as possible. It would be an easy job but this is tourist shops we are talking about. They thrive on gullible tourists.</p>

<p>$i$-th merchant has a persuasion parameter $p_{i}$ and they are <strong>different</strong> for different merchants. The more souvenirs you already have, the more a merchant is sure about your willingness to spend money on worthless crap. If a merchant sees that you have already bought $k$ souvenirs, he raises the price on his souvenir to $c_{i} + k \cdot p_{i}$.</p>

<p>What is the maximal number of souvenirs you can buy?</p>

### 입력

<p>The first line contains two integers $n$ and $S$ ($1 \le n \le 10^{5}$, $0 \le S \le 10^{9}$) --- the number of merchants and the amount of money you have.</p>

<p>The second line contains initial prices of all the souvenirs $c_{1}, c_{2}, \ldots, c_{n}$ ($1 \le c_{i} \le 10^{9}$).</p>

<p>The third line contains persuasion parameters of all the merchants $p_{1}, p_{2}, \ldots, p_{n}$ ($0 \le p_{i} \le 10^{9}$). It is guaranteed that they are distinct.</p>

### 출력

<p>Print one number --- how many souvenirs you can buy.</p>