# [Silver V] Pismo - 16756

[문제 링크](https://www.acmicpc.net/problem/16756)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 710, 정답: 273, 맞힌 사람: 236, 정답 비율: 40.000%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>In a small village besides Đakovo lives Kasap. While agriculture is his branch, love and destiny, in his free time Kasap solves tasks in competitive programming and is doing very well. Particularly interesting are the tasks involving data structures.</p>

<p>On a sunny summer day, Kasap&#39;s friend Mirko sent him a letter we carry forward entirely:</p>

<blockquote>
<p>&ldquo;My dear Kasap,<br />
I hope you tolerate well these hot summer days. I&#39;m writing this letter because I have a problem. One friend gave me a hard task the other day that I have not managed to solve yet. Since I know that you love this sort of tasks, I would ask you for help because I do not want to embarass myself in front of my friend. In the task there is an array A consisting of N integers. You should find an interval of the minimum value. The value of the interval [L, R] is defined as the difference between the maximum and minimum value of the numbers in that interval: max(A[L], A[L+1], &hellip;, A[R]) - min(A[L], A[L+1], &hellip;, A[R]). I will remind you that we observe only the intervals in which L is strictly less than R.<br />
Thank you,<br />
Mirko&rdquo;</p>
</blockquote>

<p>After a week of solving, Kasap has not yet managed to solve the task and asks you to help him.</p>

### 입력

<p>In the first line of input there is a positive integer N (2 &le; N &le; 100 000).</p>

<p>In the second line of input there are N integers, which absolute value is less than 10<sup>9</sup>.</p>

### 출력

<p>Print the minimum value of an interval.</p>