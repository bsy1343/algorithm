# [Platinum II] Constellations - 26188

[문제 링크](https://www.acmicpc.net/problem/26188)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 40, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

구현, 자료 구조, 브루트포스 알고리즘, 집합과 맵, 시뮬레이션, 트리를 사용한 집합과 맵, 우선순위 큐, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Astrologists took a hard scientific look at their zodiac horoscope predictions and realised that their methodology doesn&#39;t provide future insight better than chance. Instead of looking inwards they blame the stars and historical construction of constellations for their inability to predict the future. They&#39;re testing out a new way of constructing constellations that will renew their powers of future-sight.</p>

<p>They need your help to implement their iterative constellation creation system. Initially every star represents its own constellation. In every step you should merge two constellations into one, by picking the constellations that are closest to each other. The distance between two constellations $A$ and $B$ is defined as the average squared Euclidean distance of pairs of stars from each constellation:</p>

<p>$$ d(A, B) = \frac{1}{|A||B|}\sum_{a\in A}\sum_{b\in B}||a-b||^2.$$</p>

<p>If multiple pairs have the same distance you should merge older constellations first. When comparing two pairs of constellations that could be merged, first compare the distances between constellations. If both pairs are at exactly the same distance, compare them by the age of the older constellation in a pair. If there is still a tie, compare them by the age of the newer constellation in a pair. A constellation&#39;s age is defined by the time when it was formed with the last merge, or in case of single-star constellations by the age of the star. The stars in the input are listed from oldest to youngest.</p>

### 입력

<p>The first line contains $N$, the number of stars. The next $N$ lines contain coordinates of stars with two space-separated integers $X_i$ and $Y_i$.</p>

### 출력

<p>After every step of the described constellation creation system, print out the size of the newly created constellation. You should output $N-1$ lines.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 2000$</li>
	<li>$-1000 \leq X_i, Y_i \leq 1000$ for all $1 \leq i \leq N$</li>
	<li>All pairs $X_i$, $Y_i$ are unique since it&#39;s physically impossible for two stars to lie on the same point.</li>
</ul>