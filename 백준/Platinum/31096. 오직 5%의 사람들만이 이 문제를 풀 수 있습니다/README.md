# [Platinum I] 오직 5%의 사람들만이 이 문제를 풀 수 있습니다 - 31096

[문제 링크](https://www.acmicpc.net/problem/31096)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 35, 정답: 18, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p><strong>이 문제는 인터랙티브 문제입니다.</strong></p>

<p>이따금, 광고에서는 도발적인 내용과 제목을 넣어 사람들이 게임을 하도록 유도하는 경우가 있다. 코코아는 이런 도발에 매우 취약해서, 이런 광고가 나오면 반드시 해당 게임을 완벽히 정복해야 직성이 풀린다. 오늘도 어김없이 코코아는 &lsquo;오직 5%의 사람들만이 이 문제를 풀 수 있습니다&rsquo;라는 제목의 광고를 보았고, 이제 코코아는 이 게임을 완벽히 정복해야만 한다! 코코아가 하려는 게임은 다음과 같다.</p>

<p>게임은 직사각형 양면 격자판에서 진행된다. 격자판은 앞면과 뒷면에 상하좌우 중 한 방향을 가리키는 화살표가 그려져 있는 일반 칸과 양면 모두 아무것도 그려져 있지 않은 목표 칸으로 구성되어 있다. 처음에 모든 칸은 앞면으로 되어 있다.</p>

<div style="display: flex; flex-direction: row; justify-content: center; flex-wrap: wrap;"><img alt="" src="https://u.acmicpc.net/cd524e78-7d0a-486e-bffc-949980e8fe1e/5per1-new.png" style="margin: 8px 75px;" /> <img alt="" src="https://u.acmicpc.net/14032ce3-ab7f-42c8-ad95-4b6bda0b27ce/5per2-new.png" style="margin: 8px 75px;" /></div>

<p>플레이어는 정해진 시작 칸에 공을 놓고 게임을 시작한다. 격자판에 있는 버튼을 누르면 공은 자신이 있는 칸에 있는 화살표가 가리키는 방향으로 굴러간다. 공이 어떤 칸 위에 있었다가 떠나면 그 칸은 위아래가 뒤집혀 앞면과 뒷면이 바뀐다.</p>

<p>만약 공이 굴러가던 방향과 다른 방향의 화살표가 있는 칸에 올라가거나 목표 칸에 올라가면 공은 그 칸에서 멈춘다.</p>

<p>게임의 목적은 버튼을 눌러서 공을 목표 칸에 위치시키는 것이다. 공이 격자판 밖으로 떨어지면 게임은 실패이다.</p>

<div style="display: flex; flex-direction: row; justify-content: center; flex-wrap: wrap;"><img alt="" src="https://u.acmicpc.net/d06c16d0-9d0a-40e4-9fb4-6ecf04a152ca/5per3-new.png" style="margin:8px;" /><img alt="" src="https://u.acmicpc.net/39213f55-6706-4e80-80b2-9a32be5fb61a/5per4-new.png" style="margin:8px;" /><img alt="" src="https://u.acmicpc.net/2d5da520-4621-4d75-b57f-79b8c506971c/5per5-new.png" style="margin:8px;" /><img alt="" src="https://u.acmicpc.net/31eec43d-d6b6-42ce-8413-9e231347b09f/5per6-new.png" style="margin:8px;" /></div>

<p>위는 3행 1열에 공을 놓고 버튼을 4번 누르는 상황이다. 처음에 버튼을 누르면, 공이 3행 3열까지 이동하면서 3행 1열과 3행 2열에 있는 칸이 뒤집힌다. 그다음에 버튼을 한 번 더 누르면, 공이 한 칸 아래로 내려가면서 3행 3열에 있는 칸이 뒤집힌다. 그 후, 위 그림처럼 버튼을 두 번 더 누르면 공은 4행 4열에 있는 목표 칸에 도달한다.</p>

<p>코코아는 친구 치노의 깜짝 새해 선물로 $N\times M$ 크기 게임판을 만들어 주려고 한다. 하지만 코코아가 만들어 주려는 게임판은 조금 특별한 게임판이다. 바로 정확히 $k$번 버튼을 누른 후에 게임에서 이기는 게임판이다. 그런데 사소한 문제가 생겼다. $k$를 치노가 좋아하는 수로 정하고 싶은데 깜빡하고 $k$를 물어보지 않은 것이었다. 지금 와서 $k$를 물어보고 새로 게임판을 만든다면 깜짝 선물이 아니다!</p>

<p>그래서 코코아는 치노가 어떤 $k$를 좋아하더라도 대처할 수 있도록 게임판을 만들기로 했다. 코코아는 선물을 주기 직전에 치노에게 $k$를 물어본 후, 딱 $20$개 이하의 일반 칸에 그려진 화살표 방향을 순식간에 바꿔서 게임판을 만들려고 한다. 어떤 칸을 바꾸기로 했다면, 윗면과 아랫면에 그려진 화살표를 모두 바꿀 수 있다.</p>

<div style="display: flex; flex-direction: row; justify-content: center; flex-wrap: wrap;"><img alt="" src="https://u.acmicpc.net/0ac4949c-1826-4320-92b0-2ce21586468f/5per7-new.png" style="margin: 8px 75px;" /><img alt="" src="https://u.acmicpc.net/b4419708-4941-4a5a-8d06-b1cd8f4b7c86/5per8-new.png" style="margin: 8px 75px;" /></div>

<p>그러나 이런 게임판을 만드는 것은 화살표의 방향을 순식간에 수정하는 것보다 어려운 문제이다. 코코아는 고민을 해보았지만 마땅한 방안을 찾지 못하였다. 여러분이 코코아를 위해 초기 게임판을 만들고, $k$가 입력되었을 때 게임판을 수정하는 프로그램을 작성하자.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1\leq N\leq 100$</li>
	<li>$1\leq M\leq 100$</li>
	<li>$1\leq r\leq N$</li>
	<li>$1\leq c\leq M$</li>
	<li>$1\leq k\leq 10^6$</li>
</ul>