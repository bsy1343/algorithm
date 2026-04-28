# [Platinum IV] Bitovi - 31684

[문제 링크](https://www.acmicpc.net/problem/31684)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 13, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

해 구성하기, 비트마스킹

### 문제 설명

<p>What came first, the chicken or the egg? Is it better to live a hundred years as a millionaire or seven days in poverty? How to become a chess grandmaster? <s>How to raise blinds?</s> How to pass the final exams? How to train a dragon? These are interesting questions we can ponder only after the competition, but now we offer one <em>less interesting</em> computer science problem.</p>

<p>You are given two sets of numbers $A$ and $B$ of size $N$. In one move, you can select an arbitrary element from set $A$ and change one arbitrary digit (bit) in its binary representation. The resulting number must not be an element of set $A$ immediately before the change.</p>

<p>For example, the number $5$ in binary is $0101_2$. In one move, it can become $13 = 1101_2$, $1 = 0001_2$, $7 = 0111_2$, or $4 = 0100_2$ if we change its $4$th, $3$rd, $2$nd, or $1$st bit, respectively.</p>

<p>Determine a sequence of moves by which set $A$ becomes equal to set $B$. Sets are equal if they have the same size and there is no element in set $A$ that does not belong to set $B$.</p>

<p>Note: The number of moves does not have to be minimal, but it must satisfy the task constraints.</p>

### 입력

<p>The first line contains the integer $N$ ($1 &le; N &le; 2^{15}$), the size of the sets $A$ and $B$.</p>

<p>The second line contains $N$ different integers $a_i$ ($0 &le; a_i &lt; 2^{15}$), the elements of the set $A$.</p>

<p>The third line contains $N$ different integers $b_i$ ($0 &le; b_i &lt; 2^{15}$), the elements of the set $B$.</p>

### 출력

<p>In the first line, print the number of required moves.</p>

<p>In the remaining lines, print the numbers $x$ and $y$ ($0 &le; x, y &lt; 2^{15}$) &ndash; we change the number $x$ from set $A$ to the number $y$. The numbers $x$ and $y$ must differ by exactly one bit, and $x \in A$ and $y \not\in A$ must hold at the moment we execute the move.</p>