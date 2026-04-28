# [Platinum II] 색종이와 쿼리 - 18246

[문제 링크](https://www.acmicpc.net/problem/18246)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 772, 정답: 238, 맞힌 사람: 144, 정답 비율: 32.877%

### 분류

자료 구조, 세그먼트 트리, 누적 합, 차분 배열 트릭, 다차원 세그먼트 트리

### 문제 설명

<p>2차원 좌표평면상에 각 변이 좌표축과 평행한 직사각형 모양의 색종이 N장이 있다.</p>

<p>(y1, x1, y2, x2)를 (y1, x1)은 직사각형의 왼쪽 아래 좌표, (y2, x2)은 직사각형의 오른쪽 위 좌표를 뜻하는 직사각형의 내부 영역이라 정의한다.</p>

<p>아래는 (2, 0, 5, 8), (0, 1, 6, 3), (1, 2, 4, 5), (3, 4, 7, 7)에 각각 한 장씩, 총 네 장의 색종이가 2차원 좌표평면에 놓여진 경우의 예시이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18246.%E2%80%85%EC%83%89%EC%A2%85%EC%9D%B4%EC%99%80%E2%80%85%EC%BF%BC%EB%A6%AC/4be227f9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18246.%E2%80%85%EC%83%89%EC%A2%85%EC%9D%B4%EC%99%80%E2%80%85%EC%BF%BC%EB%A6%AC/4be227f9.png" data-original-src="https://upload.acmicpc.net/b7200ed0-029e-47bf-8f89-7e265caf228f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 355px; width: 400px;" /><br />
&nbsp;</p>

<p>이때, 다음 쿼리를 수행하는 프로그램을 작성하시오.</p>

<ul>
	<li>y<sub>1</sub>&nbsp;x<sub>1</sub>&nbsp;y<sub>2</sub>&nbsp;x<sub>2</sub> : (y<sub>1</sub>, x<sub>1,&nbsp;</sub>y<sub>2</sub>, x<sub>2</sub>)에서 색종이가 가장 많이 겹쳐 있는 영역에 놓여 있는 색종이의 장 수를 출력한다.</li>
</ul>

### 입력

<p>첫째 줄에 색종이의 장수 N과&nbsp;쿼리의 개수&nbsp;M이&nbsp;주어진다.&nbsp;(1 &le; N, M&nbsp;&le; 100,000)</p>

<p>다음 N개의 줄에는 색종이가 놓여진 영역&nbsp;(y<sub>1</sub>, x<sub>1</sub>, y<sub>2</sub>, x<sub>2</sub>)가 한 줄에 하나씩 주어진다.&nbsp;(0&nbsp;&le;&nbsp;y<sub>1</sub>&nbsp;&lt; y<sub>2</sub>&nbsp;&le; 1,500, 0&nbsp;&le; x<sub>1</sub>&nbsp;&lt;&nbsp;x<sub>2</sub>&nbsp;&le; 1,500)</p>

<p>다음 M개의 줄에는 쿼리&nbsp;y<sub>1</sub>, x<sub>1</sub>, y<sub>2</sub>, x<sub>2</sub>가 한 줄에 하나씩 주어진다.&nbsp;(0&nbsp;&le;&nbsp;y<sub>1</sub>&nbsp;&lt;&nbsp;y<sub>2</sub>&nbsp;&le; 1,500, 0&nbsp;&le; x<sub>1</sub>&nbsp;&lt;&nbsp;x<sub>2</sub>&nbsp;&le; 1,500)</p>

<p>주어지는 좌표는 모두 정수이다.</p>

### 출력

<p>각각의 쿼리를 수행한 결과를&nbsp;한 줄에 하나씩 출력한다.</p>