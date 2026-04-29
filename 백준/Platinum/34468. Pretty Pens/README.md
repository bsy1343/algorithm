# [Platinum IV] Pretty Pens - 34468

[문제 링크](https://www.acmicpc.net/problem/34468)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 19, 정답 비율: 63.333%

### 분류

그리디 알고리즘, 자료 구조, 집합과 맵

### 문제 설명

<p>You are taking an art class, and your current art assignment is very algorithmic.</p>

<p>You have $N$ pens, each of which has a single colour, represented by an integer from $1$ to $M$. Initially, the colour of the $i$-th pen is given by C$_i$. In addition, your pens are pretty, with the $i$-th pen having a prettiness of $P_i$.</p>

<p>For your assignment, you need to create a picture using $M$ strokes, each from a pen of a different colour. The prettiness of your picture is the sum of the prettiness of the pens used to create the picture.</p>

<p>Your teacher has given you some room for artistic expression: before you create this pretty picture, you are allowed to change at most one pen to any other colour. After this picture is drawn, the pen will revert back to its original colour.</p>

<p>Your teacher will give you $\frac{1} {3}$ of the marks ($5$ of $15$ total marks) for the art assignment based on creating the prettiest picture you can.</p>

<p>To push your creative limits, your teacher also has $Q$ more pictures for you to create, which compose the remaining $\frac{2}{3}$ of the marks ($10$ of $15$ total marks) for your art assignment. Before each picture, there will be one of two possible changes to the set of pens available:</p>

<ul>
	<li>$1$ $i$ $c$ indicates that the colour of the $i$-th pen changes to $c$.</li>
	<li>$2$ $i$ $p$ indicates that the prettiness of the $i$-th pen changes to $p$.</li>
</ul>

<p>The changes are executed sequentially (so the first change modifies the initial setup, the second change modifies the result of applying the first change, and so on).</p>

<p>As in the first picture you created, you are allowed to change the colour of at most one pen before the picture is created. Note that if you do change the colour of one pen, it affects only the next picture you draw, and the pen will revert to its previous colour before the next change is applied (if any).</p>

<p>What is the prettiness of the prettiest $Q + 1$ pictures you can create?</p>

### 입력

<p>The first line of input contains three space-separated integers $N$, $M$, and $Q $($1 ≤ M ≤ N ≤ 200\, 000$, $0 ≤ Q ≤ 200\, 000$).</p>

<p>The next $N$ lines each contain two space-separated integers, $C_i $and $P_i$ ($1 ≤ C_i ≤ M$, $1 ≤ P_i ≤ 10^9$), indicating the colour and prettiness of the $i$-th pen.</p>

<p>The next $Q$ lines each contain three space-separated integers, beginning with $1$ or $2$. If the first integer is $1$, it is followed by two integers $i_j$ and $c_j$ ($1 ≤ i_j ≤ N$, $1 ≤ c_j ≤ M$), representing a change of the colour of the i$_j$-th pen to $c_j$. If the first integer is $2$, it is followed by two integers $i_j$ and $p_j$ ($1 ≤ i_j ≤ N$, $1 ≤ p_j ≤ 10^9 $), representing a change of the prettiness of the $i_j$-th pen to $p_j$.</p>

<p>It is guaranteed that initially and after each change, there is at least one pen with each of the $M$ colours.</p>

### 출력

<p>The output is $Q + 1$ lines, with the $j$-th line containing one integer, the largest possible prettiness value obtainable after the first $j − 1$ changes have been performed.</p>