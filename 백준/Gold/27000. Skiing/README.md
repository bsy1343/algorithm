# [Gold IV] Skiing - 27000

[문제 링크](https://www.acmicpc.net/problem/27000)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 17, 맞힌 사람: 16, 정답 비율: 31.373%

### 분류

임의 정밀도 / 큰 수 연산, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Bessie and the rest of Farmer John&#39;s cows are taking a trip this winter to go skiing. One day Bessie finds herself at the top left corner of an R (1 &le; R &le; 100) by C (1 &le; C &le; 100) grid of elevations E (-25 &le; E &le; 25). In order to join FJ and the other cows at a discow party, she must get down to the bottom right corner as quickly as she can by travelling only north, south, east, and west.</p>

<p>Bessie starts out travelling at a initial speed V (1 &le; V &le; 1,000,000). She has discovered a remarkable relationship between her speed and her elevation change. When Bessie moves from a location of height A to an adjacent location of eight B, her speed is multiplied by the number 2^(A-B). The time it takes Bessie to travel from a location to an adjacent location is the reciprocal of her speed when she is at the first location.</p>

<p>Find the both smallest amount of time it will take Bessie to join her cow friends.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: V, R, and C, which respectively represent Bessie&#39;s initial velocity and the number of rows and columns in the grid.</li>
	<li>Lines 2..R+1: C integers representing the elevation E of the corresponding location on the grid.</li>
</ul>

### 출력

<p>A single number value, printed to two exactly decimal places: the minimum amount of time that Bessie can take to reach the bottom right corner of the grid.</p>