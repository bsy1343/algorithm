# [Gold II] DVD - 17354

[문제 링크](https://www.acmicpc.net/problem/17354)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 319, 정답: 118, 맞힌 사람: 87, 정답 비율: 45.078%

### 분류

수학, 정수론, 중국인의 나머지 정리

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17354.%E2%80%85DVD/ee455613.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17354.%E2%80%85DVD/ee455613.png" data-original-src="https://imgur.com/5iilQD0.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 180px;" /></p>

<p>DVD 로고는 (생김새는 그렇지 않지만) TV의 가로세로 변과 평행한 직사각형으로 나타낼 수 있다. 이 로고는 가로&nbsp;속도 +1 또는 -1, 세로&nbsp;속도 +1 또는 -1을 갖고 움직인다. 로고가 TV의 가로 변을 치면 세로&nbsp;속도가 반전되고, 세로 변을 치면 가로&nbsp;속도가 반전된다.</p>

<p>욱제는 DVD 로고가 TV의 꼭짓점을 치는 순간을 목격하는 사람에게 그 날의 행운이 찾아온다고 믿는다. 일반적인 TV에서 그 순간을 보는 것은 매우 드문 일이기 때문이다. 그러던 어느 날, 욱제는 기발한 생각을 했다. 꼭짓점을 치는 순간이 언제인지 알아낸 다음에&nbsp;딱 그 순간에 달려가서 보면 되지 않을까?</p>

<p>DVD 로고가 TV 꼭짓점을 치려면 욱제가 최소 몇 초를 기다려야 하는지 욱제에게 알려 주자.</p>

### 입력

<p>첫 줄에 DVD 로고의 너비 w, 높이 h, TV의 너비 W, 높이 H가 주어진다. (1&nbsp;&le; w, h, W, H &le; 10<sup>6</sup>, w+2&nbsp;&le; W, h+2&nbsp;&le; H)</p>

<p>두 번째 줄에 DVD 로고의 왼쪽 위 꼭짓점의 초기 x좌표, y좌표가 주어진다. (0 &lt; x &lt; W-w, 0 &lt; y &lt; H-h) 왼쪽 위 꼭짓점의&nbsp;좌표는 (0, 0)이다. 오른쪽으로 갈 수록 x좌표가 증가하고, 아래쪽으로 갈 수록 y좌표가 증가한다.&nbsp;&le; 대신 &lt;으로 범위가 정해진 것은 DVD 로고가 처음에 벽과 맞닿아 있지 않음을 의미한다.</p>

<p>세 번째 줄에 DVD 로고의 가로 속도(1 또는 -1)와 세로 속도(1 또는 -1)가&nbsp;주어진다.</p>

<p>입력으로 들어오는 모든 수는 정수이다.</p>

### 출력

<p>DVD 로고가 TV 꼭짓점을 칠 때까지 기다려야 하는 최소 시간을 출력한다. 로고가 꼭짓점을 칠 수 없으면 -1을 출력한다.</p>