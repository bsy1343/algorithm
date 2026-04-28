# [Platinum I] Split and Merge - 15902

[문제 링크](https://www.acmicpc.net/problem/15902)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 996, 정답: 245, 맞힌 사람: 168, 정답 비율: 30.939%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>1&times;L 격자가 있고, 1&times;L 격자는 1&times;1 조각과 1&times;2 조각들로 나누어져 있다.</p>

<p>당신은 2가지의 연산을 수행할 수 있는데, 그것은 1&times;2 조각을 쪼개 1&times;1조각 2개로 만드는 연산과, 연속하여 붙어 있는 1&times;1 조각 2개를 합쳐 1&times;2 조각 하나로 만드는 연산이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/dff859e7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/dff859e7.png" data-original-src="https://upload.acmicpc.net/cab13891-a088-4af7-bce0-b35eefa1975f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>1&times;L 격자의 초기 상태와 만들고자 하는 상태가 주어졌을 때, 수행해야 하는 연산의 최소 횟수와 그 횟수만큼 연산을 수행해 격자의 상태를 올바르게 바꾸는 방법의 가짓수를 구하여라.</p>

<p>예를 들어, 1&times;6 격자가 있고 초기 상태가 다음과 같다고 하자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/35b5ff46.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/35b5ff46.png" data-original-src="https://upload.acmicpc.net/d31ce90f-1037-4182-aba4-6410c0db9054/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>이 격자를 아래와 같이 만들고자 할 때,</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/3e0e895f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15902.%E2%80%85Split%E2%80%85and%E2%80%85Merge/3e0e895f.png" data-original-src="https://upload.acmicpc.net/e3881777-6057-4e50-9b0f-dfc63c75af95/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>1&times;2 조각을 1&times;1 격자 2개로 나눈 후에 1&times;1 격자 2개를 하나로 합치는 연산을 2번 하면 총 3번 만에 변환을 마칠 수 있고, 이때 경우의 수는 3가지가 존재한다.</p>

### 입력

<p>첫 번째 줄에는 격자의 길이 L이 주어진다. (1 &le; L &le; 3,000)</p>

<p>두 번째 줄에는 처음에 있는 조각의 수 n이 주어진다. (1 &le; n &le; L)</p>

<p>세 번째 줄에는 n개의 수 a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>이 주어진다. 이는 왼쪽 조각부터 차례대로 주어지는 조각의 길이이며,&nbsp;모두 1 이상 2 이하이다. n개의 수의 합은 L이다.</p>

<p>네 번째 줄에는 만들어야 하는 상태에 있는 조각의 수 m이 주어진다.&nbsp;(1 &le; m &le; L)</p>

<p>다섯 번째 줄에는 m개의 수 b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>m</sub>이 세 번째 줄과 같은 방식으로 주어진다.</p>

### 출력

<p>첫 번째 줄에 필요한 연산의 최소 횟수와 그 때 방법의 가짓수를 공백을 사이에 두고 출력한다. 방법이 많아질 수 있으므로 1,000,000,007로 나눈 나머지를 출력한다.</p>