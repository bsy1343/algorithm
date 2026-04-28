# [Platinum V] Fleecing the Raffle - 13359

[문제 링크](https://www.acmicpc.net/problem/13359)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 129, 정답: 59, 맞힌 사람: 51, 정답 비율: 44.348%

### 분류

수학, 조합론

### 문제 설명

<p>A tremendously exciting raffle is being held,&nbsp;with some tremendously exciting prizes being&nbsp;given out. All you have to do to have a chance&nbsp;of being a winner is to put a piece of paper with&nbsp;your name on it in the raffle box. The lucky&nbsp;winners of the p prizes are decided by drawing&nbsp;p names from the box. When a piece of paper&nbsp;with a name has been drawn it is not put back&nbsp;into the box &ndash; each person can win at most one&nbsp;prize.</p>

<p>Naturally, it is against the raffle rules to put&nbsp;your name in the box more than once. However,&nbsp;it is only cheating if you are actually caught,&nbsp;and since not even the raffle organizers want to spend time checking all the names in the box,&nbsp;the only way you can get caught is if your name ends up being drawn for more than one of the&nbsp;prizes. This means that cheating and placing your name more than once can sometimes increase&nbsp;your chances of winning a prize.</p>

<p>You know the number of names in the raffle box placed by other people, and the number of&nbsp;prizes that will be given out. By carefully choosing how many times to add your own name to&nbsp;the box, how large can you make your chances of winning a prize (i.e., the probability that your&nbsp;name is drawn exactly once)?</p>

### 입력

<p>The input consists of a single line containing two integers n and p (2 &le; p &le; n &le; 10<sup>6</sup>), where n&nbsp;is the number of names in the raffle box excluding yours, and p is the number of prizes that will&nbsp;be given away.</p>

### 출력

<p>Output a single line containing the maximum possible probability of winning a prize, accurate&nbsp;up to an absolute error of 10<sup>&minus;6</sup>.</p>