# [Gold III] 프렉탈 평면 - 1030

[문제 링크](https://www.acmicpc.net/problem/1030)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 4396, 정답: 2003, 맞힌 사람: 1629, 정답 비율: 47.451%

### 분류

구현, 분할 정복, 재귀

### 문제 설명

<p>프렉탈 평면은 다음과 같이 커진다. 시간 0에서 프렉탈은 흰색 정사각형 하나이다. 단위 시간(1)이 진행될 때마다 N&times;N개의 크기가 동일한 단위 정사각형으로 나누어진다. 만약 나누어진&nbsp;정사각형이 흰색이라면 가운데 K&times;K 정사각형이 검정색으로 채워진다. N과 K는 둘 다 홀수이거나, 둘 다 짝수이다.</p>

<p>예를 들어, N=3, K=1이라면, 시간 1에 3&times;3 정사각형이 된다. 가운데 정사각형은 검정색이고, 나머지는 흰색이 된다. 시간 2때 9&times;9 정사각형이 되고, 17개는 검정이고, 나머지는 흰색이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1030.%E2%80%85%ED%94%84%EB%A0%89%ED%83%88%E2%80%85%ED%8F%89%EB%A9%B4/a38c4a0c.png" data-original-src="https://upload.acmicpc.net/209f7362-9252-4bb8-b40d-91e115e42cf3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 206px;" /></p>

<p>s, N, K, R<sub>1</sub>, R<sub>2</sub>, C<sub>1</sub>, C<sub>2</sub>가 주어질 때, 시간 s일 때, R<sub>1</sub>행 C<sub>1</sub>열부터 R<sub>2</sub>행 C<sub>2</sub>열까지의 모습을 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 7개의 정수 s, N, K, R<sub>1</sub>, R<sub>2</sub>, C<sub>1</sub>, C<sub>2</sub>가 주어진다.</p>

### 출력

<p>첫째 줄에 문제의 정답을 출력한다. 첫째 줄에 R1행의 모습을 출력하고 이런 식으로 총 R2-R1+1개의 줄에 출력하면 된다. 각 행의 모습을 출력할 때, C1열부터 C2열까지 차례대로 흰색이면 숫자 &#39;0&#39; 검정이면 숫자 &#39;1&#39;을 출력한다. 숫자 사이에 공백을 넣으면 안 된다.</p>

### 제한

<ul>
	<li>0 &le; s &le; 10</li>
	<li>3 &le; N &le; 8</li>
	<li>1 &le; K &le; N - 2</li>
	<li>(N - K)&nbsp;mod 2 = 0</li>
	<li>0 &le; R<sub>1</sub>, R<sub>2</sub>, C<sub>1</sub>, C<sub>2</sub> &le; N<sup>s</sup> - 1</li>
	<li>R<sub>1</sub> &le; R<sub>2</sub> &le; R<sub>1</sub> + 49</li>
	<li>C<sub>1</sub> &le; C<sub>2</sub> &le; C<sub>1</sub>&nbsp;+49</li>
</ul>