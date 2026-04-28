# [Platinum II] 성공 - 15944

[문제 링크](https://www.acmicpc.net/problem/15944)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 414, 정답: 133, 맞힌 사람: 98, 정답 비율: 32.450%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>당연한 이야기지만, 성공으로 가는 길이 항상 평탄하지만은 않다. 온갖 장애물이 가득하고, 장애물에 막혀서 주저앉을 수도 있다. 그래서 그 장애물을 폭파하려고 한다.</p>

<p>성공으로 가는 길은 N&times;M격자 위에 놓여 있다. 성공으로 가려면 맨 왼쪽 위 칸에서 시작하여 장애물이 없는 상하좌우로 인접한 칸을 밟으면서 맨 오른쪽 아래 칸에 도착해야 한다. 한 번의 폭파 작업으로 D&times;D 격자 내에 있는 모든 장애물을 없앨 수 있다. 하지만 세상에 공짜는 없는 법. 폭파 작업에도 큰 힘이 들기 때문에, 성공으로 가려면 최소 몇 번의 폭파 작업이 필요한지 알고 싶다.</p>

### 입력

<p>첫 번째 줄에 격자의 행의 개수 N, 열의 개수 M, 폭파의 범위 D가 주어진다(D &le; N, M &le; 500, 1 &le; D &le; 100).</p>

<p>그 다음 N개의 줄에 격자의 각 행을 나타내는 길이 M의 문자열이 주어진다. &ldquo;.&rdquo;은 장애물이 없는 칸, &ldquo;#&rdquo;은 장애물이 있는 칸이다. 출발 지점과 성공에는 장애물이 없다.</p>

### 출력

<p>첫 번째 줄에 폭파 작업의 최소 횟수를 출력한다.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15944.%E2%80%85%EC%84%B1%EA%B3%B5/93d7c57f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15944.%E2%80%85%EC%84%B1%EA%B3%B5/93d7c57f.png" data-original-src="https://upload.acmicpc.net/e14d2149-a512-4d33-ab71-8f4f85f04cd4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>