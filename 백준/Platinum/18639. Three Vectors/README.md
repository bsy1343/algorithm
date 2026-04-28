# [Platinum I] Three Vectors - 18639

[문제 링크](https://www.acmicpc.net/problem/18639)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 33, 맞힌 사람: 25, 정답 비율: 55.556%

### 분류

그래프 이론, 해 구성하기, 강한 연결 요소, 2-sat

### 문제 설명

<p>You are given three distinct binary vectors of length n. Find any 2-CNF formula which satisfies the following conditions:</p>

<ul>
	<li>The formula is true on these vectors;</li>
	<li>The number of vectors on which the formula is true is minimal possible;</li>
	<li>The formula is not too long.</li>
</ul>

<p>Recall that a <em>2-CNF formula</em> is a propositional formula of n boolean variables v<sub>1</sub>, . . . , v<sub>n</sub> which looks like</p>

<p style="text-align: center;">C<sub>1</sub> &and; C<sub>2</sub> &and; . . . &and; C<sub>m</sub>,</p>

<p>where each clause C<sub>i</sub> is represented as a disjunction &plusmn;x<sub>i1</sub> &or; &plusmn;x<sub>i2</sub> of two literals (by literal, we mean any variable or its negation). Here, x<sub>ij</sub> &isin; {v<sub>1</sub>, . . . , v<sub>n</sub>} is one of the variables, and &minus;x<sub>ij</sub> is its negation: true becomes false, and false becomes true. We say that the formula f is true on a binary vector v if f(v<sub>1</sub>, v<sub>2</sub>, . . . , v<sub>n</sub>) = 1.</p>

<p>If there are several valid formulas, you are allowed to output any one of them.</p>

### 입력

<p>The first line of input contains a single integer n which denotes the length of the three vectors (2 &le; n &le; 10<sup>5</sup>). The i-th of the following three lines contains a binary string of length n denoting the i-th binary vector.</p>

<p>No two vectors coincide.</p>

### 출력

<p>On the first line, print a single integer m (0 &le; m &le; 2 &middot; 10<sup>5</sup>). Then output m lines, i-th of them containing two integers a<sub>i</sub> and b<sub>i</sub> (1 &le; |a<sub>i</sub>|, |b<sub>i</sub>| &le; n), denoting that the i-th clause is a conjunction of two literals: the first is v<sub>a<sub>i</sub></sub> if a<sub>i</sub> &gt; 0 and &minus;v<sub>|a<sub>i</sub>|</sub> otherwise, and the second is, similarly, v<sub>b<sub>i</sub></sub> if b<sub>i</sub> &gt; 0 and &minus;v<sub>|b<sub>i</sub>|</sub> otherwise. If your formula is empty (that is, m = 0), it is considered to be true for every possible input vector of size n.</p>

<p>Please note that, if you use too many clauses, your answer will be considered incorrect.</p>