# [Platinum III] 해밍 거리와 쿼리 - 14851

[문제 링크](https://www.acmicpc.net/problem/14851)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 433, 정답: 88, 맞힌 사람: 38, 정답 비율: 18.182%

### 분류

오프라인 쿼리, 비트 집합

### 문제 설명

<p>길이가 같은 두 바이너리 문자열 s와 t가 주어졌을 때, 해밍 거리는 서로 다른 값을 가진 위치의 개수와 같다. 예를 들어, &quot;00111&quot;과 &quot;10101&quot;의 해밍 거리는 2이다.</p>

<p>두 바이너리 문자열 a와 b가 주어졌을 때, 다음 쿼리를 수행하는 프로그램을 작성하시오.</p>

<ul>
	<li><code>p<sub>1</sub> p<sub>2</sub> len</code>: 두 부분 문자열 a<sub>p<sub>1</sub></sub>a<sub>p<sub>1</sub>+1</sub>...a<sub>p<sub>1</sub>+len-1</sub>과 b<sub>p<sub>2</sub></sub>b<sub>p<sub>2</sub>+1</sub>...b<sub>p<sub>2</sub>+len-1</sub> 의 해밍 거리를 구해 출력한다.</li>
</ul>

<p>문자열의 인덱스는&nbsp;0번 부터 시작한다.</p>

### 입력

<p>첫째 줄에 바이너리 문자열 a, 둘째 줄에 바이너리 문자열 b가 주어진다. a와 b의 길이는 200,000보다 작거나 같은 자연수이다.</p>

<p>셋째 줄에는 쿼리의 개수 q (1 &le;&nbsp;q &le; 400,000)가 주어진다. 다음 q개의 줄에는 쿼리를 나타내는 p<sub>1</sub>, p<sub>2</sub>, len이 주어진다. (0 &le; p<sub>1</sub> &le; |a|-len, 0 &le; p<sub>2</sub> &le; |b|-len)</p>

### 출력

<p>각각의 쿼리마다 정답을 출력한다.</p>