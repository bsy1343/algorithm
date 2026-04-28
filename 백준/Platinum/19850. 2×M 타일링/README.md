# [Platinum I] 2×M 타일링 - 19850

[문제 링크](https://www.acmicpc.net/problem/19850)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 43, 맞힌 사람: 35, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>상수는 프로그래밍 대회 상품으로 타일들이 들어 있는 상자를 받았다. 이 타일들은 두 개의 정사각형 칸이 변을 맞대고 붙어 있는 직사각형 모양이고, 각 칸에는 정해진 개수만큼의 점이 찍혀 있다. 편의상 한 칸에는 <span style="font-style: italic;">a</span>개, 다른 칸에는 <span style="font-style: italic;">b</span>개의 점이 찍힌 타일을 (<span style="font-style: italic;">a</span>, <span style="font-style: italic;">b</span>) 타일이라고 하자.</p>

<p>타일 상자는 크기에 따라서 안에 들어 있는 타일들의 구성이 달라지며, 상수가 받은 타일 상자는 크기가 <span style="font-style: italic;">K</span>인 상자이다. 이 상자에는 1 &le; <span style="font-style: italic;">a</span> &le; <span style="font-style: italic;">b</span> &le; <span style="font-style: italic;">K</span>를 만족하는 모든 정수 쌍 <span style="font-style: italic;">a</span>, <span style="font-style: italic;">b</span>에 대해 (<span style="font-style: italic;">a</span>, <span style="font-style: italic;">b</span>) 타일이 각각 하나씩, 총 <span style="display: inline-block; vertical-align: middle; letter-spacing: 0.1em; text-align: center; margin: 0 2px; line-height: 1.4;"><span style="display: block;"><span style="font-style: italic;">K</span>(<span style="font-style: italic;">K</span>+1)</span><span style="display: block; border-top: 1px solid black;">2</span></span>개의 타일이 들어 있다.</p>

<p style="margin-top: 15px;"><img alt="tiles" src="https://upload.acmicpc.net/a87bf3a3-75ea-4649-b076-3a549fc5f358/-/preview/" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 500px;" /></p>

<p style="margin-bottom: 15px; text-align: center;"><span style="font-style: italic;">K</span> = 4인 경우의 예시</p>

<p>머릿속이 온통 알고리즘 문제뿐인 상수는 타일의 모양을 보자마자 유명한 &ldquo;2&times;N 타일링&rdquo; 문제가 생각났다. 그래서 상수도 상자에 들어 있는 타일들 중 <span style="font-style: italic;">M</span>개의 타일을 골라서 2 &times; <span style="font-style: italic;">M</span> 격자판을 채워 보기로 했다.</p>

<p>타일을 놓을 때는 반드시 격자판의 칸에 맞춰서 놓아야 하며, 가로로 놓을지 세로로 놓을지는 자유롭게 정할 수 있다. 같은 방향이더라도 타일을 180도 돌려서 두 칸의 순서를 바꿔서 놓을 수도 있다. 당연히 타일이 격자판을 벗어나거나 두 타일이 겹쳐서는 안 되고, 따라서 <span style="font-style: italic;">M</span>개의 타일을 올바르게 놓으면 2<span style="font-style: italic;">M</span>개의 칸을 전부 덮게 된다.</p>

<p>그러나 단순히 격자판을 채우는 것은 너무 쉽다고 생각한 상수는 타일들에 찍혀 있는 점들을 이용해서 다음과 같은 조건들을 추가로 만들었다.</p>

<ul>
	<li>격자판의 두 가로줄에는 서로 같은 개수만큼의 점이 찍혀 있어야 한다.</li>
	<li>격자판의 모든 세로줄에는 점이 정확히 (<span style="font-style: italic;">K</span> + 1)개씩 찍혀 있어야 한다.</li>
</ul>

<p>상수가 주어진 조건에 맞게 격자판을 채울 수 있을지 알아보자.</p>

### 입력

<p>첫 줄에 두 개의 정수 <span style="font-style: italic;">K</span>과 <span style="font-style: italic;">M</span>이 공백을 사이에 두고 주어진다. <span style="font-style: italic;">K</span>는 상수가 받은 타일 상자의 크기, <span style="font-style: italic;">M</span>은 상수가 채우려는 격자판의 너비를 의미한다.</p>

### 출력

<p>상수가 조건에 맞게 격자판을 채울 수 있다면 첫 줄에 <code>YES</code>를 출력한다. 그리고 다음 두 줄에 걸쳐 각 줄에 격자판의 각 칸에 찍혀 있는 점의 개수를 의미하는 <span style="font-style: italic;">M</span>개의 정수를 공백으로 구분하여 출력한다. 단, 해당 칸을 덮는 타일이 세로로 놓여 있을 경우는 앞에 <code>-</code>를 붙여 음수로 출력한다.</p>

<p>격자판을 채울 수 없는 경우는 첫 줄에 <code>NO</code>를 출력한다.</p>

### 제한

<ul>
	<li>1 &le; <span style="font-style: italic;">K</span> &le; 15</li>
	<li>1 &le; <span style="font-style: italic;">M</span> &le; <span style="display: inline-block; vertical-align: middle; letter-spacing: 0.1em; text-align: center; margin: 0 2px; line-height: 1.4;"><span style="display: block;"><span style="font-style: italic;">K</span>(<span style="font-style: italic;">K</span>+1)</span><span style="display: block; border-top: 1px solid black;">2</span></span></li>
</ul>