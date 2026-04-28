# [Gold II] Dumb Bones - 4334

[문제 링크](https://www.acmicpc.net/problem/4334)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

(분류 없음)

### 문제 설명

<p>You are trying to set up a straight line of dominos, standing on end, to be pushed over later for your entertainment. (Sure, it seems pointless to set something up only to knock it down again, but you have some strange hobbies) The tricky thing about setting dominos, however, is that if you make a mistake and knock one over as you place it, it will knock down any adjacent line of consecutive dominos on one side of it, partially ruining your work.</p>

<p>For instance, if you&#39;ve already placed dominos in the pattern DD__DxDDD_D, and you try placing a domino at position x, there is a chance it will fall and knock over the domino to the left or the three dominos to its right, forcing you to place them again.</p>

<p>This human error is somewhat unavoidable, but you can make the odds somewhat more favourable by using a domino-placing technique that leads to dominos falling in one direction more often than in the other.</p>

<p>Given the number of dominos you are trying to set up, and the probability that you&#39;ll knock over any individual domino either to the left or to the right while placing it, determine the average number of dominos you&#39;ll need to place before you finish. Assume that you&#39;re using an optimal placement strategy.</p>

### 입력

<p>Input will consist of up to 100 cases. Each case consists of one line of input. It will contain the number of dominos to place, n, 1 &lt;= n &lt;= 1000, followed by nonnegative values Pl and Pr, indicating the probability of any domino falling to the left or to the right when placed. You may assume 0 &lt; Pl + Pr &lt;= 0.5.</p>

<p>The last test case is followed by a line containing a single 0.</p>

### 출력

<p>For each case, output the expected number of dominos that will need to be placed before you finish, accurate to two digits after the decimal.</p>