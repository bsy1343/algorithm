# [Gold V] Symmetric Mountains - 28313

[문제 링크](https://www.acmicpc.net/problem/28313)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 48, 맞힌 사람: 46, 정답 비율: 67.647%

### 분류

수학, 다이나믹 프로그래밍, 사칙연산

### 문제 설명

<p>Rebecca is a tour guide and is trying to market the Rocky Mountains for her magazine. She recently took a beautiful picture consisting of $N$ mountains where the $i$-th mountain from the left has a height $h_i$. She will crop this picture for her magazine, by possibly removing some mountains from the left side of the picture and possibly removing some mountains from the right side of the picture. That is, a crop consists of consecutive mountains starting from the $l$-th to the $r$-th mountain where $l \le r$. To please her magazine readers, Rebecca will try to find the most symmetric crop.</p>

<p>We will measure the asymmetric value of a crop as the sum of the absolute difference for every pair of mountains equidistant from the midpoint of the crop. To help understand that definition, note that the absolute value of a number $v$, written as $|v|$, is the non-negative value of $v$: for example $|-6| = 6$ and $|14| = 14$. The asymmetric value of a crop is the sum of all $|h_{l+i} - h_{r-i}|$ for $0 \le i \le \frac{r-l}{2}$. To put that formula in a different way, we pair up the mountains working from the outside in toward the centre, calculate the absolute difference in height of each of these pairs, and sum them up.</p>

<p>Because Rebecca does not know how wide the picture needs to be, for all possible crop lengths, find the asymmetric value of the most symmetric crop (the crop with the minimum asymmetric value).</p>

### 입력

<p>The first line consists of an integer $N$, representing the number of mountains in the picture. The second line consists of $N$ space-separated integers, where the $i$-th integer from the left represents $h_i$.</p>

### 출력

<p>Output on one line $N$ space-separated integers, where the $i$-th integer from the left is the asymmetric value of the most symmetric picture of crops of length $i$.</p>

### 제한

<ul>
	<li>$1 \le N \le 5\,000$</li>
	<li>$0 \le h_i \le 10^5$</li>
</ul>