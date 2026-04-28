# [Platinum II] Estimation - 4790

[문제 링크](https://www.acmicpc.net/problem/4790)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 14, 맞힌 사람: 11, 정답 비율: 31.429%

### 분류

다이나믹 프로그래밍, 자료 구조, 우선순위 큐

### 문제 설명

<p>&ldquo;There are too many numbers here!&rdquo; your boss bellows. &ldquo;How am I supposed to make sense of all of this? Pare it down! Estimate!&rdquo;</p>

<p>You are disappointed. It took a lot of work to generate those numbers. But, you&rsquo;ll do what your boss asks.</p>

<p>You decide to estimate in the following way: You have an array A of numbers. You will partition it into k contiguous sections, which won&rsquo;t necessarily be of the same size. Then, you&rsquo;ll use a single number to estimate an entire section. In other words, for your array A of size n, you want to create another array B of size n, which has k contiguous sections. If i and j are in the same section, then B[i]=B[j]. You want to minimize the error, expressed as the sum of the absolute values of the differences (&sum;|A[i]-B[i]|).</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with two integers on a line, n (1&le;n&le;2,000) and k (1&le;k&le;25, k&le;n), where n is the size of the array, and k is the number of contiguous sections to use in estimation. The array A will be on the next n lines, one integer per line. Each integer element of A will be in the range from -10,000 to 10,000, inclusive. The input will end with a line with two 0s.</p>

### 출력

<p>For each test case, output a single integer on its own line, which is the minimum error you can achieve. Output no extra spaces, and do not separate answers with blank lines. All possible inputs yield answers which will fit in a signed 64-bit integer.</p>