# [Gold III] 선분 교차 1 - 17386

[문제 링크](https://www.acmicpc.net/problem/17386)

### 성능 요약

시간 제한: 0.25 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 16833, 정답: 6652, 맞힌 사람: 5083, 정답 비율: 38.449%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>2차원 좌표 평면 위의 두 선분 L<sub>1</sub>, L<sub>2</sub>가 주어졌을 때, 두 선분이 교차하는지 아닌지 구해보자.</p>

<p>L<sub>1</sub>의 양 끝 점은 (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), L<sub>2</sub>의 양 끝 점은 (x<sub>3</sub>, y<sub>3</sub>), (x<sub>4</sub>, y<sub>4</sub>)이다.</p>

### 입력

<p>첫째 줄에 L<sub>1</sub>의 양 끝 점 x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>가, 둘째 줄에 L<sub>2</sub>의 양 끝 점 x<sub>3</sub>, y<sub>3</sub>, x<sub>4</sub>, y<sub>4</sub>가 주어진다. 세 점이 일직선 위에 있는 경우는 없다.</p>

### 출력

<p>L<sub>1</sub>과 L<sub>2</sub>가 교차하면 1, 아니면 0을 출력한다.</p>

### 제한

<ul>
	<li>-1,000,000 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>, y<sub>3</sub>, x<sub>4</sub>, y<sub>4</sub> &le; 1,000,000</li>
	<li>x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>, y<sub>3</sub>, x<sub>4</sub>, y<sub>4</sub>는 정수</li>
	<li>선분의 길이는 0보다 크다.</li>
</ul>