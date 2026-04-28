# [Platinum III] 정수 게임 - 10563

[문제 링크](https://www.acmicpc.net/problem/10563)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 237, 정답: 77, 맞힌 사람: 63, 정답 비율: 39.873%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10563.%E2%80%85%EC%A0%95%EC%88%98%E2%80%85%EA%B2%8C%EC%9E%84/d4ad247e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10563.%E2%80%85%EC%A0%95%EC%88%98%E2%80%85%EA%B2%8C%EC%9E%84/d4ad247e.png" data-original-src="https://www.acmicpc.net/upload/images2/numbergame.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:333px" /></p>

<p>Alice와 Bob은 N개의 정사각형을 일렬로 놓고 게임을 하고 있다. 정사각형에는 1부터 N까지의 수가 하나씩 적혀져 있다.</p>

<p>Alice와 Bob은 턴을 번갈아가면서 수를 하나씩 제거한다. 어떤 정사각형에 적혀있는 수를 제거하려면, 변을 공유하는 양쪽 정사각형에 더 큰 수가 있으면 안 된다. 수를 제거하면, 정사각형에는 수가 적혀있지 않은 상태가 된다.</p>

<p>1을 제거하는 사람이 게임을 승리한다. 게임의 초기 상태가 주어졌을 때, 두 사람이 최적의 방법으로 게임을 한다면, 누가 이기는지 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T (1 &le; T &le; 100) 가 주어진다. 각 테스트 케이스의 첫째 줄에는 N (1 &le; N &le; 100)이 주어진다. 다음 줄에는 게임의 초기 상태가 왼쪽부터 오른쪽까지 순서대로 주어진다.</p>

### 출력

<p>각각의 테스트 케이스에 대해서, 게임을 승리하는 사람을 출력한다.</p>