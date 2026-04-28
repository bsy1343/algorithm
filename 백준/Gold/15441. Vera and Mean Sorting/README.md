# [Gold II] Vera and Mean Sorting - 15441

[문제 링크](https://www.acmicpc.net/problem/15441)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 38, 정답: 15, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

해 구성하기, 그리디 알고리즘, 수학

### 문제 설명

<p>The harmonic mean of a sequence of positive integers x<sub>1</sub>, &middot; &middot; &middot; , x<sub>N</sub> is</p>

<p>\[H\left(x_1, \cdots, x_N\right) = \left( \frac{\sum_{i=1}^{N}{x_i^{-1}}}{N}\right)^{-1} \text{.}\]</p>

<p>Vera classifies an array of positive integers A = [A<sub>1</sub>, &middot; &middot; &middot; , A<sub>N</sub>] of length N as K-mean-sorted if M(i) &ge; M(i + 1) for 1 &le; i &le; N &minus; K where</p>

<p>\[M\left(i\right) = H\left(A_i, \cdots, A_{i+K-1}\right) \text{.}\]</p>

<p>A permutation P is an ordered set of integers P<sub>1</sub>, P<sub>2</sub>, &middot; &middot; &middot; , P<sub>N</sub> , consisting of N distinct positive integers, each of which are at most N.</p>

<p>Permutation P is lexicographically smaller than permutation Q if there is an i (1 &le; i &le; N), such that P<sub>i</sub> &lt; Q<sub>i</sub>, and for any j (1 &le; j &lt; i) P<sub>j</sub> = Q<sub>j</sub>.</p>

<p>Given integers N and K, help Vera find the lexicographically smallest permutation P of integers 1 to N such that P is K-mean-sorted but not L-mean-sorted for 1 &le; L &le; N &minus; 1, L &ne; K.</p>

<p>If no such permutation exists output 0.</p>

### 입력

<p>The input will be in the format:</p>

<pre>
N K</pre>

<p>Constraints:</p>

<ul>
	<li>2 &le; N &le; 100</li>
	<li>1 &le; K &le; N &minus; 1</li>
	<li>N, K are integers</li>
</ul>

### 출력

<p>Output one line with the desired permutation. If such permutation does not exist output one line with 0.</p>