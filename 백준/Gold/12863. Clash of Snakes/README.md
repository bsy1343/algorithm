# [Gold III] Clash of Snakes - 12863

[문제 링크](https://www.acmicpc.net/problem/12863)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 17, 맞힌 사람: 14, 정답 비율: 27.451%

### 분류

많은 조건 분기, 조합론, 수학

### 문제 설명

<p>두 마리의 사랑스러운 뱀 Kiki와 Susu는 n*m 직사각형 격자 위에서 노는 것을 좋아한다. 게임이 진행되는 동안에는 이들은 마구 뒤섞여 규칙을 신경쓰지 않지만, 게임을 시작할 때는 다음과 같은 규칙을 따른다.</p>

<ol>
	<li>두 뱀은 각각 한쪽 변의 길이가 1인 직사각형으로 나타낼 수 있다.</li>
	<li>각 뱀들은 수평, 혹은 수직 방향으로 나열된다.</li>
	<li>두 뱀 모두 격자판 안에 완전히 들어 있어야 한다.</li>
	<li>두 뱀이 겹치는 칸이 있어서는 안 된다.</li>
</ol>

<p>아래의 그림은 올바른 배치와 잘못된 배치를 보여준다. 위의 두 가지가 올바른 배치, 아래의 두 가지가 잘못된 배치에 해당한다. (격자판은 5*5이며, 두 뱀의 길이는 각각 3, 3이다.)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12863.%E2%80%85Clash%E2%80%85of%E2%80%85Snakes/0b22a636.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12863.%E2%80%85Clash%E2%80%85of%E2%80%85Snakes/0b22a636.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12863/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:255px; width:315px" /></p>

<p>Kiki와 Susu는 게임을 시작할 수 있는 경우의 수가 몇 가지나 되는지 알고 싶어한다. 격자판의 크기가 n*m이고, Kiki의 길이와 Susu의 길이가 각각 k, s일 때, 두 뱀이 배치될 수 있는 경우의 수를 구하는 것을 도와주자.</p>

<p>주의 : 한 뱀의 머리가 (x1, y1), 뱀의 꼬리가 (x2, y2)에 있는 경우와, 뱀의 꼬리가 (x1,y1), 뱀의 머리가 (x2, y2)에 있는 경우는 서로 다른 경우로 생각한다. 즉, 머리의 방향을 고려해야 한다.</p>

### 입력

<p>각 Test Case는 한 줄의 입력으로 구성되어 있다. 한 Test Case에는 격자의 크기를 나타내는 n, m과 두 뱀의 길이를 나타내는 k, s가 주어진다. (1&nbsp;&le; n, m &le; 100,000; 1&nbsp;&le; k, s &le; min(n, m))</p>

### 출력

<p>각 Test case에 대해, &ldquo;Case c: x&rdquo;의 형식으로 각 줄에 정답을 출력한다. c는 Test Case의 번호 (1부터 매겨진다.), x는 문제의 정답을 1,000,000,007(10<sup>9</sup>+7)로 나눈 나머지이다.&nbsp;</p>