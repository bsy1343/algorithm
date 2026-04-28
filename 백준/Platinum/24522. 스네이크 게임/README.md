# [Platinum II] 스네이크 게임 - 24522

[문제 링크](https://www.acmicpc.net/problem/24522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 381, 정답: 55, 맞힌 사람: 41, 정답 비율: 12.462%

### 분류

KMP, 문자열

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/de54511e-dde4-4d84-bdb0-009d302b1345/-/preview/" /></p>

<p>알고리즘 원툴 상원이는 첫&nbsp;프로젝트를 시작했다. 바로 스네이크 게임을 만드는 것이다.&nbsp;</p>

<p>게임에 자신만의 시그니처를 넣고 싶었던 상원이는 특별한 기능을 추가하기로 했다. 원래 뱀은 초록색이지만&nbsp;게임을 진행하다가 뱀 모양에 숨겨진 특정 모양인 <strong>트리거 패턴</strong>이 있다면 뱀의 색을 바꾸는 것이다. 하지만 프로젝트에 며칠 밤을 새운&nbsp;상원이는&nbsp;도저히 만들 체력이 없다. 여러분이 힘들어하는 상원이를 위해 기능 구현을 도와주도록 하자. 구현해야 할 기능은 뱀 모양에서 <strong>트리거 패턴</strong>이 몇 개나 있는지 찾는 것이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f884d176-7c24-4ad2-ae21-720d7ed04db0/-/preview/" /></p>

<p>이때 뱀 모양에 회전된&nbsp;<strong>트리거 패턴</strong>도 포함해야 한다. 위 뱀 모양의 경우, 보라색으로 표시된 <strong>트리거 패턴</strong>은 두 번 나타난다. 단, 회전된&nbsp;모양과는&nbsp;다른 뒤집힌&nbsp;모양인 경우는 포함되지 않음에&nbsp;유의해야 한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b9d19c90-f242-454a-a39a-8725b7bf1bc9/-/preview/" style="height: 104px; width: 400px;" /></p>

<p>뱀 모양과 <strong>트리거 패턴</strong>이 주어졌을 때, 뱀 모양에 있는 <strong>트리거 패턴</strong>의 개수를 구해보자.</p>

### 입력

<p>첫 번째 줄에 뱀&nbsp;모양을 나타내는 점 개수 $N$, 숨겨진 모양을 나타내는 점 개수 $M$이 주어진다. $(3 \le N, M \le 500\,000)$</p>

<p>이어지는 $N$개의 줄에 좌표 $x_i, y_i$가 정수로 주어진다. 뱀 모양은 $(x_i, y_i)$와&nbsp;$(x_{i+1}, y_{i+1})$을 선분으로 이은 모양이다. $(-10^9 \le x_i, y_i \le 10^9)$</p>

<p>이어지는 $M$개의 줄에 좌표 $x_i, y_i$가 정수로 주어진다. <strong>트리거 패턴</strong>은 $(x_i, y_i)$와&nbsp;$(x_{i+1}, y_{i+1})$을 선분으로 이은 모양이다. $(-10^9&nbsp;\le x_i, y_i \le 10^9)$</p>

<p>단, 각 모양에 해당하는&nbsp;선분은 축에 평행하고&nbsp;연속한 두 선분을 제외하면 서로 겹치지 않는다. 연속한 두 선분은 수직이고 오직 끝 점에서만 만난다.</p>

### 출력

<p>뱀 모양에 있는 <strong>트리거 패턴</strong>의 개수를 출력한다.</p>