# [Platinum IV] Cyclic antimonotonic permutations - 6496

[문제 링크](https://www.acmicpc.net/problem/6496)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 59, 맞힌 사람: 38, 정답 비율: 71.698%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>A permutation is a sequence of integers which contains each integer from <em>1</em> to <em>n</em> exactly once. In this problem we are looking for permutations with special properties:</p>

<ol>
	<li><strong>Antimonotonic:</strong> for each consecutive 3 values <em>p<sub>i-1</sub></em>, <em>p<sub>i</sub></em>, <em>p<sub>i+1</sub></em> (<em>1 &lt; i &lt; n</em>), <em>p<sub>i</sub></em> should either be the smallest or the biggest of the three values.</li>
	<li><strong>Cyclic:</strong> The permutation should consist of only one cycle, that is, when we use <em>p<sub>i</sub></em> as a pointer from <em>i</em> to <em>p<sub>i</sub></em>, it should be possible to start at position <em>1</em> and follow the pointers and reach all <em>n</em> positions before returning to position <em>1</em>.</li>
</ol>

### 입력

<p>The input file contains several test cases. Each test case consists of a line containing an integer <em>n</em>, (<em>3 &le; n &le; 10<sup>6</sup></em>), the number of integers in the permutation. Input is terminated by <em>n=0</em>.</p>

### 출력

<p>For each test case print a permutation of the integers <em>1</em> to <em>n</em> which is both antimonotonic and cyclic. In case there are multiple solutions, you may print any one. Separate all integers by whitespace characters.</p>