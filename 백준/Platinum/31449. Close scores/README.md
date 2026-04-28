# [Platinum III] Close scores - 31449

[문제 링크](https://www.acmicpc.net/problem/31449)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그래프 이론, 해 구성하기, 오일러 경로

### 문제 설명

<p>The Olympic football tournament has started and, of course, France is going to win by a landslide, thus killing all the suspense. Or is it? Until now, only ties happened: not very exciting...</p>

<p>To hype the event, you would like every remaining match not to be a tie, and among all such configurations, you would like to find one which minimises the difference between the best score and the worst score. Remember that the score of a team is the number of its won matches minus its lost matches.</p>

<p>Given the list of remaining matches, find such an optimal configuration of matches.</p>

### 입력

<p>The first line contains two space-separated integers $N$ and $M$; $N$ is the number of teams, and $M$ is the number of remaining matches. This line is followed by $M$ lines: the $k$<sup>th</sup> such line contains two space-separated integers $x_k$ and $y_k$, indicating that the $x_k$<sup>th</sup> team has yet to play against the $y_k$<sup>th</sup> team during the $k$<sup>th</sup> match.</p>

### 출력

<p>The output should contain $M$ lines. The $k$<sup>th</sup> such line should contain a single integer: the index of the team winning the $k$<sup>th</sup> match (which should be equal to either $x_k$ or $y_k$).</p>

### 제한

<ul>
	<li>$2 \le N \le 100\, 000$</li>
	<li>$1 \le M \le 100\, 000$</li>
	<li>$1 \le x_k &lt; y_k ⩽ N$ for all $k \le M$</li>
</ul>