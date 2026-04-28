# [Platinum I] Crusher’s Code - 9503

[문제 링크](https://www.acmicpc.net/problem/9503)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 20, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

조합론, 다이나믹 프로그래밍, 구현, 수학, 확률론

### 문제 설명

<p>Wesley Crusher is the teaching assistant for Introduction to Algorithms. During his first class, the cadets were asked to come up with their own sorting algorithms. Monty came up with the following code:</p>

<pre>
while (!sorted(a)) {
    int i = random(n) ;
    int j = random(n) ;
    if (a[min(i,j)] &gt; a[max(i,j)])
        swap(a[i], a[j]) ;
}
</pre>

<p>Carlos, inspired, came up with the following code:</p>

<pre>
while (!sorted(a)) {
    int i = random(n-1) ;
    int j = i + 1 ;
    if (a[i] &gt; a[j])
        swap(a[i], a[j]) ;
}
</pre>

<p>Wesley needs to determine which algorithm is better.</p>

<p>For a given input array of up to 8 values, calculate and print the expected number of iterations for each algorithm. That is, on average, how many iterations should each algorithm take for the given input?</p>

### 입력

<p>The first line contains T, the number of test cases: 2 &le; T &le; 100.</p>

<p>Each test case is given on a single line. The first value is N, the number of array elements; 2 &le; N &le; 8. This is followed on the same line by N integer array elements. The array elements will have values between 0 and 100 inclusive. The array elements may not be distinct.</p>

### 출력

<p>For each test case, print out the expected number of iterations for Monty&rsquo;s algorithm and for Carlos&rsquo;s algorithm, as shown in the sample output section. There should be exactly one space between words and no spaces at the start of each line or at the end of each line. There should be exactly six digits after the decimal point. Rounding should be to nearest representable value.</p>