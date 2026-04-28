# [Gold IV] Denormalization - 26190

[문제 링크](https://www.acmicpc.net/problem/26190)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 530, 정답: 68, 맞힌 사람: 60, 정답 비율: 13.453%

### 분류

수학, 브루트포스 알고리즘, 정수론, 유클리드 호제법

### 문제 설명

<p>Dr. Brodnik prepared a list $A = [a_1, a_2, \ldots, a_N]$ that contained $N$ integers. No one knows what exactly these numbers represented, but it is well known that:</p>

<ul>
	<li>$1 \leq a_i \leq 10\,000$ for all $1 \leq i \leq N$ and</li>
	<li>their greatest common divisor was $1$.</li>
</ul>

<p>Dr. Hočevar decided to do his colleague a favor and normalized the list, as he thought that it represents a vector in the $n$-dimensional real vector space. Namely, he calculated the number $$d = \sqrt{\sum_{i=1}^{N}a_i^2} = \sqrt{a_1^2 + a_2^2 + \cdots + a_N^2}$$ and replaced Dr. Brodnik&#39;s list by $[a_1 / d, a_2 / d, \ldots, a_N / d]$. The numbers in this normalized list were also rounded to 12 decimal places for storage. We will refer to the elements of the stored normalized list as $X = [x_1, x_2, \ldots, x_N]$. After some time, he realized that it was a mistake and he now wishes to recover the original list $A$. Of course, no backup of the original has been made. Since Dr. Hočevar is too busy at the moment doing more important tasks, your help will be much appreciated.</p>

<p>As some data was lost due to rounding, he will be happy with any reconstructed list $R = [r_1, r_2, \ldots, r_N]$, such that after normalization it would differ from $X$ by at most $10^{-6}$ in each corresponding element.</p>

### 입력

<p>The first line of the input contains an integer $N$, i.e. the length of the list $X$. The $i$-th of the following $N$ lines contains a floating-point number $x_i$ with exactly 12 decimal places. It is guaranteed that the input is valid, i.e. it was really obtained in the described manner from a list of integers with the properties described above.</p>

### 출력

<p>The output should contain $N$ lines containing the reconstructed integers $r_1, r_2, \ldots, r_N$ in this order. You can output any acceptable solution as described above.</p>

<ul>
	<li>$1 \leq r_i \leq 10\,000$ for all $1 \leq i \leq N$</li>
	<li>$\gcd(r_1, \ldots, r_N) = 1$</li>
</ul>

### 제한

<ul>
	<li>$2 \leq N \leq 10\,000$</li>
	<li>$0 &lt; x_i &lt; 1$ for all $1 \leq i \leq N$</li>
</ul>