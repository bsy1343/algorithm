# [Silver I] 컴백홈 - 1189

[문제 링크](https://www.acmicpc.net/problem/1189)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 13106, 정답: 7457, 맞힌 사람: 5777, 정답 비율: 56.017%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색, 백트래킹, 격자 그래프

### 문제 설명

<p>한수는 캠프를 마치고 집에 돌아가려 한다. 한수는 현재 왼쪽 아래점에 있고 집은 오른쪽 위에 있다. 그리고 한수는 집에 돌아가는 방법이 다양하다. 단, 한수는 똑똑하여 한번 지나친 곳을 다시 방문하지는 않는다.</p>

<pre>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; cdef&nbsp; ...f&nbsp; ..ef&nbsp; ..gh&nbsp; cdeh&nbsp; cdej&nbsp; ...f&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; bT..&nbsp; .T.e&nbsp; .Td.&nbsp; .Tfe&nbsp; bTfg&nbsp; bTfi&nbsp; .Tde&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; a...&nbsp; abcd&nbsp; abc.&nbsp; abcd&nbsp; a...&nbsp; a.gh&nbsp; abc.&nbsp;
거리 :&nbsp; 6&nbsp;&nbsp;&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp;&nbsp; 8&nbsp;&nbsp;&nbsp;&nbsp; 8&nbsp;&nbsp;&nbsp; 10&nbsp;&nbsp;&nbsp; 6</pre>

<p>위 예제는 한수가 집에 돌아갈 수 있는 모든 경우를 나타낸 것이다. T로 표시된 부분은 가지 못하는 부분이다. 문제는 R x C 맵에 못가는 부분이 주어지고 거리 K가 주어지면 한수가 집까지도 도착하는 경우 중 거리가 K인 가짓수를 구하는 것이다.</p>

### 입력

<p>첫 줄에 정수 R(1 &le; R &le; 5), C(1 &le; C &le; 5), K(1 &le; K &le; R&times;C)가 공백으로 구분되어 주어진다. 두 번째부터 R+1번째 줄까지는 R&times;C 맵의 정보를 나타내는 &#39;.&#39;과 &#39;T&#39;로 구성된 길이가 C인 문자열이 주어진다.</p>

### 출력

<p>첫 줄에 거리가 K인 가짓수를 출력한다.</p>