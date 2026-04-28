# [Bronze II] NASLJEDSTVO - 9664

[문제 링크](https://www.acmicpc.net/problem/9664)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 731, 정답: 459, 맞힌 사람: 405, 정답 비율: 64.490%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>A wealthy estate owner is so old that she&#39;s at that point in her life when she can&#39;t help talking funny. That is, naturally, the reason why her loving N daughters have started discussing their mother&#39;s heritage.&nbsp;</p>

<p>The youngest is sick and tired of just talking, so she conveniently decided to grab a hold of her share of the heritage. She knew exactly where her mother keeps her golden medallions &ndash; inside a thick sock in the third drawer next to the mirror in the hallway! The cunning daughter found this pile of medallions, split it into N equal parts, claimed her part and put the rest back into the sock. If the medallions couldn&#39;t have been split into N identical parts, then the parts were nearly identical: each differed from another by one medallion at most. In that case, the daughter claimed one of the smaller parts for herself.&nbsp;</p>

<p>The rest of the daughters found out about this (mis)deed so they counted the remaining medallions and now they want to know the initial number of medallions inside the sock, before the youngest one took her share. It is your task to answer this question. Given that there could be more than one possible answer, output both the smallest and the largest of them.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (2 &le; N &le; 15), the number of daughters.&nbsp;</p>

<p>The second line of input contains the integer O (N &le; O &le; 100), the number of remaining medallions.&nbsp;</p>

### 출력

<p>The first and only line of output must contain two integers: the minimal and the maximal possible total number of medallions.</p>

### 힌트

<p>Clarification of the first example: There are two daughters, so that means the youngest daughter took half of the medallions. If there were initially 9 medallions, the youngest took 4, so 5 are remaining. If, by any chance, there were initially 10 medallions, she took 5 so there are also 5 remaining. Hence, the possible answers are both 9 and 10.</p>