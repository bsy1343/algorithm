# [Platinum III] Jump - 11744

[문제 링크](https://www.acmicpc.net/problem/11744)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 207, 정답: 75, 맞힌 사람: 56, 정답 비율: 33.735%

### 분류

무작위화

### 문제 설명

<p>Consider a toy interactive problem $OneMax$ which is defined as follows. You know an integer $n$ and there is a hidden bit string $S$ of length $n$. The only thing you may do is to present the system a bit string $Q$ of length $n$, and the system will return the number $OneMax(Q)$ --- the number of bits which coincide in $Q$ and $S$ at the corresponding positions. The name of $OneMax$ problem stems from the fact that this problem is simpler to explain when $S = 111\ldots11$, so that the problem turns into maximization ($Max$) of the number of ones ($One$).</p>

<p>When $n$ is even, there is a similar (but harder) interactive problem called $Jump$. The simplest way to describe the $Jump$ is by using $OneMax$: $$\begin{equation*} Jump(Q) = \begin{cases} OneMax(Q) &amp; \text{if } OneMax(Q) = n \text{ or } OneMax(Q) = n/2;\\ 0 &amp; \text{otherwise}. \end{cases} \end{equation*}$$</p>

<p>Basically, the only nonzero values of $OneMax$ which you can see with $Jump$ are $n$ (which means you&#39;ve found the hidden string $S$) and $n/2$.</p>

<p>Given an even integer $n$ --- the problem size, you have to solve the $Jump$ problem for the hidden string $S$ by making interactive $Jump$ queries. Your task is to eventually make a query $Q$ such that $Q = S$.</p>

### 입력

<p>The first line of the input stream contains an even number $n$ ($2 \le n \le 1000$). The next lines of the input stream consist of the answers to the corresponding queries. Each answer is an integer --- either $0$, $n/2$, or $n$. Each answer is on its own line.</p>

### 출력

<p>To make a query, print a line which contains a string of length $n$ which consists of characters <code>0</code> and <code>1</code> only. Don&#39;t forget to put a newline character and to flush the output stream after you print your query.</p>