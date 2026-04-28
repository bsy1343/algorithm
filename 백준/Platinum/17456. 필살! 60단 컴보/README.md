# [Platinum II] 필살! 60단 컴보 - 17456

[문제 링크](https://www.acmicpc.net/problem/17456)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 232, 정답: 37, 맞힌 사람: 33, 정답 비율: 36.264%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="margin-top: 15px; margin-bottom: 15px;"><img alt="alt text" src="%EB%B0%B1%EC%A4%80/Platinum/17456.%E2%80%85%ED%95%84%EC%82%B4!%E2%80%8560%EB%8B%A8%E2%80%85%EC%BB%B4%EB%B3%B4/285fb370.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17456.%E2%80%85%ED%95%84%EC%82%B4!%E2%80%8560%EB%8B%A8%E2%80%85%EC%BB%B4%EB%B3%B4/285fb370.png" data-original-src="https://upload.acmicpc.net/6b19d1ef-3545-45ef-9ba5-d184a974ef80/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 400px;" /></p>

<p><strong>필살! 60단 컴보</strong>는 성모가 개발한 리듬 게임이다. 이 게임에서 곡은 언제나 60개의 노트로 이루어져 있으며, 각 노트에 대한 판정은 GOOD(1)과 MISS(0)밖에 없다. 모든 리듬 게임이 그러하듯 필살! 60단 컴보에도 콤보 시스템이 존재한다. GOOD 판정을 받았을 때 기본적으로 얻는 점수는 1점이지만, 콤보가 쌓일 때마다 2점씩 추가된다. 다시 말해, GOOD 판정을 받은 시점의 콤보가 <span style="font-style: italic;">X</span>라면, 2<span style="font-style: italic;">X</span>-1점을 얻는다. MISS 판정을 받으면 콤보가 초기화되며, 점수를 받지 못한다. 예를 들면, 노트 5개를 친 결과가 11101이라면, 점수는 1 + 3 + 5 + 0 + 1 = 10이다.</p>

<p>모든 플레이어의 플레이 기록은 서버에 저장된다. 이때, 60개의 노트를 친 결과를 2진법으로 읽은 수 하나가 서버로 올라가게 된다. 예를 들면, 마지막 4개의 노트에서만 GOOD 판정을 받고 나머지 판정이 모두 MISS인 경우, 이 플레이를 나타내는 수는 1111<sub>(2)</sub> = 15이다. 성모는 오랜 작업 끝에 서버의 랭킹 시스템의 개발을 완료했고, 테스트 단계만 남은 상황이다. 많은 사람들의 플레이 기록들을 잘 처리할 수 있는지 확인하기 위해, 성모는 <span style="font-style: italic;">a</span>부터 <span style="font-style: italic;">b</span>까지의 플레이 기록을 모두 하나씩 서버에 전송한 뒤, 그중에서 플레이 기록이 <span style="font-style: italic;">c</span>인 사람이 몇 등인지 확인하는 테스트 데이터를 만들었다. 하지만 실제로 몇 등이어야 하는지를 채워 넣지 못했다. 성모를 도와 테스트 데이터를 완성해보자!</p>

<p>등수는 (나보다 높은 점수를 가진 사람 수) + 1로 정의된다. 예를 들면, 5명의 점수가 각각 3점, 2점, 2점, 1점, 1점이라면 3점은 1등, 2점 두 명은 2등, 1점 두 명은 4등이다.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 <span style="font-style: italic;">T</span>가 주어진다. (1 &le; <span style="font-style: italic;">T</span> &le; 300,000)</p>

<p>다음 <span style="font-style: italic;">T</span>개의 줄에 걸쳐 각 줄에 정수 <span style="font-style: italic;">a</span>, <span style="font-style: italic;">b</span>, <span style="font-style: italic;">c</span>가 주어진다. (0 &le; <span style="font-style: italic;">a</span> &le; <span style="font-style: italic;">c</span> &le; <span style="font-style: italic;">b</span> &lt; 2<sup>60</sup>)</p>

### 출력

<p>각 테스트 케이스마다 정답을 한 줄에 하나씩 출력한다.</p>