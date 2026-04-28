# [Silver II] Swords - 28491

[문제 링크](https://www.acmicpc.net/problem/28491)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 241, 정답: 122, 맞힌 사람: 100, 정답 비율: 49.505%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Yan Hao has $n$ swords numbered from $1$ to $n$. Sword $i$ has attack $a[i]$ and defence $b[i]$.</p>

<p>Yan Hao thinks that sword $i$ is <strong>useless</strong> if there exists a different sword $j$ ($j \ne i$) such that $a[i] &le; a[j]$ and $b[i] &le; b[j]$. That is, a sword $i$ is <strong>useless</strong> if the attack and defence of another sword $j$ are both at least as good as that of sword $i$. If a sword is <strong>not useless</strong>, we say that it is <strong>useful</strong>.</p>

<p>Two swords are considered equivalent if they have the same attack and same defence. It is guaranteed that no pair of swords are equivalent.</p>

<p>Help Yan Hao find the number of <strong>useful</strong> swords in his collection.</p>

### 입력

<p>The first line of input contains exactly $1$ integer, $n$.</p>

<p>The next $n$ lines of input contains two space-separated integers each. The $i$-th such line of input will contain $a[i]$ and $b[i]$ respectively, indicating the attack and defence of sword $i$.</p>

### 출력

<p>The output should contain one integer, the number of <strong>useful</strong> swords.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 100\,000$</li>
	<li>$1 &le; a[i], b[i] &le; 10^9$</li>
	<li>For all $1 &le; i &lt; j &le; n$, $a[i] \ne a[j]$ or $b[i] \ne b[j]$</li>
</ul>