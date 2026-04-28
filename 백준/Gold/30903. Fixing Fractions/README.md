# [Gold I] Fixing Fractions - 30903

[문제 링크](https://www.acmicpc.net/problem/30903)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 79, 맞힌 사람: 60, 정답 비율: 32.787%

### 분류

수학, 브루트포스 알고리즘, 정수론, 비트마스킹

### 문제 설명

<p>Maths is hard.<sup>[citation needed]</sup> But it could be easier! And the internet&trade; has found some excellent ways to make it easier. Take a look at the following true equations:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/634b73a8-90e3-48a5-a275-3876cc12b91c/-/preview/" style="width: 256px; height: 55px;" /></p>

<p>Following the patterns, we come to the conclusion that the following equation should also be true:\vspace{-0.75\baselineskip}</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/36d3d2db-bd46-45db-9947-483dcd2ce16b/-/preview/" style="width: 64px; height: 31px;" /></p>

<p>However, this is actually wrong in boring old standard maths. Therefore, we define a new kind of funky maths where it is allowed to cancel out digits on the left side of the equality sign. This surely will make everyone&#39;s life easier. Except yours, since you have to evaluate if two given fractions are equal in our new funky maths.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with four integers $a$, $b$, $c$, and $d$ ($1\leq a,b,c,d&lt;10^{18}$), describing the two fractions $\frac{a}{b}$ and $\frac{c}{d}$.</li>
</ul>

### 출력

<p>If there exist integers $a&#39;$ and $b&#39;$ obtained from $a$ and $b$ by cancelling out the same digits and with $\frac{a&#39;}{b&#39;} = \frac{c}{d}$ in standard mathematics, output &quot;<code>possible</code>&quot;, followed by $a&#39;$ and $b&#39;$. Otherwise, output &quot;<code>impossible</code>&quot;.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

<p>Note that neither $a&#39;$ nor $b&#39;$ is allowed to contain leading zeroes after cancelling digits.</p>