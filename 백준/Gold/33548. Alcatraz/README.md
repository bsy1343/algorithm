# [Gold III] Alcatraz - 33548

[문제 링크](https://www.acmicpc.net/problem/33548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

그래프 이론, 그래프 탐색, 기하학, 분리 집합, 자료 구조, 피타고라스 정리

### 문제 설명

<p>After breaking into the database of the TU Delft and releasing sensitive information to the public, Anton the cyber criminal got the CIA looking for him. After being arrested, Anton was transported to the heavily guarded prison Alcatraz. Disabling the security system was a piece of cake, so he could easily get outside of the prison walls. However, behind these walls a number of guards are positioned and they will immediately sound the alarm if they spot any escaped prisoner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33548.%E2%80%85Alcatraz/89d635a5.png" data-original-src="https://boja.mercury.kr/assets/problem/33548-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 202px; height: 200px;"></p>

<p>To escape, Anton needs to cross a field with width $w$ and height $h$ that is being guarded by $n$ guards, without being spotted by any of the guards. He starts at position $(0,0)$ and can only escape if he reaches position $(w,h)$ without being spotted. Even if the criminal is only spotted at position $(n,n)$ the guards will sound the alarm and he will be captured. Some guards have better views that others, so every guard $i$ has an associated range of view $r_i$. If the distance between the guard and the escaped prisoner is $r_i$ or less, the guard will sound the alarm and the prisoner will return to his cell.</p>

<p>Your job is now to find out whether Anton can escape Alcatraz or if he cannot escape without being spotted. If he can escape, output ESCAPE. Otherwise output NO ESCAPE.</p>

### 입력

<ul>
	<li>A line with 3 integers:
	<ul>
		<li>$w$: the width of the area $(1 \leq w \leq 100)$.</li>
		<li>$h$: the height of the area $(1 \leq h \leq 100)$.</li>
		<li>$g$: the number of guards $(0 \leq g \leq 100)$.</li>
	</ul>
	</li>
	<li>$n$ lines $(i=1\dots n)$ with 3 integers each:
	<ul>
		<li>$x_i$: the $x$-coordinate of the $i^{th}$ guard $(0 \leq x_i \leq w)$.</li>
		<li>$y_i$: the $y$-coordinate of the $i^{th}$ guard $(0 \leq y_i \leq h)$.</li>
		<li>$r_i$: the range of the $i^{th}$ guard's vision $(0 \leq r_i \leq 100)$.</li>
	</ul>
	</li>
</ul>

### 출력

<p>ESCAPE if the prisoner can escape Alcatraz, NO ESCAPE otherwise.</p>