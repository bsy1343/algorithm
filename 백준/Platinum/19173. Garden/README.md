# [Platinum III] Garden - 19173

[문제 링크](https://www.acmicpc.net/problem/19173)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

값 / 좌표 압축, 자료 구조, 다이나믹 프로그래밍, 세그먼트 트리

### 문제 설명

<p>Farmer Smurf is competing in a contest for most smurfiest garden. &nbsp;He already bought some plants which he put in a row. Each flower has some height measured in centimeters. &nbsp;Farmer wants to choose some subsequence of plants that he can put into <strong>evenly</strong>&nbsp;spaced holes (without changing order) so that all plants are visible from the front (each next plant is strictly higher than previous one). &nbsp;Since this year is the year of parabolas the contest judges require that the flowers form a convex function (after putting plants into evenly spaced holes each segment connecting the highest points of two plants is strictly above all the plants between them). Help farmer choose plants that fulfill these criteria.</p>

### 입력

<p>First line of input contains two integers $n$ and $k$ ($1 \leq k \leq n \leq 20\,000$, $1 \leq k \leq 100$). $n$ is the number of plants, $k$ is the number of plants that Farmer wants to choose. Second line of input contains $n$ integers $h_i$ ($1 \leq h_i \leq 7 \cdot 10^8$). &nbsp;$h_i$ is the height of $i$th plant bought by Farmer.</p>

### 출력

<p>On a single line output $k$ integers $a_i$ ($1 \leq a_i \leq n$) specifying the numbers of plants that Farmer should choose. Don&#39;t forget that the plants must be in original order ($a_i &lt; a_{i+1}$). If it is not possible to choose $k$ plants satisfying all criteria then on a single line output &quot;NO&quot; (without quotes).</p>