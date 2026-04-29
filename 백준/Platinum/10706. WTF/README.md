# [Platinum V] WTF - 10706

[문제 링크](https://www.acmicpc.net/problem/10706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

(분류 없음)

### 문제 설명

<p>Assume you are given an array A of N integers, array ID of N + 1 integers from the interval [1, N −1] and an integer R.</p>

<p>We are doing a Warshall-Turing-Fourier transformation<sup>1</sup> on array A in the following way:</p>

<pre>sum = 0

for i = 1 to N
    index = min{ ID[i], ID[i+1] }
    sum = sum + A[index]
    rotate array A to the right by R places

change the signs of all elements in A

for i = 1 to N
    index = max{ ID[i], ID[i+1] }
    index = index + 1
    sum = sum + A[index]
    rotate array A to the right by R places</pre>

<p>You are given the array A and constant R, but you are not familiar with the array ID. What is the largest possible value of variable sum after execution of the above algorithm?</p>

<p><sup>1</sup>This doesn’t really exist.</p>

### 입력

<p>The first line of input contains the integers N and R (2 ≤ N ≤ 3 000, 1 ≤ R &lt; N) from the task.</p>

<p>The second line of input contains the elements of array A, respectively from A[1] to A[N]. These are integers from the interval [−10<sup>4</sup>, 10<sup>4</sup>].</p>

### 출력

<p>The first line of output must contain the maximal value of sum.&nbsp;</p>

<p>The second line of output must contain the array ID of N + 1 integers from the interval [1, N - 1] for which the algorithm outputs the maximal sum. If there are multiple such arrays, output any.</p>