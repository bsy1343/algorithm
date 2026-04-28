# [Platinum IV] 가지 볶음 (Easy) - 27990

[문제 링크](https://www.acmicpc.net/problem/27990)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 17, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 기하학, 구현, 수학, 정수론, 물리학

### 문제 설명

<p>가지를 좋아하는 kiwiyou는 가지를 싫어하는 이들을 위해 맛있는 가지 요리를 선보이려고 한다. 그 요리는 바로 가지볶음이다!</p>

<p>kiwiyou는 가지볶음을 만들기 위해 프라이팬에 가지볶음 재료들을 넣었다.</p>

<p>프라이팬은 정사각형 모양이며 좌표평면의 $-N \le x, y \le N$ 영역에 놓여있다. $x = -N$, $y = -N$, $x = N$, $y = N$인 지점에는 재료가 프라이팬 밖으로 나가지 못하도록 프라이팬 벽면이 존재한다.</p>

<p>재료들은 모두 크기를 무시할 정도로 작다. 프라이팬에 열을 가하면 재료들은 충돌하는 순간을 제외하고 일정한 속력과 일정한 방향, 즉 일정한 속도로 운동한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27990.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EB%B3%B6%EC%9D%8C%E2%80%85(Easy)/e47e3241.png" data-original-src="https://upload.acmicpc.net/17336364-d9f3-489a-b3a7-2ce7eaaaef8a/-" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: min(100%,671px); height: auto;" /></p>

<p style="text-align: center;"><small>왼쪽부터 두 재료가 충돌하기 전, 충돌하는 순간, 충돌한 후의 모습</small></p>

<p>서로 다른 두 재료 $a$와 $b$의 $x$좌표와 $y$좌표가 모두 일치하면 충돌한다. 이때 $a$는 $b$가 운동하던 속도로 운동하고 $b$는 $a$가 운동하던 속도로 운동한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27990.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EB%B3%B6%EC%9D%8C%E2%80%85(Easy)/9a280c14.png" data-original-src="https://upload.acmicpc.net/cc0aee16-f76a-457b-a095-7a5adeb29e4d/-" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: min(100%,483px); height: auto;" /></p>

<p style="text-align: center;"><small>왼쪽은 재료가 $y = N$인 벽면과 충돌할 때의 궤적, 오른쪽은 $x = N$인 벽면과 충돌할 때의 궤적</small></p>

<p>마찬가지로 재료가 프라이팬 벽면과 만나면 충돌한다. 재료가 $x = -N$, $x = N$인 벽면과 충돌하면 재료가 운동하던 $x$ 방향이 반대로 바뀌며, $y = -N$, $y = N$인 벽면과 충돌하면 재료가 운동하던 $y$ 방향이 반대로 바뀐다. 만약 프라이팬 벽면에서 서로 다른 두 재료가 충돌한다면 두 재료끼리 먼저 충돌한 후 각 재료가 벽면과 충돌한다.</p>

<p>문득 kiwiyou는 서로 다른 두 재료가 총 몇 번 충돌하는지 궁금해졌다. 프라이팬에 재료를 넣어 $T$초간 가열했을 때, 서로 다른 두 재료가 총 몇 번 충돌했는지 구해보자. kiwiyou는 똑똑하기 때문에 $T$초 동안 서로 다른 $3$개 이상의 재료가 같은 위치에서 동시에 충돌할 일은 없게 재료를 놓을 것이다.</p>

### 입력

<p>첫째 줄에 프라이팬 크기 $N$, 가지 볶음 재료의 개수 $M$, 가열하는 시간 $T$가 주어진다. $(1 \le N \le 10;$ $1 \le M \le$ $\min\left(10, (2N-1)^2\right);$ $1 \le T \le 100)$</p>

<p>둘째 줄부터 $M$개의 줄에 걸쳐 프라이팬을 가열을 시작한 순간의 재료 좌표와 속도가 주어진다. 그중 $i$째 줄에는 $i$번째의 재료의 $x$좌표 $x_i$, $y$좌표 $y_i$, 초당 $x$축 방향의 변위 $v_{x_i}$, 초당 $y$축 방향의 변위 $v_{y_i}$가 주어진다. $(-N \lt x_i,$ $y_i,$ $v_{x_i},$ $v_{y_i} \lt N)$</p>

<p>입력으로 주어지는 수는 모두 정수이며 두 재료가 같은 위치에서 운동을 시작하는 경우는 없다.</p>

<p>$T$초 동안 서로 다른 $3$개 이상의 재료가 같은 위치에서 동시에 충돌하는 경우의 입력은 주어지지 않는다.</p>

### 출력

<p>첫째 줄에 $T$초 동안 서로 다른 두 재료가 충돌한 횟수를 출력한다. 정확히 $T$초에 두 재료가 충돌하는 경우 충돌한 횟수에 포함한다.</p>