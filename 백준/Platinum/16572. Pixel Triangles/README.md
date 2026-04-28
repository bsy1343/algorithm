# [Platinum V] Pixel Triangles - 16572

[문제 링크](https://www.acmicpc.net/problem/16572)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 481, 정답: 222, 맞힌 사람: 122, 정답 비율: 44.689%

### 분류

다이나믹 프로그래밍, 누적 합, 차분 배열 트릭

### 문제 설명

<p>2000&times;2000 크기의 격자 판이&nbsp;주어지며, 각 픽셀(칸)은&nbsp;행과 열을 이용해서 위치가 표시된다. 가장 왼쪽 열이 1열, 가장 위쪽 행이 1행이다.</p>

<p>이때 픽셀&nbsp;삼각형의 정의는 다음과&nbsp;같다.</p>

<ul>
	<li>x행, y열의 픽셀은&nbsp;(x,y)으로 표현되고,&nbsp;픽셀 삼각형은 몇 개의 픽셀로 이루어져 있다.</li>
	<li>픽셀 삼각형은 3개의 자연수 A, B, C에 대해서 $P(A, B, C)$ 으로 표현된다.</li>
	<li>$P(A,B,C) = \{ (x,y)&nbsp;|&nbsp;A &le; x,&nbsp; B&nbsp;&le; y, &nbsp;0&nbsp;&le; (x-A) + (y-B) &le; C-1 \}$</li>
	<li>격자 위의 픽셀&nbsp;삼각형을 구성하는 픽셀은&nbsp;항상 격자 판에 존재함이 보장된다.</li>
</ul>

<p>격자 위의 픽셀들로 구성된 픽셀&nbsp;삼각형이 n개 주어졌을 때,&nbsp;픽셀 삼각형들이&nbsp;덮는 픽셀의 개수를 출력해라.</p>

<p>단, 서로 다른 픽셀 삼각형은 같은&nbsp;픽셀을 공유 할 수 있다.</p>

<p>예를 들어, n = 3&nbsp;이고 주어지는 3개의 픽셀 삼각형이&nbsp;$P(1, 2, 3), P(3, 1, 2), P(5, 5, 1)$ 일 때&nbsp;격자의 상태를 묘사하면 다음과 같다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/912abc69-0f88-4837-b5b7-12b6b507972a/-/preview/" style="height: 353px; width: 600px;" /></p>

<p style="text-align: center;"><em><b>Figure</b></em>:<b> </b>격자 일부분의 상태</p>

<p>이때 최종적으로 덮어지는 픽셀의 개수는 9가 된다.</p>

### 입력

<p>첫 번째 줄에 픽셀&nbsp;삼각형의 개수 n이 주어진다. 이후 n개의 줄에 걸쳐서 픽셀&nbsp;삼각형에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다.</p>

### 출력

<p>덮어지는 픽셀의 개수를&nbsp;출력한다.</p>

### 제한

<ul>
	<li>1&nbsp;&le; n&nbsp;&le; 4,000,000</li>
	<li>1&nbsp;&le; A, B, C &le; 2,000</li>
	<li>1&nbsp;&le; A + C - 1, B + C - 1&nbsp;&le; 2,000</li>
</ul>