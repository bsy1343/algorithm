# [Gold II] Word Squared - 18548

[문제 링크](https://www.acmicpc.net/problem/18548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 57, 맞힌 사람: 48, 정답 비율: 62.338%

### 분류

해 구성하기

### 문제 설명

<p>Given a permutation of numbers from 1 to n, find a square matrix conforming to the following rules:</p>

<ol>
	<li>The matrix should include only numbers from the permutation;</li>
	<li>The given permutation should occur in every row of the matrix as a contiguous subsequence, read from left to right;</li>
	<li>The given permutation should occur in every column of the matrix as a contiguous subsequence, read from top to bottom;</li>
	<li>The matrix size is the smallest possible.</li>
</ol>

### 입력

<p>The first line of input is a positive integer n &le; 500.</p>

<p>The second line of input consists of n space-separated integers: the permutation itself.</p>

### 출력

<p>The first line of output should be an integer m: the size of the matrix. The next m lines should list m consecutive rows of the matrix. Each of these lines should contain m integers separated by spaces: the values in the corresponding row.</p>

<p>The size m should be minimum possible. If there are several possible answers, print any one of them.</p>

### 힌트

<p>Here is where the permutation occurs in the matrix from the example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18548.%E2%80%85Word%E2%80%85Squared/4f7e1281.png" data-original-src="https://upload.acmicpc.net/03adc2de-84de-4fc8-b780-b0093c920765/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50px; height: 62px;" />&nbsp; &nbsp; &nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18548.%E2%80%85Word%E2%80%85Squared/8eebb708.png" data-original-src="https://upload.acmicpc.net/bc8f434a-43da-46dd-8eae-76cb6b28a1fa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50px; height: 60px;" /></p>