# [Silver I] The Water Bowls - 26992

[문제 링크](https://www.acmicpc.net/problem/26992)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 268, 정답: 96, 맞힌 사람: 79, 정답 비율: 42.703%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>The cows have a line of 20 water bowls from which they drink. The bowls can be either right-side-up (properly oriented to serve refreshing cool water) or upside-down (a position which holds no water). They want all 20 water bowls to be right-side-up and thus use their wide snouts to flip bowls.</p>

<p>Their snouts, though, are so wide that they flip not only one bowl but also the bowls on either side of that bowl (a total of three or -- in the case of either end bowl -- two bowls).</p>

<p>Given the initial state of the bowls (1=undrinkable, 0=drinkable -- it even looks like a bowl), what is the minimum number of bowl flips necessary to turn all the bowls right-side-up?</p>

### 입력

<ul>
	<li>Line 1: A single line with 20 space-separated integers</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of bowl flips necessary to flip all the bowls right-side-up (i.e., to 0). For the inputs given, it will always be possible to find some combination of flips that will manipulate the bowls to 20 0&#39;s.</li>
</ul>