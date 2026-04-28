# [Silver V] 번데기 - 15721

[문제 링크](https://www.acmicpc.net/problem/15721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4137, 정답: 1944, 맞힌 사람: 1587, 정답 비율: 48.237%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>중앙대학교 소프트웨어학부에 새로 입학한 19학번 새내기 일구는 새내기 새로 배움터에 가서 술게임을 여러 가지 배웠다. 그 중 가장 재미있었던 게임은 바로 번데기 게임이었다.</p>

<p>번데기 게임의 규칙은 다음과 같다. &lsquo;뻔 &ndash; 데기 &ndash; 뻔 &ndash; 데기 &ndash; 뻔 &ndash; 뻔 &ndash; 데기 &ndash; 데기&rsquo; 를 1회차 문장이라고 하자. 2회차 문장은 &lsquo;뻔 &ndash; 데기 &ndash; 뻔 - 데기 &ndash; 뻔 &ndash; 뻔 &ndash; 뻔 &ndash; 데기 &ndash; 데기 &ndash; 데기&rsquo;가 된다. 즉 n-1회차 문장일 때는 &lsquo;뻔 &ndash; 데기 &ndash; 뻔 &ndash; 데기 &ndash; 뻔(x n번) &ndash; 데기(x n번)&rsquo;이 된다. 하이픈 사이를 지날 때마다 순서는 다음 사람으로 넘어간다. 원을 돌아 다시 일구 차례가 와도 게임은 계속 진행된다.</p>

<p>일구와 동기들, 그리고 선배들을 포함한 사람 A명이 다음과 같이 원으로 앉아 있다고 가정하자.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15721.%E2%80%85%EB%B2%88%EB%8D%B0%EA%B8%B0/4131ae70.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/15721.%E2%80%85%EB%B2%88%EB%8D%B0%EA%B8%B0/4131ae70.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15721/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 227px; height: 197px;" /></p>

<p>일구가 0번째이고, 반 시계 방향으로 번데기 게임을 진행한다. T번째 &lsquo;뻔&rsquo; 또는 &lsquo;데기&rsquo;를 외치는 사람은 위 원에서 몇 번 사람인지를 구하여라. (새내기는 10000번째가 되는 순간 시체방에 가기 때문에 T는 10000이하의 임의의 자연수이다.)</p>

### 입력

<p>첫째 줄에 게임을 진행하는 사람 A명이 주어진다. A는 2,000보다 작거나 같은 자연수이다.</p>

<p>둘째 줄에는 구하고자 하는 번째 T가 주어진다. (T &le; 10000)</p>

<p>셋째 줄에는 구하고자 하는 구호가 &ldquo;뻔&rdquo;이면 0, &ldquo;데기&rdquo;면 1로 주어진다.&nbsp;</p>

### 출력

<p>첫째 줄에 구하고자 하는 사람이 원탁에서 몇 번째에 있는지 정수로 출력한다.&nbsp;</p>

### 힌트

<p>예를 들어 7명이 있고, 16번째 등장하는 &ldquo;뻔&rdquo;을 부른 사람의 번호를 알고 싶다면 입력은 7 16 0이다. 4명이 있고 6번째 등장하는 &ldquo;데기&rdquo;를 부른 사람의 번호를 알고 싶다면 입력은 4 6 1이며, 이때 출력 값은 반 시계 방향으로 3번째 있는 사람이므로 3을 출력한다.&nbsp;</p>