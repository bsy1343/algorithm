# [Platinum V] Frogs - 19385

[문제 링크](https://www.acmicpc.net/problem/19385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

해 구성하기, 자료 구조, 스택

### 문제 설명

<p>There are $n$ frogs sitting on $n$ rocks which are located on a straight line. Each rock contains exactly one frog. The rocks (as well as the frogs) are numbered by consecutive integers from $1$ to $n$ in the order of their positions on the line.&nbsp;</p>

<p>The frogs have a secret plan of taking over the world that involves all of them performing jumps at the same time in such way that, after their jumps, each rock still contains exactly one frog. Denote the destination rock of the $i$-th frog as $p_i$. Some frogs may have possibly jumped in place, that is, $p_i$ may be equal to $i$.</p>

<p>There is a satellite high in the sky that tracks the frogs&#39; movements. For technical reasons, it only tracks targets that are in motion. So the information it provides is the following: for each of the $n-1$ intervals between the rocks, it is known how many frogs crossed this interval in either direction.</p>

<p>The frogs have jumped once as described above. Find any sequence $p_i$ that satisfies the observed $n - 1$ numbers of crossings.</p>

### 입력

<p>The first line contains an integer $n$, the number of frogs ($2 \leq n \leq 200\,000$).</p>

<p>The second line contains $n - 1$ space-separated integers $a_1, \ldots, a_{n-1}$ ($0 \leq a_i \leq 200\,000$), $i$-th of them denotes the number of frogs that crossed the interval between rocks $i$ and $i + 1$.</p>

### 출력

<p>If a required permutation doesn&#39;t exist, output &quot;<code>No</code>&quot; (without the quotes). Otherwise, output &quot;<code>Yes</code>&quot; on the first line. On the second line, output $n$ integers $p_1, p_2, \ldots, p_n$ such that if the frogs perform jumps according to this sequence, each rock still contains exactly one frog, and the observed numbers of crossings of all intervals between the rocks are as given. If there are several possible answers, output any one of them.</p>