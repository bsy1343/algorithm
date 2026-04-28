# [Silver IV] Choose and divide - 4397

[문제 링크](https://www.acmicpc.net/problem/4397)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 103, 정답: 52, 맞힌 사람: 42, 정답 비율: 61.765%

### 분류

수학, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>The binomial coefficient C(m,n) is defined as</p>

<pre>
            m!
C(m,n) = --------
         n!(m-n)!
</pre>

<p>Given four natural numbers p, q, r, and s, compute the the result of dividing C(p,q) by C(r,s).</p>

### 입력

<p>Input consists of a sequence of lines. Each line contains four non-negative integer numbers giving values for p, q, r, and s, respectively, separated by a single space. All the numbers will be smaller than 10,000 with p&gt;=q and r&gt;=s.</p>

### 출력

<p>For each line of input, print a single line containing a real number with 5 digits of precision in the fraction, giving the number as described above. You may assume the result is not greater than 100,000,000.</p>