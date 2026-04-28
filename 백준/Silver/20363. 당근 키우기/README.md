# [Silver IV] 당근 키우기 - 20363

[문제 링크](https://www.acmicpc.net/problem/20363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1376, 정답: 1006, 맞힌 사람: 916, 정답 비율: 75.702%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>꽉꽉나라의 농부&nbsp;오리는 당근을 키우려고 한다. 꽉꽉나라에서는&nbsp;씨앗이&nbsp;<em>X</em>만큼의 온기와&nbsp;<em>Y</em>만큼의 수분을 가지면&nbsp;당근으로 자란다고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20363.%E2%80%85%EB%8B%B9%EA%B7%BC%E2%80%85%ED%82%A4%EC%9A%B0%EA%B8%B0/20d0d612.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/20363.%E2%80%85%EB%8B%B9%EA%B7%BC%E2%80%85%ED%82%A4%EC%9A%B0%EA%B8%B0/20d0d612.png" data-original-src="https://upload.acmicpc.net/631c490a-f8a2-4c00-968f-b01772f280b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>씨앗은 햇빛을 1번 받을 때마다&nbsp;1만큼의 온기가 증가하고, 햇빛을 10번 받을 때마다 1만큼의 수분이 감소한다.</p>

<p>씨앗은 물을&nbsp;1번 받을 때마다&nbsp;1만큼의 수분이 증가하고, 물을&nbsp;10번 받을 때마다 1만큼의 온기가 감소한다.</p>

<p>만약, 감소되어야 하는 온기&nbsp;혹은 수분이&nbsp;이미 0이라면&nbsp;감소되지 않는다. 즉, 온기와&nbsp;수분은&nbsp;음수가 되지&nbsp;않는다. 맨 처음&nbsp;씨앗의 온기와 수분은 0이다.</p>

<p>오리는 당근을 효율적으로 키우기 위해, 당근이&nbsp;자랄 때까지 햇빛과 물을 주는&nbsp;횟수의 합을&nbsp;최소화하려고 한다. 예를 들어, <em>X&nbsp;</em>= 10, <em>Y&nbsp;</em>= 10이라고 하자.</p>

<p>씨앗에 햇빛을 10번 주면&nbsp;온기&nbsp;10, 수분 0이 된다. 그리고, 물을&nbsp;10번 주면 온기 9. 수분 10이 된다. 마지막으로 햇빛을 1번 주면 온기 10, 수분 10으로 당근이 자라게 된다. 이때, 햇빛과 물을&nbsp;준 횟수의&nbsp;합은&nbsp;21이고&nbsp;위 예제에서의 최솟값이다.</p>

<p><em>X</em>와 <em>Y</em>가 주어졌을 때, 당근이&nbsp;자랄 때까지 햇빛과 물을 주는&nbsp;횟수의 합의 최솟값을 구하는 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 <em>X</em>와 <em>Y&nbsp;</em>(0 &le; <em>X</em>, <em>Y</em> &le; 10<sup>9</sup>)를 의미하는 정수가 공백으로 구분되어 주어진다.</p>

### 출력

<p>당근이&nbsp;자랄 때까지&nbsp;햇빛과 물을 주는&nbsp;횟수의 합의 최솟값을 나타내는 정수를&nbsp;출력하라.</p>