# [Bronze IV] 연대 다음 고대 - 34824

[문제 링크](https://www.acmicpc.net/problem/34824)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 993, 정답: 728, 맞힌 사람: 685, 정답 비율: 75.027%

### 분류

구현, 문자열

### 문제 설명

<p>최근 연세대학교 에브리타임에 다음과 같은 글이 올라왔다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34824.%E2%80%85%EC%97%B0%EB%8C%80%E2%80%85%EB%8B%A4%EC%9D%8C%E2%80%85%EA%B3%A0%EB%8C%80/9719ee84.png" data-original-src="https://boja.mercury.kr/assets/problem/34824-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>고려대학교가 연세대학교보다 PS를 잘 한다는 말을 인정할 수 없었던 재열이는, 연세대학교가 더 잘 한다는 것을 입증하기 위해, 연세대학교와 고려대학교가 모두 참여하는 대회를 찾아보았다.</p>

<p>각 대학의 대회 순위가 주어질 때, 연세대학교가 고려대학교를 이겼는지 확인하는 프로그램을 작성해 보자!</p>

### 입력

<p>첫째 줄에는 대회에 참여한 대학 수 $N$ $(2\leq N \leq 100)$이 주어진다.</p>

<p>다음 $N$개의 줄에 걸쳐, $1$등, $2$등, $\cdots$, $N$등을 한 대학의 이름이 한 줄에 하나씩 주어진다. 대학 이름의 길이는 $50$자를 넘지 않는다.</p>

<p>이때, 모든 대학의 이름은 공백 없이 알파벳 소문자로만 이루어져 있으며, 연세대학교는 <code style="color:#e74c3c;">yonsei</code>, 고려대학교는 <code style="color:#e74c3c;">korea</code>로 주어진다.</p>

<p>참가한 대학의 이름에는 반드시 <code style="color:#e74c3c;">yonsei</code>, <code style="color:#e74c3c;">korea</code>가 주어지며, 각 대학의 이름은 모두 다름이 보장된다.</p>

### 출력

<p>연세대학교가 고려대학교보다 순위가 높은 경우, <code style="color:#e74c3c;">Yonsei Won!</code>을, 반대의 경우 <code style="color:#e74c3c;">Yonsei Lost...</code>를 출력한다.</p>