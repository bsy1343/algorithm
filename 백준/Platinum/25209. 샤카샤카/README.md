# [Platinum IV] 샤카샤카 - 25209

[문제 링크](https://www.acmicpc.net/problem/25209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 255, 정답: 51, 맞힌 사람: 47, 정답 비율: 22.488%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a81d25e3-746c-42bb-837a-7a3d83d4bb09/-/preview/" /></p>

<p>샤카샤카는 직사각형 보드 위에서 즐기는 퍼즐 게임이다. 보드는 \(N\)행 \(M\)열의 격자로 구분되어 있으며, 각 칸에 블록을 하나 놓을 수 있다. 퍼즐을 해결하려면 게임을 시작하기 전 주어지는 보드의 블록들을 적절히 교체하여 정답 조건을 만족시켜야 한다.</p>

<p>샤카샤카의 블록은 다음과 같은 여섯 종류이다. 앞의 2개는 정사각형 블록, 뒤의 4개는 삼각형 블록이라고 부르자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/14676062-7e08-4f1d-bcc6-ac454708f5f8/-/preview/" /></p>

<p>또한, 검은색 정사각형 블록 위에는 다음과 같이 0 이상 4 이하의 숫자가 적혀있을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5f943877-c77b-4a42-a5ff-3dfab6abda3e/-/preview/" /></p>

<p>초기 보드의 각 칸에는&nbsp;정사각형 블록이 놓여있다. 플레이어는 흰색 정사각형 블록을 원하는 삼각형 블록으로 바꿀 수 있으며, 정답 조건을 만족시키려면 다음 내용을 모두 만족해야 한다.</p>

<ul>
	<li>연속한 모든 흰색 영역은 직사각형이다. 단, 그 변이 가로축 또는 세로축과 평행할 필요는 없다.</li>
	<li>숫자 \(k\)가 적힌 정사각형 블록의 상하좌우 4칸에는 삼각형 블록이 정확히 \(k\)개 있어야 한다.</li>
</ul>

<p>샤카샤카의 일반적인 해법을 구하는 것은 NP-Complete 문제로 아주 어렵다는 것이 잘 알려져 있다. 퍼즐을 푸는 대신 주어진 샤카샤카 해답이 정답 조건을 만족하는지 판별하는 프로그램을 작성하여라.</p>

### 입력

<p>입력의 첫 번째 줄에는&nbsp;보드의 크기 \(N\), \(M\)이&nbsp;주어진다.</p>

<p>다음 3\(N\)개의 줄에는 샤카샤카의 해답이 다음과 같은 조건으로 주어진다.</p>

<p>본문의 6가지 블록은 다음과 같은 3&nbsp;&times;&nbsp;3&nbsp;아스키 아트로 주어진다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/474543a8-e55c-465a-a32b-746ffcf604d3/-/preview/" /></p>

<p>또한&nbsp;검은색 정사각형 블록 안에 숫자가 있는 경우, 다음과 같이 해당 블록의 가운데에 숫자가 위치한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/764f39b4-8766-403c-b369-a7f9b06331ef/-/preview/" /></p>

<p>샤카샤카의 해답은 3\(N\) &times; 3\(M\)개의 문자로 주어지며, 위와 같이 3&nbsp;&times; 3 단위로 끊어서 어떤 블록이 어느 위치에 있는지 해석할 수 있다.</p>

### 출력

<p>주어진 해답이 정답 조건을 만족하면 <code>YES</code>, 아니면 <code>NO</code>를 출력한다.</p>

### 제한

<ul>
	<li>1 &le; \(N\), \(M\) &le;&nbsp;10</li>
</ul>