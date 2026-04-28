# [Gold II] Magic Trick - 19726

[문제 링크](https://www.acmicpc.net/problem/19726)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 34, 맞힌 사람: 27, 정답 비율: 41.538%

### 분류

애드 혹, 해 구성하기, 그래프 이론, 구현

### 문제 설명

<p>Artem came to a circus, and now he is going to take part in the magic trick.</p>

<p>Artem secretly chooses permutation --- an array of $n$ distinct integers from $1$ to $n$. Let the chosen permutation be $[a_1, a_2, \ldots, a_n]$. For every $i$ from $1$ to $n$ Artem takes the set $\{a_i, a_{i+1}, a_{i+2}\}$ (we assume that $a_{n+1} = a_1$, $a_{n+2} = a_2$).</p>

<p>He shuffles the elements of each set, and then shuffles the sets themselves. After that he &nbsp;reports the resulting sets to the Magician.</p>

<p>You are that Magician. You need to figure out the permutation Artem has chosen.</p>

### 입력

<p>The first line contains an integer $n$ ($3 \le n \le 200\,000$), the number of elements in the permutation.</p>

<p>Each of the following $n$ lines contains three distinct integers $a_{i,1}, a_{i,2}, a_{i,3}$ ($1 \le a_{i,j} \le n$), the sets that Artem has reported to the Magician.</p>

<p>It&#39;s guaranteed, that the Artem&#39;s sets correspond to at least one valid permutation.</p>

### 출력

<p>Print the permutation of $n$ elements Artem has secretly chosen.</p>

<p>If there are several possible permutations that can lead to the given sets of triples, print any suitable permutation.</p>

### 힌트

<p>In the second example, you can print any permutation of $1$, $2$ and $3$.</p>