# [Platinum I] Blind Box - 24714

[문제 링크](https://www.acmicpc.net/problem/24714)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

수학, 조합론

### 문제 설명

<p>You are the owner of a store.&nbsp;</p>

<p>The store has launched a new blind box campaign. Each blind box contains $n$ cards, and there is a positive integer written on each card. The cards in each box are ordered in such a way that the number on the $i$-th card is greater than or equal to the number on the $(i{-}1)$-th card for every $i &gt; 1$. Additionally, the integer on each card does not exceed $m$.</p>

<p>The store has <strong>all</strong> possible blind boxes satisfying the conditions above, and every two blind boxes in the store are different. Two boxes are considered different if and only if there is an index $i$ such that the numbers on the $i$-th cards in the two boxes are different.</p>

<p>You sell blind boxes at a fixed price. After buying and opening a blind box, customers will ask you for a cashback, and the amount equals the product of the numbers on the $n$ cards in the box. Please calculate the minimum price of each blind box to ensure that, after selling all blind boxes, your net income is non-negative.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$: the number of cards in each box and the maximum value on a card ($1 \leq n, m \leq 10^5$).</p>

### 출력

<p>Print a single integer: the minimum price to ensure a non-negative net income. The price may be fractional, but you have to output this price modulo $998\,244\,353$. Formally, let the minimum price be an irreducible fraction $\frac{x}{y}$. They you have to print $x \cdot y^{-1} \bmod 998\,244\,353$, where $y^{-1}$ is an integer such that $y \cdot y^{-1} \bmod 998\,244\,353 = 1$.</p>

### 힌트

<p>Explanation of the first example:</p>

<p>There are three different blind boxes: $(1,1)$, $(1,2)$, and $(2,2)$.</p>

<p>The amounts of cashback are $1$, $2$, and $4$, respectively.</p>

<p>So, the minimum price should be $\frac{7}{3}$.</p>

<p>And the answer in the second example is $\frac{42525}{126} = \frac{675}{2}$.</p>