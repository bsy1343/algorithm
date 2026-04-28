# [Silver II] Robin Hood - 25101

[문제 링크](https://www.acmicpc.net/problem/25101)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 144, 정답: 86, 맞힌 사람: 77, 정답 비율: 60.630%

### 분류

구현, 자료 구조, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>Elders of the village foresee a harsh winter and Robin Hood is worried about the wellbeing of those less well off. As usual, he will be doing a bit of wealth redistribution in the kingdom, that is, he plans to steal from the rich. He estimates that $K$ heists will be required. However, Robin Hood has a moral codex that determines who the best target is. He always steals from the richest person &ndash; if there are several, he will pick the first one on the list. He only steals $100$ monetary units at the time and never steals from anybody who would be left with $0$ (or less) money after the heist.</p>

<p>You are provided with the information about the wealth of $N$ men and the number of heists, denoted as $K$. Compute the amount of wealth left after $K$ performed heists according to the described moral codex.</p>

### 입력

<p>The first line contains two space-separated integers, $N$ and $K$. The second line contains $N$ space-separated integers $P_i$, the wealth of all Robin Hood&rsquo;s targets.</p>

### 출력

<p>Print the amount of wealth after the $K$ thefts, or print <code>impossible</code> if Robin Hood cannot perform that many thefts.</p>

### 제한

<ul>
	<li>$1 &le; N, K &le; 10^5$</li>
	<li>$1 &le; P_i &le; 10^9$</li>
</ul>