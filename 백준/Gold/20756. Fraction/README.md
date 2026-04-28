# [Gold IV] Fraction - 20756

[문제 링크](https://www.acmicpc.net/problem/20756)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 58, 정답: 21, 맞힌 사람: 17, 정답 비율: 38.636%

### 분류

이분 탐색, 자료 구조, 수학, 정수론, 정렬

### 문제 설명

<p>During his first days in the mental ward, Berlaga pretended to be the viceroy of India. After giving it some thought, he decided it was risky --- they could put him on an elephant and make him steer the beast through the streets. He opted for a change of story. He hasn&#39;t decided yet what will be his next persona. Meanwhile, he&#39;s enjoying his favorite pastime: playing Solitaire.</p>

<p>Every now and then, he begins to wonder: what portion of the games does he win? Solitaire itself provides the answer with only two decimal places, and Berlaga loves precision and sometimes calculates the proportion himself. The answer can be both a finite or a repeating fraction, depending on the proportion itself and on the base of the numeral system used. That&#39;s right, mad accountants can use any positional numeral system they want, and not only decimal. For instance, in the decimal system, $1/3$ is an infinite repeating fraction, and $4/10$ is a terminating fraction, however, in ternary numeral system, everything is vice versa: $1/3$ is a terminating fraction &quot;$0.1$&quot;, and $4/10$ is an infinite recurring fraction &quot;$0.101210121012\ldots$&quot;.</p>

<p>Naturally, like all accountants, he does not like infinite fractions and prefers to calculate the proportion of his wins only when he is absolutely sure that it will be a terminating fraction. To do this, he needs to play a few more games.</p>

<p>Help Berlaga find the minimal number of games to be played additionally. The total number of the played games must not be greater than $M$.&nbsp;</p>

### 입력

<p>The first line of the input file contains three numbers: $B$ --- the base of the numeral system, $M$ --- maximum allowed number of games and $N$ --- number of queries ($2 \le B \le 5 \cdot 10^6$, $1 \le M \le 10^{18}$, $1 \le N \le 10^5$).</p>

<p>Next $N$ lines describe the queries. Each line contains a single integer $a_i$ --- the number of games already played by Berlaga ($1 \le a_i \le M$).</p>

### 출력

<p>The output file must contain $N$ lines, with an answer to the corresponding query in each line. Each answer must be an integer $A$ --- the number of games to be played additionally to assure that the proportion of wins is a terminal fraction ($A \ge 0$). If the total number of games in this case is greater than $M$, print $-1$ as the answer.</p>