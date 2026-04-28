# [Platinum IV] Kernel Knights - 11623

[문제 링크](https://www.acmicpc.net/problem/11623)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 272, 정답: 95, 맞힌 사람: 78, 정답 비율: 33.476%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬, 함수형 그래프

### 문제 설명

<p>Jousting is a medieval contest that involves people on horseback trying to strike each other with wooden lances while riding at high speed. A total of 2n knights have entered a jousting tournament &ndash; n knights from each of the two great rival houses. Upon arrival, each knight has challenged a single knight from the other house to a duel.</p>

<p>A kernel is defined as some subset S of knights with the following two properties:</p>

<ul>
	<li>No knight in S was challenged by another knight in S.</li>
	<li>Every knight not in S was challenged by some knight in S.</li>
</ul>

<p>Given the set of the challenges issued, find one kernel. It is guaranteed that a kernel always exists.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100 000) &ndash; the number of knights of each house. The knights from the first house are denoted with integers 1 through n, knights from the second house with integers n + 1 through 2n.</p>

<p>The following line contains integers f<sub>1</sub>, f<sub>2</sub>, . . . , f<sub>n</sub> &ndash; the k-th integer f<sub>k</sub> is the index of the knight challenged by knight k (n + 1 &le; f<sub>k</sub> &le; 2n).</p>

<p>The following line contains integers s<sub>1</sub>,s<sub>2</sub>, . . . ,s<sub>n</sub> &ndash; the k-th integer s<sub>k</sub> is the index of the knight challenged by knight n + k (1 &le; s<sub>k</sub> &le; n).</p>

### 출력

<p>Output the indices of the knights in the kernel on a single line. If there is more than one solution, you may output any one.</p>