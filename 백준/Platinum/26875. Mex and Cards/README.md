# [Platinum III] Mex and Cards - 26875

[문제 링크](https://www.acmicpc.net/problem/26875)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 31, 맞힌 사람: 28, 정답 비율: 68.293%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>Mike enjoys playing with cards. Each card in his deck has a single integer value from $0$ to $n-1$ written on it. Initially the deck contains $a_i$ cards with value $i$.</p>

<p>Today Mike is learning the concept of <em>mex</em>. The mex of a collection of integers is the smallest non-negative integer that does not belong to the collection. For instance, $\operatorname{mex}(\{4, 1, 4, 12, 0, 7, 0, 0, 5\}) = 2$.</p>

<p>Mike will distribute all cards in his deck into non-empty piles. Each card must belong to exactly one pile. He will then find the mex of the card values in each pile and add them all together. Mike wants to find a distribution that maximizes this sum.</p>

<p>Moreover, a sequence of $q$ modifications happens to the deck: sometimes a new card is added to the deck, while other times a card is removed from the deck. Mike wants to find the distribution with the maximum sum of mexes at every point in the sequence: before the first modification, and after the first $i$ modifications for every $i = 1, 2, \ldots, q$.</p>

### 입력

<p>The first line contains a single integer $n$ --- the range of card values ($1 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_0, a_1, \ldots, a_{n-1}$ --- the number of cards with value $0, 1, \ldots, n-1$ in the deck initially ($0 \le a_i \le 10^6$).</p>

<p>The third line contains a single integer $q$ --- the number of deck modifications ($0 \le q \le 2 \cdot 10^5$).</p>

<p>The $i$-th of the next $q$ lines contains two integers $p_i$ and $v_i$, describing the $i$-th modification ($1 \le p_i \le 2$; $0 \le v_i &lt; n$). If $p_i = 1$, a new card with value $v_i$ is added to the deck. If $p_i = 2$, a card with value $v_i$ is removed from the deck.</p>

<p>It is guaranteed that if $p_i = 2$, then the deck contains at least one card with value $v_i$ right before the $i$-th modification.</p>

### 출력

<p>Print $q+1$ integers --- the maximum possible sum of mexes for some valid distribution of all cards into piles after the first $0, 1, \ldots, q$ modifications to the deck.</p>

### 힌트

<p>For the initial deck of the example test, one of the best distributions is to assign the cards with values $0$ and $2$ into one pile, the cards with values $0, 1, 2, 2, 4$ into another pile, and the card with value $4$ into the third pile. The sum of mexes in this distribution is $\operatorname{mex}(\{0, 2\}) + \operatorname{mex}(\{0, 1, 2, 2, 4\}) + \operatorname{mex}(\{4\}) = 1 + 3 + 0 = 4$.</p>