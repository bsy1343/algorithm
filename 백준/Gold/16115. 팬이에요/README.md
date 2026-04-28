# [Gold III] 팬이에요 - 16115

[문제 링크](https://www.acmicpc.net/problem/16115)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 1218, 정답: 295, 맞힌 사람: 231, 정답 비율: 25.781%

### 분류

정렬, 기하학, 각도 정렬

### 문제 설명

<p>상수는 진표의 열렬한 팬이다. 그는 팬심을 담아 진표에게 직접 만든 선풍기를 선물해 주었다. 선풍기를 돌리고 놀던 진표는 선풍기를 일정 각도 이상 돌리면 날개의 자취가 원 형태가 된다는 것을 발견했다.</p>

<p>선풍기의 회전 중심을 원점으로 하는 좌표평면 위에 선풍기의 날개를 놓았다고 가정하자. 이때 선풍기의 날개는 원점을 포함하며 꼭짓점이 <em>N</em>개인 단순다각형으로 나타낼 수 있다. 또한 날개는 안전을 위해 다음과 같은 조건을 만족하도록 디자인되었다.</p>

<p><strong>선풍기 날개 내부에 있는 임의의 점 P에 대해, 원점 O와 P를 잇는 선분 위의 모든 점 역시 날개 내부에 있다.</strong></p>

<p>이때, 날개의 자취가 원이 되는 최소 회전 각도를 구해 보자. 선풍기는 반시계 방향으로 돌아간다.</p>

### 입력

<p>첫 줄에 선풍기 날개의 꼭짓점의 수 <em>N</em>(3 &le; <em>N</em> &le; 300,000)이 주어진다.</p>

<p>두 번째 줄부터 <em>N</em>개의 줄에 걸쳐 각 꼭짓점의 좌표가 반시계 방향으로 순서대로 주어진다. 각 좌표는 x 좌표와 y 좌표를 의미하는 두 개의 정수로 이루어지며, 각 좌푯값의 절댓값은 10<sup>6</sup> 이하이다.</p>

<p>이 다각형은 원점을 포함하며, 인접한 두 선분을 제외한 다른 선분끼리는 만나지 않는다. 또한 다각형에서 연속한 3개의 점이 한 직선 위에 있지 않음이 보장된다.</p>

### 출력

<p>선풍기를 반시계 방향으로 <em>&theta;</em>만큼 돌렸을 때 날개의 자취가 원이 되는 최소 <em>&theta;</em>를 도(&deg;) 단위로 구해 출력한다. 절대 또는 상대 오차가 10<sup>-6</sup> 이하면 정답으로 처리된다.</p>

### 힌트

<p>첫 번째 예제의 선풍기는 아래와 같다.</p>

<p style="text-align: center;"><img alt="첫 번째 예제의 선풍기" src="%EB%B0%B1%EC%A4%80/Gold/16115.%E2%80%85%ED%8C%AC%EC%9D%B4%EC%97%90%EC%9A%94/bb3a9d73.png" data-original-src="https://upload.acmicpc.net/d1f1afb1-5e6c-4b65-8892-418e2c2cfcbe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:40.31%;" /></p>

<p>이를 반시계 방향으로 45&deg; 돌렸을 때 자취는 아래와 같다. 처음 도형과 마지막 도형을 짙게 칠하였다.</p>

<p style="text-align: center;"><img alt="반시계 방향으로 45° 돌렸을 때 자취" src="%EB%B0%B1%EC%A4%80/Gold/16115.%E2%80%85%ED%8C%AC%EC%9D%B4%EC%97%90%EC%9A%94/1135abba.png" data-original-src="https://upload.acmicpc.net/c90fd8d2-978b-4cfe-816a-5cc426b70233/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:56.39%;" /></p>

<p>이렇게 90&deg;를 돌리는 순간 자취는 반지름이 2&radic;<span style="text-decoration: overline;">2</span>인 원이 된다. 따라서 답은 90이다.</p>