# [Platinum II] 지그재그 - 3894

[문제 링크](https://www.acmicpc.net/problem/3894)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 8, 맞힌 사람: 5, 정답 비율: 19.231%

### 분류

다이나믹 프로그래밍, 그래프 이론, 기하학, 비트마스킹, 최단 경로, 데이크스트라, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>평면 위에 점이 여러 개 주어진다. 이 점을 모두 지나는 지그재그 선을 찾으려고 한다. 이때, 전환점(turning point)의 개수를 가장 적게 하려고 한다. 또, 전환점의 개수가 같은 경우에는 선의 길이가 가장 작은 것을 찾으려고 한다.</p>

<p>예를 들어, 아래와 같이 평면 위에 점이 9개가 있다고 하자.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/04b69188.png" data-original-src="https://www.acmicpc.net/upload/images/z1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 161px; height: 143px;" /></p>

<p>지그재그 선은 여러 선분으로 이루어져 있고, 각 선분은 점을 두 개 이상 지나야 한다.</p>

<p>지그재그 선은 선이 꺽일 수 있는데, 이 꺽이는 지점을 전환점(turning point)라고 한다. 전환점은 주어진 점 위에 있을 수도 있고, 아닐 수도 있다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/3c44203e.png" data-original-src="https://www.acmicpc.net/upload/images/z2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 486px; height: 137px;" /></p>

<p>왼쪽 지그재그 선의 길이: 8 + 3&radic;2 ≃ 12.242641, 오른쪽 지그재그 선의 길이: 2&radic;2 + (6 + 1/2) + 5&radic;5/2 ≃ 14.918597</p>

<p>위의 그림은 주어진 점을 지나는 지그재그 선이고 두 선 모두 전환점의 개수는 3개이다. 왼쪽 지그재그 선의 길이는 오른쪽 지그재그 선의 길이보다 짧다. 또, 왼쪽 지그재그 선은 주어진 아홉 개의 점을 지나는 가장 짧은 지그재그 선이다.</p>

<p>전환점을 네 개 갖는 지그재그 선은 아래와 같다. 이 선의 길이는 위의 그림의 길이보다 짧지만, 전환점의 수가 더 많기 때문에 정답이 아니다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/6c80c6c4.png" data-original-src="https://www.acmicpc.net/upload/images/z3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 148px; height: 98px;" /></p>

<p>아래와 같이 점이 7개 있고, 그 점을 잇는 두가지로 이었다고 하자. 이때, 왼쪽의 길이가 오른쪽보다 더 길지만, 정답은 왼쪽 그림이 된다. 그 이유는 지그재그 선의 모든 선분은 점을 두 개 이상 지나야 하기 때문이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/ae7ea10f.png" data-original-src="https://www.acmicpc.net/upload/images/z4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 427px; height: 74px;" /></p>

<p>점이 주어졌을 때, 지그재그 선을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스의 첫째 줄에는 점의 개수 n이 주어진다. 다음 n개의 줄에는 점의 좌표가 주어진다.</p>

<p>모든 좌표는 음이 아닌 정수이고, 공백으로 구분되어 있다. n은 2이상 10이하의 자연수이고, x,y좌표는 0이상 10이하의 정수이다. 점의 순서는 별 의미가 없다.</p>

### 출력

<p>각 테스트 케이스에 대해서, 가장 적은 전환점을 갖는 지그재그 선 중 가장 짧은 것의 전환점의 개수와 길이를 출력한다. 선의 길이는 정답과의 오차가 0.0001까지 허용된다.</p>

<p>가장 적은 전환점의 개수는 최대 4개이며, 따라서 선분의 개수는 최대 5개가 된다.</p>

### 힌트

<p>첫 번째 데이터:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/73c9f776.png" data-original-src="https://www.acmicpc.net/upload/images/zh1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 163px; height: 166px;" /></p>

<p>두 번째 데이터:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/f2f7048c.png" data-original-src="https://www.acmicpc.net/upload/images/zh2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 158px; height: 164px;" /></p>

<p>세 번째 데이터:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/4872b6f5.png" data-original-src="https://www.acmicpc.net/upload/images/zh3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 162px; height: 162px;" /></p>

<p>네 번째 데이터:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3894.%E2%80%85%EC%A7%80%EA%B7%B8%EC%9E%AC%EA%B7%B8/9b2e70a8.png" data-original-src="https://www.acmicpc.net/upload/images/zh4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 158px; height: 161px;" /></p>