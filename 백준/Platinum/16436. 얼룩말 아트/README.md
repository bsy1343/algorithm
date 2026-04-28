# [Platinum III] 얼룩말 아트 - 16436

[문제 링크](https://www.acmicpc.net/problem/16436)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 517, 정답: 158, 맞힌 사람: 123, 정답 비율: 32.283%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>진수는 초원을 뛰어 다니는 야생의 얼룩말들의 무늬를 보고 감명을 얻어 다음과 같은 그림을 그리고자 합니다.</p>

<p>진수가 왼쪽 상단 픽셀의 좌표가 (0, 0)이고 오른쪽 하단 픽셀의 좌표는 (<em>W</em>-1, <em>H</em>-1)인 가로 <em>W</em>픽셀 &times; 세로 <em>H</em>픽셀 크기의 흰 이미지에 <em>K</em>개의 도형을 그릴 것이며 도형은 2가지 종류가 있습니다.&nbsp;</p>

<ol>
	<li>직사각형 - <em>px</em>, <em>py</em>, <em>qx</em>, <em>qy</em>이 주어지면 <em>px</em> &le; <em>x</em> &le; <em>qx</em> 와 <em>py</em> &le; <em>y</em> &le; <em>qy&nbsp;</em>를 만족하는 모든 픽셀 (<em>x</em>, <em>y</em>)의 색상을 반전시킵니다.</li>
	<li>다이아몬드 - <em>px</em>, <em>py</em>, <em>r</em>이 주어지면 |<em>x</em> - <em>px</em>| + |<em>y</em> - <em>py</em>| &le; <em>r&nbsp;</em>을 만족하는 모든 픽셀 (<em>x</em>, <em>y</em>)의 색상을 반전시킵니다.</li>
</ol>

<p>픽셀이 반전되면 흰색은 검은색으로, 검은색은 흰색으로 바뀝니다.</p>

<p>진수는 도형이 많아질수록 그리는 것이 어려워졌고 똑똑한 여러분에게 위의 방식에 따라 그림을 그리는 <strong>효율적인</strong> 프로그램을 작성해달라고 부탁했습니다.</p>

### 입력

<p>첫 번째 줄에 이미지의 가로 픽셀 크기 <em>W</em> (10 &le;&nbsp;<em>W</em> &le; 2,500) 와 이미지의 세로 픽셀 크기 <em>H</em> (10 &le; <em>H</em> &le; 2,500) 와 진수가 그릴 도형의 개수 <em>K</em> (1&nbsp;&le; <em>K</em> &le; 150,000) 가 주어집니다.</p>

<p>다음 <em>K</em>개 줄에는 도형들의 정보가 주어집니다.</p>

<p>직사각형인 경우 1, <em>px</em>, <em>py</em>, <em>qx</em>, <em>qy</em> (0 &le; <em>px</em> &le; <em>qx</em> &lt; <em>W</em>, 0 &le; <em>py</em> &le; <em>qy</em> &lt; <em>H</em>) 형식으로 총 5개의 정수가 주어지며,</p>

<p>다이아몬드인 경우 2, <em>px</em>, <em>py</em>, <em>r</em> (0 &le; <em>px</em> &lt; <em>W</em>, 0 &le; <em>py</em> &lt; <em>H</em>, 1 &le; <em>r</em> &lt; 1,250) 형식으로 총 4개의 정수가 주어집니다.&nbsp;</p>

<p>진수가 그리는 도형이 이미지 밖으로 벗어나는 경우는 없습니다.</p>

### 출력

<p>첫 번째 줄부터&nbsp;<em>H</em>번째 줄까지&nbsp;각 줄에 길이가&nbsp;<em>W</em>인 문자열을&nbsp;출력합니다.</p>

<p>진수가 그린 이미지의 (<em>x</em>, <em>y</em>) 픽셀이 검은색이라면 <i>y</i>+1번째 줄 <i>x</i>+1번째 문자를 &#39;<code>#</code>&#39;로, 흰색이라면 &#39;<code>.</code>&#39;로 출력합니다.</p>