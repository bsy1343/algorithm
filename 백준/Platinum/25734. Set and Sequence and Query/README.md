# [Platinum V] Set and Sequence and Query - 25734

[문제 링크](https://www.acmicpc.net/problem/25734)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 357, 정답: 136, 맞힌 사람: 89, 정답 비율: 40.826%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Takina and Chisato are playing a game with a set of positive integers.</p>

<p>This game is about making <em>continuous increasing sequence</em>s using the numbers from the set.</p>

<p>A <em>continuous increasing sequence</em> is defined as a sequence $a_1,a_2,\dots ,a_k$ of positive length $k$, satisfying $a_{i+1}=a_i+1$ for all $1\leq i\leq k-1$.</p>

<p>The game begins with an empty set and consists of $Q$ turns. In each turn, Takina can either insert a new integer into the set or delete an integer from the set.</p>

<p>Every time a change is made to the set, Chisato has to count how many different <em>continuous increasing sequence</em>s can be made using the numbers from the set.</p>

<p>Your task is to help Chisato.</p>

### 입력

<p>The first line contains the number of turns, $Q$.</p>

<p>The following $Q$ lines contain two integers, describing Takina&rsquo;s move. Each line has one of the following forms:</p>

<ul>
	<li><code>1</code> $x$ : Insert $x$ into the set. It is guaranteed that $x$ was not in the set.</li>
	<li><code>2</code> $x$ : Delete $x$ from the set. It is guaranteed that $x$ was in the set.</li>
</ul>

### 출력

<p>Output $Q$ integers separated by newlines, the number of <em>continuous increasing sequence</em>s in the set after each Takina&rsquo;s move.</p>

### 제한

<ul>
	<li>$1\leq Q\leq 300\, 000$</li>
	<li>$1\leq x\leq 10^9$</li>
</ul>