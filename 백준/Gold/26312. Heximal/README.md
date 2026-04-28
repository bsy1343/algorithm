# [Gold IV] Heximal - 26312

[문제 링크](https://www.acmicpc.net/problem/26312)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 242, 정답: 64, 맞힌 사람: 54, 정답 비율: 30.000%

### 분류

수학, 이분 탐색, 분할 정복을 이용한 거듭제곱, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>The base-6 numeral system is also called the heximal numeral system. We say a string $h_kh_{k-1} \cdots h_1h_0$ is a heximal number if $h_i &isin; \{0, 1, 2, 3, 4, 5\}$ for every $i &isin; \{0, 1, \dots , k\}$ and $h_k = 0$ implies $k = 0$. The value represented by $h_kh_{k-1} \cdots h_1h_0$ in the heximal numeral system is $\sum^{k}_{i=0}{h_i6^i}$. For example, the value of the heximal number $12345$ equals the value of the decimal number $1865 = 1 &times; 6^4 + 2 &times; 6^3 + 3 &times; 6^2 + 4 &times; 6 + 5$.</p>

<p>Harry asks you to convert a very large base-10 number $N$ to base-6. Since the conversion result can be very long, it is too hard for Harry to verify the result by himself. So, you just need to tell Harry the length of the conversion result. For example, if $N = 1865$, then you just need to tell Harry the length of the conversion result is $5$.</p>

### 입력

<p>The input contains exactly one integer $N$ in decimal.</p>

### 출력

<p>Output the length of the base-6 representation of $N$.</p>

### 제한

<ul>
	<li>$0 &le; N &lt; 10^{500000}$.</li>
</ul>