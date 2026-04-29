# [Platinum V] Avoid Copyright Infringement - 34909

[문제 링크](https://www.acmicpc.net/problem/34909)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 9, 정답 비율: 52.941%

### 분류

많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<p>Busy Beaver has $X$ cards with the letter <code>M</code>, $Y$ cards with the letter <code>I</code>, and $Z$ cards with the letter <code>T</code>.</p>

<p>He wants to arrange these $X+Y+Z$ cards into a row following some constraints:</p>

<ul>
<li>Busy Beaver likes variety, so <strong>no two adjacent cards can be equal</strong>;</li>
<li>Busy Beaver wants to avoid getting sued, so <strong>no three consecutive cards in a row can read</strong> <code>MIT</code> <strong>or</strong> <code>TIM</code>.</li>
</ul>

<p>Determine if he can do this. If it is possible, output an example.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 50$) --- the number of test cases.</p>

<p>The only line of each test case contains three integers $X$, $Y$, and $Z$ ($0 \leq X, Y, Z \leq 10^5$). There is at least one card in each test case ($X+Y+Z &gt; 0$).</p>

<p>The combined sum of $X+Y+Z$ across all test cases does not exceed $3 \cdot 10^5$.</p>

### 출력

<p>For each test case, if Busy Beaver cannot arrange all $X+Y+Z$ cards, output <code>NO</code>.</p>

<p>Otherwise, output <code>YES</code>. Then, output one line --- a string of length $X+Y+Z$ consisting of characters <code>M</code>, <code>I</code>, and <code>T</code>, satisfying the constraints in the statement.</p>

<p>You can output the answer in any case (upper or lower). For example, the strings "<code>yEs</code>", "<code>yes</code>", "<code>Yes</code>", and "<code>YES</code>" will be recognized as positive responses. You can also output the string in any case.</p>

### 힌트

<p>In the first test case, there are $4$ possible combinations that will work: <code>ITM</code>, <code>IMT</code>, <code>MTI</code>, <code>TMI</code>. <code>ITM</code> is one of them. It does not have equal adjacent cards, and there is no <code>MIT</code> or <code>TIM</code>.</p>

<p>In the second test case, there is only one possible construction: <code>MMM</code>, but it is not valid, as there are adjacent <code>M</code>s.</p>