# [Silver V] 벚꽃이 정보섬에 피어난 이유 - 17127

[문제 링크](https://www.acmicpc.net/problem/17127)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 2257, 정답: 1552, 맞힌 사람: 1366, 정답 비율: 71.706%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>정보섬에&nbsp;벚꽃이 피어났다!</p>

<p>정보섬에 만발한 꽃송이들을&nbsp;본 욱제는 한 가지 좋은 생각을 떠올렸다.&nbsp;아래와 같은 네 개의 푯말을 준비해서 정보섬의 꽃밭에 세우는 것이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/17127.%E2%80%85%EB%B2%9A%EA%BD%83%EC%9D%B4%E2%80%85%EC%A0%95%EB%B3%B4%EC%84%AC%EC%97%90%E2%80%85%ED%94%BC%EC%96%B4%EB%82%9C%E2%80%85%EC%9D%B4%EC%9C%A0/18228684.png" data-original-src="https://upload.acmicpc.net/628e8f8c-2101-4a62-861a-2e18bb33e3db/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 187px; width: 600px;" /></p>

<p>정보섬의 1층 꽃밭에는 총 N개의 벚나무가 일렬로 늘어서&nbsp;있다. 각 벚나무에는 늘어선 순서대로 A<sub>1</sub>, A<sub>2</sub>, ..., A<span style="font-size: 10.8333px;">N</span>개의&nbsp;벚꽃이 피어나 있다. 욱제는 이 벚나무를 총 네 개의 그룹으로 나누어 각 그룹을 대표하도록 푯말을 세웠다.</p>

<p>이 그룹을 나눈 데에는 특별한 기준이 있다. 그룹&nbsp;[i, j]의&nbsp;벚꽃 개수들의 곱 P<sub>i,j</sub> = A<sub>i</sub>&nbsp;&times;&nbsp;A<sub>i+1</sub>&nbsp;&times;&nbsp;... &times;&nbsp;A<sub>j-1</sub>&nbsp;&times;&nbsp;A<sub>j</sub>&nbsp;(i &le;&nbsp;j)가 네 개 있을 때, 네 개의 P의 합이 최대가 되도록&nbsp;나누었다. 다시 말해, 그룹 내의 벚꽃 개수를 모두 곱하고, 그렇게 곱해진 값&nbsp;네 개를 모두 더한 값이 최대가 되도록 나누었다. 욱제는&nbsp;연속된 순서의 나무들만 하나의 그룹으로 묶고, 모든 나무들을 빠짐없이 정확히 하나의 그룹에 포함시켰다. 또한 하나의 그룹에는 반드시 하나 이상의 나무가 포함되었다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/17127.%E2%80%85%EB%B2%9A%EA%BD%83%EC%9D%B4%E2%80%85%EC%A0%95%EB%B3%B4%EC%84%AC%EC%97%90%E2%80%85%ED%94%BC%EC%96%B4%EB%82%9C%E2%80%85%EC%9D%B4%EC%9C%A0/bdbb28e6.png" data-original-src="https://upload.acmicpc.net/0522261b-c791-4d0f-a690-2af6ecb6db83/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 200px; width: 600px;" /></p>

<p>힘든 하루를 마치고 집으로 돌아가던 당신은 정보섬 1층에 만발한 꽃송이와 푯말을 보았다. 그리고&nbsp;갑자기 최대화 된 네 개의 P의&nbsp;합이 얼마인지 궁금해졌다.</p>

<p>얼마일까?</p>

### 입력

<p>첫째 줄에 벚나무의 개수 N이 주어진다. (4 &le; N&nbsp;&le; 10)</p>

<p>둘째 줄에 N개의&nbsp;나무에 피어난 벚꽃의 개수 A<sub>i</sub>가 순서대로 주어진다. (1&nbsp;&le; A<sub>i</sub>&nbsp;&le; 5)</p>

### 출력

<p>얼마일까?</p>