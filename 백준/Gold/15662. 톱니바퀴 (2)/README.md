# [Gold V] 톱니바퀴 (2) - 15662

[문제 링크](https://www.acmicpc.net/problem/15662)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5598, 정답: 3606, 맞힌 사람: 2835, 정답 비율: 66.958%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>총 8개의 톱니를 가지고 있는 톱니바퀴 T개가 아래 그림과 같이 일렬로 놓여져 있다. 또,&nbsp;톱니는 N극 또는 S극 중 하나를 나타내고 있다. 톱니바퀴에는 번호가 매겨져 있는데, 가장 왼쪽 톱니바퀴가 1번, 그 오른쪽은 2번,&nbsp;..., 가장 오른쪽 톱니바퀴는 T번이다. 아래 그림은 T가 4인 경우이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/8da61a7c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:210px; width:918px" /></p>

<p>이때, 톱니바퀴를 총 K번 회전시키려고 한다. 톱니바퀴의 회전은 한 칸을 기준으로 한다. 회전은 시계 방향과 반시계 방향이 있고, 아래 그림과 같이 회전한다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/a32ea7b5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:253px; width:660px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/e1744c4e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:253px; width:602px" /></p>

<p>톱니바퀴를 회전시키려면, 회전시킬 톱니바퀴와&nbsp;회전시킬 방향을 결정해야 한다. 톱니바퀴가 회전할 때, 서로 맞닿은 극에 따라서 옆에 있는 톱니바퀴를 회전시킬 수도 있고, 회전시키지 않을 수도 있다. 톱니바퀴 A를 회전할 때, 그 옆에 있는 톱니바퀴 B와 서로 맞닿은 톱니의 극이 다르다면, B는 A가 회전한 방향과 반대방향으로 회전하게 된다. 예를 들어, 아래와 같은 경우를 살펴보자.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/cb59448a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:223px; width:923px" /></p>

<p>두 톱니바퀴의 맞닿은 부분은 초록색 점선으로 묶여있는 부분이다. 여기서, 3번 톱니바퀴를&nbsp;반시계 방향으로 회전했다면, 4번 톱니바퀴는 시계 방향으로 회전하게 된다. 2번 톱니바퀴는 맞닿은 부분이 S극으로 서로 같기 때문에, 회전하지 않게 되고, 1번 톱니바퀴는 2번이 회전하지 않았기 때문에, 회전하지 않게 된다. 따라서, 아래 그림과 같은 모양을 만들게 된다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/637f1b99.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:921px" /></p>

<p>위와 같은&nbsp;상태에서 1번 톱니바퀴를 시계 방향으로 회전시키면, 2번 톱니바퀴가 반시계 방향으로 회전하게 되고, 2번이 회전하기 때문에, 3번도 동시에 시계 방향으로 회전하게 된다. 4번은 3번이 회전하지만, 맞닿은 극이 같기 때문에 회전하지 않는다. 따라서, 아래와 같은 상태가 된다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15662.%E2%80%85%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4%E2%80%85(2)/0097540b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14891/6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:921px" /></p>

<p>톱니바퀴 T개의 초기 상태와 톱니바퀴를 회전시킨 방법이 주어졌을 때, 최종 톱니바퀴의 상태를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 톱니바퀴의 개수 T (1 &le; T &le; 1,000)가 주어진다.&nbsp;</p>

<p>둘째 줄부터 T개의 줄에 톱니바퀴의 상태가 가장 왼쪽 톱니바퀴부터 순서대로 주어진다. 상태는 8개의 정수로 이루어져 있고, 12시방향부터 시계방향 순서대로 주어진다. N극은 0, S극은 1로 나타나있다.</p>

<p>다음 줄에는 회전 횟수 K(1 &le; K &le; 1,000)가 주어진다. 다음 K개 줄에는 회전시킨 방법이 순서대로 주어진다. 각 방법은 두 개의 정수로 이루어져 있고, 첫 번째 정수는 회전시킨 톱니바퀴의 번호, 두 번째 정수는 방향이다. 방향이 1인 경우는 시계 방향이고, -1인 경우는 반시계 방향이다.</p>

### 출력

<p>총 K번 회전시킨 이후에 12시방향이&nbsp;S극인 톱니바퀴의 개수를 출력한다.</p>